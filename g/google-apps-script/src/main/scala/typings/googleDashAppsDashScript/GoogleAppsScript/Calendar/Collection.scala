package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar

import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Acl
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.AclRule
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.CalendarList
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.CalendarListEntry
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Channel
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Colors
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Event
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Events
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.FreeBusyRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.FreeBusyResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Setting
import typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Settings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.Calendar.Collection")
@js.native
object Collection extends js.Object {
  @js.native
  trait AclCollection extends js.Object {
    // Returns an access control rule.
    def get(calendarId: String, ruleId: String): AclRule = js.native
    // Returns an access control rule.
    def get(calendarId: String, ruleId: String, optionalArgs: js.Object, headers: js.Object): AclRule = js.native
    // Creates an access control rule.
    def insert(resource: AclRule, calendarId: String): AclRule = js.native
    // Creates an access control rule.
    def insert(resource: AclRule, calendarId: String, optionalArgs: js.Object): AclRule = js.native
    // Creates an access control rule.
    def insert(resource: AclRule, calendarId: String, optionalArgs: js.Object, headers: js.Object): AclRule = js.native
    // Returns the rules in the access control list for the calendar.
    def list(calendarId: String): Acl = js.native
    // Returns the rules in the access control list for the calendar.
    def list(calendarId: String, optionalArgs: js.Object): Acl = js.native
    // Returns the rules in the access control list for the calendar.
    def list(calendarId: String, optionalArgs: js.Object, headers: js.Object): Acl = js.native
    // Updates an access control rule. This method supports patch semantics.
    def patch(resource: AclRule, calendarId: String, ruleId: String): AclRule = js.native
    // Updates an access control rule. This method supports patch semantics.
    def patch(resource: AclRule, calendarId: String, ruleId: String, optionalArgs: js.Object): AclRule = js.native
    // Updates an access control rule. This method supports patch semantics.
    def patch(resource: AclRule, calendarId: String, ruleId: String, optionalArgs: js.Object, headers: js.Object): AclRule = js.native
    // Deletes an access control rule.
    def remove(calendarId: String, ruleId: String): Unit = js.native
    // Deletes an access control rule.
    def remove(calendarId: String, ruleId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
    // Updates an access control rule.
    def update(resource: AclRule, calendarId: String, ruleId: String): AclRule = js.native
    // Updates an access control rule.
    def update(resource: AclRule, calendarId: String, ruleId: String, optionalArgs: js.Object): AclRule = js.native
    // Updates an access control rule.
    def update(resource: AclRule, calendarId: String, ruleId: String, optionalArgs: js.Object, headers: js.Object): AclRule = js.native
    // Watch for changes to ACL resources.
    def watch(resource: Channel, calendarId: String): Channel = js.native
    // Watch for changes to ACL resources.
    def watch(resource: Channel, calendarId: String, optionalArgs: js.Object): Channel = js.native
    // Watch for changes to ACL resources.
    def watch(resource: Channel, calendarId: String, optionalArgs: js.Object, headers: js.Object): Channel = js.native
  }
  
  @js.native
  trait CalendarListCollection extends js.Object {
    // Returns a calendar from the user's calendar list.
    def get(calendarId: String): CalendarListEntry = js.native
    // Returns a calendar from the user's calendar list.
    def get(calendarId: String, optionalArgs: js.Object, headers: js.Object): CalendarListEntry = js.native
    // Inserts an existing calendar into the user's calendar list.
    def insert(resource: CalendarListEntry): CalendarListEntry = js.native
    // Inserts an existing calendar into the user's calendar list.
    def insert(resource: CalendarListEntry, optionalArgs: js.Object): CalendarListEntry = js.native
    // Inserts an existing calendar into the user's calendar list.
    def insert(resource: CalendarListEntry, optionalArgs: js.Object, headers: js.Object): CalendarListEntry = js.native
    // Returns the calendars on the user's calendar list.
    def list(): CalendarList = js.native
    // Returns the calendars on the user's calendar list.
    def list(optionalArgs: js.Object): CalendarList = js.native
    // Returns the calendars on the user's calendar list.
    def list(optionalArgs: js.Object, headers: js.Object): CalendarList = js.native
    // Updates an existing calendar on the user's calendar list. This method supports patch semantics.
    def patch(resource: CalendarListEntry, calendarId: String): CalendarListEntry = js.native
    // Updates an existing calendar on the user's calendar list. This method supports patch semantics.
    def patch(resource: CalendarListEntry, calendarId: String, optionalArgs: js.Object): CalendarListEntry = js.native
    // Updates an existing calendar on the user's calendar list. This method supports patch semantics.
    def patch(resource: CalendarListEntry, calendarId: String, optionalArgs: js.Object, headers: js.Object): CalendarListEntry = js.native
    // Removes a calendar from the user's calendar list.
    def remove(calendarId: String): Unit = js.native
    // Removes a calendar from the user's calendar list.
    def remove(calendarId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
    // Updates an existing calendar on the user's calendar list.
    def update(resource: CalendarListEntry, calendarId: String): CalendarListEntry = js.native
    // Updates an existing calendar on the user's calendar list.
    def update(resource: CalendarListEntry, calendarId: String, optionalArgs: js.Object): CalendarListEntry = js.native
    // Updates an existing calendar on the user's calendar list.
    def update(resource: CalendarListEntry, calendarId: String, optionalArgs: js.Object, headers: js.Object): CalendarListEntry = js.native
    // Watch for changes to CalendarList resources.
    def watch(resource: Channel): Channel = js.native
    // Watch for changes to CalendarList resources.
    def watch(resource: Channel, optionalArgs: js.Object): Channel = js.native
    // Watch for changes to CalendarList resources.
    def watch(resource: Channel, optionalArgs: js.Object, headers: js.Object): Channel = js.native
  }
  
