package typings.gapiDotClientDotContent.gapi.client.content

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
  var lineItemId: js.UndefOr[String] = js.undefined
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
  /** The quantity to cancel. */
  var quantity: js.UndefOr[Double] = js.undefined
  /** The reason for the cancellation. */
  var reason: js.UndefOr[String] = js.undefined
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.undefined
}

object OrdersCancelLineItemRequest {
  @scala.inline
  def apply(
    amount: Price = null,
    lineItemId: String = null,
    operationId: String = null,
    quantity: Int | Double = null,
    reason: String = null,
    reasonText: String = null
  ): OrdersCancelLineItemRequest = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersCancelLineItemRequest]
  }
}

