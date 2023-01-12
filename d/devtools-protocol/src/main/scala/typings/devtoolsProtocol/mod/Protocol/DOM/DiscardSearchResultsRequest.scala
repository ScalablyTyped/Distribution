package typings.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscardSearchResultsRequest extends StObject {
  
  /**
    * Unique search session identifier.
    */
  var searchId: String
}
object DiscardSearchResultsRequest {
  
  inline def apply(searchId: String): DiscardSearchResultsRequest = {
    val __obj = js.Dynamic.literal(searchId = searchId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscardSearchResultsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscardSearchResultsRequest] (val x: Self) extends AnyVal {
    
    inline def setSearchId(value: String): Self = StObject.set(x, "searchId", value.asInstanceOf[js.Any])
  }
}
