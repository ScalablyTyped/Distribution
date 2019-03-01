package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingSchedulePricingPeriod extends js.Object {
  /**
    * Pricing period end date. This date must be later than, or the same day as, the pricing period start date, but not later than the placement end date.
    * The period end date can be the same date as the period start date. If, for example, you set 6/25/2015 as both the start and end dates, the effective
    * pricing period date is just that day only, 6/25/2015. The hours, minutes, and seconds of the end date should not be set, as doing so will result in an
    * error.
    */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** Comments for this pricing period. */
  var pricingComment: js.UndefOr[java.lang.String] = js.undefined
  /** Rate or cost of this pricing period in nanos (i.e., multipled by 1000000000). Acceptable values are 0 to 1000000000000000000, inclusive. */
  var rateOrCostNanos: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Pricing period start date. This date must be later than, or the same day as, the placement start date. The hours, minutes, and seconds of the start
    * date should not be set, as doing so will result in an error.
    */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  /** Units of this pricing period. Acceptable values are 0 to 10000000000, inclusive. */
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

