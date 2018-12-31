package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAutocompleteRequest extends js.Object {
  /**
    * The text string on which to search.
    * The Places service will return candidate matches based on this string and order results based on their perceived relevance.
    */
  var input: java.lang.String
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Searches are also biased to the selected language; results in the selected language may be given a higher ranking.
    * If language is not supplied, the Places service will attempt to use the native language of the domain from which the request is sent.
    */
  var language: js.UndefOr[Language] = js.undefined
  /** The point around which you wish to retrieve place information. Must be specified as latitude,longitude. */
  var location: js.UndefOr[LatLng] = js.undefined
  /**
    * The character position in the input term at which the service uses text for predictions.
    * For example, if the input is 'Googl' and the completion point is 3, the service will match on 'Goo'.
    * The offset should generally be set to the position of the text caret.
    * If no offset is supplied, the service will use the entire term.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The distance (in meters) within which to return place results.
    * Note that setting a radius biases results to the indicated area, but may not fully restrict results to the specified area.
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
}

