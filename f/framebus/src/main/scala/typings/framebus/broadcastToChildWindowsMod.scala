package typings.framebus

import typings.framebus.typesMod.global.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastToChildWindowsMod {
  
  @JSImport("framebus/dist/lib/broadcast-to-child-windows", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def broadcastToChildWindows(payload: String, origin: String, source: Window): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("broadcastToChildWindows")(payload.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
