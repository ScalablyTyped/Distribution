package typings.googleAppsScript.GoogleAppsScript.Content.Schema

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
    expirationMonth: js.UndefOr[Double] = js.undefined,
    expirationYear: js.UndefOr[Double] = js.undefined,
    lastFourDigits: String = null,
    predefinedBillingAddress: String = null,
    `type`: String = null
  ): TestOrderPaymentMethod = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expirationMonth)) __obj.updateDynamic("expirationMonth")(expirationMonth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expirationYear)) __obj.updateDynamic("expirationYear")(expirationYear.get.asInstanceOf[js.Any])
    if (lastFourDigits != null) __obj.updateDynamic("lastFourDigits")(lastFourDigits.asInstanceOf[js.Any])
    if (predefinedBillingAddress != null) __obj.updateDynamic("predefinedBillingAddress")(predefinedBillingAddress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestOrderPaymentMethod]
  }
}

