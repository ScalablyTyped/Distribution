package typings
package gapiDotClientDotPlaymoviespartnerLib.gapiNs.clientNs.playmoviespartnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsResource extends js.Object {
  var avails: AvailsResource
  var orders: OrdersResource
  var storeInfos: StoreInfosResource
}

object AccountsResource {
  @scala.inline
  def apply(avails: AvailsResource, orders: OrdersResource, storeInfos: StoreInfosResource): AccountsResource = {
    val __obj = js.Dynamic.literal(avails = avails, orders = orders, storeInfos = storeInfos)
  
    __obj.asInstanceOf[AccountsResource]
  }
}

