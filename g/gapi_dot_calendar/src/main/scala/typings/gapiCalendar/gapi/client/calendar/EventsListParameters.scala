package typings.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsListParameters extends StObject {
  
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.native
  
  var calendarId: String = js.native
  
  var iCalUID: js.UndefOr[String] = js.native
  
  var maxAttendees: js.UndefOr[integer] = js.native
  
  var maxResults: js.UndefOr[integer] = js.native
  
  var orderBy: js.UndefOr[EventsOrder] = js.native
  
  var pageToken: js.UndefOr[String] = js.native
  
  var privateExtendedProperty: js.UndefOr[String] = js.native
  
  var q: js.UndefOr[String] = js.native
  
  var sharedExtendedProperty: js.UndefOr[String] = js.native
  
  var showDeleted: js.UndefOr[Boolean] = js.native
  
  var showHiddenInvitations: js.UndefOr[Boolean] = js.native
  
  var singleEvents: js.UndefOr[Boolean] = js.native
  
  var syncToken: js.UndefOr[SyncToken] = js.native
  
  var timeMax: js.UndefOr[datetime] = js.native
  
  var timeMin: js.UndefOr[datetime] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
  
  var updatedMin: js.UndefOr[datetime] = js.native
}
object EventsListParameters {
  
  @scala.inline
  def apply(calendarId: String): EventsListParameters = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsListParameters]
  }
  
  @scala.inline
  implicit class EventsListParametersMutableBuilder[Self <: EventsListParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysIncludeEmail(value: Boolean): Self = StObject.set(x, "alwaysIncludeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysIncludeEmailUndefined: Self = StObject.set(x, "alwaysIncludeEmail", js.undefined)
    
    @scala.inline
    def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICalUID(value: String): Self = StObject.set(x, "iCalUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICalUIDUndefined: Self = StObject.set(x, "iCalUID", js.undefined)
    
    @scala.inline
    def setMaxAttendees(value: integer): Self = StObject.set(x, "maxAttendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAttendeesUndefined: Self = StObject.set(x, "maxAttendees", js.undefined)
    
    @scala.inline
    def setMaxResults(value: integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOrderBy(value: EventsOrder): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPrivateExtendedProperty(value: String): Self = StObject.set(x, "privateExtendedProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateExtendedPropertyUndefined: Self = StObject.set(x, "privateExtendedProperty", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setSharedExtendedProperty(value: String): Self = StObject.set(x, "sharedExtendedProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedExtendedPropertyUndefined: Self = StObject.set(x, "sharedExtendedProperty", js.undefined)
    
    @scala.inline
    def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    @scala.inline
    def setShowHiddenInvitations(value: Boolean): Self = StObject.set(x, "showHiddenInvitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHiddenInvitationsUndefined: Self = StObject.set(x, "showHiddenInvitations", js.undefined)
    
    @scala.inline
    def setSingleEvents(value: Boolean): Self = StObject.set(x, "singleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleEventsUndefined: Self = StObject.set(x, "singleEvents", js.undefined)
    
    @scala.inline
    def setSyncToken(value: SyncToken): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
    
    @scala.inline
    def setTimeMax(value: datetime): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
    
    @scala.inline
    def setTimeMin(value: datetime): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setUpdatedMin(value: datetime): Self = StObject.set(x, "updatedMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedMinUndefined: Self = StObject.set(x, "updatedMin", js.undefined)
  }
}
