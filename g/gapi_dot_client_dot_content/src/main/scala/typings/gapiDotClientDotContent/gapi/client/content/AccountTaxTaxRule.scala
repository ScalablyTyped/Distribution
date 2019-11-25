package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTaxTaxRule extends js.Object {
  /** Country code in which tax is applicable. */
  var country: js.UndefOr[String] = js.undefined
  /** State (or province) is which the tax is applicable, described by its location id (also called criteria id). */
  var locationId: js.UndefOr[String] = js.undefined
  /** Explicit tax rate in percent, represented as a floating point number without the percentage character. Must not be negative. */
  var ratePercent: js.UndefOr[String] = js.undefined
  /** If true, shipping charges are also taxed. */
  var shippingTaxed: js.UndefOr[Boolean] = js.undefined
  /** Whether the tax rate is taken from a global tax table or specified explicitly. */
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

