package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderRefund extends js.Object {
  var actor: js.UndefOr[java.lang.String] = js.undefined
  var amount: js.UndefOr[Price] = js.undefined
  var creationDate: js.UndefOr[java.lang.String] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
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

