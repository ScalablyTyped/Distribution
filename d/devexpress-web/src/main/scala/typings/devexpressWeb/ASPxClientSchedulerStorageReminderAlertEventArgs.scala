package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientSchedulerStorageControl.ReminderAlert event.
  */
@JSGlobal("ASPxClientSchedulerStorageReminderAlertEventArgs")
@js.native
class ASPxClientSchedulerStorageReminderAlertEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSchedulerStorageReminderAlertEventArgs class.
    * @param completedNotifications An array of ASPxClientReminderAlertNotification objects.
    * @param previousNotifications An array of ASPxClientReminderAlertNotification objects.
    */
  def this(
    completedNotifications: js.Array[ASPxClientReminderAlertNotification],
    previousNotifications: js.Array[ASPxClientReminderAlertNotification]
  ) = this()
  /**
    * Returns an array of currently triggered reminders.
    */
  var alertNotifications: js.Array[ASPxClientReminderAlertNotification] = js.native
}

