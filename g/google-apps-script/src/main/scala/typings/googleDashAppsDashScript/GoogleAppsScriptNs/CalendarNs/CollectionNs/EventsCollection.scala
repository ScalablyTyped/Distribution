package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Event
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Events
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

