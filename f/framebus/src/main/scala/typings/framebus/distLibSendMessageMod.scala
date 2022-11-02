package typings.framebus

import typings.framebus.distLibTypesMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSendMessageMod {
  
  @JSImport("framebus/dist/lib/send-message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendMessage(frame: Window, payload: String, origin: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(frame.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
