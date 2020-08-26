package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var orders: js.UndefOr[js.Array[Order]] = js.native
}

object OrdersListResponse {
  @scala.inline
  def apply(): OrdersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersListResponse]
  }
  @scala.inline
  implicit class OrdersListResponseOps[Self <: OrdersListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setOrdersVarargs(value: Order*): Self = this.set("orders", js.Array(value :_*))
    @scala.inline
    def setOrders(value: js.Array[Order]): Self = this.set("orders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrders: Self = this.set("orders", js.undefined)
  }
  
}

