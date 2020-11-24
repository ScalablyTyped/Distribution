package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceAutocompleteRequest extends js.Object {
  
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
  implicit class PlaceAutocompleteRequestOps[Self <: PlaceAutocompleteRequest] (val x: Self) extends AnyVal {
    
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
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsVarargs(value: String*): Self = this.set("components", js.Array(value :_*))
    
    @scala.inline
    def setComponents(value: js.Array[String]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocation(value: LatLng): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    
    @scala.inline
    def setSessiontoken(value: String): Self = this.set("sessiontoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessiontoken: Self = this.set("sessiontoken", js.undefined)
    
    @scala.inline
    def setStrictbounds(value: Boolean): Self = this.set("strictbounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictbounds: Self = this.set("strictbounds", js.undefined)
    
    @scala.inline
    def setTypes(value: PlaceAutocompleteType): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
