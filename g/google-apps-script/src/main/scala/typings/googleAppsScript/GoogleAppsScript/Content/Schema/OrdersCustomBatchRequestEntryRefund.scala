package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrdersCustomBatchRequestEntryRefund extends js.Object {
  var amount: js.UndefOr[Price] = js.native
  var amountPretax: js.UndefOr[Price] = js.native
  var amountTax: js.UndefOr[Price] = js.native
  var reason: js.UndefOr[String] = js.native
  var reasonText: js.UndefOr[String] = js.native
}

object OrdersCustomBatchRequestEntryRefund {
  @scala.inline
  def apply(): OrdersCustomBatchRequestEntryRefund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryRefund]
  }
  @scala.inline
  implicit class OrdersCustomBatchRequestEntryRefundOps[Self <: OrdersCustomBatchRequestEntryRefund] (val x: Self) extends AnyVal {
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
    def setAmountPretax(value: Price): Self = this.set("amountPretax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmountPretax: Self = this.set("amountPretax", js.undefined)
    @scala.inline
    def setAmountTax(value: Price): Self = this.set("amountTax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmountTax: Self = this.set("amountTax", js.undefined)
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

