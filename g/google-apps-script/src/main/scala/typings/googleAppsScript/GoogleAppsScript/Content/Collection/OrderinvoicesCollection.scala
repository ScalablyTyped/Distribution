package typings.googleAppsScript.GoogleAppsScript.Content.Collection

import typings.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateChargeInvoiceRequest
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateChargeInvoiceResponse
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateRefundInvoiceRequest
import typings.googleAppsScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateRefundInvoiceResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderinvoicesCollection extends js.Object {
  // Creates a charge invoice for a shipment group, and triggers a charge capture for non-facilitated payment orders.
  def createchargeinvoice(resource: OrderinvoicesCreateChargeInvoiceRequest, merchantId: String, orderId: String): OrderinvoicesCreateChargeInvoiceResponse = js.native
  // Creates a refund invoice for one or more shipment groups, and triggers a refund for non-facilitated payment orders. This can only be used for line items that have previously been charged using createChargeInvoice. All amounts (except for the summary) are incremental with respect to the previous invoice.
  def createrefundinvoice(resource: OrderinvoicesCreateRefundInvoiceRequest, merchantId: String, orderId: String): OrderinvoicesCreateRefundInvoiceResponse = js.native
}

object OrderinvoicesCollection {
  @scala.inline
  def apply(
    createchargeinvoice: (OrderinvoicesCreateChargeInvoiceRequest, String, String) => OrderinvoicesCreateChargeInvoiceResponse,
    createrefundinvoice: (OrderinvoicesCreateRefundInvoiceRequest, String, String) => OrderinvoicesCreateRefundInvoiceResponse
  ): OrderinvoicesCollection = {
    val __obj = js.Dynamic.literal(createchargeinvoice = js.Any.fromFunction3(createchargeinvoice), createrefundinvoice = js.Any.fromFunction3(createrefundinvoice))
    __obj.asInstanceOf[OrderinvoicesCollection]
  }
  @scala.inline
  implicit class OrderinvoicesCollectionOps[Self <: OrderinvoicesCollection] (val x: Self) extends AnyVal {
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
    def setCreatechargeinvoice(
      value: (OrderinvoicesCreateChargeInvoiceRequest, String, String) => OrderinvoicesCreateChargeInvoiceResponse
    ): Self = this.set("createchargeinvoice", js.Any.fromFunction3(value))
    @scala.inline
    def setCreaterefundinvoice(
      value: (OrderinvoicesCreateRefundInvoiceRequest, String, String) => OrderinvoicesCreateRefundInvoiceResponse
    ): Self = this.set("createrefundinvoice", js.Any.fromFunction3(value))
  }
  
}

