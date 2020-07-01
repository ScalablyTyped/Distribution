package typings.framebus

import typings.framebus.typesMod.global.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("framebus/dist/lib/broadcast-to-child-windows", JSImport.Namespace)
@js.native
object broadcastToChildWindowsMod extends js.Object {
  def broadcastToChildWindows(payload: String, origin: String, source: Window): Unit = js.native
}

