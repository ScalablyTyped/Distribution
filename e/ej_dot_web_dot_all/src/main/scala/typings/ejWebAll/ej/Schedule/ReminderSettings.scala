package typings.ejWebAll.ej.Schedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReminderSettings extends js.Object {
  /** Sets the timing, when the reminders are to be alerted for the Schedule appointments.
    * @Default {5}
    */
  var alertBefore: js.UndefOr[Double] = js.native
  /** When set to true, enables the reminder option available for the Schedule appointments.
    * @Default {false}
    */
  var enable: js.UndefOr[Boolean] = js.native
}

object ReminderSettings {
  @scala.inline
  def apply(): ReminderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReminderSettings]
  }
  @scala.inline
  implicit class ReminderSettingsOps[Self <: ReminderSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlertBefore(value: Double): Self = this.set("alertBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlertBefore: Self = this.set("alertBefore", js.undefined)
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
  }
  
}

