package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformSearchResponse extends StObject {
  
  /**
    * Number of search results.
    */
  var resultCount: integer
  
  /**
    * Unique search session identifier.
    */
  var searchId: String
}
object PerformSearchResponse {
  
  inline def apply(resultCount: integer, searchId: String): PerformSearchResponse = {
    val __obj = js.Dynamic.literal(resultCount = resultCount.asInstanceOf[js.Any], searchId = searchId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformSearchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformSearchResponse] (val x: Self) extends AnyVal {
    
    inline def setResultCount(value: integer): Self = StObject.set(x, "resultCount", value.asInstanceOf[js.Any])
    
    inline def setSearchId(value: String): Self = StObject.set(x, "searchId", value.asInstanceOf[js.Any])
  }
}
