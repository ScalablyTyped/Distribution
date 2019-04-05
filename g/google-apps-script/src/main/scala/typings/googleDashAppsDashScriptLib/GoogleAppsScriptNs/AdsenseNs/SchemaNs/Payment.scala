package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payment extends js.Object {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var paymentAmount: js.UndefOr[java.lang.String] = js.undefined
  var paymentAmountCurrencyCode: js.UndefOr[java.lang.String] = js.undefined
  var paymentDate: js.UndefOr[java.lang.String] = js.undefined
}

object Payment {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    kind: java.lang.String = null,
    paymentAmount: java.lang.String = null,
    paymentAmountCurrencyCode: java.lang.String = null,
    paymentDate: java.lang.String = null
  ): Payment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (paymentAmount != null) __obj.updateDynamic("paymentAmount")(paymentAmount)
    if (paymentAmountCurrencyCode != null) __obj.updateDynamic("paymentAmountCurrencyCode")(paymentAmountCurrencyCode)
    if (paymentDate != null) __obj.updateDynamic("paymentDate")(paymentDate)
    __obj.asInstanceOf[Payment]
  }
}

