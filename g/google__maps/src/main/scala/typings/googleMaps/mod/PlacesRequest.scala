package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacesRequest extends StObject {
  
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
  
  inline def apply(query: String): PlacesRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlacesRequest] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaxprice(value: Double): Self = StObject.set(x, "maxprice", value.asInstanceOf[js.Any])
    
    inline def setMaxpriceUndefined: Self = StObject.set(x, "maxprice", js.undefined)
    
    inline def setMinprice(value: Double): Self = StObject.set(x, "minprice", value.asInstanceOf[js.Any])
    
    inline def setMinpriceUndefined: Self = StObject.set(x, "minprice", js.undefined)
    
    inline def setOpennow(value: Boolean): Self = StObject.set(x, "opennow", value.asInstanceOf[js.Any])
    
    inline def setOpennowUndefined: Self = StObject.set(x, "opennow", js.undefined)
    
    inline def setPagetoken(value: String): Self = StObject.set(x, "pagetoken", value.asInstanceOf[js.Any])
    
    inline def setPagetokenUndefined: Self = StObject.set(x, "pagetoken", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setType(value: PlaceType1): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
