package typings.framebus

import typings.framebus.typesMod.global.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("framebus/dist/lib/broadcast", JSImport.Namespace)
@js.native
object broadcastMod extends js.Object {
  def broadcast(frame: Window, payload: String, origin: String): Unit = js.native
}

