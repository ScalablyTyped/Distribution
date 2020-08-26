package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryAutocompleteResponse extends js.Object {
  /**
    * When the Places service returns a status code other than `OK`, there may be an additional `error_message` field
    * within the response object. This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: String = js.native
  /** containing information about a single query prediction. */
  var predictions: js.Array[QueryAutocompleteResult] = js.native
  /** contains metadata on the request. */
  var status: QueryAutocompleteResponseStatus = js.native
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
  @scala.inline
  implicit class QueryAutocompleteResponseOps[Self <: QueryAutocompleteResponse] (val x: Self) extends AnyVal {
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
    def setPredictionsVarargs(value: QueryAutocompleteResult*): Self = this.set("predictions", js.Array(value :_*))
    @scala.inline
    def setPredictions(value: js.Array[QueryAutocompleteResult]): Self = this.set("predictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: QueryAutocompleteResponseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

