package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderAddress extends js.Object {
  /**
    * CLDR country code (e.g. &quot;US&quot;).
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Strings representing the lines of the printed label for mailing the
    * order, for example: John Smith 1600 Amphitheatre Parkway Mountain View,
    * CA, 94043 United States
    */
  var fullAddress: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether the address is a post office box.
    */
  var isPostOfficeBox: js.UndefOr[Boolean] = js.native
  /**
    * City, town or commune. May also include dependent localities or
    * sublocalities (e.g. neighborhoods or suburbs).
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * Postal Code or ZIP (e.g. &quot;94043&quot;).
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * Name of the recipient.
    */
  var recipientName: js.UndefOr[String] = js.native
  /**
    * Top-level administrative subdivision of the country. For example, a state
    * like California (&quot;CA&quot;) or a province like Quebec
    * (&quot;QC&quot;).
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Street-level part of the address.
    */
  var streetAddress: js.UndefOr[js.Array[String]] = js.native
}

object Schema$OrderAddress {
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
  ): Schema$OrderAddress = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (fullAddress != null) __obj.updateDynamic("fullAddress")(fullAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(isPostOfficeBox)) __obj.updateDynamic("isPostOfficeBox")(isPostOfficeBox.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (recipientName != null) __obj.updateDynamic("recipientName")(recipientName.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderAddress]
  }
}

