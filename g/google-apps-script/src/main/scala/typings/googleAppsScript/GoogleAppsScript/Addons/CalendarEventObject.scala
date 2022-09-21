package typings.googleAppsScript.GoogleAppsScript.Addons

import typings.googleAppsScript.anon.CanAddAttendees
import typings.googleAppsScript.anon.Email
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Event object with information on user's calendar and events
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#calendar_event_object
  */
trait CalendarEventObject extends StObject {
  
  var attendees: js.Array[AttendeeObject]
  
  var calendarId: String
  
  var capabilities: CanAddAttendees
  
  var id: String
  
  var organizer: Email
  
  var recurringEventId: String
}
object CalendarEventObject {
  
  inline def apply(
    attendees: js.Array[AttendeeObject],
    calendarId: String,
    capabilities: CanAddAttendees,
    id: String,
    organizer: Email,
    recurringEventId: String
  ): CalendarEventObject = {
    val __obj = js.Dynamic.literal(attendees = attendees.asInstanceOf[js.Any], calendarId = calendarId.asInstanceOf[js.Any], capabilities = capabilities.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], organizer = organizer.asInstanceOf[js.Any], recurringEventId = recurringEventId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarEventObject]
  }
  
  extension [Self <: CalendarEventObject](x: Self) {
    
    inline def setAttendees(value: js.Array[AttendeeObject]): Self = StObject.set(x, "attendees", value.asInstanceOf[js.Any])
    
    inline def setAttendeesVarargs(value: AttendeeObject*): Self = StObject.set(x, "attendees", js.Array(value*))
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setCapabilities(value: CanAddAttendees): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOrganizer(value: Email): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    inline def setRecurringEventId(value: String): Self = StObject.set(x, "recurringEventId", value.asInstanceOf[js.Any])
  }
}
