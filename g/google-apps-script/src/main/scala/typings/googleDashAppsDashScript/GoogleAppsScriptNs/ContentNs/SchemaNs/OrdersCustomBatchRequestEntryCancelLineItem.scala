package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryCancelLineItem extends js.Object {
  var amount: js.UndefOr[Price] = js.undefined
  var amountPretax: js.UndefOr[Price] = js.undefined
  var amountTax: js.UndefOr[Price] = js.undefined
  var lineItemId: js.UndefOr[String] = js.undefined
  var productId: js.UndefOr[String] = js.undefined
  var quantity: js.UndefOr[Double] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
  var reasonText: js.UndefOr[String] = js.undefined
}

object OrdersCustomBatchRequestEntryCancelLineItem {
  @scala.inline
  def apply(
    amount: Price = null,
    amountPretax: Price = null,
    amountTax: Price = null,
    lineItemId: String = null,
    productId: String = null,
    quantity: Int | Double = null,
    reason: String = null,
    reasonText: String = null
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

