package typings.googleapis.buildSrcApisWebsecurityscannerV1alphaMod.websecurityscanner_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scan schedule configuration.
  */
@js.native
trait Schema$Schedule extends js.Object {
  /**
    * Required. The duration of time between executions in days.
    */
  var intervalDurationDays: js.UndefOr[Double] = js.native
  /**
    * A timestamp indicates when the next run will be scheduled. The value is
    * refreshed by the server after each run. If unspecified, it will default
    * to current server time, which means the scan will be scheduled to start
    * immediately.
    */
  var scheduleTime: js.UndefOr[String] = js.native
}

object Schema$Schedule {
  @scala.inline
  def apply(intervalDurationDays: Int | Double = null, scheduleTime: String = null): Schema$Schedule = {
    val __obj = js.Dynamic.literal()
    if (intervalDurationDays != null) __obj.updateDynamic("intervalDurationDays")(intervalDurationDays.asInstanceOf[js.Any])
    if (scheduleTime != null) __obj.updateDynamic("scheduleTime")(scheduleTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Schedule]
  }
}

