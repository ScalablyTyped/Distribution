package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceSearchResult extends StObject {
  
  /**
    * An array of zero, one or more alternative place IDs for the place, with a scope related to each alternative ID.
    * Note: This array may be empty or not present.
    */
  var alt_ids: js.Array[AlternativePlaceId]
  
  /**
    * is a string containing the human-readable address of this place. Often this address is equivalent to the "postal address".
    * The `formatted_address` property is only returned for a Text Search.
    */
  var formatted_address: String
  
  /**
    * contains geometry information about the result, generally including the `location` (geocode)
    * of the place and (optionally) the viewport identifying its general area of coverage
    */
  var geometry: AddressGeometry
  
  /** contains the URL of a recommended icon which may be displayed to the user when indicating this result. */
  var icon: String
  
  /** contains the human-readable name for the returned result. For `establishment` results, this is usually the business name. */
  var name: String
  
  /** information on the opening hours. */
  var opening_hours: OpeningHours
  
  /**
    * is a boolean flag indicating whether the place has permanently shut down (value `true`).
    * If the place is not permanently closed, the flag is absent from the response.
    */
  var permanently_closed: Boolean
  
  /**
    * an array of `photo` objects, each containing a reference to an image.
    * A Place Search will return at most one `photo` object.
    * Performing a Place Details request on the place may return up to ten photos.
    * More information about Place Photos and how you can use the images in your application can be found in the
    * [Place Photos](https://developers.google.com/places/web-service/photos) documentation.
    */
  var photos: js.Array[PlacePhoto]
  
  /**
    * a textual identifier that uniquely identifies a place.
    * To retrieve information about the place, pass this identifier in the `placeId` field of a Places API request
    */
  var place_id: String
  
  /**
    * is an encoded location reference, derived from latitude and longitude coordinates, that represents an area:
    * 1/8000th of a degree by 1/8000th of a degree (about 14m x 14m at the equator) or smaller.
    * Plus codes can be used as a replacement for street addresses in places where they do not exist
    * (where buildings are not numbered or streets are not named).
    *
    * The plus code is formatted as a global code and a compound code:
    *  - `global_code` is a 4 character area code and 6 character or longer local code (849VCWC8+R9).
    *  - `compound_code` is a 6 character or longer local code with an explicit location (CWC8+R9, Mountain View, CA, USA).
    *
    * Typically, both the global code and compound code are returned.
    * However, if the result is in a remote location (for example, an ocean or desert) only the global code may be returned.
    *
    * @see [Open Location Code](https://en.wikipedia.org/wiki/Open_Location_Code)
    * @see [plus codes](https://plus.codes/)
    */
  var plus_code: PlusCode
  
  /**
    * The price level of the place, on a scale of 0 to 4.
    * The exact amount indicated by a specific value will vary from region to region.
    *
    * Price levels are interpreted as follows:
    *  - `0`: Free
    *  - `1`: Inexpensive
    *  - `2`: Moderate
    *  - `3`: Expensive
    *  - `4`: Very Expensive
    */
  var price_level: Double
  
  /** contains the place's rating, from 1.0 to 5.0, based on aggregated user reviews. */
  var rating: Double
  
  /**
    * Indicates the scope of the `place_id`.
    *
    * **Note:** The `scope` field is included only in Nearby Search results and Place Details results.
    * You can only retrieve app-scoped places via the Nearby Search and the Place Details requests.
    * If the `scope` field is not present in a response, it is safe to assume the scope is `GOOGLE`.
    */
  var scope: PlaceIdScope
  
  /**
    * contains an array of feature types describing the given result.
    * XML responses include multiple `<type>` elements if more than one type is assigned to the result.
    */
  var types: js.Array[PlaceType1 | PlaceType2]
  
  /**
    * contains a feature name of a nearby location. Often this feature refers to a street or neighborhood within the given results.
    * The `vicinity` property is only returned for a Nearby Search.
    */
  var vicinity: js.UndefOr[String] = js.undefined
}
object PlaceSearchResult {
  
  inline def apply(
    alt_ids: js.Array[AlternativePlaceId],
    formatted_address: String,
    geometry: AddressGeometry,
    icon: String,
    name: String,
    opening_hours: OpeningHours,
    permanently_closed: Boolean,
    photos: js.Array[PlacePhoto],
    place_id: String,
    plus_code: PlusCode,
    price_level: Double,
    rating: Double,
    scope: PlaceIdScope,
    types: js.Array[PlaceType1 | PlaceType2]
  ): PlaceSearchResult = {
    val __obj = js.Dynamic.literal(alt_ids = alt_ids.asInstanceOf[js.Any], formatted_address = formatted_address.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], opening_hours = opening_hours.asInstanceOf[js.Any], permanently_closed = permanently_closed.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], plus_code = plus_code.asInstanceOf[js.Any], price_level = price_level.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceSearchResult]
  }
  
  extension [Self <: PlaceSearchResult](x: Self) {
    
    inline def setAlt_ids(value: js.Array[AlternativePlaceId]): Self = StObject.set(x, "alt_ids", value.asInstanceOf[js.Any])
    
    inline def setAlt_idsVarargs(value: AlternativePlaceId*): Self = StObject.set(x, "alt_ids", js.Array(value :_*))
    
    inline def setFormatted_address(value: String): Self = StObject.set(x, "formatted_address", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: AddressGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOpening_hours(value: OpeningHours): Self = StObject.set(x, "opening_hours", value.asInstanceOf[js.Any])
    
    inline def setPermanently_closed(value: Boolean): Self = StObject.set(x, "permanently_closed", value.asInstanceOf[js.Any])
    
    inline def setPhotos(value: js.Array[PlacePhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosVarargs(value: PlacePhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setPlus_code(value: PlusCode): Self = StObject.set(x, "plus_code", value.asInstanceOf[js.Any])
    
    inline def setPrice_level(value: Double): Self = StObject.set(x, "price_level", value.asInstanceOf[js.Any])
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setScope(value: PlaceIdScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[PlaceType1 | PlaceType2]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: (PlaceType1 | PlaceType2)*): Self = StObject.set(x, "types", js.Array(value :_*))
    
    inline def setVicinity(value: String): Self = StObject.set(x, "vicinity", value.asInstanceOf[js.Any])
    
    inline def setVicinityUndefined: Self = StObject.set(x, "vicinity", js.undefined)
  }
}
