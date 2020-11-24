package typings.googleAppsScript.GoogleAppsScript.People.Collection.ContactGroups

import typings.googleAppsScript.GoogleAppsScript.People.Schema.ModifyContactGroupMembersRequest
import typings.googleAppsScript.GoogleAppsScript.People.Schema.ModifyContactGroupMembersResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersCollection extends js.Object {
  
  // Modify the members of a contact group owned by the authenticated user.
  // <br>
  // The only system contact groups that can have members added are
  // `contactGroups/myContacts` and `contactGroups/starred`. Other system
  // contact groups are deprecated and can only have contacts removed.
  def modify(resource: ModifyContactGroupMembersRequest, resourceName: String): ModifyContactGroupMembersResponse = js.native
}
object MembersCollection {
  
  @scala.inline
  def apply(modify: (ModifyContactGroupMembersRequest, String) => ModifyContactGroupMembersResponse): MembersCollection = {
    val __obj = js.Dynamic.literal(modify = js.Any.fromFunction2(modify))
    __obj.asInstanceOf[MembersCollection]
  }
  
  @scala.inline
  implicit class MembersCollectionOps[Self <: MembersCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setModify(value: (ModifyContactGroupMembersRequest, String) => ModifyContactGroupMembersResponse): Self = this.set("modify", js.Any.fromFunction2(value))
  }
}
