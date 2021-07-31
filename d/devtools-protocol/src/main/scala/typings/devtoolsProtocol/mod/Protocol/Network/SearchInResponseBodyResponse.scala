package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Debugger.SearchMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchInResponseBodyResponse extends StObject {
  
  /**
    * List of search matches.
    */
  var result: js.Array[SearchMatch]
}
object SearchInResponseBodyResponse {
  
  @scala.inline
  def apply(result: js.Array[SearchMatch]): SearchInResponseBodyResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInResponseBodyResponse]
  }
  
  @scala.inline
  implicit class SearchInResponseBodyResponseMutableBuilder[Self <: SearchInResponseBodyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Array[SearchMatch]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: SearchMatch*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
