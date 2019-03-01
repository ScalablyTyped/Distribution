package typings
package ejDotWebDotAllLib.ejNs.ScheduleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReminderSettings extends js.Object {
  /** Sets the timing, when the reminders are to be alerted for the Schedule appointments.
    * @Default {5}
    */
  var alertBefore: js.UndefOr[scala.Double] = js.undefined
  /** When set to true, enables the reminder option available for the Schedule appointments.
    * @Default {false}
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
}

object ReminderSettings {
  @scala.inline
  def apply(alertBefore: scala.Int | scala.Double = null, enable: js.UndefOr[scala.Boolean] = js.undefined): ReminderSettings = {
    val __obj = js.Dynamic.literal()
    if (alertBefore != null) __obj.updateDynamic("alertBefore")(alertBefore.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    __obj.asInstanceOf[ReminderSettings]
  }
}

