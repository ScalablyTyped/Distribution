package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReminderNotifyEmail extends js.Object {
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.undefined
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.undefined
}

object Anon_ReminderNotifyEmail {
  @scala.inline
  def apply(
    reminderNotifyEmail: js.UndefOr[Boolean] = js.undefined,
    reminderNotifyInApp: js.UndefOr[Boolean] = js.undefined
  ): Anon_ReminderNotifyEmail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reminderNotifyEmail)) __obj.updateDynamic("reminderNotifyEmail")(reminderNotifyEmail.asInstanceOf[js.Any])
    if (!js.isUndefined(reminderNotifyInApp)) __obj.updateDynamic("reminderNotifyInApp")(reminderNotifyInApp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ReminderNotifyEmail]
  }
}

