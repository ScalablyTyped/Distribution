package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AccountAddress extends js.Object {
  /**
    * CLDR country code (e.g. &quot;US&quot;).
    */
  var country: js.UndefOr[String] = js.native
  /**
    * City, town or commune. May also include dependent localities or
    * sublocalities (e.g. neighborhoods or suburbs).
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * Postal code or ZIP (e.g. &quot;94043&quot;).
    */
  var postalCode: js.UndefOr[String] = js.native
  /**
    * Top-level administrative subdivision of the country. For example, a state
    * like California (&quot;CA&quot;) or a province like Quebec
    * (&quot;QC&quot;).
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Street-level part of the address.
    */
  var streetAddress: js.UndefOr[String] = js.native
}

object Schema$AccountAddress {
  @scala.inline
  def apply(
    country: String = null,
    locality: String = null,
    postalCode: String = null,
    region: String = null,
    streetAddress: String = null
  ): Schema$AccountAddress = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountAddress]
  }
}

