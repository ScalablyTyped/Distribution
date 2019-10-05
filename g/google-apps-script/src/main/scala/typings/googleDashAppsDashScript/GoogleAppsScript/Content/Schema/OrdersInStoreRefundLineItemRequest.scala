package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersInStoreRefundLineItemRequest extends js.Object {
  var amountPretax: js.UndefOr[Price] = js.undefined
  var amountTax: js.UndefOr[Price] = js.undefined
  var lineItemId: js.UndefOr[String] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var reasonText: js.UndefOr[String] = js.undefined
}

object OrdersInStoreRefundLineItemRequest {
  @scala.inline
  def apply(
    amountPretax: Price = null,
    amountTax: Price = null,
    lineItemId: String = null,
    operationId: String = null,
    productId: String = null,
    quantity: Int | Double = null,
    reason: String = null,
    reasonText: String = null
  ): OrdersInStoreRefundLineItemRequest = {
    val __obj = js.Dynamic.literal()
    if (amountPretax != null) __obj.updateDynamic("amountPretax")(amountPretax)
    if (amountTax != null) __obj.updateDynamic("amountTax")(amountTax)
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText)
    __obj.asInstanceOf[OrdersInStoreRefundLineItemRequest]
  }
}

