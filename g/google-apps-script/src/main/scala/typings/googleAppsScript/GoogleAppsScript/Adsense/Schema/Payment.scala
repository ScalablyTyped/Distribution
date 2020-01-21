package typings.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payment extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var paymentAmount: js.UndefOr[String] = js.undefined
  var paymentAmountCurrencyCode: js.UndefOr[String] = js.undefined
  var paymentDate: js.UndefOr[String] = js.undefined
}

object Payment {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    paymentAmount: String = null,
    paymentAmountCurrencyCode: String = null,
    paymentDate: String = null
  ): Payment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (paymentAmount != null) __obj.updateDynamic("paymentAmount")(paymentAmount.asInstanceOf[js.Any])
    if (paymentAmountCurrencyCode != null) __obj.updateDynamic("paymentAmountCurrencyCode")(paymentAmountCurrencyCode.asInstanceOf[js.Any])
    if (paymentDate != null) __obj.updateDynamic("paymentDate")(paymentDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payment]
  }
}

