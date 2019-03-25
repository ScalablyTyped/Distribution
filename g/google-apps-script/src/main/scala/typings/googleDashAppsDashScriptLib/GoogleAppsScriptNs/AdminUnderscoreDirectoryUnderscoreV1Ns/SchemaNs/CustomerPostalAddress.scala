package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerPostalAddress extends js.Object {
  var addressLine1: js.UndefOr[java.lang.String] = js.undefined
  var addressLine2: js.UndefOr[java.lang.String] = js.undefined
  var addressLine3: js.UndefOr[java.lang.String] = js.undefined
  var contactName: js.UndefOr[java.lang.String] = js.undefined
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  var locality: js.UndefOr[java.lang.String] = js.undefined
  var organizationName: js.UndefOr[java.lang.String] = js.undefined
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
}

object CustomerPostalAddress {
  @scala.inline
  def apply(
    addressLine1: java.lang.String = null,
    addressLine2: java.lang.String = null,
    addressLine3: java.lang.String = null,
    contactName: java.lang.String = null,
    countryCode: java.lang.String = null,
    locality: java.lang.String = null,
    organizationName: java.lang.String = null,
    postalCode: java.lang.String = null,
    region: java.lang.String = null
  ): CustomerPostalAddress = {
    val __obj = js.Dynamic.literal()
    if (addressLine1 != null) __obj.updateDynamic("addressLine1")(addressLine1)
    if (addressLine2 != null) __obj.updateDynamic("addressLine2")(addressLine2)
    if (addressLine3 != null) __obj.updateDynamic("addressLine3")(addressLine3)
    if (contactName != null) __obj.updateDynamic("contactName")(contactName)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (organizationName != null) __obj.updateDynamic("organizationName")(organizationName)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[CustomerPostalAddress]
  }
}

