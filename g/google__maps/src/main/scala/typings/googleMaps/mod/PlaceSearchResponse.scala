package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceSearchResponse extends js.Object {
  
  /**
    * When the Google Places service returns a status code other than `OK`, there may be an additional `error_message` field
    * within the search response object. This field contains more detailed information about the reasons behind the given status code.
    */
  var error_message: String = js.native
  
  /** may contain a set of attributions about this listing which must be displayed to the user (some listings may not have attribution). */
  var html_attributions: js.Array[String] = js.native
  
  /**
    * contains a token that can be used to return up to 20 additional results.
    * A `next_page_token` will not be returned if there are no additional results to display.
    * The maximum number of results that can be returned is 60.
    * There is a short delay between when a `next_page_token` is issued, and when it will become valid.
    */
  var next_page_token: String = js.native
  
  /**
    * contains an array of places, with information about each.
    * The Places API returns up to 20 `establishment` results per query.
    * Additionally, political results may be returned which serve to identify the area of the request.
    */
  var results: js.Array[PlaceSearchResult] = js.native
  
  /** contains metadata on the request. */
  var status: SearchResponseStatus = js.native
}
object PlaceSearchResponse {
  
  @scala.inline
  def apply(
    error_message: String,
    html_attributions: js.Array[String],
    next_page_token: String,
    results: js.Array[PlaceSearchResult],
    status: SearchResponseStatus
  ): PlaceSearchResponse = {
    val __obj = js.Dynamic.literal(error_message = error_message.asInstanceOf[js.Any], html_attributions = html_attributions.asInstanceOf[js.Any], next_page_token = next_page_token.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceSearchResponse]
  }
  
  @scala.inline
  implicit class PlaceSearchResponseOps[Self <: PlaceSearchResponse] (val x: Self) extends AnyVal {
    
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
    def setHtml_attributionsVarargs(value: String*): Self = this.set("html_attributions", js.Array(value :_*))
    
    @scala.inline
    def setHtml_attributions(value: js.Array[String]): Self = this.set("html_attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext_page_token(value: String): Self = this.set("next_page_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsVarargs(value: PlaceSearchResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[PlaceSearchResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: SearchResponseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
