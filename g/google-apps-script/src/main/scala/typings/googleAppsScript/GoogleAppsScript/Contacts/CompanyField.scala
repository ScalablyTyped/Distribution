package typings.googleAppsScript.GoogleAppsScript.Contacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Company field in a Contact.
  */
@js.native
trait CompanyField extends js.Object {
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
  implicit class CompanyFieldOps[Self <: CompanyField] (val x: Self) extends AnyVal {
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
    def setDeleteCompanyField(value: () => Unit): Self = this.set("deleteCompanyField", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCompanyName(value: () => String): Self = this.set("getCompanyName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetJobTitle(value: () => String): Self = this.set("getJobTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setIsPrimary(value: () => Boolean): Self = this.set("isPrimary", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAsPrimary(value: () => CompanyField): Self = this.set("setAsPrimary", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCompanyName(value: String => CompanyField): Self = this.set("setCompanyName", js.Any.fromFunction1(value))
    @scala.inline
    def setSetJobTitle(value: String => CompanyField): Self = this.set("setJobTitle", js.Any.fromFunction1(value))
  }
  
}

