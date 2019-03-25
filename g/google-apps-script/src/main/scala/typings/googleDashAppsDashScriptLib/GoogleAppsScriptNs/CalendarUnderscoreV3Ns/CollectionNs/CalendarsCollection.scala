package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarsCollection extends js.Object {
  // Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account.
  def clear(calendarId: java.lang.String): scala.Unit = js.native
  // Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account.
  def clear(calendarId: java.lang.String, optionalArgs: js.Object, headers: js.Object): scala.Unit = js.native
  // Returns metadata for a calendar.
  def get(calendarId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar = js.native
  // Returns metadata for a calendar.
  def get(calendarId: java.lang.String, optionalArgs: js.Object, headers: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar = js.native
  // Creates a secondary calendar.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar = js.native
  // Creates a secondary calendar.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar = js.native
  // Updates metadata for a calendar. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar,
    calendarId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar = js.native
  // Updates metadata for a calendar. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar,
    calendarId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar = js.native
  // Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars.
  def remove(calendarId: java.lang.String): scala.Unit = js.native
  // Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars.
  def remove(calendarId: java.lang.String, optionalArgs: js.Object, headers: js.Object): scala.Unit = js.native
  // Updates metadata for a calendar.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar,
    calendarId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar = js.native
  // Updates metadata for a calendar.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar,
    calendarId: java.lang.String,
    optionalArgs: js.Object,
    headers: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarUnderscoreV3Ns.SchemaNs.Calendar = js.native
}

