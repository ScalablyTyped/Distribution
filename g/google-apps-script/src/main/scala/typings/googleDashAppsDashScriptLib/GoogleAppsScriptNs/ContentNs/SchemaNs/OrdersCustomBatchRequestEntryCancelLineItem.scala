package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryCancelLineItem extends js.Object {
  var amount: js.UndefOr[Price] = js.undefined
  var amountPretax: js.UndefOr[Price] = js.undefined
  var amountTax: js.UndefOr[Price] = js.undefined
  var lineItemId: js.UndefOr[java.lang.String] = js.undefined
  var productId: js.UndefOr[java.lang.String] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var reasonText: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCustomBatchRequestEntryCancelLineItem {
  @scala.inline
  def apply(
    amount: Price = null,
    amountPretax: Price = null,
    amountTax: Price = null,
    lineItemId: java.lang.String = null,
    productId: java.lang.String = null,
    quantity: scala.Int | scala.Double = null,
    reason: java.lang.String = null,
    reasonText: java.lang.String = null
  ): OrdersCustomBatchRequestEntryCancelLineItem = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (amountPretax != null) __obj.updateDynamic("amountPretax")(amountPretax)
    if (amountTax != null) __obj.updateDynamic("amountTax")(amountTax)
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText)
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryCancelLineItem]
  }
}

