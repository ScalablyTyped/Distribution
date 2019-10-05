package typings.easyDashXDashHeaders.netMod

import typings.easyDashXDashHeaders.Anon_AllowHalfOpenBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): Server = js.native
  def apply(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  def apply(options: Anon_AllowHalfOpenBoolean): Server = js.native
  def apply(options: Anon_AllowHalfOpenBoolean, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
}

