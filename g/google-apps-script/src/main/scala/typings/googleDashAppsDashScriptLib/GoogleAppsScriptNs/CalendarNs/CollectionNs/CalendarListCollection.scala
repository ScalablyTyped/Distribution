package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarListCollection extends js.Object {
  // Returns a calendar from the user's calendar list.
  def get(calendarId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry = js.native
  // Returns a calendar from the user's calendar list.
  def get(calendarId: java.lang.String, optionalArgs: js.Object, headers: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry = js.native
  // Inserts an existing calendar into the user's calendar list.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry = js.native
  // Inserts an existing calendar into the user's calendar list.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry = js.native
  // Inserts an existing calendar into the user's calendar list.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry = js.native
  // Returns the calendars on the user's calendar list.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarList = js.native
  // Returns the calendars on the user's calendar list.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarList = js.native
  // Returns the calendars on the user's calendar list.
  def list(optionalArgs: js.Object, headers: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarList = js.native
  // Updates an existing calendar on the user's calendar list. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry,
    calendarId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry = js.native
  // Updates an existing calendar on the user's calendar list. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry,
    calendarId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry = js.native
  // Updates an existing calendar on the user's calendar list. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry,
    calendarId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry = js.native
  // Removes a calendar from the user's calendar list.
  def remove(calendarId: java.lang.String): scala.Unit = js.native
  // Removes a calendar from the user's calendar list.
  def remove(calendarId: java.lang.String, optionalArgs: js.Object, headers: js.Object): scala.Unit = js.native
  // Updates an existing calendar on the user's calendar list.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry,
    calendarId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry = js.native
  // Updates an existing calendar on the user's calendar list.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry,
    calendarId: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry = js.native
  // Updates an existing calendar on the user's calendar list.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry,
    calendarId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry = js.native
  // Watch for changes to CalendarList resources.
  def watch(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel = js.native
  // Watch for changes to CalendarList resources.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel = js.native
  // Watch for changes to CalendarList resources.
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel = js.native
}

