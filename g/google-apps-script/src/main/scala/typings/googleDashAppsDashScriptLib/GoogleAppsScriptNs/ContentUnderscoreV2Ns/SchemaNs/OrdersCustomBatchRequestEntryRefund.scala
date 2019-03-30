package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryRefund extends js.Object {
  var amount: js.UndefOr[Price] = js.undefined
  var amountPretax: js.UndefOr[Price] = js.undefined
  var amountTax: js.UndefOr[Price] = js.undefined
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var reasonText: js.UndefOr[java.lang.String] = js.undefined
}

object OrdersCustomBatchRequestEntryRefund {
  @scala.inline
  def apply(
    amount: Price = null,
    amountPretax: Price = null,
    amountTax: Price = null,
    reason: java.lang.String = null,
    reasonText: java.lang.String = null
  ): OrdersCustomBatchRequestEntryRefund = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount)
    if (amountPretax != null) __obj.updateDynamic("amountPretax")(amountPretax)
    if (amountTax != null) __obj.updateDynamic("amountTax")(amountTax)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    if (reasonText != null) __obj.updateDynamic("reasonText")(reasonText)
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryRefund]
  }
}

