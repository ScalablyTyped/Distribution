package typings.easyDashXapiDashSupertest.netMod

import typings.easyDashXapiDashSupertest.Anon_AllowHalfOpenBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", "connect")
@js.native
object connect extends js.Object {
  def apply(options: Anon_AllowHalfOpenBoolean): Socket = js.native
  def apply(options: Anon_AllowHalfOpenBoolean, connectionListener: js.Function): Socket = js.native
  def apply(path: String): Socket = js.native
  def apply(path: String, connectionListener: js.Function): Socket = js.native
  def apply(port: Double): Socket = js.native
  def apply(port: Double, host: String): Socket = js.native
  def apply(port: Double, host: String, connectionListener: js.Function): Socket = js.native
}

