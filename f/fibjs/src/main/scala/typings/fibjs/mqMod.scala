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
  class Chain () extends Class_Chain
  
  @js.native
  class Handler () extends Class_Handler
  
  @js.native
  class HttpHandler () extends Class_HttpHandler
  
  @js.native
  class Message () extends Class_Message
  
  @js.native
  class Routing () extends Class_Routing
  
  def invoke(hdlr: Class_Handler, v: Class__object): Unit = js.native
  def nullHandler(): Class_Handler = js.native
}

