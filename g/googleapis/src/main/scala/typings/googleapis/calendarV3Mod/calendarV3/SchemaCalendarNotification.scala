package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCalendarNotification extends StObject {
  
  /**
    * The method used to deliver the notification. The possible value is:
    * - "email" - Notifications are sent via email.
    * Required when adding a notification.
    */
  var method: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of notification. Possible values are:
    * - "eventCreation" - Notification sent when a new event is put on the calendar.
    * - "eventChange" - Notification sent when an event is changed.
    * - "eventCancellation" - Notification sent when an event is cancelled.
    * - "eventResponse" - Notification sent when an attendee responds to the event invitation.
    * - "agenda" - An agenda with the events of the day (sent out in the morning).
    * Required when adding a notification.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaCalendarNotification {
  
  inline def apply(): SchemaCalendarNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalendarNotification]
  }
  
  extension [Self <: SchemaCalendarNotification](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodNull: Self = StObject.set(x, "method", null)
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
