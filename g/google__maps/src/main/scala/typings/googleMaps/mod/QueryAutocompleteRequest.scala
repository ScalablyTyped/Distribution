package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryAutocompleteRequest extends js.Object {
  /**
    * The text string on which to search.
    * The Places service will return candidate matches based on this string and order results based on their perceived relevance.
    */
  var input: String = js.native
  /**
    * The language code, indicating in which language the results should be returned, if possible.
    * Searches are also biased to the selected language; results in the selected language may be given a higher ranking.
    * If language is not supplied, the Places service will attempt to use the native language of the domain from which the request is sent.
    */
  var language: js.UndefOr[Language] = js.native
  /** The point around which you wish to retrieve place information. Must be specified as latitude,longitude. */
  var location: js.UndefOr[LatLng] = js.native
  /**
    * The character position in the input term at which the service uses text for predictions.
    * For example, if the input is 'Googl' and the completion point is 3, the service will match on 'Goo'.
    * The offset should generally be set to the position of the text caret.
    * If no offset is supplied, the service will use the entire term.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * The distance (in meters) within which to return place results.
    * Note that setting a radius biases results to the indicated area, but may not fully restrict results to the specified area.
    */
  var radius: js.UndefOr[Double] = js.native
}

object QueryAutocompleteRequest {
  @scala.inline
  def apply(input: String): QueryAutocompleteRequest = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAutocompleteRequest]
  }
  @scala.inline
  implicit class QueryAutocompleteRequestOps[Self <: QueryAutocompleteRequest] (val x: Self) extends AnyVal {
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
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
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
  }
  
}

