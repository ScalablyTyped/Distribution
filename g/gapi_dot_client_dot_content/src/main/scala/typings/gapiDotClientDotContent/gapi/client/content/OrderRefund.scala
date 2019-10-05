package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderRefund extends js.Object {
  /** The actor that created the refund. */
  var actor: js.UndefOr[String] = js.undefined
  /** The amount that is refunded. */
  var amount: js.UndefOr[Price] = js.undefined
  /** Date on which the item has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[String] = js.undefined
  /** The reason for the refund. */
  var reason: js.UndefOr[String] = js.undefined
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.undefined
}

object OrderRefund {
  @scala.inline
  def apply(
    actor: String = null,
    amount: Price = null,
    creationDate: String = null,
    reason: String = null,
    reasonText: String = null
  ): OrderRefund = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText)
    __obj.asInstanceOf[OrderRefund]
  }
}

