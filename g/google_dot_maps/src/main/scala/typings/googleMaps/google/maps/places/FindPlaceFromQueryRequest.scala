package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.Circle
import typings.googleMaps.google.maps.CircleLiteral
import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A find place from text search request to be sent to {@link
  * google.maps.places.PlacesService.findPlaceFromQuery}.
  */
trait FindPlaceFromQueryRequest extends StObject {
  
  /**
    * Fields to be included in the response, <a
    * href="https://developers.google.com/maps/billing/understanding-cost-of-use#places-product">which
    * will be billed for</a>. If <code>[&#39;ALL&#39;]</code> is passed in, all
    * available fields will be returned and billed for (this is not recommended
    * for production deployments). For a list of fields see {@link
    * google.maps.places.PlaceResult}. Nested fields can be specified with
    * dot-paths (for example, <code>"geometry.location"</code>).
    */
  var fields: js.Array[String]
  
  /**
    * A language identifier for the language in which names and addresses
    * should be returned, when possible. See the <a
    * href="https://developers.google.com/maps/faq#languagesupport">list of
    * supported languages</a>.
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The bias used when searching for Place. The result will be biased
    * towards, but not restricted to, the given {@link
    * google.maps.places.LocationBias}.
    */
  var locationBias: js.UndefOr[
    LatLng | LatLngLiteral | LatLngBounds | LatLngBoundsLiteral | Circle | CircleLiteral | String
  ] = js.undefined
  
  /**
    * The request&#39;s query. For example, the name or address of a place.
    */
  var query: String
}
object FindPlaceFromQueryRequest {
  
  inline def apply(fields: js.Array[String], query: String): FindPlaceFromQueryRequest = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindPlaceFromQueryRequest]
  }
  
  extension [Self <: FindPlaceFromQueryRequest](x: Self) {
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocationBias(
      value: LatLng | LatLngLiteral | LatLngBounds | LatLngBoundsLiteral | Circle | CircleLiteral | String
    ): Self = StObject.set(x, "locationBias", value.asInstanceOf[js.Any])
    
    inline def setLocationBiasUndefined: Self = StObject.set(x, "locationBias", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
