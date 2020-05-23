package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
  * @brief 消息队列模块
  * @detail 
  */
@JSImport("mq", JSImport.Namespace)
@js.native
object mqMod extends js.Object {
  @js.native
  class Chain () extends ClassChain
  
  @js.native
  class Handler () extends ClassHandler
  
  @js.native
  class HttpHandler () extends ClassHttpHandler
  
  @js.native
  class Message () extends ClassMessage
  
  @js.native
  class Routing () extends ClassRouting
  
  def invoke(hdlr: ClassHandler, v: ClassObject): Unit = js.native
  def nullHandler(): ClassHandler = js.native
}

