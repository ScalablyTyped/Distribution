package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReminderNotifyEmail extends js.Object {
  var reminderNotifyEmail: js.UndefOr[Boolean] = js.undefined
  var reminderNotifyInApp: js.UndefOr[Boolean] = js.undefined
}

object ReminderNotifyEmail {
  @scala.inline
  def apply(
    reminderNotifyEmail: js.UndefOr[Boolean] = js.undefined,
    reminderNotifyInApp: js.UndefOr[Boolean] = js.undefined
  ): ReminderNotifyEmail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reminderNotifyEmail)) __obj.updateDynamic("reminderNotifyEmail")(reminderNotifyEmail.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reminderNotifyInApp)) __obj.updateDynamic("reminderNotifyInApp")(reminderNotifyInApp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReminderNotifyEmail]
  }
}

