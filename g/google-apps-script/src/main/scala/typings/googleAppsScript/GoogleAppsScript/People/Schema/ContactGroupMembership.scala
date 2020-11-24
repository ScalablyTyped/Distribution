package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactGroupMembership extends js.Object {
  
  var contactGroupId: js.UndefOr[String] = js.native
}
object ContactGroupMembership {
  
  @scala.inline
  def apply(): ContactGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroupMembership]
  }
  
  @scala.inline
  implicit class ContactGroupMembershipOps[Self <: ContactGroupMembership] (val x: Self) extends AnyVal {
    
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
    def setContactGroupId(value: String): Self = this.set("contactGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactGroupId: Self = this.set("contactGroupId", js.undefined)
  }
}
