package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscardSearchResultsRequest extends js.Object {
  
  /**
    * Unique search session identifier.
    */
  var searchId: String = js.native
}
object DiscardSearchResultsRequest {
  
  @scala.inline
  def apply(searchId: String): DiscardSearchResultsRequest = {
    val __obj = js.Dynamic.literal(searchId = searchId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscardSearchResultsRequest]
  }
  
  @scala.inline
  implicit class DiscardSearchResultsRequestOps[Self <: DiscardSearchResultsRequest] (val x: Self) extends AnyVal {
    
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
    def setSearchId(value: String): Self = this.set("searchId", value.asInstanceOf[js.Any])
  }
}
