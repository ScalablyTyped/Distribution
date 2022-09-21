package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Place search query to be sent to the <code>PlacesService</code>.
  */
trait PlaceSearchRequest extends StObject {
  
  /**
    * The bounds within which to search for Places. Both <code>location</code>
    * and <code>radius</code> will be ignored if <code>bounds</code> is set.
    */
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  
  /**
    * A term to be matched against all available fields, including but not
    * limited to name, type, and address, as well as customer reviews and other
    * third-party content.
    */
  var keyword: js.UndefOr[String] = js.undefined
  
  /**
    * A language identifier for the language in which names and addresses
    * should be returned, when possible. See the <a
    * href="https://developers.google.com/maps/faq#languagesupport">list of
    * supported languages</a>.
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The location around which to search for Places.
    */
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  
  /**
    * Restricts results to only those places at the specified price level or
    * lower. Valid values are in the range from 0 (most affordable) to 4 (most
    * expensive), inclusive. Must be greater than or equal to <code>minPrice
    * </code>, if specified.
    */
  var maxPriceLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Restricts results to only those places at the specified price level or
    * higher. Valid values are in the range from 0 (most affordable) to 4 (most
    * expensive), inclusive. Must be less than or equal to
    * <code>maxPrice</code>, if specified.
    */
  var minPriceLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Equivalent to <code>keyword</code>. Values in this field are combined
    * with values in the <code>keyword</code> field and passed as part of the
    * same search string.
    * @deprecated Use <code>keyword</code> instead.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Restricts results to only those places that are open right now.
    */
  var openNow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The distance from the given location within which to search for Places,
    * in meters. The maximum allowed value is 50&thinsp;000.
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the ranking method to use when returning results. Note that
    * when <code>rankBy</code> is set to <code>DISTANCE</code>, you must
    * specify a <code>location</code> but you cannot specify a
    * <code>radius</code> or <code>bounds</code>.
    * @defaultValue {@link google.maps.places.RankBy.PROMINENCE}
    */
  var rankBy: js.UndefOr[RankBy] = js.undefined
  
  /**
    * Searches for places of the given type. The type is translated to the
    * local language of the request&#39;s target location and used as a query
    * string. If a query is also provided, it is concatenated to the localized
    * type string. Results of a different type are dropped from the response.
    * Use this field to perform language and region independent categorical
    * searches. Valid types are given <a
    * href="https://developers.google.com/maps/documentation/places/web-service/supported_types">here</a>.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object PlaceSearchRequest {
  
  inline def apply(): PlaceSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceSearchRequest]
  }
  
  extension [Self <: PlaceSearchRequest](x: Self) {
    
    inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaxPriceLevel(value: Double): Self = StObject.set(x, "maxPriceLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxPriceLevelUndefined: Self = StObject.set(x, "maxPriceLevel", js.undefined)
    
    inline def setMinPriceLevel(value: Double): Self = StObject.set(x, "minPriceLevel", value.asInstanceOf[js.Any])
    
    inline def setMinPriceLevelUndefined: Self = StObject.set(x, "minPriceLevel", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOpenNow(value: Boolean): Self = StObject.set(x, "openNow", value.asInstanceOf[js.Any])
    
    inline def setOpenNowUndefined: Self = StObject.set(x, "openNow", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRankBy(value: RankBy): Self = StObject.set(x, "rankBy", value.asInstanceOf[js.Any])
    
    inline def setRankByUndefined: Self = StObject.set(x, "rankBy", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
