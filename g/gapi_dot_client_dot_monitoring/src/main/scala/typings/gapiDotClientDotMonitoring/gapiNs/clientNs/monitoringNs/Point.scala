package typings.gapiDotClientDotMonitoring.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /**
    * The time interval to which the data point applies. For GAUGE metrics, only the end time of the interval is used. For DELTA metrics, the start and end
    * time should specify a non-zero interval, with subsequent points specifying contiguous and non-overlapping intervals. For CUMULATIVE metrics, the start
    * and end time should specify a non-zero interval, with subsequent points specifying the same start time and increasing end times, until an event resets
    * the cumulative value to zero and sets a new start time for the following points.
    */
  var interval: js.UndefOr[TimeInterval] = js.undefined
  /** The value of the data point. */
  var value: js.UndefOr[TypedValue] = js.undefined
}

object Point {
  @scala.inline
  def apply(interval: TimeInterval = null, value: TypedValue = null): Point = {
    val __obj = js.Dynamic.literal()
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Point]
  }
}

