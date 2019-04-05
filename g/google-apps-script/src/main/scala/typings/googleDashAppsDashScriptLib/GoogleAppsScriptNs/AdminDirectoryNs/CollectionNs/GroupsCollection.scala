package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsCollection extends js.Object {
  var Aliases: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs.GroupsNs.AliasesCollection
  ] = js.native
  // Retrieve Group
  def get(groupKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Group = js.native
  // Create Group
  def insert(resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Group): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Group = js.native
  // Retrieve all groups of a domain or of a user given a userKey (paginated)
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Groups = js.native
  // Retrieve all groups of a domain or of a user given a userKey (paginated)
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Groups = js.native
  // Update Group. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Group,
    groupKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Group = js.native
  // Delete Group
  def remove(groupKey: java.lang.String): scala.Unit = js.native
  // Update Group
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Group,
    groupKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Group = js.native
}

