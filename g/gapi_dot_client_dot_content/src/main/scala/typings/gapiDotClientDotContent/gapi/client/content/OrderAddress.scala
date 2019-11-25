package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderAddress extends js.Object {
  /** CLDR country code (e.g. "US"). */
  var country: js.UndefOr[String] = js.undefined
  /**
    * Strings representing the lines of the printed label for mailing the order, for example:
    * John Smith
    * 1600 Amphitheatre Parkway
    * Mountain View, CA, 94043
    * United States
    */
  var fullAddress: js.UndefOr[js.Array[String]] = js.undefined
  /** Whether the address is a post office box. */
  var isPostOfficeBox: js.UndefOr[Boolean] = js.undefined
  /** City, town or commune. May also include dependent localities or sublocalities (e.g. neighborhoods or suburbs). */
  var locality: js.UndefOr[String] = js.undefined
  /** Postal Code or ZIP (e.g. "94043"). */
  var postalCode: js.UndefOr[String] = js.undefined
  /** Name of the recipient. */
  var recipientName: js.UndefOr[String] = js.undefined
  /** Top-level administrative subdivision of the country (e.g. "CA"). */
  var region: js.UndefOr[String] = js.undefined
  /** Street-level part of the address. */
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

