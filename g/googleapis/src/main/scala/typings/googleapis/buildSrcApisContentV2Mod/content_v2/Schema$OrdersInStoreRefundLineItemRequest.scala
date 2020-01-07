package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersInStoreRefundLineItemRequest extends js.Object {
  /**
    * The amount that is refunded. Required.
    */
  var amountPretax: js.UndefOr[Schema$Price] = js.native
  /**
    * Tax amount that correspond to refund amount in amountPretax. Required.
    */
  var amountTax: js.UndefOr[Schema$Price] = js.native
  /**
    * The ID of the line item to return. Either lineItemId or productId is
    * required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * The ID of the product to return. This is the REST ID used in the products
    * service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The quantity to return and refund.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * The reason for the return.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.native
}

object Schema$OrdersInStoreRefundLineItemRequest {
  @scala.inline
  def apply(
    amountPretax: Schema$Price = null,
    amountTax: Schema$Price = null,
    lineItemId: String = null,
    operationId: String = null,
    productId: String = null,
    quantity: Int | Double = null,
    reason: String = null,
    reasonText: String = null
  ): Schema$OrdersInStoreRefundLineItemRequest = {
    val __obj = js.Dynamic.literal()
    if (amountPretax != null) __obj.updateDynamic("amountPretax")(amountPretax.asInstanceOf[js.Any])
    if (amountTax != null) __obj.updateDynamic("amountTax")(amountTax.asInstanceOf[js.Any])
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersInStoreRefundLineItemRequest]
  }
}

