package typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Customer extends js.Object {
  var alternateEmail: js.UndefOr[String] = js.undefined
  var customerDomain: js.UndefOr[String] = js.undefined
  var customerDomainVerified: js.UndefOr[Boolean] = js.undefined
  var customerId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var phoneNumber: js.UndefOr[String] = js.undefined
  var postalAddress: js.UndefOr[Address] = js.undefined
  var resourceUiUrl: js.UndefOr[String] = js.undefined
}

object Customer {
  @scala.inline
  def apply(
    alternateEmail: String = null,
    customerDomain: String = null,
    customerDomainVerified: js.UndefOr[Boolean] = js.undefined,
    customerId: String = null,
    kind: String = null,
    phoneNumber: String = null,
    postalAddress: Address = null,
    resourceUiUrl: String = null
  ): Customer = {
    val __obj = js.Dynamic.literal()
    if (alternateEmail != null) __obj.updateDynamic("alternateEmail")(alternateEmail.asInstanceOf[js.Any])
    if (customerDomain != null) __obj.updateDynamic("customerDomain")(customerDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(customerDomainVerified)) __obj.updateDynamic("customerDomainVerified")(customerDomainVerified.asInstanceOf[js.Any])
    if (customerId != null) __obj.updateDynamic("customerId")(customerId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber.asInstanceOf[js.Any])
    if (postalAddress != null) __obj.updateDynamic("postalAddress")(postalAddress.asInstanceOf[js.Any])
    if (resourceUiUrl != null) __obj.updateDynamic("resourceUiUrl")(resourceUiUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customer]
  }
}

