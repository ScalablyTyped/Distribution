package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingSchedule extends js.Object {
  var capCostOption: js.UndefOr[String] = js.undefined
  var disregardOverdelivery: js.UndefOr[Boolean] = js.undefined
  var endDate: js.UndefOr[String] = js.undefined
  var flighted: js.UndefOr[Boolean] = js.undefined
  var floodlightActivityId: js.UndefOr[String] = js.undefined
  var pricingPeriods: js.UndefOr[js.Array[PricingSchedulePricingPeriod]] = js.undefined
  var pricingType: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
  var testingStartDate: js.UndefOr[String] = js.undefined
}

object PricingSchedule {
  @scala.inline
  def apply(
    capCostOption: String = null,
    disregardOverdelivery: js.UndefOr[Boolean] = js.undefined,
    endDate: String = null,
    flighted: js.UndefOr[Boolean] = js.undefined,
    floodlightActivityId: String = null,
    pricingPeriods: js.Array[PricingSchedulePricingPeriod] = null,
    pricingType: String = null,
    startDate: String = null,
    testingStartDate: String = null
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

