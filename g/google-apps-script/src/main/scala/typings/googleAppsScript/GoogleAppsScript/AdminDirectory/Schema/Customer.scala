package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Customer extends js.Object {
  var alternateEmail: js.UndefOr[String] = js.native
  var customerCreationTime: js.UndefOr[String] = js.native
  var customerDomain: js.UndefOr[String] = js.native
  var etag: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var language: js.UndefOr[String] = js.native
  var phoneNumber: js.UndefOr[String] = js.native
  var postalAddress: js.UndefOr[CustomerPostalAddress] = js.native
}

object Customer {
  @scala.inline
  def apply(): Customer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Customer]
  }
  @scala.inline
  implicit class CustomerOps[Self <: Customer] (val x: Self) extends AnyVal {
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
    def setAlternateEmail(value: String): Self = this.set("alternateEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateEmail: Self = this.set("alternateEmail", js.undefined)
    @scala.inline
    def setCustomerCreationTime(value: String): Self = this.set("customerCreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerCreationTime: Self = this.set("customerCreationTime", js.undefined)
    @scala.inline
    def setCustomerDomain(value: String): Self = this.set("customerDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerDomain: Self = this.set("customerDomain", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setPostalAddress(value: CustomerPostalAddress): Self = this.set("postalAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalAddress: Self = this.set("postalAddress", js.undefined)
  }
  
}

