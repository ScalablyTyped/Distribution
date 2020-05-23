package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizationActivity extends js.Object {
  var floodlightActivityId: js.UndefOr[String] = js.undefined
  var floodlightActivityIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object OptimizationActivity {
  @scala.inline
  def apply(
    floodlightActivityId: String = null,
    floodlightActivityIdDimensionValue: DimensionValue = null,
    weight: js.UndefOr[Double] = js.undefined
  ): OptimizationActivity = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityId != null) __obj.updateDynamic("floodlightActivityId")(floodlightActivityId.asInstanceOf[js.Any])
    if (floodlightActivityIdDimensionValue != null) __obj.updateDynamic("floodlightActivityIdDimensionValue")(floodlightActivityIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationActivity]
  }
}

