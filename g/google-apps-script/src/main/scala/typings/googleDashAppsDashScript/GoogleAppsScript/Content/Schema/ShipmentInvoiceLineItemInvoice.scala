package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShipmentInvoiceLineItemInvoice extends js.Object {
  var lineItemId: js.UndefOr[String] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
  var shipmentUnitIds: js.UndefOr[js.Array[String]] = js.undefined
  var unitInvoice: js.UndefOr[UnitInvoice] = js.undefined
}

object ShipmentInvoiceLineItemInvoice {
  @scala.inline
  def apply(
    lineItemId: String = null,
    productId: String = null,
    shipmentUnitIds: js.Array[String] = null,
    unitInvoice: UnitInvoice = null
  ): ShipmentInvoiceLineItemInvoice = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (shipmentUnitIds != null) __obj.updateDynamic("shipmentUnitIds")(shipmentUnitIds.asInstanceOf[js.Any])
    if (unitInvoice != null) __obj.updateDynamic("unitInvoice")(unitInvoice.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShipmentInvoiceLineItemInvoice]
  }
}

