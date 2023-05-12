package typings.googleMaps.google.maps.places

import typings.googleMaps.google.maps.Circle
import typings.googleMaps.google.maps.CircleLiteral
import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngBounds
import typings.googleMaps.google.maps.LatLngBoundsLiteral
import typings.googleMaps.google.maps.LatLngLiteral
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceAutocompleteElementOptions extends StObject {
  
  /**
    * The component restrictions. Component restrictions are used to restrict
    * predictions to only those within the parent component. For example, the
    * country.
    */
  var componentRestrictions: js.UndefOr[Null | ComponentRestrictions] = js.undefined
  
  /**
    * This Field is read-only. The DOM Element backing the view.
    */
  var element: js.UndefOr[Null | HTMLElement | SVGElement] = js.undefined
  
  /**
    * The input element to show autocompletions for.
    */
  var inputElement: HTMLInputElement
  
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
    * A language identifier for the language in which the results should be
    * returned, if possible. Results in the selected language may be given a
    * higher ranking, but suggestions are not restricted to this language. See
    * the <a href="https://developers.google.com/maps/faq#languagesupport">list
    * of supported languages</a>.
    */
  var requestedLanguage: js.UndefOr[Null | String] = js.undefined
  
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
  var requestedRegion: js.UndefOr[Null | String] = js.undefined
  
  /**
    * The types of predictions to be returned. For supported types, see the <a
    * href="https://developers.google.com/maps/documentation/javascript/places-autocomplete#constrain-place-types">
    * developer&#39;s guide</a>. If no types are specified, all types will be
    * returned.
    */
  var types: js.UndefOr[Null | js.Array[String]] = js.undefined
}
object PlaceAutocompleteElementOptions {
  
  inline def apply(inputElement: HTMLInputElement): PlaceAutocompleteElementOptions = {
    val __obj = js.Dynamic.literal(inputElement = inputElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceAutocompleteElementOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceAutocompleteElementOptions] (val x: Self) extends AnyVal {
    
    inline def setComponentRestrictions(value: ComponentRestrictions): Self = StObject.set(x, "componentRestrictions", value.asInstanceOf[js.Any])
    
    inline def setComponentRestrictionsNull: Self = StObject.set(x, "componentRestrictions", null)
    
    inline def setComponentRestrictionsUndefined: Self = StObject.set(x, "componentRestrictions", js.undefined)
    
    inline def setElement(value: HTMLElement | SVGElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementNull: Self = StObject.set(x, "element", null)
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setInputElement(value: HTMLInputElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
    
    inline def setLocationBias(
      value: LatLng | LatLngLiteral | LatLngBounds | LatLngBoundsLiteral | Circle | CircleLiteral | String
    ): Self = StObject.set(x, "locationBias", value.asInstanceOf[js.Any])
    
    inline def setLocationBiasNull: Self = StObject.set(x, "locationBias", null)
    
    inline def setLocationBiasUndefined: Self = StObject.set(x, "locationBias", js.undefined)
    
    inline def setLocationRestriction(value: LatLngBounds | LatLngBoundsLiteral): Self = StObject.set(x, "locationRestriction", value.asInstanceOf[js.Any])
    
    inline def setLocationRestrictionNull: Self = StObject.set(x, "locationRestriction", null)
    
    inline def setLocationRestrictionUndefined: Self = StObject.set(x, "locationRestriction", js.undefined)
    
    inline def setRequestedLanguage(value: String): Self = StObject.set(x, "requestedLanguage", value.asInstanceOf[js.Any])
    
    inline def setRequestedLanguageNull: Self = StObject.set(x, "requestedLanguage", null)
    
    inline def setRequestedLanguageUndefined: Self = StObject.set(x, "requestedLanguage", js.undefined)
    
    inline def setRequestedRegion(value: String): Self = StObject.set(x, "requestedRegion", value.asInstanceOf[js.Any])
    
    inline def setRequestedRegionNull: Self = StObject.set(x, "requestedRegion", null)
    
    inline def setRequestedRegionUndefined: Self = StObject.set(x, "requestedRegion", js.undefined)
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesNull: Self = StObject.set(x, "types", null)
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
