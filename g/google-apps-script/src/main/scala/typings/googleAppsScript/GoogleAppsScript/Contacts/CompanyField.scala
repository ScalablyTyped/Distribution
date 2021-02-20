package typings.googleAppsScript.GoogleAppsScript.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Company field in a Contact.
  */
@js.native
trait CompanyField extends StObject {
  
  def deleteCompanyField(): Unit = js.native
  
  def getCompanyName(): String = js.native
  
  def getJobTitle(): String = js.native
  
  def isPrimary(): Boolean = js.native
  
  def setAsPrimary(): CompanyField = js.native
  
  def setCompanyName(company: String): CompanyField = js.native
  
  def setJobTitle(title: String): CompanyField = js.native
}
object CompanyField {
  
  @scala.inline
  def apply(
    deleteCompanyField: () => Unit,
    getCompanyName: () => String,
    getJobTitle: () => String,
    isPrimary: () => Boolean,
    setAsPrimary: () => CompanyField,
    setCompanyName: String => CompanyField,
    setJobTitle: String => CompanyField
  ): CompanyField = {
    val __obj = js.Dynamic.literal(deleteCompanyField = js.Any.fromFunction0(deleteCompanyField), getCompanyName = js.Any.fromFunction0(getCompanyName), getJobTitle = js.Any.fromFunction0(getJobTitle), isPrimary = js.Any.fromFunction0(isPrimary), setAsPrimary = js.Any.fromFunction0(setAsPrimary), setCompanyName = js.Any.fromFunction1(setCompanyName), setJobTitle = js.Any.fromFunction1(setJobTitle))
    __obj.asInstanceOf[CompanyField]
  }
  
  @scala.inline
  implicit class CompanyFieldMutableBuilder[Self <: CompanyField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteCompanyField(value: () => Unit): Self = StObject.set(x, "deleteCompanyField", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCompanyName(value: () => String): Self = StObject.set(x, "getCompanyName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetJobTitle(value: () => String): Self = StObject.set(x, "getJobTitle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPrimary(value: () => Boolean): Self = StObject.set(x, "isPrimary", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAsPrimary(value: () => CompanyField): Self = StObject.set(x, "setAsPrimary", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCompanyName(value: String => CompanyField): Self = StObject.set(x, "setCompanyName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetJobTitle(value: String => CompanyField): Self = StObject.set(x, "setJobTitle", js.Any.fromFunction1(value))
  }
}
