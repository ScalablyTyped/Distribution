package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContactsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompanyField extends js.Object {
  def deleteCompanyField(): scala.Unit
  def getCompanyName(): java.lang.String
  def getJobTitle(): java.lang.String
  def isPrimary(): scala.Boolean
  def setAsPrimary(): CompanyField
  def setCompanyName(company: java.lang.String): CompanyField
  def setJobTitle(title: java.lang.String): CompanyField
}

object CompanyField {
  @scala.inline
  def apply(
    deleteCompanyField: () => scala.Unit,
    getCompanyName: () => java.lang.String,
    getJobTitle: () => java.lang.String,
    isPrimary: () => scala.Boolean,
    setAsPrimary: () => CompanyField,
    setCompanyName: java.lang.String => CompanyField,
    setJobTitle: java.lang.String => CompanyField
  ): CompanyField = {
    val __obj = js.Dynamic.literal(deleteCompanyField = js.Any.fromFunction0(deleteCompanyField), getCompanyName = js.Any.fromFunction0(getCompanyName), getJobTitle = js.Any.fromFunction0(getJobTitle), isPrimary = js.Any.fromFunction0(isPrimary), setAsPrimary = js.Any.fromFunction0(setAsPrimary), setCompanyName = js.Any.fromFunction1(setCompanyName), setJobTitle = js.Any.fromFunction1(setJobTitle))
  
    __obj.asInstanceOf[CompanyField]
  }
}

