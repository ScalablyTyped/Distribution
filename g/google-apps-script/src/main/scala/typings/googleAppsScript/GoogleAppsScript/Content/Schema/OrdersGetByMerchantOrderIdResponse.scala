package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersGetByMerchantOrderIdResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var order: js.UndefOr[Order] = js.native
}

object OrdersGetByMerchantOrderIdResponse {
  @scala.inline
  def apply(): OrdersGetByMerchantOrderIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersGetByMerchantOrderIdResponse]
  }
  @scala.inline
  implicit class OrdersGetByMerchantOrderIdResponseOps[Self <: OrdersGetByMerchantOrderIdResponse] (val x: Self) extends AnyVal {
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
    def setOrder(value: Order): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
  
}

