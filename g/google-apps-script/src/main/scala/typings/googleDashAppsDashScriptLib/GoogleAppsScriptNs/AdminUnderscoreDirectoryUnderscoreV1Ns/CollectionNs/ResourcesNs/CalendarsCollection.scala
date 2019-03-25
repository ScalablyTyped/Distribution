package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.CollectionNs.ResourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarsCollection extends js.Object {
  // Retrieves a calendar resource.
  def get(customer: java.lang.String, calendarResourceId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.CalendarResource = js.native
  // Inserts a calendar resource.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.CalendarResource,
    customer: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.CalendarResource = js.native
  // Retrieves a list of calendar resources for an account.
  def list(customer: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.CalendarResources = js.native
  // Retrieves a list of calendar resources for an account.
  def list(customer: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.CalendarResources = js.native
  // Updates a calendar resource.
  // This method supports patch semantics, meaning you only need to include the fields you wish to update. Fields that are not present in the request will be preserved. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.CalendarResource,
    customer: java.lang.String,
    calendarResourceId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.CalendarResource = js.native
  // Deletes a calendar resource.
  def remove(customer: java.lang.String, calendarResourceId: java.lang.String): scala.Unit = js.native
  // Updates a calendar resource.
  // This method supports patch semantics, meaning you only need to include the fields you wish to update. Fields that are not present in the request will be preserved.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.CalendarResource,
    customer: java.lang.String,
    calendarResourceId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs.CalendarResource = js.native
}

