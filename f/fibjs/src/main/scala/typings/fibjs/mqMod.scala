package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 消息队列模块
  * @detail 
  */
object mqMod {
  
  @JSImport("mq", "Chain")
  @js.native
  class Chain () extends ClassChain
  
  @JSImport("mq", "Handler")
  @js.native
  class Handler () extends ClassHandler
  
  @JSImport("mq", "HttpHandler")
  @js.native
  class HttpHandler () extends ClassHttpHandler
  
  @JSImport("mq", "Message")
  @js.native
  class Message () extends ClassMessage
  
  @JSImport("mq", "Routing")
  @js.native
  class Routing () extends ClassRouting
  
  @JSImport("mq", "invoke")
  @js.native
  def invoke(hdlr: ClassHandler, v: ClassObject): Unit = js.native
  
  @JSImport("mq", "nullHandler")
  @js.native
  def nullHandler(): ClassHandler = js.native
}
