package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCalendarNotification extends StObject {
  
  /**
    * The method used to deliver the notification. Possible values are:   -
    * &quot;email&quot; - Notifications are sent via email.  - &quot;sms&quot;
    * - Deprecated. Once this feature is shutdown, the API will no longer
    * return notifications using this method. Any newly added SMS notifications
    * will be ignored. See  Google Calendar SMS notifications to be removed for
    * more information. Notifications are sent via SMS. This value is read-only
    * and is ignored on inserts and updates. SMS notifications are only
    * available for G Suite customers.   Required when adding a notification.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The type of notification. Possible values are:   -
    * &quot;eventCreation&quot; - Notification sent when a new event is put on
    * the calendar.  - &quot;eventChange&quot; - Notification sent when an
    * event is changed.  - &quot;eventCancellation&quot; - Notification sent
    * when an event is cancelled.  - &quot;eventResponse&quot; - Notification
    * sent when an attendee responds to the event invitation.  -
    * &quot;agenda&quot; - An agenda with the events of the day (sent out in
    * the morning).   Required when adding a notification.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaCalendarNotification {
  
  @scala.inline
  def apply(): SchemaCalendarNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalendarNotification]
  }
  
  @scala.inline
  implicit class SchemaCalendarNotificationMutableBuilder[Self <: SchemaCalendarNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
