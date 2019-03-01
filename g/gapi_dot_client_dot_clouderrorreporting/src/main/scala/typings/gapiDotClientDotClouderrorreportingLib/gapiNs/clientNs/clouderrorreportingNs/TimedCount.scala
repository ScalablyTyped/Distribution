package typings
package gapiDotClientDotClouderrorreportingLib.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimedCount extends js.Object {
  /** Approximate number of occurrences in the given time period. */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /** End of the time period to which `count` refers (excluded). */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Start of the time period to which `count` refers (included). */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

object TimedCount {
  @scala.inline
  def apply(
    count: java.lang.String = null,
    endTime: java.lang.String = null,
    startTime: java.lang.String = null
  ): TimedCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[TimedCount]
  }
}

