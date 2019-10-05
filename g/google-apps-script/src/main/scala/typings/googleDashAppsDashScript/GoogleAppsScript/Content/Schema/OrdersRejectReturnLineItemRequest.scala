package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersRejectReturnLineItemRequest extends js.Object {
  var lineItemId: js.UndefOr[String] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var reasonText: js.UndefOr[String] = js.undefined
}

object OrdersRejectReturnLineItemRequest {
  @scala.inline
  def apply(
    lineItemId: String = null,
    operationId: String = null,
    productId: String = null,
    quantity: Int | Double = null,
    reason: String = null,
    reasonText: String = null
  ): OrdersRejectReturnLineItemRequest = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText)
    __obj.asInstanceOf[OrdersRejectReturnLineItemRequest]
  }
}

