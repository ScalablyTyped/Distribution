package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.ResourcesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.CalendarResource
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.CalendarResources
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarsCollection extends js.Object {
  // Retrieves a calendar resource.
  def get(customer: String, calendarResourceId: String): CalendarResource = js.native
  // Inserts a calendar resource.
  def insert(resource: CalendarResource, customer: String): CalendarResource = js.native
  // Retrieves a list of calendar resources for an account.
  def list(customer: String): CalendarResources = js.native
  // Retrieves a list of calendar resources for an account.
  def list(customer: String, optionalArgs: js.Object): CalendarResources = js.native
  // Updates a calendar resource.
  // This method supports patch semantics, meaning you only need to include the fields you wish to update. Fields that are not present in the request will be preserved. This method supports patch semantics.
  def patch(resource: CalendarResource, customer: String, calendarResourceId: String): CalendarResource = js.native
  // Deletes a calendar resource.
  def remove(customer: String, calendarResourceId: String): Unit = js.native
  // Updates a calendar resource.
  // This method supports patch semantics, meaning you only need to include the fields you wish to update. Fields that are not present in the request will be preserved.
  def update(resource: CalendarResource, customer: String, calendarResourceId: String): CalendarResource = js.native
}

