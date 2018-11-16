package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_HttpServer")
@js.native
class Class_HttpServer protected () extends Class_TcpServer {
  /**
  	 * 
  	 * @brief HttpServer 构造函数，在所有本机地址侦听
  	 * @param port 指定 http 服务器侦听端口
  	 * @param hdlr http 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
  	 * 
  	 * 
  	 * 
  	 */
  def this(port: scala.Double, hdlr: Class_Handler) = this()
  /**
  	 * 
  	 * @brief HttpServer 构造函数
  	 * @param addr 指定 http 服务器侦听地址，为 "" 则在本机所有地址侦听
  	 * @param port 指定 http 服务器侦听端口
  	 * @param hdlr http 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
  	 * 
  	 * 
  	 * 
  	 */
  def this(addr: java.lang.String, port: scala.Double, hdlr: Class_Handler) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置是否允强制使用 gzip 压缩输出，缺省为 false
  	 * 
  	 * 
  	 * @type Boolean
  	 */
  var forceGZIP: scala.Boolean = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询 http 协议转换处理器的工作状态
  	 * 
  	 * 返回的结果为一个 Stats 对象，结构如下：
  	 * ```JavaScript
  	 * {
  	 * total : 1000,    // 总计处理的请求
  	 * pendding : 100,  // 当前正在处理的请求
  	 * request : 10,    // 新建的请求
  	 * response : 10,   // 发送的响应
  	 * error : 100,     // 发生的错误（不计入 404）
  	 * error_400 : 10,  // 发生的请求错误
  	 * error_404 : 12,  // 文件未找到的数量
  	 * error_500 : 2    // 内部处理错误
  	 * }
  	 * ```
  	 * 
  	 * 
  	 * @readonly
  	 * @type Stats
  	 */
  var httpStats: Class_Stats = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置 body 最大尺寸，以 MB 为单位，缺省为 64
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var maxBodySize: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置最大请求头个数，缺省为 128
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var maxHeadersCount: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置服务器名称，缺省为：fibjs/0.x.0
  	 * 
  	 * 
  	 * @type String
  	 */
  var serverName: java.lang.String = js.native
  /**
  	 * 
  	 * @brief 允许跨域请求
  	 * @param allowHeaders 指定接受的 http 头字段
  	 * 
  	 * 
  	 * 
  	 */
  def enableCrossOrigin(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 允许跨域请求
  	 * @param allowHeaders 指定接受的 http 头字段
  	 * 
  	 * 
  	 * 
  	 */
  def enableCrossOrigin(allowHeaders: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 设置错误处理器
  	 * 
  	 * 使用方式：
  	 * ```JavaScript
  	 * hdlr.onerror({
  	 * "404": function(v)
  	 * {
  	 * ...
  	 * },
  	 * "500": new mq.Routing(...)
  	 * })
  	 * ```
  	 * @param hdlrs 指定不同的错误的处理器，key 是错误号，value 是处理器，可以是内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
  	 * 
  	 * 
  	 * 
  	 */
  def onerror(hdlrs: js.Object): scala.Unit = js.native
}

