package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizationActivity extends js.Object {
  var floodlightActivityId: js.UndefOr[java.lang.String] = js.undefined
  var floodlightActivityIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object OptimizationActivity {
  @scala.inline
  def apply(
    floodlightActivityId: java.lang.String = null,
    floodlightActivityIdDimensionValue: DimensionValue = null,
    weight: scala.Int | scala.Double = null
  ): OptimizationActivity = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityId != null) __obj.updateDynamic("floodlightActivityId")(floodlightActivityId)
    if (floodlightActivityIdDimensionValue != null) __obj.updateDynamic("floodlightActivityIdDimensionValue")(floodlightActivityIdDimensionValue)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationActivity]
  }
}

