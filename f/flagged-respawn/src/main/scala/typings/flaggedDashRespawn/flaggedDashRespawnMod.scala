package typings.flaggedDashRespawn

import typings.node.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flagged-respawn", JSImport.Namespace)
@js.native
object flaggedDashRespawnMod extends js.Object {
  def apply(flags: js.Array[String], argv: js.Array[String], callback: Callback): Unit = js.native
  def apply(flags: js.Array[String], argv: js.Array[String], forcedFlags: String, callback: Callback): Unit = js.native
  def apply(flags: js.Array[String], argv: js.Array[String], forcedFlags: js.Array[String], callback: Callback): Unit = js.native
  type Callback = js.Function3[/* ready */ Boolean, /* proc */ Process, /* argv */ js.Array[String], Unit]
}

