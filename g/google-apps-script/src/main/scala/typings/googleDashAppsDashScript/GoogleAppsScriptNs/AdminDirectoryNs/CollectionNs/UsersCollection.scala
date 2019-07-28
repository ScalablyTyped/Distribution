package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.UsersNs.AliasesCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.UsersNs.PhotosCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Channel
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.User
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserMakeAdmin
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserUndelete
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersCollection extends js.Object {
  var Aliases: js.UndefOr[AliasesCollection] = js.native
  var Photos: js.UndefOr[PhotosCollection] = js.native
  // retrieve user
  def get(userKey: String): User = js.native
  // retrieve user
  def get(userKey: String, optionalArgs: js.Object): User = js.native
  // create user.
  def insert(resource: User): User = js.native
  // Retrieve either deleted users or all users in a domain (paginated)
  def list(): Users = js.native
  // Retrieve either deleted users or all users in a domain (paginated)
  def list(optionalArgs: js.Object): Users = js.native
  // change admin status of a user
  def makeAdmin(resource: UserMakeAdmin, userKey: String): Unit = js.native
  // update user. This method supports patch semantics.
  def patch(resource: User, userKey: String): User = js.native
  // Delete user
  def remove(userKey: String): Unit = js.native
  // Undelete a deleted user
  def undelete(resource: UserUndelete, userKey: String): Unit = js.native
  // update user
  def update(resource: User, userKey: String): User = js.native
  // Watch for changes in users list
  def watch(resource: Channel): Channel = js.native
  // Watch for changes in users list
  def watch(resource: Channel, optionalArgs: js.Object): Channel = js.native
}

