package typings.easyXapiSupertest.netMod

import typings.easyXapiSupertest.anon.AllowHalfOpenBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", "createServer")
@js.native
object createServer extends js.Object {
  def apply(): Server = js.native
  def apply(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  def apply(options: AllowHalfOpenBoolean): Server = js.native
  def apply(options: AllowHalfOpenBoolean, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
}

