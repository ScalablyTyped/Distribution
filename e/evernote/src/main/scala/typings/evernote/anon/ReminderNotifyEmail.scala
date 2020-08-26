package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReminderNotifyEmail extends js.Object {
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.native
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.native
}

object ReminderNotifyEmail {
  @scala.inline
  def apply(): ReminderNotifyEmail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReminderNotifyEmail]
  }
  @scala.inline
  implicit class ReminderNotifyEmailOps[Self <: ReminderNotifyEmail] (val x: Self) extends AnyVal {
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
    def setReminderNotifyEmail(value: Boolean): Self = this.set("reminderNotifyEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReminderNotifyEmail: Self = this.set("reminderNotifyEmail", js.undefined)
    @scala.inline
    def setReminderNotifyInApp(value: Boolean): Self = this.set("reminderNotifyInApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReminderNotifyInApp: Self = this.set("reminderNotifyInApp", js.undefined)
  }
  
}

