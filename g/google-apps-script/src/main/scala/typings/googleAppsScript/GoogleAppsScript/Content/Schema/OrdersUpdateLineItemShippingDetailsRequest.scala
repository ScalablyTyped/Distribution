package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersUpdateLineItemShippingDetailsRequest extends js.Object {
  var deliverByDate: js.UndefOr[String] = js.native
  var lineItemId: js.UndefOr[String] = js.native
  var operationId: js.UndefOr[String] = js.native
  var productId: js.UndefOr[String] = js.native
  var shipByDate: js.UndefOr[String] = js.native
}

object OrdersUpdateLineItemShippingDetailsRequest {
  @scala.inline
  def apply(): OrdersUpdateLineItemShippingDetailsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersUpdateLineItemShippingDetailsRequest]
  }
  @scala.inline
  implicit class OrdersUpdateLineItemShippingDetailsRequestOps[Self <: OrdersUpdateLineItemShippingDetailsRequest] (val x: Self) extends AnyVal {
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
    def setDeliverByDate(value: String): Self = this.set("deliverByDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliverByDate: Self = this.set("deliverByDate", js.undefined)
    @scala.inline
    def setLineItemId(value: String): Self = this.set("lineItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineItemId: Self = this.set("lineItemId", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setShipByDate(value: String): Self = this.set("shipByDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShipByDate: Self = this.set("shipByDate", js.undefined)
  }
  
}

