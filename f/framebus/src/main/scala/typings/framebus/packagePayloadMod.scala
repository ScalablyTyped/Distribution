package typings.framebus

import typings.framebus.typesMod.FramebusSubscribeHandler
import typings.framebus.typesMod.FramebusSubscriberArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packagePayloadMod {
  
  @JSImport("framebus/dist/lib/package-payload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def packagePayload(event: String, origin: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("packagePayload")(event.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def packagePayload(event: String, origin: String, data: Unit, reply: FramebusSubscribeHandler): String = (^.asInstanceOf[js.Dynamic].applyDynamic("packagePayload")(event.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], data.asInstanceOf[js.Any], reply.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def packagePayload(event: String, origin: String, data: FramebusSubscriberArg): String = (^.asInstanceOf[js.Dynamic].applyDynamic("packagePayload")(event.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def packagePayload(event: String, origin: String, data: FramebusSubscriberArg, reply: FramebusSubscribeHandler): String = (^.asInstanceOf[js.Dynamic].applyDynamic("packagePayload")(event.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], data.asInstanceOf[js.Any], reply.asInstanceOf[js.Any])).asInstanceOf[String]
}
