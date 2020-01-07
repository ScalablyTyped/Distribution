package typings.googleapis.buildSrcApisClouderrorreportingV1beta1Mod.clouderrorreporting_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of errors in a given time period. All numbers are approximate
  * since the error events are sampled before counting them.
  */
@js.native
trait Schema$TimedCount extends js.Object {
  /**
    * Approximate number of occurrences in the given time period.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * End of the time period to which `count` refers (excluded).
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Start of the time period to which `count` refers (included).
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$TimedCount {
  @scala.inline
  def apply(count: String = null, endTime: String = null, startTime: String = null): Schema$TimedCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TimedCount]
  }
}

