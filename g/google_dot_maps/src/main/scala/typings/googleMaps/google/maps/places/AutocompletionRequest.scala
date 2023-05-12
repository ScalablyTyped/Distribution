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

trait AutocompletionRequest extends StObject {
  
  /**
    * Bounds for prediction biasing. Predictions will be biased towards, but
    * not restricted to, the given <code>bounds</code>. Both
    * <code>location</code> and <code>radius</code> will be ignored if
    * <code>bounds</code> is set.
    */
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.undefined
  
  /**
    * The component restrictions. Component restrictions are used to restrict
    * predictions to only those within the parent component. For example, the
    * country.
    */
  var componentRestrictions: js.UndefOr[ComponentRestrictions] = js.undefined
  
  /**
    * The user entered input string.
    */
  var input: String
  
  /**
    * A language identifier for the language in which the results should be
    * returned, if possible. Results in the selected language may be given a
    * higher ranking, but suggestions are not restricted to this language. See
    * the <a href="https://developers.google.com/maps/faq#languagesupport">list
    * of supported languages</a>.
    */
  var language: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Location for prediction biasing. Predictions will be biased towards the
    * given <code>location</code> and <code>radius</code>. Alternatively,
    * <code>bounds</code> can be used.
    */
  var location: js.UndefOr[LatLng] = js.undefined
  
  /**
    * A soft boundary or hint to use when searching for places.
    */
  var locationBias: js.UndefOr[
    LatLng | LatLngLiteral | LatLngBounds | LatLngBoundsLiteral | Circle | CircleLiteral | String | Null
  ] = js.undefined
  
  /**
    * Bounds to constrain search results.
    */
  var locationRestriction: js.UndefOr[LatLngBounds | LatLngBoundsLiteral | Null] = js.undefined
  
  /**
    * The character position in the input term at which the service uses text
    * for predictions (the position of the cursor in the input field).
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * The location where {@link
    * google.maps.places.AutocompletePrediction.distance_meters} is calculated
    * from.
    */
  var origin: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  
  /**
    * The radius of the area used for prediction biasing. The
    * <code>radius</code> is specified in meters, and must always be
    * accompanied by a <code>location</code> property. Alternatively,
    * <code>bounds</code> can be used.
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * A region code which is used for result formatting and for result
    * filtering. It does not restrict the suggestions to this country. The
    * region code accepts a <a
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
    * Unique reference used to bundle individual requests into sessions.
    */
  var sessionToken: js.UndefOr[AutocompleteSessionToken] = js.undefined
  
  /**
    * The types of predictions to be returned. For supported types, see the <a
    * href="https://developers.google.com/maps/documentation/javascript/places-autocomplete#constrain-place-types">
    * developer&#39;s guide</a>. If no types are specified, all types will be
    * returned.
    */
  var types: js.UndefOr[js.Array[String]] = js.undefined
}
object AutocompletionRequest {
  
  inline def apply(input: String): AutocompletionRequest = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompletionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutocompletionRequest] (val x: Self) extends AnyVal {
    
    inline def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setComponentRestrictions(value: ComponentRestrictions): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
    
    inline def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationBias(
      value: LatLng | LatLngLiteral | LatLngBounds | LatLngBoundsLiteral | Circle | CircleLiteral | String
    ): Self = StObject.set(x, "locationBias", value.asInstanceOf[js.Any])
    
    inline def setLocationBiasNull: Self = StObject.set(x, "locationBias", null)
    
    inline def setLocationBiasUndefined: Self = StObject.set(x, "locationBias", js.undefined)
    
    inline def setLocationRestriction(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "locationRestriction", value.asInstanceOf[js.Any])
    
    inline def setLocationRestrictionNull: Self = StObject.set(x, "locationRestriction", null)
    
    inline def setLocationRestrictionUndefined: Self = StObject.set(x, "locationRestriction", js.undefined)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrigin(value: LatLng | LatLngLiteral): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSessionToken(value: AutocompleteSessionToken): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setSessionTokenUndefined: Self = StObject.set(x, "sessionToken", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
