package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MembersCollection extends js.Object {
  // Retrieve Group Member
  def get(groupKey: java.lang.String, memberKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Member = js.native
  // Checks whether the given user is a member of the group. Membership can be direct or nested.
  def hasMember(groupKey: java.lang.String, memberKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.MembersHasMember = js.native
  // Add user to the specified group.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Member,
    groupKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Member = js.native
  // Retrieve all members in a group (paginated)
  def list(groupKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Members = js.native
  // Retrieve all members in a group (paginated)
  def list(groupKey: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Members = js.native
  // Update membership of a user in the specified group. This method supports patch semantics.
  def patch(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Member,
    groupKey: java.lang.String,
    memberKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Member = js.native
  // Remove membership.
  def remove(groupKey: java.lang.String, memberKey: java.lang.String): scala.Unit = js.native
  // Update membership of a user in the specified group.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Member,
    groupKey: java.lang.String,
    memberKey: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Member = js.native
}