  @js.native
  trait CalendarsCollection extends js.Object {
    // Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account.
    def clear(calendarId: String): Unit = js.native
    // Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account.
    def clear(calendarId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
    // Returns metadata for a calendar.
    def get(calendarId: String): typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
    // Returns metadata for a calendar.
    def get(calendarId: String, optionalArgs: js.Object, headers: js.Object): typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
    // Creates a secondary calendar.
    def insert(resource: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar): typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
    // Creates a secondary calendar.
    def insert(
      resource: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar,
      optionalArgs: js.Object,
      headers: js.Object
    ): typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
    // Updates metadata for a calendar. This method supports patch semantics.
    def patch(
      resource: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar,
      calendarId: String
    ): typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
    // Updates metadata for a calendar. This method supports patch semantics.
    def patch(
      resource: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar,
      calendarId: String,
      optionalArgs: js.Object,
      headers: js.Object
    ): typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
    // Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars.
    def remove(calendarId: String): Unit = js.native
    // Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars.
    def remove(calendarId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
    // Updates metadata for a calendar.
    def update(
      resource: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar,
      calendarId: String
    ): typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
    // Updates metadata for a calendar.
    def update(
      resource: typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar,
      calendarId: String,
      optionalArgs: js.Object,
      headers: js.Object
    ): typings.googleDashAppsDashScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
  }
  
  @js.native
  trait ChannelsCollection extends js.Object {
    // Stop watching resources through this channel
    def stop(resource: Channel): Unit = js.native
    // Stop watching resources through this channel
    def stop(resource: Channel, optionalArgs: js.Object, headers: js.Object): Unit = js.native
  }
  
  @js.native
  trait ColorsCollection extends js.Object {
    // Returns the color definitions for calendars and events.
    def get(): Colors = js.native
    // Returns the color definitions for calendars and events.
    def get(optionalArgs: js.Object, headers: js.Object): Colors = js.native
  }
  
  @js.native
  trait EventsCollection extends js.Object {
    // Returns an event.
    def get(calendarId: String, eventId: String): Event = js.native
    // Returns an event.
    def get(calendarId: String, eventId: String, optionalArgs: js.Object): Event = js.native
    // Returns an event.
    def get(calendarId: String, eventId: String, optionalArgs: js.Object, headers: js.Object): Event = js.native
    // Imports an event. This operation is used to add a private copy of an existing event to a calendar.
    def `import`(resource: Event, calendarId: String): Event = js.native
    // Imports an event. This operation is used to add a private copy of an existing event to a calendar.
    def `import`(resource: Event, calendarId: String, optionalArgs: js.Object): Event = js.native
    // Imports an event. This operation is used to add a private copy of an existing event to a calendar.
    def `import`(resource: Event, calendarId: String, optionalArgs: js.Object, headers: js.Object): Event = js.native
    // Creates an event.
    def insert(resource: Event, calendarId: String): Event = js.native
    // Creates an event.
    def insert(resource: Event, calendarId: String, optionalArgs: js.Object): Event = js.native
    // Creates an event.
    def insert(resource: Event, calendarId: String, optionalArgs: js.Object, headers: js.Object): Event = js.native
    // Returns instances of the specified recurring event.
    def instances(calendarId: String, eventId: String): Events = js.native
    // Returns instances of the specified recurring event.
    def instances(calendarId: String, eventId: String, optionalArgs: js.Object): Events = js.native
    // Returns instances of the specified recurring event.
    def instances(calendarId: String, eventId: String, optionalArgs: js.Object, headers: js.Object): Events = js.native
    // Returns events on the specified calendar.
    def list(calendarId: String): Events = js.native
    // Returns events on the specified calendar.
    def list(calendarId: String, optionalArgs: js.Object): Events = js.native
    // Returns events on the specified calendar.
    def list(calendarId: String, optionalArgs: js.Object, headers: js.Object): Events = js.native
    // Moves an event to another calendar, i.e. changes an event's organizer.
    def move(calendarId: String, eventId: String, destination: String): Event = js.native
    // Moves an event to another calendar, i.e. changes an event's organizer.
    def move(calendarId: String, eventId: String, destination: String, optionalArgs: js.Object): Event = js.native
    // Moves an event to another calendar, i.e. changes an event's organizer.
    def move(
      calendarId: String,
      eventId: String,
      destination: String,
      optionalArgs: js.Object,
      headers: js.Object
    ): Event = js.native
    // Updates an event. This method supports patch semantics.
    def patch(resource: Event, calendarId: String, eventId: String): Event = js.native
    // Updates an event. This method supports patch semantics.
    def patch(resource: Event, calendarId: String, eventId: String, optionalArgs: js.Object): Event = js.native
    // Updates an event. This method supports patch semantics.
    def patch(resource: Event, calendarId: String, eventId: String, optionalArgs: js.Object, headers: js.Object): Event = js.native
    // Creates an event based on a simple text string.
    def quickAdd(calendarId: String, text: String): Event = js.native
    // Creates an event based on a simple text string.
    def quickAdd(calendarId: String, text: String, optionalArgs: js.Object): Event = js.native
    // Creates an event based on a simple text string.
    def quickAdd(calendarId: String, text: String, optionalArgs: js.Object, headers: js.Object): Event = js.native
    // Deletes an event.
    def remove(calendarId: String, eventId: String): Unit = js.native
    // Deletes an event.
    def remove(calendarId: String, eventId: String, optionalArgs: js.Object): Unit = js.native
    // Deletes an event.
    def remove(calendarId: String, eventId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
    // Updates an event.
    def update(resource: Event, calendarId: String, eventId: String): Event = js.native
    // Updates an event.
    def update(resource: Event, calendarId: String, eventId: String, optionalArgs: js.Object): Event = js.native
    // Updates an event.
    def update(resource: Event, calendarId: String, eventId: String, optionalArgs: js.Object, headers: js.Object): Event = js.native
    // Watch for changes to Events resources.
    def watch(resource: Channel, calendarId: String): Channel = js.native
    // Watch for changes to Events resources.
    def watch(resource: Channel, calendarId: String, optionalArgs: js.Object): Channel = js.native
    // Watch for changes to Events resources.
    def watch(resource: Channel, calendarId: String, optionalArgs: js.Object, headers: js.Object): Channel = js.native
  }
  
  @js.native
  trait FreebusyCollection extends js.Object {
    // Returns free/busy information for a set of calendars.
    def query(resource: FreeBusyRequest): FreeBusyResponse = js.native
    // Returns free/busy information for a set of calendars.
    def query(resource: FreeBusyRequest, optionalArgs: js.Object, headers: js.Object): FreeBusyResponse = js.native
  }
  
  @js.native
  trait SettingsCollection extends js.Object {
    // Returns a single user setting.
    def get(setting: String): Setting = js.native
    // Returns a single user setting.
    def get(setting: String, optionalArgs: js.Object, headers: js.Object): Setting = js.native
    // Returns all user settings for the authenticated user.
    def list(): Settings = js.native
    // Returns all user settings for the authenticated user.
    def list(optionalArgs: js.Object): Settings = js.native
    // Returns all user settings for the authenticated user.
    def list(optionalArgs: js.Object, headers: js.Object): Settings = js.native
    // Watch for changes to Settings resources.
    def watch(resource: Channel): Channel = js.native
    // Watch for changes to Settings resources.
    def watch(resource: Channel, optionalArgs: js.Object): Channel = js.native
    // Watch for changes to Settings resources.
    def watch(resource: Channel, optionalArgs: js.Object, headers: js.Object): Channel = js.native
  }
  
}

