package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceAutocompleteRequest extends StObject {
  
  /**
    * A grouping of places to which you would like to restrict your results.
    * Currently, you can use `components` to filter by up to 5 countries.
    * Countries must be passed as a two character, ISO 3166-1 Alpha-2 compatible country code.
    * For example: `components=country:fr` would restrict your results to places within France.
    * Multiple countries must be passed as multiple `country:XX` filters, with the pipe character (`|`) as a separator.
    * For example: `components=country:us|country:pr|country:vi|country:gu|country:mp` would restrict your results
    * to places within the United States and its unincorporated organized territories.
    */
  var components: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The text string on which to search. The Place Autocomplete service will return candidate matches
    * based on this string and order results based on their perceived relevance.
    */
  var input: String = js.native
  
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Searches are also biased to the selected language; results in the selected language may be given a higher ranking.
    * See the list of supported languages and their codes.
    * Note that we often update supported languages so this list may not be exhaustive.
    * If language is not supplied, the Place Autocomplete service will attempt to use the native language
    * of the domain from which the request is sent.
    */
  var language: js.UndefOr[String] = js.native
  
  /** The point around which you wish to retrieve place information. */
  var location: js.UndefOr[LatLng] = js.native
  
  /**
    * The position, in the input term, of the last character that the service uses to match predictions.
    * For example, if the input is 'Google' and the `offset` is 3, the service will match on 'Goo'.
    * The string determined by the `offset` is matched against the first word in the input term only.
    * For example, if the input term is 'Google abc' and the offset is 3, the service will attempt to match against 'Goo abc'.
    * If no `offset` is supplied, the service will use the whole term.
    * The `offset` should generally be set to the position of the text caret.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * The distance (in meters) within which to return place results. Note that setting a radius biases results to the indicated area,
    * but may not fully restrict results to the specified area.
    */
  var radius: js.UndefOr[Double] = js.native
  
  /**
    * A random string which identifies an autocomplete
    * [session](https://developers.google.com/places/web-service/autocomplete#session_tokens) for billing purposes.
    * If this parameter is omitted from an autocomplete request, the request is billed independently
    */
  var sessiontoken: js.UndefOr[String] = js.native
  
  /**
    * Returns only those places that are strictly within the region defined by `location` and `radius`.
    * This is a restriction, rather than a bias, meaning that results outside this region
    * will not be returned even if they match the user input.
    */
  var strictbounds: js.UndefOr[Boolean] = js.native
  
  /** The types of place results to return. */
  var types: js.UndefOr[PlaceAutocompleteType] = js.native
}
object PlaceAutocompleteRequest {
  
  @scala.inline
  def apply(input: String): PlaceAutocompleteRequest = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceAutocompleteRequest]
  }
  
  @scala.inline
  implicit class PlaceAutocompleteRequestMutableBuilder[Self <: PlaceAutocompleteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSessiontoken(value: String): Self = StObject.set(x, "sessiontoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessiontokenUndefined: Self = StObject.set(x, "sessiontoken", js.undefined)
    
    @scala.inline
    def setStrictbounds(value: Boolean): Self = StObject.set(x, "strictbounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictboundsUndefined: Self = StObject.set(x, "strictbounds", js.undefined)
    
    @scala.inline
    def setTypes(value: PlaceAutocompleteType): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
  }
}
