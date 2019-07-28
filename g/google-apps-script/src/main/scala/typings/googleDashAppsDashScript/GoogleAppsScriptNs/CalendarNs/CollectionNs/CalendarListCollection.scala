package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarList
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

