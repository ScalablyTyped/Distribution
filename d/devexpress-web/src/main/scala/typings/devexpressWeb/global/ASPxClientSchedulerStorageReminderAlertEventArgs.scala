package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSchedulerStorageControl.ReminderAlert event.
  */
@JSGlobal("ASPxClientSchedulerStorageReminderAlertEventArgs")
@js.native
open class ASPxClientSchedulerStorageReminderAlertEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientSchedulerStorageReminderAlertEventArgs {
  /**
    * Initializes a new instance of the ASPxClientSchedulerStorageReminderAlertEventArgs class.
    * @param completedNotifications An array of ASPxClientReminderAlertNotification objects.
    * @param previousNotifications An array of ASPxClientReminderAlertNotification objects.
    */
  def this(
    completedNotifications: js.Array[typings.devexpressWeb.ASPxClientReminderAlertNotification],
    previousNotifications: js.Array[typings.devexpressWeb.ASPxClientReminderAlertNotification]
  ) = this()
  
  /**
    * Returns an array of currently triggered reminders.
    */
  /* CompleteClass */
  var alertNotifications: js.Array[typings.devexpressWeb.ASPxClientReminderAlertNotification] = js.native
}
