package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderAddress extends js.Object {
  /** CLDR country code (e.g. "US"). */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Strings representing the lines of the printed label for mailing the order, for example:
    * John Smith
    * 1600 Amphitheatre Parkway
    * Mountain View, CA, 94043
    * United States
    */
  var fullAddress: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether the address is a post office box. */
  var isPostOfficeBox: js.UndefOr[scala.Boolean] = js.undefined
  /** City, town or commune. May also include dependent localities or sublocalities (e.g. neighborhoods or suburbs). */
  var locality: js.UndefOr[java.lang.String] = js.undefined
  /** Postal Code or ZIP (e.g. "94043"). */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the recipient. */
  var recipientName: js.UndefOr[java.lang.String] = js.undefined
  /** Top-level administrative subdivision of the country (e.g. "CA"). */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** Street-level part of the address. */
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

