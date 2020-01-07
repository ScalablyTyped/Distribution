package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Time window specified for daily operations.
  */
@js.native
trait Schema$ResourcePolicyDailyCycle extends js.Object {
  /**
    * Defines a schedule that runs every nth day of the month.
    */
  var daysInCycle: js.UndefOr[Double] = js.native
  /**
    * [Output only] A predetermined duration for the window, automatically
    * chosen to be the smallest possible in the given scenario.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Start time of the window. This must be in UTC format that resolves to one
    * of 00:00, 04:00, 08:00, 12:00, 16:00, or 20:00. For example, both 13:00-5
    * and 08:00 are valid.
    */
  var startTime: js.UndefOr[String] = js.native
}

object Schema$ResourcePolicyDailyCycle {
  @scala.inline
  def apply(daysInCycle: Int | Double = null, duration: String = null, startTime: String = null): Schema$ResourcePolicyDailyCycle = {
    val __obj = js.Dynamic.literal()
    if (daysInCycle != null) __obj.updateDynamic("daysInCycle")(daysInCycle.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourcePolicyDailyCycle]
  }
}

