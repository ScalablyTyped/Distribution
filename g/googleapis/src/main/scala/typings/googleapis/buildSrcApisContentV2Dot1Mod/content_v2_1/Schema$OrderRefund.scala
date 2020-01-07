package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderRefund extends js.Object {
  /**
    * The actor that created the refund.
    */
  var actor: js.UndefOr[String] = js.native
  /**
    * The amount that is refunded.
    */
  var amount: js.UndefOr[Schema$Price] = js.native
  /**
    * Date on which the item has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.native
  /**
    * The reason for the refund.
    */
  var reason: js.UndefOr[String] = js.native
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.native
}

object Schema$OrderRefund {
  @scala.inline
  def apply(
    actor: String = null,
    amount: Schema$Price = null,
    creationDate: String = null,
    reason: String = null,
    reasonText: String = null
  ): Schema$OrderRefund = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderRefund]
  }
}

