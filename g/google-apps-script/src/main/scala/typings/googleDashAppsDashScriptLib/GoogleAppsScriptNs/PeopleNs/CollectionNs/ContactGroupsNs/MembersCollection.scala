package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.CollectionNs.ContactGroupsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MembersCollection extends js.Object {
  // Modify the members of a contact group owned by the authenticated user.
  // <br>
  // The only system contact groups that can have members added are
  // `contactGroups/myContacts` and `contactGroups/starred`. Other system
  // contact groups are deprecated and can only have contacts removed.
  def modify(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.ModifyContactGroupMembersRequest,
    resourceName: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.ModifyContactGroupMembersResponse
}

object MembersCollection {
  @scala.inline
  def apply(
    modify: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.ModifyContactGroupMembersRequest, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.ModifyContactGroupMembersResponse
  ): MembersCollection = {
    val __obj = js.Dynamic.literal(modify = js.Any.fromFunction2(modify))
  
    __obj.asInstanceOf[MembersCollection]
  }
}

