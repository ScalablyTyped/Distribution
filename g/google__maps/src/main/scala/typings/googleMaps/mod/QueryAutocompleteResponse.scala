package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryAutocompleteResponse extends StObject {
  
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
  
  @scala.inline
  implicit class QueryAutocompleteResponseMutableBuilder[Self <: QueryAutocompleteResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError_message(value: String): Self = StObject.set(x, "error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictions(value: js.Array[QueryAutocompleteResult]): Self = StObject.set(x, "predictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictionsVarargs(value: QueryAutocompleteResult*): Self = StObject.set(x, "predictions", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: QueryAutocompleteResponseStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
