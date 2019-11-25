package typings.gapiDotClientDotContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DailyMaintenanceWindow extends js.Object {
  /**
    * [Output only] Duration of the time window, automatically chosen to be
    * smallest possible in the given scenario.
    * Duration will be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
    * format "PTnHnMnS".
    */
  var duration: js.UndefOr[String] = js.undefined
  /**
    * Time within the maintenance window to start the maintenance operations.
    * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
    * format "HH:MM”, where HH : [00-23] and MM : [00-59] GMT.
    */
  var startTime: js.UndefOr[String] = js.undefined
}

object DailyMaintenanceWindow {
  @scala.inline
  def apply(duration: String = null, startTime: String = null): DailyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DailyMaintenanceWindow]
  }
}

