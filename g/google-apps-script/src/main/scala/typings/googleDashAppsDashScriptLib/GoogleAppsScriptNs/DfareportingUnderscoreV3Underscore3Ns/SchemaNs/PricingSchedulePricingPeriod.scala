package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingSchedulePricingPeriod extends js.Object {
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  var pricingComment: js.UndefOr[java.lang.String] = js.undefined
  var rateOrCostNanos: js.UndefOr[java.lang.String] = js.undefined
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  var units: js.UndefOr[java.lang.String] = js.undefined
}

object PricingSchedulePricingPeriod {
  @scala.inline
  def apply(
    endDate: java.lang.String = null,
    pricingComment: java.lang.String = null,
    rateOrCostNanos: java.lang.String = null,
    startDate: java.lang.String = null,
    units: java.lang.String = null
  ): PricingSchedulePricingPeriod = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (pricingComment != null) __obj.updateDynamic("pricingComment")(pricingComment)
    if (rateOrCostNanos != null) __obj.updateDynamic("rateOrCostNanos")(rateOrCostNanos)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[PricingSchedulePricingPeriod]
  }
}

