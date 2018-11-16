package typings
package gapiDotClientDotManufacturersLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val accounts: gapiDotClientDotManufacturersLib.gapiNs.clientNs.manufacturersNs.AccountsResource = js.native
  /** Load Manufacturer Center API v1 */
  def load(
    name: gapiDotClientDotManufacturersLib.gapiDotClientDotManufacturersLibStrings.manufacturers,
    version: gapiDotClientDotManufacturersLib.gapiDotClientDotManufacturersLibStrings.v1
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotManufacturersLib.gapiDotClientDotManufacturersLibStrings.manufacturers,
    version: gapiDotClientDotManufacturersLib.gapiDotClientDotManufacturersLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

