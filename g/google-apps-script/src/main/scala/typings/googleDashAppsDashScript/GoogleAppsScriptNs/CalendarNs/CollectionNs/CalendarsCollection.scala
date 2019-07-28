package typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarsCollection extends js.Object {
  // Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account.
  def clear(calendarId: String): Unit = js.native
  // Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account.
  def clear(calendarId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
  // Returns metadata for a calendar.
  def get(calendarId: String): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar = js.native
  // Returns metadata for a calendar.
  def get(calendarId: String, optionalArgs: js.Object, headers: js.Object): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar = js.native
  // Creates a secondary calendar.
  def insert(resource: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar = js.native
  // Creates a secondary calendar.
  def insert(
    resource: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar,
    optionalArgs: js.Object,
    headers: js.Object
  ): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar = js.native
  // Updates metadata for a calendar. This method supports patch semantics.
  def patch(
    resource: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar,
    calendarId: String
  ): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar = js.native
  // Updates metadata for a calendar. This method supports patch semantics.
  def patch(
    resource: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar,
    calendarId: String,
    optionalArgs: js.Object,
    headers: js.Object
  ): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar = js.native
  // Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars.
  def remove(calendarId: String): Unit = js.native
  // Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars.
  def remove(calendarId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
  // Updates metadata for a calendar.
  def update(
    resource: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar,
    calendarId: String
  ): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar = js.native
  // Updates metadata for a calendar.
  def update(
    resource: typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar,
    calendarId: String,
    optionalArgs: js.Object,
    headers: js.Object
  ): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar = js.native
}

