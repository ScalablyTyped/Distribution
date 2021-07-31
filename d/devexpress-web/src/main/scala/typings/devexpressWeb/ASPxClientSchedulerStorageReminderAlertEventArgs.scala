package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientSchedulerStorageControl.ReminderAlert event.
  */
trait ASPxClientSchedulerStorageReminderAlertEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
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
  
  @scala.inline
  implicit class ASPxClientSchedulerStorageReminderAlertEventArgsMutableBuilder[Self <: ASPxClientSchedulerStorageReminderAlertEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertNotifications(value: js.Array[ASPxClientReminderAlertNotification]): Self = StObject.set(x, "alertNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertNotificationsVarargs(value: ASPxClientReminderAlertNotification*): Self = StObject.set(x, "alertNotifications", js.Array(value :_*))
  }
}
