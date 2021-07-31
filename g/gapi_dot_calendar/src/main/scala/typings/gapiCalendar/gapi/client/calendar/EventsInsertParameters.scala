package typings.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsInsertParameters extends StObject {
  
  var calendarId: String
  
  var maxAttendees: js.UndefOr[integer] = js.undefined
  
  // Event resource
  var resource: EventInput
  
  var sendNotifications: js.UndefOr[Boolean] = js.undefined
  
  var supportsAttachments: js.UndefOr[Boolean] = js.undefined
}
object EventsInsertParameters {
  
  @scala.inline
  def apply(calendarId: String, resource: EventInput): EventsInsertParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsInsertParameters]
  }
  
  @scala.inline
  implicit class EventsInsertParametersMutableBuilder[Self <: EventsInsertParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAttendees(value: integer): Self = StObject.set(x, "maxAttendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAttendeesUndefined: Self = StObject.set(x, "maxAttendees", js.undefined)
    
    @scala.inline
    def setResource(value: EventInput): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendNotifications(value: Boolean): Self = StObject.set(x, "sendNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendNotificationsUndefined: Self = StObject.set(x, "sendNotifications", js.undefined)
    
    @scala.inline
    def setSupportsAttachments(value: Boolean): Self = StObject.set(x, "supportsAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsAttachmentsUndefined: Self = StObject.set(x, "supportsAttachments", js.undefined)
  }
}
