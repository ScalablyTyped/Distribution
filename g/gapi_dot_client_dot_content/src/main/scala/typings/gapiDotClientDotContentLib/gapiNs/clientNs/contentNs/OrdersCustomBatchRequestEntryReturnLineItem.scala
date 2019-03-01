package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryReturnLineItem extends js.Object {
  /** The ID of the line item to return. */
  var lineItemId: js.UndefOr[java.lang.String] = js.undefined
  /** The quantity to return. */
  var quantity: js.UndefOr[scala.Double] = js.undefined
  /** The reason for the return. */
  var reason: js.UndefOr[java.lang.String] = js.undefined
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCustomBatchRequestEntryReturnLineItem {
  @scala.inline
  def apply(
    lineItemId: java.lang.String = null,
    quantity: scala.Int | scala.Double = null,
    reason: java.lang.String = null,
    reasonText: java.lang.String = null
  ): OrdersCustomBatchRequestEntryReturnLineItem = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText)
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryReturnLineItem]
  }
}

