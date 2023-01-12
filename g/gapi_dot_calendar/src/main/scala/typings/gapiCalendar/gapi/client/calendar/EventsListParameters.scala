package typings.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventsListParameters extends StObject {
  
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.undefined
  
  var calendarId: String
  
  var iCalUID: js.UndefOr[String] = js.undefined
  
  var maxAttendees: js.UndefOr[integer] = js.undefined
  
  var maxResults: js.UndefOr[integer] = js.undefined
  
  var orderBy: js.UndefOr[EventsOrder] = js.undefined
  
  var pageToken: js.UndefOr[String] = js.undefined
  
  var privateExtendedProperty: js.UndefOr[String] = js.undefined
  
  var q: js.UndefOr[String] = js.undefined
  
  var sharedExtendedProperty: js.UndefOr[String] = js.undefined
  
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  
  var showHiddenInvitations: js.UndefOr[Boolean] = js.undefined
  
  var singleEvents: js.UndefOr[Boolean] = js.undefined
  
  var syncToken: js.UndefOr[SyncToken] = js.undefined
  
  var timeMax: js.UndefOr[datetime] = js.undefined
  
  var timeMin: js.UndefOr[datetime] = js.undefined
  
  var timeZone: js.UndefOr[String] = js.undefined
  
  var updatedMin: js.UndefOr[datetime] = js.undefined
}
object EventsListParameters {
  
  inline def apply(calendarId: String): EventsListParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsListParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventsListParameters] (val x: Self) extends AnyVal {
    
    inline def setAlwaysIncludeEmail(value: Boolean): Self = StObject.set(x, "alwaysIncludeEmail", value.asInstanceOf[js.Any])
    
    inline def setAlwaysIncludeEmailUndefined: Self = StObject.set(x, "alwaysIncludeEmail", js.undefined)
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setICalUID(value: String): Self = StObject.set(x, "iCalUID", value.asInstanceOf[js.Any])
    
    inline def setICalUIDUndefined: Self = StObject.set(x, "iCalUID", js.undefined)
    
    inline def setMaxAttendees(value: integer): Self = StObject.set(x, "maxAttendees", value.asInstanceOf[js.Any])
    
    inline def setMaxAttendeesUndefined: Self = StObject.set(x, "maxAttendees", js.undefined)
    
    inline def setMaxResults(value: integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setOrderBy(value: EventsOrder): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPrivateExtendedProperty(value: String): Self = StObject.set(x, "privateExtendedProperty", value.asInstanceOf[js.Any])
    
    inline def setPrivateExtendedPropertyUndefined: Self = StObject.set(x, "privateExtendedProperty", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setSharedExtendedProperty(value: String): Self = StObject.set(x, "sharedExtendedProperty", value.asInstanceOf[js.Any])
    
    inline def setSharedExtendedPropertyUndefined: Self = StObject.set(x, "sharedExtendedProperty", js.undefined)
    
    inline def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    inline def setShowHiddenInvitations(value: Boolean): Self = StObject.set(x, "showHiddenInvitations", value.asInstanceOf[js.Any])
    
    inline def setShowHiddenInvitationsUndefined: Self = StObject.set(x, "showHiddenInvitations", js.undefined)
    
    inline def setSingleEvents(value: Boolean): Self = StObject.set(x, "singleEvents", value.asInstanceOf[js.Any])
    
    inline def setSingleEventsUndefined: Self = StObject.set(x, "singleEvents", js.undefined)
    
    inline def setSyncToken(value: SyncToken): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    inline def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
    
    inline def setTimeMax(value: datetime): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    inline def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
    
    inline def setTimeMin(value: datetime): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    inline def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUpdatedMin(value: datetime): Self = StObject.set(x, "updatedMin", value.asInstanceOf[js.Any])
    
    inline def setUpdatedMinUndefined: Self = StObject.set(x, "updatedMin", js.undefined)
  }
}
