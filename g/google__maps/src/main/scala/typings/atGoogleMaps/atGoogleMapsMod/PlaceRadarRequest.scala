package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceRadarRequest extends js.Object {
  /**
    * A term to be matched against all content that Google has indexed for this place, including but not limited to
    * name, type, and address, as well as customer reviews and other third-party content.
    */
  var keyword: js.UndefOr[String] = js.undefined
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Searches are also biased to the selected language; results in the selected language may be given a higher ranking.
    * Note that we often update supported languages so this list may not be exhaustive.
    */
  var language: js.UndefOr[String] = js.undefined
  /** The latitude/longitude around which to retrieve place information. This must be specified as latitude,longitude. */
  var location: LatLng
  /**
    * Restricts results to only those places within the specified price level.
    * Valid values are in the range from 0 (most affordable) to 4 (most expensive), inclusive.
    * The exact amount indicated by a specific value will vary from region to region.
    */
  var maxprice: js.UndefOr[Double] = js.undefined
  /**
    * Restricts results to only those places within the specified price level.
    * Valid values are in the range from 0 (most affordable) to 4 (most expensive), inclusive.
    * The exact amount indicated by a specific value will vary from region to region.
    */
  var minprice: js.UndefOr[Double] = js.undefined
  /**
    * A term to be matched against all content that Google has indexed for this place.
    * Equivalent to keyword. The `name` field is no longer restricted to place names.
    * Values in this field are combined with values in the `keyword` field and passed as part of the same search string.
    * We recommend using only the `keyword` parameter for all search terms.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Returns only those places that are open for business at the time the query is sent.
    * Places that do not specify opening hours in the Google Places database will not be returned if you include this parameter in your query.
    */
  var opennow: js.UndefOr[Boolean] = js.undefined
  /** Defines the distance (in meters) within which to return place results. The maximum allowed radius is 50 000 meters. */
  var radius: Double
  /**
    * Restricts the results to places matching the specified type.
    * Only one type may be specified (if more than one type is provided, all types following the first entry are ignored).
    */
  var `type`: js.UndefOr[AddressType] = js.undefined
}

object PlaceRadarRequest {
  @scala.inline
  def apply(
    location: LatLng,
    radius: Double,
    keyword: String = null,
    language: String = null,
    maxprice: Int | Double = null,
    minprice: Int | Double = null,
    name: String = null,
    opennow: js.UndefOr[Boolean] = js.undefined,
    `type`: AddressType = null
  ): PlaceRadarRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], radius = radius)
    if (keyword != null) __obj.updateDynamic("keyword")(keyword)
    if (language != null) __obj.updateDynamic("language")(language)
    if (maxprice != null) __obj.updateDynamic("maxprice")(maxprice.asInstanceOf[js.Any])
    if (minprice != null) __obj.updateDynamic("minprice")(minprice.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(opennow)) __obj.updateDynamic("opennow")(opennow)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PlaceRadarRequest]
  }
}

