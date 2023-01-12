package typings.evernote.anon

import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompanyStartDate extends StObject {
  
  var companyStartDate: js.UndefOr[Timestamp] = js.undefined
  
  var department: js.UndefOr[String] = js.undefined
  
  var linkedInProfileUrl: js.UndefOr[String] = js.undefined
  
  var location: js.UndefOr[String] = js.undefined
  
  var mobilePhone: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var workPhone: js.UndefOr[String] = js.undefined
}
object CompanyStartDate {
  
  inline def apply(): CompanyStartDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompanyStartDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompanyStartDate] (val x: Self) extends AnyVal {
    
    inline def setCompanyStartDate(value: Timestamp): Self = StObject.set(x, "companyStartDate", value.asInstanceOf[js.Any])
    
    inline def setCompanyStartDateUndefined: Self = StObject.set(x, "companyStartDate", js.undefined)
    
    inline def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    inline def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    inline def setLinkedInProfileUrl(value: String): Self = StObject.set(x, "linkedInProfileUrl", value.asInstanceOf[js.Any])
    
    inline def setLinkedInProfileUrlUndefined: Self = StObject.set(x, "linkedInProfileUrl", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMobilePhone(value: String): Self = StObject.set(x, "mobilePhone", value.asInstanceOf[js.Any])
    
    inline def setMobilePhoneUndefined: Self = StObject.set(x, "mobilePhone", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setWorkPhone(value: String): Self = StObject.set(x, "workPhone", value.asInstanceOf[js.Any])
    
    inline def setWorkPhoneUndefined: Self = StObject.set(x, "workPhone", js.undefined)
  }
}
