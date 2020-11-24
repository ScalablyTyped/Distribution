package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaceDetailsResponse extends js.Object {
  
  /** contains a set of attributions about this listing which must be displayed to the user. */
  var html_attributions: js.Array[String] = js.native
  
  /**
    * When the Google Places service returns a status code other than `OK`, there may be an additional `error_message` field
    * within the details response object. This field contains more detailed information about the reasons behind the given status code.
    */
  /** contains the detailed information about the place requested. */
  var result: PlaceDetailsResult = js.native
  
  /** contains metadata on the request. */
  var status: PlaceDetailsResponseStatus = js.native
}
object PlaceDetailsResponse {
  
  @scala.inline
  def apply(
    html_attributions: js.Array[String],
    result: PlaceDetailsResult,
    status: PlaceDetailsResponseStatus
  ): PlaceDetailsResponse = {
    val __obj = js.Dynamic.literal(html_attributions = html_attributions.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceDetailsResponse]
  }
  
  @scala.inline
  implicit class PlaceDetailsResponseOps[Self <: PlaceDetailsResponse] (val x: Self) extends AnyVal {
    
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
    def setHtml_attributionsVarargs(value: String*): Self = this.set("html_attributions", js.Array(value :_*))
    
    @scala.inline
    def setHtml_attributions(value: js.Array[String]): Self = this.set("html_attributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: PlaceDetailsResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: PlaceDetailsResponseStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
