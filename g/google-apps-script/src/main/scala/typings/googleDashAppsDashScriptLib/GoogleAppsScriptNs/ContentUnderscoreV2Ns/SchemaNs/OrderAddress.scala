package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderAddress extends js.Object {
  var country: js.UndefOr[java.lang.String] = js.undefined
  var fullAddress: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var isPostOfficeBox: js.UndefOr[scala.Boolean] = js.undefined
  var locality: js.UndefOr[java.lang.String] = js.undefined
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  var recipientName: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var streetAddress: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OrderAddress {
  @scala.inline
  def apply(
    country: java.lang.String = null,
    fullAddress: js.Array[java.lang.String] = null,
    isPostOfficeBox: js.UndefOr[scala.Boolean] = js.undefined,
    locality: java.lang.String = null,
    postalCode: java.lang.String = null,
    recipientName: java.lang.String = null,
    region: java.lang.String = null,
    streetAddress: js.Array[java.lang.String] = null
  ): OrderAddress = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (fullAddress != null) __obj.updateDynamic("fullAddress")(fullAddress)
    if (!js.isUndefined(isPostOfficeBox)) __obj.updateDynamic("isPostOfficeBox")(isPostOfficeBox)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (recipientName != null) __obj.updateDynamic("recipientName")(recipientName)
    if (region != null) __obj.updateDynamic("region")(region)
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress)
    __obj.asInstanceOf[OrderAddress]
  }
}

