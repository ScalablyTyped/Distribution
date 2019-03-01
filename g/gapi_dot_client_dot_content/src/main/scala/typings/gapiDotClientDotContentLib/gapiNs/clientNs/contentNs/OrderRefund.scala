package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderRefund extends js.Object {
  /** The actor that created the refund. */
  var actor: js.UndefOr[java.lang.String] = js.undefined
  /** The amount that is refunded. */
  var amount: js.UndefOr[Price] = js.undefined
  /** Date on which the item has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[java.lang.String] = js.undefined
  /** The reason for the refund. */
  var reason: js.UndefOr[java.lang.String] = js.undefined
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[java.lang.String] = js.undefined
}

object OrderRefund {
  @scala.inline
  def apply(
    actor: java.lang.String = null,
    amount: Price = null,
    creationDate: java.lang.String = null,
    reason: java.lang.String = null,
    reasonText: java.lang.String = null
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

