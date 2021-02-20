package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformSearchResponse extends StObject {
  
  /**
    * Number of search results.
    */
  var resultCount: integer = js.native
  
  /**
    * Unique search session identifier.
    */
  var searchId: String = js.native
}
object PerformSearchResponse {
  
  @scala.inline
  def apply(resultCount: integer, searchId: String): PerformSearchResponse = {
    val __obj = js.Dynamic.literal(resultCount = resultCount.asInstanceOf[js.Any], searchId = searchId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformSearchResponse]
  }
  
  @scala.inline
  implicit class PerformSearchResponseMutableBuilder[Self <: PerformSearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResultCount(value: integer): Self = StObject.set(x, "resultCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchId(value: String): Self = StObject.set(x, "searchId", value.asInstanceOf[js.Any])
  }
}
