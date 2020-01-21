package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTaxTaxRule extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var locationId: js.UndefOr[String] = js.undefined
  var ratePercent: js.UndefOr[String] = js.undefined
  var shippingTaxed: js.UndefOr[Boolean] = js.undefined
  var useGlobalRate: js.UndefOr[Boolean] = js.undefined
}

object AccountTaxTaxRule {
  @scala.inline
  def apply(
    country: String = null,
    locationId: String = null,
    ratePercent: String = null,
    shippingTaxed: js.UndefOr[Boolean] = js.undefined,
    useGlobalRate: js.UndefOr[Boolean] = js.undefined
  ): AccountTaxTaxRule = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (locationId != null) __obj.updateDynamic("locationId")(locationId.asInstanceOf[js.Any])
    if (ratePercent != null) __obj.updateDynamic("ratePercent")(ratePercent.asInstanceOf[js.Any])
    if (!js.isUndefined(shippingTaxed)) __obj.updateDynamic("shippingTaxed")(shippingTaxed.asInstanceOf[js.Any])
    if (!js.isUndefined(useGlobalRate)) __obj.updateDynamic("useGlobalRate")(useGlobalRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountTaxTaxRule]
  }
}

