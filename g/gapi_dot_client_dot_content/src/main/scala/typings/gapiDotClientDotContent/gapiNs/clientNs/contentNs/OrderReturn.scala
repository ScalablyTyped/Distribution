package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderReturn extends js.Object {
  /** The actor that created the refund. */
  var actor: js.UndefOr[String] = js.undefined
  /** Date on which the item has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[String] = js.undefined
  /** Quantity that is returned. */
  var quantity: js.UndefOr[Double] = js.undefined
  /** The reason for the return. */
  var reason: js.UndefOr[String] = js.undefined
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.undefined
}

object OrderReturn {
  @scala.inline
  def apply(
    actor: String = null,
    creationDate: String = null,
    quantity: Int | Double = null,
    reason: String = null,
    reasonText: String = null
  ): OrderReturn = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText)
    __obj.asInstanceOf[OrderReturn]
  }
}

