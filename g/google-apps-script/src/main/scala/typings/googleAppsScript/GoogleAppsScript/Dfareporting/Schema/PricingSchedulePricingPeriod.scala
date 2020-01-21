package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PricingSchedulePricingPeriod extends js.Object {
  var endDate: js.UndefOr[String] = js.undefined
  var pricingComment: js.UndefOr[String] = js.undefined
  var rateOrCostNanos: js.UndefOr[String] = js.undefined
  var startDate: js.UndefOr[String] = js.undefined
  var units: js.UndefOr[String] = js.undefined
}

object PricingSchedulePricingPeriod {
  @scala.inline
  def apply(
    endDate: String = null,
    pricingComment: String = null,
    rateOrCostNanos: String = null,
    startDate: String = null,
    units: String = null
  ): PricingSchedulePricingPeriod = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (pricingComment != null) __obj.updateDynamic("pricingComment")(pricingComment.asInstanceOf[js.Any])
    if (rateOrCostNanos != null) __obj.updateDynamic("rateOrCostNanos")(rateOrCostNanos.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingSchedulePricingPeriod]
  }
}

