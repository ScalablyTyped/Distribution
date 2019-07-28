package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListUserPermissionsResponse
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.UserPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User_permissionsCollection extends js.Object {
  // Creates a user's Account & Container access.
  def create(resource: UserPermission, parent: String): UserPermission = js.native
  // Gets a user's Account & Container access.
  def get(path: String): UserPermission = js.native
  // List all users that have access to the account along with Account and Container user access granted to each of them.
  def list(parent: String): ListUserPermissionsResponse = js.native
  // List all users that have access to the account along with Account and Container user access granted to each of them.
  def list(parent: String, optionalArgs: js.Object): ListUserPermissionsResponse = js.native
  // Removes a user from the account, revoking access to it and all of its containers.
  def remove(path: String): Unit = js.native
  // Updates a user's Account & Container access.
  def update(resource: UserPermission, path: String): UserPermission = js.native
}

