package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ReminderAlert event.
  */
trait ASPxClientSchedulerStorageReminderAlertEventArgs extends ASPxClientEventArgs {
  /**
    * Returns an array of currently triggered reminders.
    * Value: An array of ASPxClientReminderAlertNotification objects.
    */
  var alertNotifications: js.Array[ASPxClientReminderAlertNotification]
}

object ASPxClientSchedulerStorageReminderAlertEventArgs {
  @scala.inline
  def apply(alertNotifications: js.Array[ASPxClientReminderAlertNotification]): ASPxClientSchedulerStorageReminderAlertEventArgs = {
    val __obj = js.Dynamic.literal(alertNotifications = alertNotifications)
  
    __obj.asInstanceOf[ASPxClientSchedulerStorageReminderAlertEventArgs]
  }
}

