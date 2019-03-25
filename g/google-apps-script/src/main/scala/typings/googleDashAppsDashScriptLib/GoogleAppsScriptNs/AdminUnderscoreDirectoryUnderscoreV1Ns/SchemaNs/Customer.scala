package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Customer extends js.Object {
  var alternateEmail: js.UndefOr[java.lang.String] = js.undefined
  var customerCreationTime: js.UndefOr[java.lang.String] = js.undefined
  var customerDomain: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  var postalAddress: js.UndefOr[CustomerPostalAddress] = js.undefined
}

object Customer {
  @scala.inline
  def apply(
    alternateEmail: java.lang.String = null,
    customerCreationTime: java.lang.String = null,
    customerDomain: java.lang.String = null,
    etag: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    language: java.lang.String = null,
    phoneNumber: java.lang.String = null,
    postalAddress: CustomerPostalAddress = null
  ): Customer = {
    val __obj = js.Dynamic.literal()
    if (alternateEmail != null) __obj.updateDynamic("alternateEmail")(alternateEmail)
    if (customerCreationTime != null) __obj.updateDynamic("customerCreationTime")(customerCreationTime)
    if (customerDomain != null) __obj.updateDynamic("customerDomain")(customerDomain)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (language != null) __obj.updateDynamic("language")(language)
    if (phoneNumber != null) __obj.updateDynamic("phoneNumber")(phoneNumber)
    if (postalAddress != null) __obj.updateDynamic("postalAddress")(postalAddress)
    __obj.asInstanceOf[Customer]
  }
}

