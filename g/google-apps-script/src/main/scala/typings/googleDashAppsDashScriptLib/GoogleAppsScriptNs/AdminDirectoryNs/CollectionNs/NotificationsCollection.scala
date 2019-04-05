package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsCollection extends js.Object {
  // Retrieves a notification.
  def get(customer: java.lang.String, notificationId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Notification = js.native
  // Retrieves a list of notifications.
  def list(customer: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Notifications = js.native
  // Retrieves a list of notifications.
  def list(customer: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Notifications = js.native
  // Updates a notification. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Notification,
    customer: java.lang.String,
    notificationId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Notification = js.native
  // Deletes a notification
  def remove(customer: java.lang.String, notificationId: java.lang.String): scala.Unit = js.native
  // Updates a notification.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Notification,
    customer: java.lang.String,
    notificationId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Notification = js.native
}

