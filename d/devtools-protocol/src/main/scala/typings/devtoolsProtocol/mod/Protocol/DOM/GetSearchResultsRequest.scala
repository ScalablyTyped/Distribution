package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSearchResultsRequest extends StObject {
  
  /**
    * Start index of the search result to be returned.
    */
  var fromIndex: integer
  
  /**
    * Unique search session identifier.
    */
  var searchId: String
  
  /**
    * End index of the search result to be returned.
    */
  var toIndex: integer
}
object GetSearchResultsRequest {
  
  inline def apply(fromIndex: integer, searchId: String, toIndex: integer): GetSearchResultsRequest = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], searchId = searchId.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSearchResultsRequest]
  }
  
  extension [Self <: GetSearchResultsRequest](x: Self) {
    
    inline def setFromIndex(value: integer): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    inline def setSearchId(value: String): Self = StObject.set(x, "searchId", value.asInstanceOf[js.Any])
    
    inline def setToIndex(value: integer): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
  }
}
