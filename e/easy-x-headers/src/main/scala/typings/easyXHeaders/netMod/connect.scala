package typings.easyXHeaders.netMod

import typings.easyXHeaders.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", "connect")
@js.native
object connect extends js.Object {
  def apply(options: `0`): Socket = js.native
  def apply(options: `0`, connectionListener: js.Function): Socket = js.native
  def apply(path: String): Socket = js.native
  def apply(path: String, connectionListener: js.Function): Socket = js.native
  def apply(port: Double): Socket = js.native
  def apply(port: Double, host: js.UndefOr[scala.Nothing], connectionListener: js.Function): Socket = js.native
  def apply(port: Double, host: String): Socket = js.native
  def apply(port: Double, host: String, connectionListener: js.Function): Socket = js.native
}

