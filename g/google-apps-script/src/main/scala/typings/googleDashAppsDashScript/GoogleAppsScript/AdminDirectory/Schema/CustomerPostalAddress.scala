package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerPostalAddress extends js.Object {
  var addressLine1: js.UndefOr[String] = js.undefined
  var addressLine2: js.UndefOr[String] = js.undefined
  var addressLine3: js.UndefOr[String] = js.undefined
  var contactName: js.UndefOr[String] = js.undefined
  var countryCode: js.UndefOr[String] = js.undefined
  var locality: js.UndefOr[String] = js.undefined
  var organizationName: js.UndefOr[String] = js.undefined
  var postalCode: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
}

object CustomerPostalAddress {
  @scala.inline
  def apply(
    addressLine1: String = null,
    addressLine2: String = null,
    addressLine3: String = null,
    contactName: String = null,
    countryCode: String = null,
    locality: String = null,
    organizationName: String = null,
    postalCode: String = null,
    region: String = null
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

