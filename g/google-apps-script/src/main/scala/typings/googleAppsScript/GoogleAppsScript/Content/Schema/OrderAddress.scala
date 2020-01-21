package typings.googleAppsScript.GoogleAppsScript.Content.Schema

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
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (fullAddress != null) __obj.updateDynamic("fullAddress")(fullAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(isPostOfficeBox)) __obj.updateDynamic("isPostOfficeBox")(isPostOfficeBox.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (recipientName != null) __obj.updateDynamic("recipientName")(recipientName.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderAddress]
  }
}

