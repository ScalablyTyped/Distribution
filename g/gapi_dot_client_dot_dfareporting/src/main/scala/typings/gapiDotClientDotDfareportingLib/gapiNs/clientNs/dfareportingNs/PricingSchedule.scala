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

