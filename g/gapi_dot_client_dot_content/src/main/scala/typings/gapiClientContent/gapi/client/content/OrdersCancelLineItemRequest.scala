package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCancelLineItemRequest extends js.Object {
  /**
    * Amount to refund for the cancelation. Optional. If not set, Google will calculate the default based on the price and tax of the items involved. The
    * amount must not be larger than the net amount left on the order.
    */
  var amount: js.UndefOr[Price] = js.native
  /** The ID of the line item to cancel. */
  var lineItemId: js.UndefOr[String] = js.native
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.native
  /** The quantity to cancel. */
  var quantity: js.UndefOr[Double] = js.native
  /** The reason for the cancellation. */
  var reason: js.UndefOr[String] = js.native
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.native
}

object OrdersCancelLineItemRequest {
  @scala.inline
  def apply(): OrdersCancelLineItemRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCancelLineItemRequest]
  }
  @scala.inline
  implicit class OrdersCancelLineItemRequestOps[Self <: OrdersCancelLineItemRequest] (val x: Self) extends AnyVal {
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
    def setAmount(value: Price): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setLineItemId(value: String): Self = this.set("lineItemId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineItemId: Self = this.set("lineItemId", js.undefined)
    @scala.inline
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setReasonText(value: String): Self = this.set("reasonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonText: Self = this.set("reasonText", js.undefined)
  }
  
}

