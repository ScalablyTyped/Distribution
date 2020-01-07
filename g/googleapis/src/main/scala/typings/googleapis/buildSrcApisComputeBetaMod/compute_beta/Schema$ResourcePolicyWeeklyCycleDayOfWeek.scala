package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ResourcePolicyWeeklyCycleDayOfWeek extends js.Object {
  /**
    * Allows to define schedule that runs specified day of the week.
    */
  var day: js.UndefOr[String] = js.native
  /**
    * [Output only] Duration of the time window, automatically chosen to be
    * smallest possible in the given scenario.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Time within the window to start the operations. It must be in format
    * &quot;HH:MM&quot;, where HH : [00-23] and MM : [00-00] GMT.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$ResourcePolicyWeeklyCycleDayOfWeek {
  @scala.inline
  def apply(day: String = null, duration: String = null, startTime: String = null): Schema$ResourcePolicyWeeklyCycleDayOfWeek = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourcePolicyWeeklyCycleDayOfWeek]
  }
}

