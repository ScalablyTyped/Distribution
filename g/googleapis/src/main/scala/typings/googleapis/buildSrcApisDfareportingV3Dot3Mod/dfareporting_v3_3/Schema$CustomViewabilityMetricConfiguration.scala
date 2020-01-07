package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The attributes, like playtime and percent onscreen, that define the Custom
  * Viewability Metric.
  */
@js.native
trait Schema$CustomViewabilityMetricConfiguration extends js.Object {
  /**
    * Whether the video must be audible to count an impression.
    */
  var audible: js.UndefOr[Boolean] = js.native
  /**
    * The time in milliseconds the video must play for the Custom Viewability
    * Metric to count an impression. If both this and timePercent are
    * specified, the earlier of the two will be used.
    */
  var timeMillis: js.UndefOr[Double] = js.native
  /**
    * The percentage of video that must play for the Custom Viewability Metric
    * to count an impression. If both this and timeMillis are specified, the
    * earlier of the two will be used.
    */
  var timePercent: js.UndefOr[Double] = js.native
  /**
    * The percentage of video that must be on screen for the Custom Viewability
    * Metric to count an impression.
    */
  var viewabilityPercent: js.UndefOr[Double] = js.native
}

object Schema$CustomViewabilityMetricConfiguration {
  @scala.inline
  def apply(
    audible: js.UndefOr[Boolean] = js.undefined,
    timeMillis: Int | Double = null,
    timePercent: Int | Double = null,
    viewabilityPercent: Int | Double = null
  ): Schema$CustomViewabilityMetricConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible.asInstanceOf[js.Any])
    if (timeMillis != null) __obj.updateDynamic("timeMillis")(timeMillis.asInstanceOf[js.Any])
    if (timePercent != null) __obj.updateDynamic("timePercent")(timePercent.asInstanceOf[js.Any])
    if (viewabilityPercent != null) __obj.updateDynamic("viewabilityPercent")(viewabilityPercent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomViewabilityMetricConfiguration]
  }
}

