package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaceAutocompleteResponse extends js.Object {
  /**
    * When the Places service returns a status code other than `OK`, there may be an additional `error_message` field
    * within the response object. This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: String
  /**
    * contains an array of places, with information about the place.
    * See [Place Autocomplete Results](https://developers.google.com/places/web-service/autocomplete#place_autocomplete_results)
    * for information about these results. The Places API returns up to 5 results.
    */
  var predictions: js.Array[PlaceAutocompleteResult]
  /** contains metadata on the request. */
  var status: PlaceAutocompleteResponseStatus
}

object PlaceAutocompleteResponse {
  @scala.inline
  def apply(
    error_message: String,
    predictions: js.Array[PlaceAutocompleteResult],
    status: PlaceAutocompleteResponseStatus
  ): PlaceAutocompleteResponse = {
    val __obj = js.Dynamic.literal(error_message = error_message.asInstanceOf[js.Any], predictions = predictions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PlaceAutocompleteResponse]
  }
}

