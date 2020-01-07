package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersRefundRequest extends js.Object {
  /**
    * Deprecated. Please use amountPretax and amountTax instead.
    */
  var amount: js.UndefOr[Schema$Price] = js.native
  /**
    * The amount that is refunded. Either amount or amountPretax should be
    * filled.
    */
  var amountPretax: js.UndefOr[Schema$Price] = js.native
  /**
    * Tax amount that corresponds to refund amount in amountPretax. Optional,
    * but if filled, amountPretax must be set. Calculated automatically if not
    * provided.
    */
  var amountTax: js.UndefOr[Schema$Price] = js.native
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * The reason for the refund.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.native
}

object Schema$OrdersRefundRequest {
  @scala.inline
  def apply(
    amount: Schema$Price = null,
    amountPretax: Schema$Price = null,
    amountTax: Schema$Price = null,
    operationId: String = null,
    reason: String = null,
    reasonText: String = null
  ): Schema$OrdersRefundRequest = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (amountPretax != null) __obj.updateDynamic("amountPretax")(amountPretax.asInstanceOf[js.Any])
    if (amountTax != null) __obj.updateDynamic("amountTax")(amountTax.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersRefundRequest]
  }
}

