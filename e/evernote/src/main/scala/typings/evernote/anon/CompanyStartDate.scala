package typings.evernote.anon

import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompanyStartDate extends js.Object {
  
  var companyStartDate: js.UndefOr[Timestamp] = js.native
  
  var department: js.UndefOr[String] = js.native
  
  var linkedInProfileUrl: js.UndefOr[String] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var mobilePhone: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var workPhone: js.UndefOr[String] = js.native
}
object CompanyStartDate {
  
  @scala.inline
  def apply(): CompanyStartDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompanyStartDate]
  }
  
  @scala.inline
  implicit class CompanyStartDateOps[Self <: CompanyStartDate] (val x: Self) extends AnyVal {
    
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
    def setCompanyStartDate(value: Timestamp): Self = this.set("companyStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyStartDate: Self = this.set("companyStartDate", js.undefined)
    
    @scala.inline
    def setDepartment(value: String): Self = this.set("department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    
    @scala.inline
    def setLinkedInProfileUrl(value: String): Self = this.set("linkedInProfileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedInProfileUrl: Self = this.set("linkedInProfileUrl", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setMobilePhone(value: String): Self = this.set("mobilePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobilePhone: Self = this.set("mobilePhone", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWorkPhone(value: String): Self = this.set("workPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkPhone: Self = this.set("workPhone", js.undefined)
  }
}
