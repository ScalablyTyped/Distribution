package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactGroup extends js.Object {
  
  var etag: js.UndefOr[String] = js.native
  
  var formattedName: js.UndefOr[String] = js.native
  
  var groupType: js.UndefOr[String] = js.native
  
  var memberCount: js.UndefOr[Double] = js.native
  
  var memberResourceNames: js.UndefOr[js.Array[String]] = js.native
  
  var metadata: js.UndefOr[ContactGroupMetadata] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var resourceName: js.UndefOr[String] = js.native
}
object ContactGroup {
  
  @scala.inline
  def apply(): ContactGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactGroup]
  }
  
  @scala.inline
  implicit class ContactGroupOps[Self <: ContactGroup] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setFormattedName(value: String): Self = this.set("formattedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedName: Self = this.set("formattedName", js.undefined)
    
    @scala.inline
    def setGroupType(value: String): Self = this.set("groupType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupType: Self = this.set("groupType", js.undefined)
    
    @scala.inline
    def setMemberCount(value: Double): Self = this.set("memberCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberCount: Self = this.set("memberCount", js.undefined)
    
    @scala.inline
    def setMemberResourceNamesVarargs(value: String*): Self = this.set("memberResourceNames", js.Array(value :_*))
    
    @scala.inline
    def setMemberResourceNames(value: js.Array[String]): Self = this.set("memberResourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberResourceNames: Self = this.set("memberResourceNames", js.undefined)
    
    @scala.inline
    def setMetadata(value: ContactGroupMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
  }
}
