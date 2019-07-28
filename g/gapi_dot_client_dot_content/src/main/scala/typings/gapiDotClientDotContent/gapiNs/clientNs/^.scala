package typings.gapiDotClientDotContent.gapiNs.clientNs

import typings.gapiDotClientDotContent.gapiDotClientDotContentStrings.content
import typings.gapiDotClientDotContent.gapiDotClientDotContentStrings.v2
import typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs.AccountsResource
import typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs.AccountstatusesResource
import typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs.AccounttaxResource
import typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs.DatafeedsResource
import typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs.DatafeedstatusesResource
import typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs.InventoryResource
import typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs.OrdersResource
import typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs.ProductsResource
import typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs.ProductstatusesResource
import typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs.ShippingsettingsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val accounts: AccountsResource = js.native
  val accountstatuses: AccountstatusesResource = js.native
  val accounttax: AccounttaxResource = js.native
  val datafeeds: DatafeedsResource = js.native
  val datafeedstatuses: DatafeedstatusesResource = js.native
  val inventory: InventoryResource = js.native
  val orders: OrdersResource = js.native
  val products: ProductsResource = js.native
  val productstatuses: ProductstatusesResource = js.native
  val shippingsettings: ShippingsettingsResource = js.native
  /** Load Content API for Shopping v2 */
  def load(name: content, version: v2): js.Thenable[Unit] = js.native
  def load(name: content, version: v2, callback: js.Function0[_]): Unit = js.native
}

