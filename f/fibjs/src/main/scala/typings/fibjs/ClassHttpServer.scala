package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassHttpServer
  extends StObject
     with ClassTcpServer {
  
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
  var httpStats: ClassStats = js.native
  
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
  def onerror(hdlrs: js.Object): Unit = js.native
  
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
}
