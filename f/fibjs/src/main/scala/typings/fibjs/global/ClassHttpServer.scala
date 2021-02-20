package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Class_HttpServer")
@js.native
class ClassHttpServer protected ()
  extends typings.fibjs.ClassHttpServer {
  /**
    * 
    * @brief HttpServer 构造函数，在所有本机地址侦听
    * @param port 指定 http 服务器侦听端口
    * @param hdlr http 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
    * 
    * 
    * 
    */
  def this(port: Double, hdlr: typings.fibjs.ClassHandler) = this()
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
  def this(addr: String, port: Double, hdlr: typings.fibjs.ClassHandler) = this()
}
