package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacesRequest extends js.Object {
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Note that we often update supported languages so this list may not be exhaustive
    */
  var language: js.UndefOr[Language] = js.undefined
  /**
    * The latitude/longitude around which to retrieve place information.
    * This must be specified as latitude,longitude. If you specify a location parameter,
    * you must also specify a radius parameter.
    */
  var location: js.UndefOr[LatLng] = js.undefined
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
    * Returns only those places that are open for business at the time the query is sent.
    * Places that do not specify opening hours in the Google Places database will not be returned
    * if you include this parameter in your query.
    */
  var opennow: js.UndefOr[Boolean] = js.undefined
  /**
    * Returns the next 20 results from a previously run search.
    * Setting a `pagetoken` parameter will execute a search with the same parameters used previously —
    * all parameters other than `pagetoken` will be ignored.
    */
  var pagetoken: js.UndefOr[String] = js.undefined
  /**
    * The text string on which to search, for example: "restaurant" or "123 Main Street".
    * The Google Places service will return candidate matches based on this string and order the results
    * based on their perceived relevance. This parameter becomes optional if the `type` parameter
    * is also used in the search request.
    */
  var query: String
  /**
    * Defines the distance (in meters) within which to bias place results.
    * The maximum allowed radius is 50 000 meters.
    * Results inside of this region will be ranked higher than results outside of the search circle;
    * however, prominent results from outside of the search radius may be included.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * The region code, specified as a ccTLD (country code top-level domain) two-character value.
    * Most ccTLD codes are identical to ISO 3166-1 codes, with some exceptions.
    * This parameter will only influence, not fully restrict, search results.
    * If more relevant results exist outside of the specified region, they may be included.
    * When this parameter is used, the country name is omitted from the resulting `formatted_address`
    * for results in the specified region.
    */
  var region: js.UndefOr[String] = js.undefined
  /**
    * Restricts the results to places matching the specified type.
    * Only one type may be specified (if more than one type is provided, all types following the first entry are ignored).
    */
  var `type`: js.UndefOr[PlaceType1] = js.undefined
}

object PlacesRequest {
  @scala.inline
  def apply(
    query: String,
    language: Language = null,
    location: LatLng = null,
    maxprice: Int | Double = null,
    minprice: Int | Double = null,
    opennow: js.UndefOr[Boolean] = js.undefined,
    pagetoken: String = null,
    radius: Int | Double = null,
    region: String = null,
    `type`: PlaceType1 = null
  ): PlacesRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (maxprice != null) __obj.updateDynamic("maxprice")(maxprice.asInstanceOf[js.Any])
    if (minprice != null) __obj.updateDynamic("minprice")(minprice.asInstanceOf[js.Any])
    if (!js.isUndefined(opennow)) __obj.updateDynamic("opennow")(opennow.asInstanceOf[js.Any])
    if (pagetoken != null) __obj.updateDynamic("pagetoken")(pagetoken.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacesRequest]
  }
}

