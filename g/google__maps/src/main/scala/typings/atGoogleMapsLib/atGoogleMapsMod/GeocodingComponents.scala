package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodingComponents extends js.Object {
  /** matches all the administrative_area levels. */
  var administrativeArea: js.UndefOr[java.lang.String] = js.undefined
  /**
    * matches a country name or a two letter [ISO 3166-1](https://en.wikipedia.org/wiki/ISO_3166-1) country code.
    * **Note:** The API follows the ISO standard for defining countries, and the filtering works best when using
    * the corresponding ISO code of the country
    */
  var country: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** matches against `locality` and `sublocality` types. */
  var locality: js.UndefOr[java.lang.String] = js.undefined
  /** matches `postal_code` and `postal_code_prefix`. */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /** matches the long or short name of a route. */
  var route: js.UndefOr[java.lang.String] = js.undefined
}

object GeocodingComponents {
  @scala.inline
  def apply(
    administrativeArea: java.lang.String = null,
    country: java.lang.String | js.Array[java.lang.String] = null,
    locality: java.lang.String = null,
    postalCode: java.lang.String = null,
    route: java.lang.String = null
  ): GeocodingComponents = {
    val __obj = js.Dynamic.literal()
    if (administrativeArea != null) __obj.updateDynamic("administrativeArea")(administrativeArea)
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (route != null) __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[GeocodingComponents]
  }
}

