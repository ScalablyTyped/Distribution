package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShipmentInvoiceLineItemInvoice extends js.Object {
  var lineItemId: js.UndefOr[java.lang.String] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
  var shipmentUnitIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var unitInvoice: js.UndefOr[UnitInvoice] = js.undefined
}

object ShipmentInvoiceLineItemInvoice {
  @scala.inline
  def apply(
    lineItemId: java.lang.String = null,
    productId: java.lang.String = null,
    shipmentUnitIds: js.Array[java.lang.String] = null,
    unitInvoice: UnitInvoice = null
  ): ShipmentInvoiceLineItemInvoice = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (shipmentUnitIds != null) __obj.updateDynamic("shipmentUnitIds")(shipmentUnitIds)
    if (unitInvoice != null) __obj.updateDynamic("unitInvoice")(unitInvoice)
    __obj.asInstanceOf[ShipmentInvoiceLineItemInvoice]
  }
}

