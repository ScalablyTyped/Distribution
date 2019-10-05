package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateChargeInvoiceRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateChargeInvoiceResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateRefundInvoiceRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema.OrderinvoicesCreateRefundInvoiceResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderinvoicesCollection extends js.Object {
  // Creates a charge invoice for a shipment group, and triggers a charge capture for non-facilitated payment orders.
  def createchargeinvoice(resource: OrderinvoicesCreateChargeInvoiceRequest, merchantId: String, orderId: String): OrderinvoicesCreateChargeInvoiceResponse
  // Creates a refund invoice for one or more shipment groups, and triggers a refund for non-facilitated payment orders. This can only be used for line items that have previously been charged using createChargeInvoice. All amounts (except for the summary) are incremental with respect to the previous invoice.
  def createrefundinvoice(resource: OrderinvoicesCreateRefundInvoiceRequest, merchantId: String, orderId: String): OrderinvoicesCreateRefundInvoiceResponse
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
}

