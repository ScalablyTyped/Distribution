package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSearchResultsRequest extends StObject {
  
  /**
    * Start index of the search result to be returned.
    */
  var fromIndex: integer = js.native
  
  /**
    * Unique search session identifier.
    */
  var searchId: String = js.native
  
  /**
    * End index of the search result to be returned.
    */
  var toIndex: integer = js.native
}
object GetSearchResultsRequest {
  
  @scala.inline
  def apply(fromIndex: integer, searchId: String, toIndex: integer): GetSearchResultsRequest = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], searchId = searchId.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSearchResultsRequest]
  }
  
  @scala.inline
  implicit class GetSearchResultsRequestMutableBuilder[Self <: GetSearchResultsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromIndex(value: integer): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchId(value: String): Self = StObject.set(x, "searchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToIndex(value: integer): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
  }
}
