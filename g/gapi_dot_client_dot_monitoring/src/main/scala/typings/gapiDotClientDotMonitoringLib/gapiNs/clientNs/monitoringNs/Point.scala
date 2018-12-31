package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

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

