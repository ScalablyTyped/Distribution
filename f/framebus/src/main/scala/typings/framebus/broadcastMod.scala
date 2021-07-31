package typings.framebus

import typings.framebus.typesMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastMod {
  
  @JSImport("framebus/dist/lib/broadcast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def broadcast(frame: Window, payload: String, origin: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcast")(frame.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
