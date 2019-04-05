package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserAddress extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  var customType: js.UndefOr[java.lang.String] = js.undefined
  var extendedAddress: js.UndefOr[java.lang.String] = js.undefined
  var formatted: js.UndefOr[java.lang.String] = js.undefined
  var locality: js.UndefOr[java.lang.String] = js.undefined
  var poBox: js.UndefOr[java.lang.String] = js.undefined
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  var primary: js.UndefOr[scala.Boolean] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var sourceIsStructured: js.UndefOr[scala.Boolean] = js.undefined
  var streetAddress: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object UserAddress {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    countryCode: java.lang.String = null,
    customType: java.lang.String = null,
    extendedAddress: java.lang.String = null,
    formatted: java.lang.String = null,
    locality: java.lang.String = null,
    poBox: java.lang.String = null,
    postalCode: java.lang.String = null,
    primary: js.UndefOr[scala.Boolean] = js.undefined,
    region: java.lang.String = null,
    sourceIsStructured: js.UndefOr[scala.Boolean] = js.undefined,
    streetAddress: java.lang.String = null,
    `type`: java.lang.String = null
  ): UserAddress = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (customType != null) __obj.updateDynamic("customType")(customType)
    if (extendedAddress != null) __obj.updateDynamic("extendedAddress")(extendedAddress)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (poBox != null) __obj.updateDynamic("poBox")(poBox)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary)
    if (region != null) __obj.updateDynamic("region")(region)
    if (!js.isUndefined(sourceIsStructured)) __obj.updateDynamic("sourceIsStructured")(sourceIsStructured)
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UserAddress]
  }
}

