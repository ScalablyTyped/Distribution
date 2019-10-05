package typings.googleDashAppsDashScript.GoogleAppsScript.AdminReseller.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var addressLine1: js.UndefOr[String] = js.undefined
  var addressLine2: js.UndefOr[String] = js.undefined
  var addressLine3: js.UndefOr[String] = js.undefined
  var contactName: js.UndefOr[String] = js.undefined
  var countryCode: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var locality: js.UndefOr[String] = js.undefined
  var organizationName: js.UndefOr[String] = js.undefined
  var postalCode: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    addressLine1: String = null,
    addressLine2: String = null,
    addressLine3: String = null,
    contactName: String = null,
    countryCode: String = null,
    kind: String = null,
    locality: String = null,
    organizationName: String = null,
    postalCode: String = null,
    region: String = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (addressLine1 != null) __obj.updateDynamic("addressLine1")(addressLine1)
    if (addressLine2 != null) __obj.updateDynamic("addressLine2")(addressLine2)
    if (addressLine3 != null) __obj.updateDynamic("addressLine3")(addressLine3)
    if (contactName != null) __obj.updateDynamic("contactName")(contactName)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (organizationName != null) __obj.updateDynamic("organizationName")(organizationName)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[Address]
  }
}

