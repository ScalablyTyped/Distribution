package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShipmentInvoice extends js.Object {
  var invoiceSummary: js.UndefOr[InvoiceSummary] = js.undefined
  var lineItemInvoices: js.UndefOr[js.Array[ShipmentInvoiceLineItemInvoice]] = js.undefined
  var shipmentGroupId: js.UndefOr[String] = js.undefined
}

object ShipmentInvoice {
  @scala.inline
  def apply(
    invoiceSummary: InvoiceSummary = null,
    lineItemInvoices: js.Array[ShipmentInvoiceLineItemInvoice] = null,
    shipmentGroupId: String = null
  ): ShipmentInvoice = {
    val __obj = js.Dynamic.literal()
    if (invoiceSummary != null) __obj.updateDynamic("invoiceSummary")(invoiceSummary.asInstanceOf[js.Any])
    if (lineItemInvoices != null) __obj.updateDynamic("lineItemInvoices")(lineItemInvoices.asInstanceOf[js.Any])
    if (shipmentGroupId != null) __obj.updateDynamic("shipmentGroupId")(shipmentGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShipmentInvoice]
  }
}

