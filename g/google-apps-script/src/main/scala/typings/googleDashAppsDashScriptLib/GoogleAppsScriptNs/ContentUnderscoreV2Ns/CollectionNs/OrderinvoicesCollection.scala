package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderinvoicesCollection extends js.Object {
  // Creates a charge invoice for a shipment group, and triggers a charge capture for non-facilitated payment orders.
  def createchargeinvoice(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderinvoicesCreateChargeInvoiceRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderinvoicesCreateChargeInvoiceResponse
  // Creates a refund invoice for one or more shipment groups, and triggers a refund for non-facilitated payment orders. This can only be used for line items that have previously been charged using createChargeInvoice. All amounts (except for the summary) are incremental with respect to the previous invoice.
  def createrefundinvoice(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderinvoicesCreateRefundInvoiceRequest,
    merchantId: java.lang.String,
    orderId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderinvoicesCreateRefundInvoiceResponse
}

object OrderinvoicesCollection {
  @scala.inline
  def apply(
    createchargeinvoice: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderinvoicesCreateChargeInvoiceRequest, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderinvoicesCreateChargeInvoiceResponse,
    createrefundinvoice: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderinvoicesCreateRefundInvoiceRequest, java.lang.String, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs.OrderinvoicesCreateRefundInvoiceResponse
  ): OrderinvoicesCollection = {
    val __obj = js.Dynamic.literal(createchargeinvoice = js.Any.fromFunction3(createchargeinvoice), createrefundinvoice = js.Any.fromFunction3(createrefundinvoice))
  
    __obj.asInstanceOf[OrderinvoicesCollection]
  }
}

