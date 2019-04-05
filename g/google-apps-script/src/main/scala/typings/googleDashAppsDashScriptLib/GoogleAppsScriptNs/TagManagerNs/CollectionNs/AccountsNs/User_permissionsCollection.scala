package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User_permissionsCollection extends js.Object {
  // Creates a user's Account & Container access.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.UserPermission,
    parent: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.UserPermission = js.native
  // Gets a user's Account & Container access.
  def get(path: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.UserPermission = js.native
  // List all users that have access to the account along with Account and Container user access granted to each of them.
  def list(parent: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListUserPermissionsResponse = js.native
  // List all users that have access to the account along with Account and Container user access granted to each of them.
  def list(parent: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListUserPermissionsResponse = js.native
  // Removes a user from the account, revoking access to it and all of its containers.
  def remove(path: java.lang.String): scala.Unit = js.native
  // Updates a user's Account & Container access.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.UserPermission,
    path: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs.UserPermission = js.native
}

