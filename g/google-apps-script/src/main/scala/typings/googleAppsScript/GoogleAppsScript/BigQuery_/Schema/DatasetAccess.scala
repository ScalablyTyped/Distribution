package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetAccess extends js.Object {
  
  var domain: js.UndefOr[String] = js.native
  
  var groupByEmail: js.UndefOr[String] = js.native
  
  var iamMember: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var specialGroup: js.UndefOr[String] = js.native
  
  var userByEmail: js.UndefOr[String] = js.native
  
  var view: js.UndefOr[TableReference] = js.native
}
object DatasetAccess {
  
  @scala.inline
  def apply(): DatasetAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetAccess]
  }
  
  @scala.inline
  implicit class DatasetAccessOps[Self <: DatasetAccess] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setGroupByEmail(value: String): Self = this.set("groupByEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupByEmail: Self = this.set("groupByEmail", js.undefined)
    
    @scala.inline
    def setIamMember(value: String): Self = this.set("iamMember", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamMember: Self = this.set("iamMember", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSpecialGroup(value: String): Self = this.set("specialGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialGroup: Self = this.set("specialGroup", js.undefined)
    
    @scala.inline
    def setUserByEmail(value: String): Self = this.set("userByEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserByEmail: Self = this.set("userByEmail", js.undefined)
    
    @scala.inline
    def setView(value: TableReference): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
