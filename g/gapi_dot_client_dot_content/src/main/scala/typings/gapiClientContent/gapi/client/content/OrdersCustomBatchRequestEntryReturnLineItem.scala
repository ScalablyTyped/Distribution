package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryReturnLineItem extends js.Object {
  /** The ID of the line item to return. */
  var lineItemId: js.UndefOr[String] = js.undefined
  /** The quantity to return. */
  var quantity: js.UndefOr[Double] = js.undefined
  /** The reason for the return. */
  var reason: js.UndefOr[String] = js.undefined
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.undefined
}

object OrdersCustomBatchRequestEntryReturnLineItem {
  @scala.inline
  def apply(
    lineItemId: String = null,
    quantity: Int | Double = null,
    reason: String = null,
    reasonText: String = null
  ): OrdersCustomBatchRequestEntryReturnLineItem = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryReturnLineItem]
  }
}

