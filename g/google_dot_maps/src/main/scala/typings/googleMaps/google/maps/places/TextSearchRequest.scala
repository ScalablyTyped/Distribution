package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSearchRequest extends StObject {
  
  /**
    * Bounds used to bias results when searching for Places (optional). Both
    * <code>location</code> and <code>radius</code> will be ignored if
    * <code>bounds</code> is set. Results will not be restricted to those
    * inside these bounds; but, results inside it will rank higher.
    */
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  
  /**
    * A language identifier for the language in which names and addresses
    * should be returned, when possible. See the <a
    * href="https://developers.google.com/maps/faq#languagesupport">list of
    * supported languages</a>.
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The center of the area used to bias results when searching for Places.
    */
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  
  /**
    * The request&#39;s query term. For example, the name of a place
    * (&#39;Eiffel Tower&#39;), a category followed by the name of a location
    * (&#39;pizza in New York&#39;), or the name of a place followed by a
    * location disambiguator
    * (&#39;Starbucks in Sydney&#39;).
    */
  var query: js.UndefOr[String] = js.undefined
  
  /**
    * The radius of the area used to bias results when searching for Places, in
    * meters.
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * A region code to bias results towards. The region code accepts a <a
    * href="https://en.wikipedia.org/wiki/List_of_Internet_top-level_domains#Country_code_top-level_domains">ccTLD
    * (&quot;top-level domain&quot;)</a> two-character value. Most ccTLD codes
    * are identical to ISO 3166-1 codes, with some notable exceptions. For
    * example, the United Kingdom&#39;s ccTLD is &quot;uk&quot;
    * (<code>.co.uk</code>) while its ISO 3166-1 code is &quot;gb&quot;
    * (technically for the entity of &quot;The United Kingdom of Great Britain
    * and Northern Ireland&quot;).
    */
  var region: js.UndefOr[String | Null] = js.undefined
  
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
object TextSearchRequest {
  
  inline def apply(): TextSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSearchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextSearchRequest] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
