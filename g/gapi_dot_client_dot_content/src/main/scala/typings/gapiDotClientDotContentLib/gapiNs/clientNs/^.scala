package typings
package gapiDotClientDotContentLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val accounts: gapiDotClientDotContentLib.gapiNs.clientNs.contentNs.AccountsResource = js.native
  val accountstatuses: gapiDotClientDotContentLib.gapiNs.clientNs.contentNs.AccountstatusesResource = js.native
  val accounttax: gapiDotClientDotContentLib.gapiNs.clientNs.contentNs.AccounttaxResource = js.native
  val datafeeds: gapiDotClientDotContentLib.gapiNs.clientNs.contentNs.DatafeedsResource = js.native
  val datafeedstatuses: gapiDotClientDotContentLib.gapiNs.clientNs.contentNs.DatafeedstatusesResource = js.native
  val inventory: gapiDotClientDotContentLib.gapiNs.clientNs.contentNs.InventoryResource = js.native
  val orders: gapiDotClientDotContentLib.gapiNs.clientNs.contentNs.OrdersResource = js.native
  val products: gapiDotClientDotContentLib.gapiNs.clientNs.contentNs.ProductsResource = js.native
  val productstatuses: gapiDotClientDotContentLib.gapiNs.clientNs.contentNs.ProductstatusesResource = js.native
  val shippingsettings: gapiDotClientDotContentLib.gapiNs.clientNs.contentNs.ShippingsettingsResource = js.native
  /** Load Content API for Shopping v2 */
  def load(
    name: gapiDotClientDotContentLib.gapiDotClientDotContentLibStrings.content,
    version: gapiDotClientDotContentLib.gapiDotClientDotContentLibStrings.v2
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotContentLib.gapiDotClientDotContentLibStrings.content,
    version: gapiDotClientDotContentLib.gapiDotClientDotContentLibStrings.v2,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

