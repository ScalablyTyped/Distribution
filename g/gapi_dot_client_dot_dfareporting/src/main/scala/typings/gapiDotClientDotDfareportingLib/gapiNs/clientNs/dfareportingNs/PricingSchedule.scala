package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingSchedule extends js.Object {
  /** Placement cap cost option. */
  var capCostOption: js.UndefOr[java.lang.String] = js.undefined
  /** Whether cap costs are ignored by ad serving. */
  var disregardOverdelivery: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Placement end date. This date must be later than, or the same day as, the placement start date, but not later than the campaign end date. If, for
    * example, you set 6/25/2015 as both the start and end dates, the effective placement date is just that day only, 6/25/2015. The hours, minutes, and
    * seconds of the end date should not be set, as doing so will result in an error. This field is required on insertion.
    */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this placement is flighted. If true, pricing periods will be computed automatically. */
  var flighted: js.UndefOr[scala.Boolean] = js.undefined
  /** Floodlight activity ID associated with this placement. This field should be set when placement pricing type is set to PRICING_TYPE_CPA. */
  var floodlightActivityId: js.UndefOr[java.lang.String] = js.undefined
  /** Pricing periods for this placement. */
  var pricingPeriods: js.UndefOr[js.Array[PricingSchedulePricingPeriod]] = js.undefined
  /** Placement pricing type. This field is required on insertion. */
  var pricingType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Placement start date. This date must be later than, or the same day as, the campaign start date. The hours, minutes, and seconds of the start date
    * should not be set, as doing so will result in an error. This field is required on insertion.
    */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  /** Testing start date of this placement. The hours, minutes, and seconds of the start date should not be set, as doing so will result in an error. */
  var testingStartDate: js.UndefOr[java.lang.String] = js.undefined
}

object PricingSchedule {
  @scala.inline
  def apply(
    capCostOption: java.lang.String = null,
    disregardOverdelivery: js.UndefOr[scala.Boolean] = js.undefined,
    endDate: java.lang.String = null,
    flighted: js.UndefOr[scala.Boolean] = js.undefined,
    floodlightActivityId: java.lang.String = null,
    pricingPeriods: js.Array[PricingSchedulePricingPeriod] = null,
    pricingType: java.lang.String = null,
    startDate: java.lang.String = null,
    testingStartDate: java.lang.String = null
  ): PricingSchedule = {
    val __obj = js.Dynamic.literal()
    if (capCostOption != null) __obj.updateDynamic("capCostOption")(capCostOption)
    if (!js.isUndefined(disregardOverdelivery)) __obj.updateDynamic("disregardOverdelivery")(disregardOverdelivery)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (!js.isUndefined(flighted)) __obj.updateDynamic("flighted")(flighted)
    if (floodlightActivityId != null) __obj.updateDynamic("floodlightActivityId")(floodlightActivityId)
    if (pricingPeriods != null) __obj.updateDynamic("pricingPeriods")(pricingPeriods)
    if (pricingType != null) __obj.updateDynamic("pricingType")(pricingType)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (testingStartDate != null) __obj.updateDynamic("testingStartDate")(testingStartDate)
    __obj.asInstanceOf[PricingSchedule]
  }
}

