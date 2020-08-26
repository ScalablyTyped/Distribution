package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsResource extends js.Object {
  var avails: AvailsResource = js.native
  var orders: OrdersResource = js.native
  var storeInfos: StoreInfosResource = js.native
}

object AccountsResource {
  @scala.inline
  def apply(avails: AvailsResource, orders: OrdersResource, storeInfos: StoreInfosResource): AccountsResource = {
    val __obj = js.Dynamic.literal(avails = avails.asInstanceOf[js.Any], orders = orders.asInstanceOf[js.Any], storeInfos = storeInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsResource]
  }
  @scala.inline
  implicit class AccountsResourceOps[Self <: AccountsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvails(value: AvailsResource): Self = this.set("avails", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrders(value: OrdersResource): Self = this.set("orders", value.asInstanceOf[js.Any])
    @scala.inline
    def setStoreInfos(value: StoreInfosResource): Self = this.set("storeInfos", value.asInstanceOf[js.Any])
  }
  
}

