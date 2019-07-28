package typings.gapiDotClientDotManufacturers.gapiNs.clientNs

import typings.gapiDotClientDotManufacturers.gapiDotClientDotManufacturersStrings.manufacturers
import typings.gapiDotClientDotManufacturers.gapiDotClientDotManufacturersStrings.v1
import typings.gapiDotClientDotManufacturers.gapiNs.clientNs.manufacturersNs.AccountsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val accounts: AccountsResource = js.native
  /** Load Manufacturer Center API v1 */
  def load(name: manufacturers, version: v1): js.Thenable[Unit] = js.native
  def load(name: manufacturers, version: v1, callback: js.Function0[_]): Unit = js.native
}

