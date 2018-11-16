package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_HttpResponse")
@js.native
class Class_HttpResponse () extends Class_HttpMessage {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 返回当前消息的 HttpCookie 对象列表
  	 * 
  	 * @readonly
  	 * @type NArray
  	 */
  var cookies: js.Array[_] = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置响应消息的返回状态
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var statusCode: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置响应消息的返回消息
  	 * 
  	 * 
  	 * @type String
  	 */
  var statusMessage: java.lang.String = js.native
  /**
  	 * 
  	 * @brief 向 cookies 添加一个 HttpCookie 对象
  	 * @param cookie 指定要添加的 HttpCookie 对象
  	 * 
  	 * 
  	 * 
  	 */
  def addCookie(cookie: Class_HttpCookie): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 发送重定向到客户端
  	 * @param url 重定向的地址
  	 * 
  	 * 
  	 * 
  	 */
  def redirect(url: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 仅发送格式化 http 头到给定的流对象
  	 * @param stm 指定接收格式化消息的流对象
  	 * 
  	 * 
  	 * @async
  	 */
  def sendHeader(stm: Class_Stream): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 设置响应消息的返回状态，返回消息，并添加响应头
  	 * @param statusCode 指定响应消息的返回状态
  	 * @param headers 指定响应消息添加的响应头
  	 * 
  	 * 
  	 * 
  	 */
  def writeHead(statusCode: scala.Double): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 设置响应消息的返回状态，返回消息，并添加响应头
  	 * @param statusCode 指定响应消息的返回状态
  	 * @param headers 指定响应消息添加的响应头
  	 * 
  	 * 
  	 * 
  	 */
  def writeHead(statusCode: scala.Double, headers: js.Object): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 设置响应消息的返回状态，返回消息，并添加响应头
  	 * @param statusCode 指定响应消息的返回状态
  	 * @param statusMessage 指定响应消息的返回消息
  	 * @param headers 指定响应消息添加的响应头
  	 * 
  	 * 
  	 * 
  	 */
  def writeHead(statusCode: scala.Double, statusMessage: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 设置响应消息的返回状态，返回消息，并添加响应头
  	 * @param statusCode 指定响应消息的返回状态
  	 * @param statusMessage 指定响应消息的返回消息
  	 * @param headers 指定响应消息添加的响应头
  	 * 
  	 * 
  	 * 
  	 */
  def writeHead(statusCode: scala.Double, statusMessage: java.lang.String, headers: js.Object): scala.Unit = js.native
}

