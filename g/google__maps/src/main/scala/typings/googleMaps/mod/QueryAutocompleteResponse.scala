package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAutocompleteResponse extends js.Object {
  /**
    * When the Places service returns a status code other than `OK`, there may be an additional `error_message` field
    * within the response object. This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: String
  /** containing information about a single query prediction. */
  var predictions: js.Array[QueryAutocompleteResult]
  /** contains metadata on the request. */
  var status: QueryAutocompleteResponseStatus
}

object QueryAutocompleteResponse {
  @scala.inline
  def apply(
    error_message: String,
    predictions: js.Array[QueryAutocompleteResult],
    status: QueryAutocompleteResponseStatus
  ): QueryAutocompleteResponse = {
    val __obj = js.Dynamic.literal(error_message = error_message.asInstanceOf[js.Any], predictions = predictions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryAutocompleteResponse]
  }
}

