package typings.fibjs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
  * @brief http Cookie 对象，用于添加和处理 cookie
  * @detail 
  */
@js.native
trait ClassHttpCookie extends ClassObject {
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置 cookie 的域名范围
    * 
    * 
    * @type String
    */
  var domain: String = js.native
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置 cookie 的过期时间
    * 
    * 
    * @type Date
    */
  var expires: Date = js.native
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置 cookie 是否仅允许 http 请求，缺省 false
    * 
    * 
    * @type Boolean
    */
  var httpOnly: Boolean = js.native
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置 cookie 名称
    * 
    * 
    * @type String
    */
  var name: String = js.native
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置 cookie 的路径范围
    * 
    * 
    * @type String
    */
  var path: String = js.native
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置 cookie 是否仅通过 https 传递，缺省 false
    * 
    * 
    * @type Boolean
    */
  var secure: Boolean = js.native
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置 cookie 的值
    * 
    * 
    * @type String
    */
  var value: String = js.native
  /**
    * 
    * @brief 检测给定的 url 是否匹配当前设置
    * @param url 指定测试的 url
    * @return 匹配成功返回 true
    * 
    * 
    * 
    */
  def `match`(url: String): Boolean = js.native
  /**
    * 
    * @brief 解析给定的字符串，填充 cookie 对象
    * @param header 指定需要解析的 header 字符串
    * 
    * 
    * 
    */
  def parse(header: String): Unit = js.native
}

