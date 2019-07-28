package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompanyField extends js.Object {
  def deleteCompanyField(): Unit
  def getCompanyName(): String
  def getJobTitle(): String
  def isPrimary(): Boolean
  def setAsPrimary(): CompanyField
  def setCompanyName(company: String): CompanyField
  def setJobTitle(title: String): CompanyField
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
}

