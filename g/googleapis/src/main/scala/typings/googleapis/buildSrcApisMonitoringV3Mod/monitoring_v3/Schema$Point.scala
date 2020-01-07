package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single data point in a time series.
  */
@js.native
trait Schema$Point extends js.Object {
  /**
    * The time interval to which the data point applies. For GAUGE metrics,
    * only the end time of the interval is used. For DELTA metrics, the start
    * and end time should specify a non-zero interval, with subsequent points
    * specifying contiguous and non-overlapping intervals. For CUMULATIVE
    * metrics, the start and end time should specify a non-zero interval, with
    * subsequent points specifying the same start time and increasing end
    * times, until an event resets the cumulative value to zero and sets a new
    * start time for the following points.
    */
  var interval: js.UndefOr[Schema$TimeInterval] = js.native
  /**
    * The value of the data point.
    */
  var value: js.UndefOr[Schema$TypedValue] = js.native
}

object Schema$Point {
  @scala.inline
  def apply(interval: Schema$TimeInterval = null, value: Schema$TypedValue = null): Schema$Point = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Point]
  }
}

