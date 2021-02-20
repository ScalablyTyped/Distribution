package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscardSearchResultsRequest extends StObject {
  
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
  implicit class DiscardSearchResultsRequestMutableBuilder[Self <: DiscardSearchResultsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearchId(value: String): Self = StObject.set(x, "searchId", value.asInstanceOf[js.Any])
  }
}
