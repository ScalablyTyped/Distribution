package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderinvoicesCreateChargeInvoiceRequest extends js.Object {
  var invoiceId: js.UndefOr[String] = js.undefined
  var invoiceSummary: js.UndefOr[InvoiceSummary] = js.undefined
  var lineItemInvoices: js.UndefOr[js.Array[ShipmentInvoiceLineItemInvoice]] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
  var shipmentGroupId: js.UndefOr[String] = js.undefined
}

object OrderinvoicesCreateChargeInvoiceRequest {
  @scala.inline
  def apply(
    invoiceId: String = null,
    invoiceSummary: InvoiceSummary = null,
    lineItemInvoices: js.Array[ShipmentInvoiceLineItemInvoice] = null,
    operationId: String = null,
    shipmentGroupId: String = null
  ): OrderinvoicesCreateChargeInvoiceRequest = {
    val __obj = js.Dynamic.literal()
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId.asInstanceOf[js.Any])
    if (invoiceSummary != null) __obj.updateDynamic("invoiceSummary")(invoiceSummary.asInstanceOf[js.Any])
    if (lineItemInvoices != null) __obj.updateDynamic("lineItemInvoices")(lineItemInvoices.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (shipmentGroupId != null) __obj.updateDynamic("shipmentGroupId")(shipmentGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderinvoicesCreateChargeInvoiceRequest]
  }
}

