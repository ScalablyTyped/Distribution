package typings.gapiDotClientDotAdsense.gapi.client.adsense

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payment extends js.Object {
  /** Unique identifier of this Payment. */
  var id: js.UndefOr[String] = js.undefined
  /** Kind of resource this is, in this case adsense#payment. */
  var kind: js.UndefOr[String] = js.undefined
  /** The amount to be paid. */
  var paymentAmount: js.UndefOr[String] = js.undefined
  /** The currency code for the amount to be paid. */
  var paymentAmountCurrencyCode: js.UndefOr[String] = js.undefined
  /** The date this payment was/will be credited to the user, or none if the payment threshold has not been met. */
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
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (paymentAmount != null) __obj.updateDynamic("paymentAmount")(paymentAmount)
    if (paymentAmountCurrencyCode != null) __obj.updateDynamic("paymentAmountCurrencyCode")(paymentAmountCurrencyCode)
    if (paymentDate != null) __obj.updateDynamic("paymentDate")(paymentDate)
    __obj.asInstanceOf[Payment]
  }
}

