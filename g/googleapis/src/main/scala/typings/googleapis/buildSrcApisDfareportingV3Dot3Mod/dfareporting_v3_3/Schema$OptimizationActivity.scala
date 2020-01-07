package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative optimization activity.
  */
@js.native
trait Schema$OptimizationActivity extends js.Object {
  /**
    * Floodlight activity ID of this optimization activity. This is a required
    * field.
    */
  var floodlightActivityId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the floodlight activity. This is a
    * read-only, auto-generated field.
    */
  var floodlightActivityIdDimensionValue: js.UndefOr[Schema$DimensionValue] = js.native
  /**
    * Weight associated with this optimization. The weight assigned will be
    * understood in proportion to the weights assigned to the other
    * optimization activities. Value must be greater than or equal to 1.
    */
  var weight: js.UndefOr[Double] = js.native
}

object Schema$OptimizationActivity {
  @scala.inline
  def apply(
    floodlightActivityId: String = null,
    floodlightActivityIdDimensionValue: Schema$DimensionValue = null,
    weight: Int | Double = null
  ): Schema$OptimizationActivity = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityId != null) __obj.updateDynamic("floodlightActivityId")(floodlightActivityId.asInstanceOf[js.Any])
    if (floodlightActivityIdDimensionValue != null) __obj.updateDynamic("floodlightActivityIdDimensionValue")(floodlightActivityIdDimensionValue.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OptimizationActivity]
  }
}

