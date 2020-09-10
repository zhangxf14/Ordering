package com.example.ordering;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {

	public String[] Beef = { "尖椒牛柳", "黄豆芽炒牛肉", "土豆烧牛肉", "百叶结烧肉", "葱爆牛肉", "芹菜炒牛肉", "孜然牛肉", "炖牛肉",
            "酱牛肉", "水煮牛肉", "红烧牛肉", "蚝油青椒牛肉丁","凉拌牛肉" };
	public String[] Pork = { "青椒肉丝", "芹菜肉丝", "雪菜肉丝", "鱼香肉丝", "茭白肉丝", "木耳肉丝", "青椒肉片", "杏鲍菇肉片", 
            "干丝肉丝", "西芹香肠","川味回锅肉", "木须肉", "肉沫茄子","鱼香茄子", "肉沫粉丝","咸肉白菜", 
            "咸肉百叶","莴苣肉片", "糖醋排骨","咕咾肉", "咸肉冬笋","梅菜扣肉","红烧狮子头","毛血旺","水煮肉片"};

	public String[] Chicken = { "尖椒鸡肫", "宫爆鸡丁", "咖喱鸡丁", "生爆仔鸡", "土豆鸡块", "板栗鸡块", "干锅仔鸡", "麻辣鸡肉", "香菇焖鸡肉",
	               "口水鸡肉", "洋葱炒鸭肉","泡菜炒鸭肉","韭黄炒鸭肉","红烧鸭","青椒炒鸭肉","泡椒炒鸭肉","豆角烧鸭"};
	
	public String[] Eggs = { "黄瓜炒蛋", "韭菜炒蛋", "韭黄炒蛋", "番茄炒蛋", "尖椒炒蛋", "丝瓜炒蛋", "木耳炒蛋", "平菇炒蛋", "白菜荷包蛋",
	            "莴苣炒蛋", "金针菇炒蛋", "银鱼炒蛋", "苦瓜炒蛋", "香葱焖蛋","肉沫炖蛋" };
	
	public String[] Fish = { "炒鱿鱼卷", "青椒鱼片", "糖醋鱼片", "雪菜小黄鱼", "红烧带鱼", "红烧鱼块", "红烧鳊鱼", "红烧鲫鱼（大）",
	            "剁椒鱼头", "剁椒鱼块","干锅鱼","干锅虾", "干锅牛蛙", "尖椒虾糕", "酸菜鱼" };
	
	public String[] Vegt = { "手撕包菜", "干煸四季豆", "松仁玉米", "芦蒿干丝", "酸辣白菜", "生瓜肉丝", "干锅包菜", "蒜泥生菜", "蒜泥空心菜", 
	            "紫角叶", "香菇青菜/面筋", "上汤苋菜", "黄豆芽粉丝", "雪菜豆子", "清炒菠菜", "青椒土豆丝",
	            "长豇豆", "丝瓜毛豆",  "西兰花","虎皮青椒","地三鲜","长豇豆烧茄子","莴苣","糖醋藕片","酸辣藕片","大烧百叶",
	            "炒山药","雪菜粉皮","芹菜干丝","葱油蚕豆","青椒海带丝","雪菜冬笋片","青椒茄丝","蓬蒿","酸辣土豆丝","素什锦","凉拌黄瓜"};
	
	public String[] Bean = { "胡葱豆腐", "麻辣豆腐", "平菇豆腐", "豆瓣肉沫豆腐", "家常豆腐", "麻辣牛肉豆腐", "咸肉豆腐","皮蛋豆腐" };
	
	public String[] Soup = { "西红柿蛋汤","紫菜蛋汤","冬瓜排骨汤","鸭血粉丝汤" ,"豆腐汤","酸辣汤","猪蹄汤","丸子汤"};
	
	public String str,strCai,strSoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        
        Button button1 =(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v){
//        		EditText eTbeef=(EditText)findViewById(R.id.eTbeef);
//        		String beef=eTbeef.getText().toString();
//        		EditText eTpork=(EditText)findViewById(R.id.eTpork);
//        		String pork=eTbeef.getText().toString();
//        		EditText eTchicken=(EditText)findViewById(R.id.eTchicken);
//        		String chicken=eTbeef.getText().toString();
//        		EditText eTeggs=(EditText)findViewById(R.id.eTeggs);
//        		String eggs=eTbeef.getText().toString();
//        		EditText eTfish=(EditText)findViewById(R.id.eTfish);
//        		String fish=eTbeef.getText().toString();
//        		EditText eTvegt=(EditText)findViewById(R.id.eTvegt);
//        		String vegt=eTbeef.getText().toString();
//        		EditText eTbean=(EditText)findViewById(R.id.eTbean);
//        		String bean=eTbeef.getText().toString();
//        		EditText eTsoup=(EditText)findViewById(R.id.eTsoup);
//        		String soup=eTbeef.getText().toString();
//        		
//        		 if (beef == "")
//        			 eTbeef.setText(0); 
//        		
        		
        		
        	}
        });
  
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
