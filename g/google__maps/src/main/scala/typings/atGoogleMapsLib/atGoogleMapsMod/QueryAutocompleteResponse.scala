package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAutocompleteResponse extends js.Object {
  /**
    * When the Places service returns a status code other than `OK`, there may be an additional `error_message` field
    * within the response object. This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: java.lang.String
  /** containing information about a single query prediction. */
  var predictions: js.Array[QueryAutocompleteResult]
  /** contains metadata on the request. */
  var status: QueryAutocompleteResponseStatus
}

object QueryAutocompleteResponse {
  @scala.inline
  def apply(
    error_message: java.lang.String,
    predictions: js.Array[QueryAutocompleteResult],
    status: QueryAutocompleteResponseStatus
  ): QueryAutocompleteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error_message")(error_message)
    __obj.updateDynamic("predictions")(predictions)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[QueryAutocompleteResponse]
  }
}

