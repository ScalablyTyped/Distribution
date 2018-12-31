package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var components: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The text string on which to search. The Place Autocomplete service will return candidate matches
    * based on this string and order results based on their perceived relevance.
    */
  var input: java.lang.String
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Searches are also biased to the selected language; results in the selected language may be given a higher ranking.
    * See the list of supported languages and their codes.
    * Note that we often update supported languages so this list may not be exhaustive.
    * If language is not supplied, the Place Autocomplete service will attempt to use the native language
    * of the domain from which the request is sent.
    */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /** The point around which you wish to retrieve place information. */
  var location: js.UndefOr[LatLng] = js.undefined
  /**
    * The position, in the input term, of the last character that the service uses to match predictions.
    * For example, if the input is 'Google' and the `offset` is 3, the service will match on 'Goo'.
    * The string determined by the `offset` is matched against the first word in the input term only.
    * For example, if the input term is 'Google abc' and the offset is 3, the service will attempt to match against 'Goo abc'.
    * If no `offset` is supplied, the service will use the whole term.
    * The `offset` should generally be set to the position of the text caret.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The distance (in meters) within which to return place results. Note that setting a radius biases results to the indicated area,
    * but may not fully restrict results to the specified area.
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
  /**
    * A random string which identifies an autocomplete
    * [session](https://developers.google.com/places/web-service/autocomplete#session_tokens) for billing purposes.
    * If this parameter is omitted from an autocomplete request, the request is billed independently
    */
  var sessiontoken: java.lang.String
  /**
    * Returns only those places that are strictly within the region defined by `location` and `radius`.
    * This is a restriction, rather than a bias, meaning that results outside this region
    * will not be returned even if they match the user input.
    */
  var strictbounds: js.UndefOr[scala.Boolean] = js.undefined
  /** The types of place results to return. */
  var types: js.UndefOr[PlaceAutocompleteType] = js.undefined
}

