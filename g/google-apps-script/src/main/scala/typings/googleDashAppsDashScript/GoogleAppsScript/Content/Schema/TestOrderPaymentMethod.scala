package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderPaymentMethod extends js.Object {
  var expirationMonth: js.UndefOr[Double] = js.undefined
  var expirationYear: js.UndefOr[Double] = js.undefined
  var lastFourDigits: js.UndefOr[String] = js.undefined
  var predefinedBillingAddress: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object TestOrderPaymentMethod {
  @scala.inline
  def apply(
    expirationMonth: Int | Double = null,
    expirationYear: Int | Double = null,
    lastFourDigits: String = null,
    predefinedBillingAddress: String = null,
    `type`: String = null
  ): TestOrderPaymentMethod = {
    val __obj = js.Dynamic.literal()
    if (expirationMonth != null) __obj.updateDynamic("expirationMonth")(expirationMonth.asInstanceOf[js.Any])
    if (expirationYear != null) __obj.updateDynamic("expirationYear")(expirationYear.asInstanceOf[js.Any])
    if (lastFourDigits != null) __obj.updateDynamic("lastFourDigits")(lastFourDigits)
    if (predefinedBillingAddress != null) __obj.updateDynamic("predefinedBillingAddress")(predefinedBillingAddress)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TestOrderPaymentMethod]
  }
}

