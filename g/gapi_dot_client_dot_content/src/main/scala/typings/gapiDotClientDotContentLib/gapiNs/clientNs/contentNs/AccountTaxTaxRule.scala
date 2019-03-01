package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountTaxTaxRule extends js.Object {
  /** Country code in which tax is applicable. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** State (or province) is which the tax is applicable, described by its location id (also called criteria id). */
  var locationId: js.UndefOr[java.lang.String] = js.undefined
  /** Explicit tax rate in percent, represented as a floating point number without the percentage character. Must not be negative. */
  var ratePercent: js.UndefOr[java.lang.String] = js.undefined
  /** If true, shipping charges are also taxed. */
  var shippingTaxed: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the tax rate is taken from a global tax table or specified explicitly. */
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

