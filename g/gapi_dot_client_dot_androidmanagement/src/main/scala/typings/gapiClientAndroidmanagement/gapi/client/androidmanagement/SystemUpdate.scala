package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemUpdate extends js.Object {
  /**
    * If the type is WINDOWED, the end of the maintenance window, measured as the number of minutes after midnight in device local time. This value must be
    * between 0 and 1439, inclusive. If this value is less than start_minutes, then the maintenance window spans midnight. If the maintenance window
    * specified is smaller than 30 minutes, the actual window is extended to 30 minutes beyond the start time.
    */
  var endMinutes: js.UndefOr[Double] = js.undefined
  /**
    * If the type is WINDOWED, the start of the maintenance window, measured as the number of minutes after midnight in device local time. This value must be
    * between 0 and 1439, inclusive.
    */
  var startMinutes: js.UndefOr[Double] = js.undefined
  /** The type of system update to configure. */
  var `type`: js.UndefOr[String] = js.undefined
}

object SystemUpdate {
  @scala.inline
  def apply(
    endMinutes: js.UndefOr[Double] = js.undefined,
    startMinutes: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): SystemUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endMinutes)) __obj.updateDynamic("endMinutes")(endMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startMinutes)) __obj.updateDynamic("startMinutes")(startMinutes.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemUpdate]
  }
}

