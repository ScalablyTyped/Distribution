package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReminderSettings extends js.Object {
  /** Sets the timing, when the reminders are to be alerted for the Schedule appointments.
    * @Default {5}
    */
  var alertBefore: js.UndefOr[Double] = js.undefined
  /** When set to true, enables the reminder option available for the Schedule appointments.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.undefined
}

object ReminderSettings {
  @scala.inline
  def apply(alertBefore: js.UndefOr[Double] = js.undefined, enable: js.UndefOr[Boolean] = js.undefined): ReminderSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alertBefore)) __obj.updateDynamic("alertBefore")(alertBefore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReminderSettings]
  }
}

