package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderinvoicesCreateChargeInvoiceRequest extends js.Object {
  var invoiceId: js.UndefOr[java.lang.String] = js.undefined
  var invoiceSummary: js.UndefOr[InvoiceSummary] = js.undefined
  var lineItemInvoices: js.UndefOr[js.Array[ShipmentInvoiceLineItemInvoice]] = js.undefined
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var shipmentGroupId: js.UndefOr[java.lang.String] = js.undefined
}

object OrderinvoicesCreateChargeInvoiceRequest {
  @scala.inline
  def apply(
    invoiceId: java.lang.String = null,
    invoiceSummary: InvoiceSummary = null,
    lineItemInvoices: js.Array[ShipmentInvoiceLineItemInvoice] = null,
    operationId: java.lang.String = null,
    shipmentGroupId: java.lang.String = null
  ): OrderinvoicesCreateChargeInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId)
    if (invoiceSummary != null) __obj.updateDynamic("invoiceSummary")(invoiceSummary)
    if (lineItemInvoices != null) __obj.updateDynamic("lineItemInvoices")(lineItemInvoices)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (shipmentGroupId != null) __obj.updateDynamic("shipmentGroupId")(shipmentGroupId)
    __obj.asInstanceOf[OrderinvoicesCreateChargeInvoiceRequest]
  }
}

