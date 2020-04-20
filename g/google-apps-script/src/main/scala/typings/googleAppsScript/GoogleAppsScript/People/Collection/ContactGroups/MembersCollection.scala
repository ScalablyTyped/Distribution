package typings.googleAppsScript.GoogleAppsScript.People.Collection.ContactGroups

import typings.googleAppsScript.GoogleAppsScript.People.Schema.ModifyContactGroupMembersRequest
import typings.googleAppsScript.GoogleAppsScript.People.Schema.ModifyContactGroupMembersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersCollection extends js.Object {
  // Modify the members of a contact group owned by the authenticated user.
  // <br>
  // The only system contact groups that can have members added are
  // `contactGroups/myContacts` and `contactGroups/starred`. Other system
  // contact groups are deprecated and can only have contacts removed.
  def modify(resource: ModifyContactGroupMembersRequest, resourceName: String): ModifyContactGroupMembersResponse
}

object MembersCollection {
  @scala.inline
  def apply(modify: (ModifyContactGroupMembersRequest, String) => ModifyContactGroupMembersResponse): MembersCollection = {
    val __obj = js.Dynamic.literal(modify = js.Any.fromFunction2(modify))
    __obj.asInstanceOf[MembersCollection]
  }
}

