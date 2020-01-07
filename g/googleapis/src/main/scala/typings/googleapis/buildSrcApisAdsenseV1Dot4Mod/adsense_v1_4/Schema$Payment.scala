package typings.googleapis.buildSrcApisAdsenseV1Dot4Mod.adsense_v1_4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Payment extends js.Object {
  /**
    * Unique identifier of this Payment.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is, in this case adsense#payment.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The amount to be paid.
    */
  var paymentAmount: js.UndefOr[String] = js.native
  /**
    * The currency code for the amount to be paid.
    */
  var paymentAmountCurrencyCode: js.UndefOr[String] = js.native
  /**
    * The date this payment was/will be credited to the user, or none if the
    * payment threshold has not been met.
    */
  var paymentDate: js.UndefOr[String] = js.native
}

object Schema$Payment {
  @scala.inline
  def apply(
    id: String = null,
    kind: String = null,
    paymentAmount: String = null,
    paymentAmountCurrencyCode: String = null,
    paymentDate: String = null
  ): Schema$Payment = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (paymentAmount != null) __obj.updateDynamic("paymentAmount")(paymentAmount.asInstanceOf[js.Any])
    if (paymentAmountCurrencyCode != null) __obj.updateDynamic("paymentAmountCurrencyCode")(paymentAmountCurrencyCode.asInstanceOf[js.Any])
    if (paymentDate != null) __obj.updateDynamic("paymentDate")(paymentDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Payment]
  }
}

