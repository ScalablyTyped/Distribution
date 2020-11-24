package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceAutocompleteResponse extends js.Object {
  
  /**
    * When the Places service returns a status code other than `OK`, there may be an additional `error_message` field
    * within the response object. This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: String = js.native
  
  /**
    * contains an array of places, with information about the place.
    * See [Place Autocomplete Results](https://developers.google.com/places/web-service/autocomplete#place_autocomplete_results)
    * for information about these results. The Places API returns up to 5 results.
    */
  var predictions: js.Array[PlaceAutocompleteResult] = js.native
  
  /** contains metadata on the request. */
  var status: PlaceAutocompleteResponseStatus = js.native
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
  
  @scala.inline
  implicit class PlaceAutocompleteResponseOps[Self <: PlaceAutocompleteResponse] (val x: Self) extends AnyVal {
    
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
    def setError_message(value: String): Self = this.set("error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionsVarargs(value: PlaceAutocompleteResult*): Self = this.set("predictions", js.Array(value :_*))
    
    @scala.inline
    def setPredictions(value: js.Array[PlaceAutocompleteResult]): Self = this.set("predictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PlaceAutocompleteResponseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
