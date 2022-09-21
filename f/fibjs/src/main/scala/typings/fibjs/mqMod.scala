package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 消息队列模块
  * @detail 
  */
object mqMod {
  
  @JSImport("mq", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mq", "Chain")
  @js.native
  open class Chain ()
    extends StObject
       with ClassChain
  
  @JSImport("mq", "Handler")
  @js.native
  open class Handler ()
    extends StObject
       with ClassHandler
  
  @JSImport("mq", "HttpHandler")
  @js.native
  open class HttpHandler ()
    extends StObject
       with ClassHttpHandler
  
  @JSImport("mq", "Message")
  @js.native
  open class Message ()
    extends StObject
       with ClassMessage
  
  @JSImport("mq", "Routing")
  @js.native
  open class Routing ()
    extends StObject
       with ClassRouting
  
  inline def invoke(hdlr: ClassHandler, v: ClassObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(hdlr.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def nullHandler(): ClassHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("nullHandler")().asInstanceOf[ClassHandler]
}
