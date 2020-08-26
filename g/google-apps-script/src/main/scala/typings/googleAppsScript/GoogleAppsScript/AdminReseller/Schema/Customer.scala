package typings.googleAppsScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Customer extends js.Object {
  var alternateEmail: js.UndefOr[String] = js.native
  var customerDomain: js.UndefOr[String] = js.native
  var customerDomainVerified: js.UndefOr[Boolean] = js.native
  var customerId: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var phoneNumber: js.UndefOr[String] = js.native
  var postalAddress: js.UndefOr[Address] = js.native
  var resourceUiUrl: js.UndefOr[String] = js.native
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
    def setCustomerDomain(value: String): Self = this.set("customerDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerDomain: Self = this.set("customerDomain", js.undefined)
    @scala.inline
    def setCustomerDomainVerified(value: Boolean): Self = this.set("customerDomainVerified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerDomainVerified: Self = this.set("customerDomainVerified", js.undefined)
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setPostalAddress(value: Address): Self = this.set("postalAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalAddress: Self = this.set("postalAddress", js.undefined)
    @scala.inline
    def setResourceUiUrl(value: String): Self = this.set("resourceUiUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceUiUrl: Self = this.set("resourceUiUrl", js.undefined)
  }
  
}

