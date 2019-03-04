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
    deleteCompanyField: js.Function0[scala.Unit],
    getCompanyName: js.Function0[java.lang.String],
    getJobTitle: js.Function0[java.lang.String],
    isPrimary: js.Function0[scala.Boolean],
    setAsPrimary: js.Function0[CompanyField],
    setCompanyName: js.Function1[java.lang.String, CompanyField],
    setJobTitle: js.Function1[java.lang.String, CompanyField]
  ): CompanyField = {
    val __obj = js.Dynamic.literal(deleteCompanyField = deleteCompanyField, getCompanyName = getCompanyName, getJobTitle = getJobTitle, isPrimary = isPrimary, setAsPrimary = setAsPrimary, setCompanyName = setCompanyName, setJobTitle = setJobTitle)
  
    __obj.asInstanceOf[CompanyField]
  }
}

