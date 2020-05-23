package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersReturnLineItemRequest extends js.Object {
  /** The ID of the line item to return. */
  var lineItemId: js.UndefOr[String] = js.undefined
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
  /** The quantity to return. */
  var quantity: js.UndefOr[Double] = js.undefined
  /** The reason for the return. */
  var reason: js.UndefOr[String] = js.undefined
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.undefined
}

object OrdersReturnLineItemRequest {
  @scala.inline
  def apply(
    lineItemId: String = null,
    operationId: String = null,
    quantity: js.UndefOr[Double] = js.undefined,
    reason: String = null,
    reasonText: String = null
  ): OrdersReturnLineItemRequest = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (!js.isUndefined(quantity)) __obj.updateDynamic("quantity")(quantity.get.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersReturnLineItemRequest]
  }
}

