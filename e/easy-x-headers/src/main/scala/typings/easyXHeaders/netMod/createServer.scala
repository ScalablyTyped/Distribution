package typings.easyXHeaders.netMod

import typings.easyXHeaders.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): Server = js.native
  def apply(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  def apply(options: js.UndefOr[scala.Nothing], connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  def apply(options: `0`): Server = js.native
  def apply(options: `0`, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
}

