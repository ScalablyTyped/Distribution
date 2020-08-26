package typings.gapiCalendar

import typings.gapi.gapi.client.HttpRequest
import typings.gapiCalendar.gapi.client.calendar.AclDeleteParameters
import typings.gapiCalendar.gapi.client.calendar.AclGetParameters
import typings.gapiCalendar.gapi.client.calendar.AclInsertParameters
import typings.gapiCalendar.gapi.client.calendar.AclUpdateParameters
import typings.gapiCalendar.gapi.client.calendar.Acl_
import typings.gapiCalendar.gapi.client.calendar.Calendar
import typings.gapiCalendar.gapi.client.calendar.CalendarListEntry
import typings.gapiCalendar.gapi.client.calendar.CalendarListInsertParameters
import typings.gapiCalendar.gapi.client.calendar.CalendarListListParameters
import typings.gapiCalendar.gapi.client.calendar.CalendarList_
import typings.gapiCalendar.gapi.client.calendar.CalendarsDeleteParameters
import typings.gapiCalendar.gapi.client.calendar.CalendarsInsertParameters
import typings.gapiCalendar.gapi.client.calendar.CalendarsUpdateParameters
import typings.gapiCalendar.gapi.client.calendar.EventsDeleteParameters
import typings.gapiCalendar.gapi.client.calendar.EventsGetParameters
import typings.gapiCalendar.gapi.client.calendar.EventsInsertParameters
import typings.gapiCalendar.gapi.client.calendar.EventsListParameters
import typings.gapiCalendar.gapi.client.calendar.EventsUpdateParameters
import typings.gapiCalendar.gapi.client.calendar.Events_
import typings.gapiCalendar.gapi.client.calendar.FreeBusyQueryParameters
import typings.gapiCalendar.gapi.client.calendar.FreeBusy_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      @js.native
      object calendar extends js.Object {
        @js.native
        class Event ()
          extends typings.gapiCalendar.gapi.client.calendar.Event
        
        @js.native
        class acl ()
          extends typings.gapiCalendar.gapi.client.calendar.acl
        
        @js.native
        class calendarList ()
          extends typings.gapiCalendar.gapi.client.calendar.calendarList
        
        @js.native
        class calendars ()
          extends typings.gapiCalendar.gapi.client.calendar.calendars
        
        @js.native
        class events ()
          extends typings.gapiCalendar.gapi.client.calendar.events
        
        @js.native
        class freebusy ()
          extends typings.gapiCalendar.gapi.client.calendar.freebusy
        
        /* static members */
        @js.native
        object acl extends js.Object {
          def delete(parameters: AclDeleteParameters): HttpRequest[Unit] = js.native
          def get(parameters: AclGetParameters): HttpRequest[Acl_] = js.native
          def insert(parameters: AclInsertParameters): HttpRequest[Acl_] = js.native
          def update(parameters: AclUpdateParameters): HttpRequest[Acl_] = js.native
        }
        
        /* static members */
        @js.native
        object calendarList extends js.Object {
          def insert(parameters: CalendarListInsertParameters): HttpRequest[CalendarListEntry] = js.native
          def list(): HttpRequest[CalendarList_] = js.native
          def list(parameters: CalendarListListParameters): HttpRequest[CalendarList_] = js.native
        }
        
        /* static members */
        @js.native
        object calendars extends js.Object {
          def delete(parameters: CalendarsDeleteParameters): HttpRequest[Unit] = js.native
          def insert(parameters: CalendarsInsertParameters): HttpRequest[Calendar] = js.native
          def update(parameters: CalendarsUpdateParameters): HttpRequest[Calendar] = js.native
        }
        
        /* static members */
        @js.native
        object events extends js.Object {
          // delete the existing event from calendar
          def delete(parameters: EventsDeleteParameters): HttpRequest[typings.gapiCalendar.gapi.client.calendar.Event] = js.native
          def get(parameters: EventsGetParameters): HttpRequest[typings.gapiCalendar.gapi.client.calendar.Event] = js.native
          def insert(parameters: EventsInsertParameters): HttpRequest[typings.gapiCalendar.gapi.client.calendar.Event] = js.native
          def list(parameters: EventsListParameters): HttpRequest[Events_] = js.native
          def update(parameters: EventsUpdateParameters): HttpRequest[typings.gapiCalendar.gapi.client.calendar.Event] = js.native
        }
        
        /* static members */
        @js.native
        object freebusy extends js.Object {
          def query(parameters: FreeBusyQueryParameters): HttpRequest[FreeBusy_] = js.native
        }
        
      }
      
    }
    
  }
  
}

