package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersCancelLineItemRequest extends js.Object {
  /**
    * Deprecated. Please use amountPretax and amountTax instead.
    */
  var amount: js.UndefOr[Schema$Price] = js.native
  /**
    * Amount to refund for the cancelation. Optional. If not set, Google will
    * calculate the default based on the price and tax of the items involved.
    * The amount must not be larger than the net amount left on the order.
    */
  var amountPretax: js.UndefOr[Schema$Price] = js.native
  /**
    * Tax amount that corresponds to cancellation amount in amountPretax.
    * Optional, but if filled, then amountPretax must be set. Calculated
    * automatically if not provided.
    */
  var amountTax: js.UndefOr[Schema$Price] = js.native
  /**
    * The ID of the line item to cancel. Either lineItemId or productId is
    * required.
    */
  var lineItemId: js.UndefOr[String] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * The ID of the product to cancel. This is the REST ID used in the products
    * service. Either lineItemId or productId is required.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The quantity to cancel.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * The reason for the cancellation.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.native
}

object Schema$OrdersCancelLineItemRequest {
  @scala.inline
  def apply(
    amount: Schema$Price = null,
    amountPretax: Schema$Price = null,
    amountTax: Schema$Price = null,
    lineItemId: String = null,
    operationId: String = null,
    productId: String = null,
    quantity: Int | Double = null,
    reason: String = null,
    reasonText: String = null
  ): Schema$OrdersCancelLineItemRequest = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (amountPretax != null) __obj.updateDynamic("amountPretax")(amountPretax.asInstanceOf[js.Any])
    if (amountTax != null) __obj.updateDynamic("amountTax")(amountTax.asInstanceOf[js.Any])
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersCancelLineItemRequest]
  }
}

