package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersCollection extends js.Object {
  var Aliases: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.UsersNs.AliasesCollection
  ] = js.native
  var Photos: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.UsersNs.PhotosCollection
  ] = js.native
  // retrieve user
  def get(userKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.User = js.native
  // retrieve user
  def get(userKey: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.User = js.native
  // create user.
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.User): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.User = js.native
  // Retrieve either deleted users or all users in a domain (paginated)
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Users = js.native
  // Retrieve either deleted users or all users in a domain (paginated)
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Users = js.native
  // change admin status of a user
  def makeAdmin(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserMakeAdmin,
    userKey: java.lang.String
  ): scala.Unit = js.native
  // update user. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.User,
    userKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.User = js.native
  // Delete user
  def remove(userKey: java.lang.String): scala.Unit = js.native
  // Undelete a deleted user
  def undelete(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.UserUndelete,
    userKey: java.lang.String
  ): scala.Unit = js.native
  // update user
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.User,
    userKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.User = js.native
  // Watch for changes in users list
  def watch(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Channel): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Channel = js.native
  // Watch for changes in users list
  def watch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Channel,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Channel = js.native
}

