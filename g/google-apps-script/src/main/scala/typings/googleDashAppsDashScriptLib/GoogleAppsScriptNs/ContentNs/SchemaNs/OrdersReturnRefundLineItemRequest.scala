package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersReturnRefundLineItemRequest extends js.Object {
  var amountPretax: js.UndefOr[Price] = js.undefined
  var amountTax: js.UndefOr[Price] = js.undefined
  var lineItemId: js.UndefOr[java.lang.String] = js.undefined
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var reasonText: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersReturnRefundLineItemRequest {
  @scala.inline
  def apply(
    amountPretax: Price = null,
    amountTax: Price = null,
    lineItemId: java.lang.String = null,
    operationId: java.lang.String = null,
    productId: java.lang.String = null,
    quantity: scala.Int | scala.Double = null,
    reason: java.lang.String = null,
    reasonText: java.lang.String = null
  ): OrdersReturnRefundLineItemRequest = {
    val __obj = js.Dynamic.literal()
    if (amountPretax != null) __obj.updateDynamic("amountPretax")(amountPretax)
    if (amountTax != null) __obj.updateDynamic("amountTax")(amountTax)
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText)
    __obj.asInstanceOf[OrdersReturnRefundLineItemRequest]
  }
}

