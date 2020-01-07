package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ShipmentInvoice extends js.Object {
  /**
    * [required] Invoice summary.
    */
  var invoiceSummary: js.UndefOr[Schema$InvoiceSummary] = js.native
  /**
    * [required] Invoice details per line item.
    */
  var lineItemInvoices: js.UndefOr[js.Array[Schema$ShipmentInvoiceLineItemInvoice]] = js.native
  /**
    * [required] ID of the shipment group. It is assigned by the merchant in
    * the shipLineItems method and is used to group multiple line items that
    * have the same kind of shipping charges.
    */
  var shipmentGroupId: js.UndefOr[String] = js.native
}

object Schema$ShipmentInvoice {
  @scala.inline
  def apply(
    invoiceSummary: Schema$InvoiceSummary = null,
    lineItemInvoices: js.Array[Schema$ShipmentInvoiceLineItemInvoice] = null,
    shipmentGroupId: String = null
  ): Schema$ShipmentInvoice = {
    val __obj = js.Dynamic.literal()
    if (invoiceSummary != null) __obj.updateDynamic("invoiceSummary")(invoiceSummary.asInstanceOf[js.Any])
    if (lineItemInvoices != null) __obj.updateDynamic("lineItemInvoices")(lineItemInvoices.asInstanceOf[js.Any])
    if (shipmentGroupId != null) __obj.updateDynamic("shipmentGroupId")(shipmentGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShipmentInvoice]
  }
}

