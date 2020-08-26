package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacesRequest extends js.Object {
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Note that we often update supported languages so this list may not be exhaustive
    */
  var language: js.UndefOr[Language] = js.native
  /**
    * The latitude/longitude around which to retrieve place information.
    * This must be specified as latitude,longitude. If you specify a location parameter,
    * you must also specify a radius parameter.
    */
  var location: js.UndefOr[LatLng] = js.native
  /**
    * Restricts results to only those places within the specified price level.
    * Valid values are in the range from 0 (most affordable) to 4 (most expensive), inclusive.
    * The exact amount indicated by a specific value will vary from region to region.
    */
  var maxprice: js.UndefOr[Double] = js.native
  /**
    * Restricts results to only those places within the specified price level.
    * Valid values are in the range from 0 (most affordable) to 4 (most expensive), inclusive.
    * The exact amount indicated by a specific value will vary from region to region.
    */
  var minprice: js.UndefOr[Double] = js.native
  /**
    * Returns only those places that are open for business at the time the query is sent.
    * Places that do not specify opening hours in the Google Places database will not be returned
    * if you include this parameter in your query.
    */
  var opennow: js.UndefOr[Boolean] = js.native
  /**
    * Returns the next 20 results from a previously run search.
    * Setting a `pagetoken` parameter will execute a search with the same parameters used previously —
    * all parameters other than `pagetoken` will be ignored.
    */
  var pagetoken: js.UndefOr[String] = js.native
  /**
    * The text string on which to search, for example: "restaurant" or "123 Main Street".
    * The Google Places service will return candidate matches based on this string and order the results
    * based on their perceived relevance. This parameter becomes optional if the `type` parameter
    * is also used in the search request.
    */
  var query: String = js.native
  /**
    * Defines the distance (in meters) within which to bias place results.
    * The maximum allowed radius is 50 000 meters.
    * Results inside of this region will be ranked higher than results outside of the search circle;
    * however, prominent results from outside of the search radius may be included.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * The region code, specified as a ccTLD (country code top-level domain) two-character value.
    * Most ccTLD codes are identical to ISO 3166-1 codes, with some exceptions.
    * This parameter will only influence, not fully restrict, search results.
    * If more relevant results exist outside of the specified region, they may be included.
    * When this parameter is used, the country name is omitted from the resulting `formatted_address`
    * for results in the specified region.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Restricts the results to places matching the specified type.
    * Only one type may be specified (if more than one type is provided, all types following the first entry are ignored).
    */
  var `type`: js.UndefOr[PlaceType1] = js.native
}

object PlacesRequest {
  @scala.inline
  def apply(query: String): PlacesRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacesRequest]
  }
  @scala.inline
  implicit class PlacesRequestOps[Self <: PlacesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setLocation(value: LatLng): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMaxprice(value: Double): Self = this.set("maxprice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxprice: Self = this.set("maxprice", js.undefined)
    @scala.inline
    def setMinprice(value: Double): Self = this.set("minprice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinprice: Self = this.set("minprice", js.undefined)
    @scala.inline
    def setOpennow(value: Boolean): Self = this.set("opennow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpennow: Self = this.set("opennow", js.undefined)
    @scala.inline
    def setPagetoken(value: String): Self = this.set("pagetoken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagetoken: Self = this.set("pagetoken", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setType(value: PlaceType1): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

