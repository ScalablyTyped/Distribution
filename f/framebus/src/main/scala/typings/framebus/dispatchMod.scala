package typings.framebus

import typings.framebus.typesMod.FramebusSubscribeHandler
import typings.framebus.typesMod.FramebusSubscriberArg
import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dispatchMod {
  
  @JSImport("framebus/dist/lib/dispatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dispatch(origin: String, event: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(origin.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dispatch(origin: String, event: String, data: Unit, reply: Unit, e: MessageEvent[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(origin.asInstanceOf[js.Any], event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], reply.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dispatch(origin: String, event: String, data: Unit, reply: FramebusSubscribeHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(origin.asInstanceOf[js.Any], event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], reply.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dispatch(
    origin: String,
    event: String,
    data: Unit,
    reply: FramebusSubscribeHandler,
    e: MessageEvent[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(origin.asInstanceOf[js.Any], event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], reply.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dispatch(origin: String, event: String, data: FramebusSubscriberArg): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(origin.asInstanceOf[js.Any], event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dispatch(origin: String, event: String, data: FramebusSubscriberArg, reply: Unit, e: MessageEvent[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(origin.asInstanceOf[js.Any], event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], reply.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dispatch(origin: String, event: String, data: FramebusSubscriberArg, reply: FramebusSubscribeHandler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(origin.asInstanceOf[js.Any], event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], reply.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dispatch(
    origin: String,
    event: String,
    data: FramebusSubscriberArg,
    reply: FramebusSubscribeHandler,
    e: MessageEvent[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dispatch")(origin.asInstanceOf[js.Any], event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], reply.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
