package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderRefund extends js.Object {
  var actor: js.UndefOr[String] = js.undefined
  var amount: js.UndefOr[Price] = js.undefined
  var creationDate: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
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

