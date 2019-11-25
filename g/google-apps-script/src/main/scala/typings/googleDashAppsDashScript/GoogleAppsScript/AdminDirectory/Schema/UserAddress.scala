package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAddress extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var countryCode: js.UndefOr[String] = js.undefined
  var customType: js.UndefOr[String] = js.undefined
  var extendedAddress: js.UndefOr[String] = js.undefined
  var formatted: js.UndefOr[String] = js.undefined
  var locality: js.UndefOr[String] = js.undefined
  var poBox: js.UndefOr[String] = js.undefined
  var postalCode: js.UndefOr[String] = js.undefined
  var primary: js.UndefOr[Boolean] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var sourceIsStructured: js.UndefOr[Boolean] = js.undefined
  var streetAddress: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object UserAddress {
  @scala.inline
  def apply(
    country: String = null,
    countryCode: String = null,
    customType: String = null,
    extendedAddress: String = null,
    formatted: String = null,
    locality: String = null,
    poBox: String = null,
    postalCode: String = null,
    primary: js.UndefOr[Boolean] = js.undefined,
    region: String = null,
    sourceIsStructured: js.UndefOr[Boolean] = js.undefined,
    streetAddress: String = null,
    `type`: String = null
  ): UserAddress = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (customType != null) __obj.updateDynamic("customType")(customType.asInstanceOf[js.Any])
    if (extendedAddress != null) __obj.updateDynamic("extendedAddress")(extendedAddress.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (poBox != null) __obj.updateDynamic("poBox")(poBox.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceIsStructured)) __obj.updateDynamic("sourceIsStructured")(sourceIsStructured.asInstanceOf[js.Any])
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAddress]
  }
}

