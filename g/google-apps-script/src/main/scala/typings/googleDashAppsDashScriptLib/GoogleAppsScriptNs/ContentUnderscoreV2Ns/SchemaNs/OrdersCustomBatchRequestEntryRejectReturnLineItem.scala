package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryRejectReturnLineItem extends js.Object {
  var lineItemId: js.UndefOr[java.lang.String] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var reasonText: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCustomBatchRequestEntryRejectReturnLineItem {
  @scala.inline
  def apply(
    lineItemId: java.lang.String = null,
    productId: java.lang.String = null,
    quantity: scala.Int | scala.Double = null,
    reason: java.lang.String = null,
    reasonText: java.lang.String = null
  ): OrdersCustomBatchRequestEntryRejectReturnLineItem = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText)
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryRejectReturnLineItem]
  }
}

