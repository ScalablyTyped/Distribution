package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsListParameters extends js.Object {
  
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
  implicit class EventsListParametersOps[Self <: EventsListParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalendarId(value: String): Self = this.set("calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysIncludeEmail(value: Boolean): Self = this.set("alwaysIncludeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysIncludeEmail: Self = this.set("alwaysIncludeEmail", js.undefined)
    
    @scala.inline
    def setICalUID(value: String): Self = this.set("iCalUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteICalUID: Self = this.set("iCalUID", js.undefined)
    
    @scala.inline
    def setMaxAttendees(value: integer): Self = this.set("maxAttendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAttendees: Self = this.set("maxAttendees", js.undefined)
    
    @scala.inline
    def setMaxResults(value: integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setOrderBy(value: EventsOrder): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPrivateExtendedProperty(value: String): Self = this.set("privateExtendedProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateExtendedProperty: Self = this.set("privateExtendedProperty", js.undefined)
    
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    
    @scala.inline
    def setSharedExtendedProperty(value: String): Self = this.set("sharedExtendedProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedExtendedProperty: Self = this.set("sharedExtendedProperty", js.undefined)
    
    @scala.inline
    def setShowDeleted(value: Boolean): Self = this.set("showDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDeleted: Self = this.set("showDeleted", js.undefined)
    
    @scala.inline
    def setShowHiddenInvitations(value: Boolean): Self = this.set("showHiddenInvitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHiddenInvitations: Self = this.set("showHiddenInvitations", js.undefined)
    
    @scala.inline
    def setSingleEvents(value: Boolean): Self = this.set("singleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleEvents: Self = this.set("singleEvents", js.undefined)
    
    @scala.inline
    def setSyncToken(value: SyncToken): Self = this.set("syncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncToken: Self = this.set("syncToken", js.undefined)
    
    @scala.inline
    def setTimeMax(value: datetime): Self = this.set("timeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeMax: Self = this.set("timeMax", js.undefined)
    
    @scala.inline
    def setTimeMin(value: datetime): Self = this.set("timeMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeMin: Self = this.set("timeMin", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
    
    @scala.inline
    def setUpdatedMin(value: datetime): Self = this.set("updatedMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedMin: Self = this.set("updatedMin", js.undefined)
  }
}
