package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodingComponents extends js.Object {
  /** matches all the administrative_area levels. */
  var administrative_area: js.UndefOr[String] = js.undefined
  /**
    * matches a country name or a two letter [ISO 3166-1](https://en.wikipedia.org/wiki/ISO_3166-1) country code.
    * **Note:** The API follows the ISO standard for defining countries, and the filtering works best when using
    * the corresponding ISO code of the country
    */
  var country: js.UndefOr[String | js.Array[String]] = js.undefined
  /** matches against `locality` and `sublocality` types. */
  var locality: js.UndefOr[String] = js.undefined
  /** matches `postal_code` and `postal_code_prefix`. */
  var postal_code: js.UndefOr[String] = js.undefined
  /** matches the long or short name of a route. */
  var route: js.UndefOr[String] = js.undefined
}

object GeocodingComponents {
  @scala.inline
  def apply(
    administrative_area: String = null,
    country: String | js.Array[String] = null,
    locality: String = null,
    postal_code: String = null,
    route: String = null
  ): GeocodingComponents = {
    val __obj = js.Dynamic.literal()
    if (administrative_area != null) __obj.updateDynamic("administrative_area")(administrative_area)
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (postal_code != null) __obj.updateDynamic("postal_code")(postal_code)
    if (route != null) __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[GeocodingComponents]
  }
}

