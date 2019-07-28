package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.ContainersCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.CollectionNs.AccountsNs.User_permissionsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.Account
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs.ListAccountsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountsCollection extends js.Object {
  var Containers: js.UndefOr[ContainersCollection] = js.native
  var User_permissions: js.UndefOr[User_permissionsCollection] = js.native
  // Gets a GTM Account.
  def get(path: String): Account = js.native
  // Lists all GTM Accounts that a user has access to.
  def list(): ListAccountsResponse = js.native
  // Lists all GTM Accounts that a user has access to.
  def list(optionalArgs: js.Object): ListAccountsResponse = js.native
  // Updates a GTM Account.
  def update(resource: Account, path: String): Account = js.native
  // Updates a GTM Account.
  def update(resource: Account, path: String, optionalArgs: js.Object): Account = js.native
}

