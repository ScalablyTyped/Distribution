package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTaxTaxRule extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var locationId: js.UndefOr[java.lang.String] = js.undefined
  var ratePercent: js.UndefOr[java.lang.String] = js.undefined
  var shippingTaxed: js.UndefOr[scala.Boolean] = js.undefined
  var useGlobalRate: js.UndefOr[scala.Boolean] = js.undefined
}

object AccountTaxTaxRule {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    locationId: java.lang.String = null,
    ratePercent: java.lang.String = null,
    shippingTaxed: js.UndefOr[scala.Boolean] = js.undefined,
    useGlobalRate: js.UndefOr[scala.Boolean] = js.undefined
  ): AccountTaxTaxRule = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (locationId != null) __obj.updateDynamic("locationId")(locationId)
    if (ratePercent != null) __obj.updateDynamic("ratePercent")(ratePercent)
    if (!js.isUndefined(shippingTaxed)) __obj.updateDynamic("shippingTaxed")(shippingTaxed)
    if (!js.isUndefined(useGlobalRate)) __obj.updateDynamic("useGlobalRate")(useGlobalRate)
    __obj.asInstanceOf[AccountTaxTaxRule]
  }
}

