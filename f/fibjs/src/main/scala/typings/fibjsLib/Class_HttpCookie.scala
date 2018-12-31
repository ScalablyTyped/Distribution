package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief http Cookie 对象，用于添加和处理 cookie
	* @detail 
	*/
@JSGlobal("Class_HttpCookie")
@js.native
/**
	 * 
	 * @brief HttpCookie 构造函数，创建一个新的 HttpCookie 对象
	 * @param opts 指定创建的 cookie 的属性
	 * 
	 * 
	 * 
	 */
class Class_HttpCookie () extends Class__object {
  def this(opts: js.Object) = this()
  /**
  	 * 
  	 * @brief HttpCookie 构造函数，创建一个新的 HttpCookie 对象
  	 * @param name 指定创建的 cookie 名称
  	 * @param value 指定创建的 cookie 值
  	 * @param opts 指定创建的 cookie 的其它属性
  	 * 
  	 * 
  	 * 
  	 */
  def this(name: java.lang.String, value: java.lang.String) = this()
  def this(name: java.lang.String, value: java.lang.String, opts: js.Object) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置 cookie 的域名范围
  	 * 
  	 * 
  	 * @type String
  	 */
  var domain: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置 cookie 的过期时间
  	 * 
  	 * 
  	 * @type Date
  	 */
  var expires: stdLib.Date = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置 cookie 是否仅允许 http 请求，缺省 false
  	 * 
  	 * 
  	 * @type Boolean
  	 */
  var httpOnly: scala.Boolean = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置 cookie 名称
  	 * 
  	 * 
  	 * @type String
  	 */
  var name: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置 cookie 的路径范围
  	 * 
  	 * 
  	 * @type String
  	 */
  var path: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置 cookie 是否仅通过 https 传递，缺省 false
  	 * 
  	 * 
  	 * @type Boolean
  	 */
  var secure: scala.Boolean = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置 cookie 的值
  	 * 
  	 * 
  	 * @type String
  	 */
  var value: java.lang.String = js.native
  /**
  	 * 
  	 * @brief 检测给定的 url 是否匹配当前设置
  	 * @param url 指定测试的 url
  	 * @return 匹配成功返回 true
  	 * 
  	 * 
  	 * 
  	 */
  def `match`(url: java.lang.String): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 解析给定的字符串，填充 cookie 对象
  	 * @param header 指定需要解析的 header 字符串
  	 * 
  	 * 
  	 * 
  	 */
  def parse(header: java.lang.String): scala.Unit = js.native
}

