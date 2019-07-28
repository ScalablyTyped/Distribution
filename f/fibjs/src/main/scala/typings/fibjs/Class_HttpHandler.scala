package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_HttpHandler")
@js.native
class Class_HttpHandler protected () extends Class_HandlerEx {
  /**
  	 * 
  	 * @brief 创建一个 http 协议处理器对象，将流对象的数据转变为 http 消息对象
  	 * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
  	 * 
  	 * 
  	 * 
  	 */
  def this(hdlr: Class_Handler) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置是否允强制使用 gzip 压缩输出，缺省为 false
  	 * 
  	 * 
  	 * @type Boolean
  	 */
  var forceGZIP: Boolean = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置 body 最大尺寸，以 MB 为单位，缺省为 64
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var maxBodySize: Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置最大请求头个数，缺省为 128
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var maxHeadersCount: Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置服务器名称，缺省为：fibjs/0.x.0
  	 * 
  	 * 
  	 * @type String
  	 */
  var serverName: String = js.native
  /**
  	 * 
  	 * @brief 允许跨域请求
  	 * @param allowHeaders 指定接受的 http 头字段
  	 * 
  	 * 
  	 * 
  	 */
  def enableCrossOrigin(): Unit = js.native
  def enableCrossOrigin(allowHeaders: String): Unit = js.native
}

