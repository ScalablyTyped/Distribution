package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestOrderPaymentMethod extends js.Object {
  var expirationMonth: js.UndefOr[scala.Double] = js.undefined
  var expirationYear: js.UndefOr[scala.Double] = js.undefined
  var lastFourDigits: js.UndefOr[java.lang.String] = js.undefined
  var predefinedBillingAddress: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object TestOrderPaymentMethod {
  @scala.inline
  def apply(
    expirationMonth: scala.Int | scala.Double = null,
    expirationYear: scala.Int | scala.Double = null,
    lastFourDigits: java.lang.String = null,
    predefinedBillingAddress: java.lang.String = null,
    `type`: java.lang.String = null
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

