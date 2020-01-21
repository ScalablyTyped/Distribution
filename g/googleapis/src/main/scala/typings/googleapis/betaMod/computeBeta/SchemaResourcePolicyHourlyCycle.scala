package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Time window specified for hourly operations.
  */
@js.native
trait SchemaResourcePolicyHourlyCycle extends js.Object {
  /**
    * [Output only] Duration of the time window, automatically chosen to be
    * smallest possible in the given scenario.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Allows to define schedule that runs every nth hour.
    */
  var hoursInCycle: js.UndefOr[Double] = js.native
  /**
    * Time within the window to start the operations. It must be in format
    * &quot;HH:MM&quot;, where HH : [00-23] and MM : [00-00] GMT.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaResourcePolicyHourlyCycle {
  @scala.inline
  def apply(duration: String = null, hoursInCycle: Int | Double = null, startTime: String = null): SchemaResourcePolicyHourlyCycle = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (hoursInCycle != null) __obj.updateDynamic("hoursInCycle")(hoursInCycle.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaResourcePolicyHourlyCycle]
  }
}

