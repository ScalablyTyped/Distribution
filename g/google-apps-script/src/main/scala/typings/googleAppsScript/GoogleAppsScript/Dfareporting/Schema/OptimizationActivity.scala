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
    weight: Int | Double = null
  ): OptimizationActivity = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityId != null) __obj.updateDynamic("floodlightActivityId")(floodlightActivityId.asInstanceOf[js.Any])
    if (floodlightActivityIdDimensionValue != null) __obj.updateDynamic("floodlightActivityIdDimensionValue")(floodlightActivityIdDimensionValue.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationActivity]
  }
}

