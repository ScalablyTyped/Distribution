package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderAddress extends js.Object {
  var country: js.UndefOr[String] = js.undefined
  var fullAddress: js.UndefOr[js.Array[String]] = js.undefined
  var isPostOfficeBox: js.UndefOr[Boolean] = js.undefined
  var locality: js.UndefOr[String] = js.undefined
  var postalCode: js.UndefOr[String] = js.undefined
  var recipientName: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var streetAddress: js.UndefOr[js.Array[String]] = js.undefined
}

object OrderAddress {
  @scala.inline
  def apply(
    country: String = null,
    fullAddress: js.Array[String] = null,
    isPostOfficeBox: js.UndefOr[Boolean] = js.undefined,
    locality: String = null,
    postalCode: String = null,
    recipientName: String = null,
    region: String = null,
    streetAddress: js.Array[String] = null
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

