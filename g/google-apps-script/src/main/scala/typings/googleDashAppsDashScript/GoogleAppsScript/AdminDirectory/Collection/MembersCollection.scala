package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Member
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.Members
import typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema.MembersHasMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MembersCollection extends js.Object {
  // Retrieve Group Member
  def get(groupKey: String, memberKey: String): Member = js.native
  // Checks whether the given user is a member of the group. Membership can be direct or nested.
  def hasMember(groupKey: String, memberKey: String): MembersHasMember = js.native
  // Add user to the specified group.
  def insert(resource: Member, groupKey: String): Member = js.native
  // Retrieve all members in a group (paginated)
  def list(groupKey: String): Members = js.native
  // Retrieve all members in a group (paginated)
  def list(groupKey: String, optionalArgs: js.Object): Members = js.native
  // Update membership of a user in the specified group. This method supports patch semantics.
  def patch(resource: Member, groupKey: String, memberKey: String): Member = js.native
  // Remove membership.
  def remove(groupKey: String, memberKey: String): Unit = js.native
  // Update membership of a user in the specified group.
  def update(resource: Member, groupKey: String, memberKey: String): Member = js.native
}

