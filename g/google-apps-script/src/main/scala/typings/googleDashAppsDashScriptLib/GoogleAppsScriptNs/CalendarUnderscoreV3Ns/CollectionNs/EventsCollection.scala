package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsCollection extends js.Object {
  // Returns an event.
  def get(calendarId: java.lang.String, eventId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Returns an event.
  def get(calendarId: java.lang.String, eventId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Returns an event.
  def get(
    calendarId: java.lang.String,
    eventId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Imports an event. This operation is used to add a private copy of an existing event to a calendar.
  def `import`(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event,
    calendarId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Imports an event. This operation is used to add a private copy of an existing event to a calendar.
  def `import`(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event,
    calendarId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Imports an event. This operation is used to add a private copy of an existing event to a calendar.
  def `import`(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event,
    calendarId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Creates an event.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event,
    calendarId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Creates an event.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event,
    calendarId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Creates an event.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event,
    calendarId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Returns instances of the specified recurring event.
  def instances(calendarId: java.lang.String, eventId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Events = js.native
  // Returns instances of the specified recurring event.
  def instances(calendarId: java.lang.String, eventId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Events = js.native
  // Returns instances of the specified recurring event.
  def instances(
    calendarId: java.lang.String,
    eventId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Events = js.native
  // Returns events on the specified calendar.
  def list(calendarId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Events = js.native
  // Returns events on the specified calendar.
  def list(calendarId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Events = js.native
  // Returns events on the specified calendar.
  def list(calendarId: java.lang.String, optionalArgs: js.Object, headers: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Events = js.native
  // Moves an event to another calendar, i.e. changes an event's organizer.
  def move(calendarId: java.lang.String, eventId: java.lang.String, destination: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Moves an event to another calendar, i.e. changes an event's organizer.
  def move(
    calendarId: java.lang.String,
    eventId: java.lang.String,
    destination: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Moves an event to another calendar, i.e. changes an event's organizer.
  def move(
    calendarId: java.lang.String,
    eventId: java.lang.String,
    destination: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Updates an event. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event,
    calendarId: java.lang.String,
    eventId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Updates an event. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event,
    calendarId: java.lang.String,
    eventId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Updates an event. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event,
    calendarId: java.lang.String,
    eventId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Creates an event based on a simple text string.
  def quickAdd(calendarId: java.lang.String, text: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Creates an event based on a simple text string.
  def quickAdd(calendarId: java.lang.String, text: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Creates an event based on a simple text string.
  def quickAdd(calendarId: java.lang.String, text: java.lang.String, optionalArgs: js.Object, headers: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Deletes an event.
  def remove(calendarId: java.lang.String, eventId: java.lang.String): scala.Unit = js.native
  // Deletes an event.
  def remove(calendarId: java.lang.String, eventId: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Deletes an event.
  def remove(
    calendarId: java.lang.String,
    eventId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): scala.Unit = js.native
  // Updates an event.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event,
    calendarId: java.lang.String,
    eventId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Updates an event.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event,
    calendarId: java.lang.String,
    eventId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Updates an event.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event,
    calendarId: java.lang.String,
    eventId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Event = js.native
  // Watch for changes to Events resources.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Channel,
    calendarId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Channel = js.native
  // Watch for changes to Events resources.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Channel,
    calendarId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Channel = js.native
  // Watch for changes to Events resources.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Channel,
    calendarId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Channel = js.native
}

