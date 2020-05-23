package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSchedulerStorageControl.ReminderAlert event.
  */
trait ASPxClientSchedulerStorageReminderAlertEventArgs extends ASPxClientEventArgs {
  /**
    * Returns an array of currently triggered reminders.
    */
  var alertNotifications: js.Array[ASPxClientReminderAlertNotification]
}

object ASPxClientSchedulerStorageReminderAlertEventArgs {
  @scala.inline
  def apply(alertNotifications: js.Array[ASPxClientReminderAlertNotification]): ASPxClientSchedulerStorageReminderAlertEventArgs = {
    val __obj = js.Dynamic.literal(alertNotifications = alertNotifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientSchedulerStorageReminderAlertEventArgs]
  }
}

