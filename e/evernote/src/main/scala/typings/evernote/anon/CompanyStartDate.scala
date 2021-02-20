package typings.evernote.anon

import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompanyStartDate extends StObject {
  
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
  implicit class CompanyStartDateMutableBuilder[Self <: CompanyStartDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanyStartDate(value: Timestamp): Self = StObject.set(x, "companyStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyStartDateUndefined: Self = StObject.set(x, "companyStartDate", js.undefined)
    
    @scala.inline
    def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    @scala.inline
    def setLinkedInProfileUrl(value: String): Self = StObject.set(x, "linkedInProfileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkedInProfileUrlUndefined: Self = StObject.set(x, "linkedInProfileUrl", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMobilePhone(value: String): Self = StObject.set(x, "mobilePhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobilePhoneUndefined: Self = StObject.set(x, "mobilePhone", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWorkPhone(value: String): Self = StObject.set(x, "workPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkPhoneUndefined: Self = StObject.set(x, "workPhone", js.undefined)
  }
}
