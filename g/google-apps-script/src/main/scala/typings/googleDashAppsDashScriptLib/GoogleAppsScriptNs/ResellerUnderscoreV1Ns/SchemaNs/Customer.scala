package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ResellerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Customer extends js.Object {
  var alternateEmail: js.UndefOr[java.lang.String] = js.undefined
  var customerDomain: js.UndefOr[java.lang.String] = js.undefined
  var customerDomainVerified: js.UndefOr[scala.Boolean] = js.undefined
  var customerId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  var postalAddress: js.UndefOr[Address] = js.undefined
  var resourceUiUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Customer {
  @scala.inline
  def apply(
    alternateEmail: java.lang.String = null,
    customerDomain: java.lang.String = null,
    customerDomainVerified: js.UndefOr[scala.Boolean] = js.undefined,
    customerId: java.lang.String = null,
    kind: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    postalAddress: Address = null,
    resourceUiUrl: java.lang.String = null
  ): Customer = {
    val __obj = js.Dynamic.literal()
    if (alternateEmail != null) __obj.updateDynamic("alternateEmail")(alternateEmail)
    if (customerDomain != null) __obj.updateDynamic("customerDomain")(customerDomain)
    if (!js.isUndefined(customerDomainVerified)) __obj.updateDynamic("customerDomainVerified")(customerDomainVerified)
    if (customerId != null) __obj.updateDynamic("customerId")(customerId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (postalAddress != null) __obj.updateDynamic("postalAddress")(postalAddress)
    if (resourceUiUrl != null) __obj.updateDynamic("resourceUiUrl")(resourceUiUrl)
    __obj.asInstanceOf[Customer]
  }
}

