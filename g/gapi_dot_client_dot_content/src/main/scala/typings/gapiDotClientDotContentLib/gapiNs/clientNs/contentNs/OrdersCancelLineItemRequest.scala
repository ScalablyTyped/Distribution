package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCancelLineItemRequest extends js.Object {
  /**
    * Amount to refund for the cancelation. Optional. If not set, Google will calculate the default based on the price and tax of the items involved. The
    * amount must not be larger than the net amount left on the order.
    */
  var amount: js.UndefOr[Price] = js.undefined
  /** The ID of the line item to cancel. */
  var lineItemId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  /** The quantity to cancel. */
  var quantity: js.UndefOr[scala.Double] = js.undefined
  /** The reason for the cancellation. */
  var reason: js.UndefOr[java.lang.String] = js.undefined
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCancelLineItemRequest {
  @scala.inline
  def apply(
    amount: Price = null,
    lineItemId: java.lang.String = null,
    operationId: java.lang.String = null,
    quantity: scala.Int | scala.Double = null,
    reason: java.lang.String = null,
    reasonText: java.lang.String = null
  ): OrdersCancelLineItemRequest = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText)
    __obj.asInstanceOf[OrdersCancelLineItemRequest]
  }
}

