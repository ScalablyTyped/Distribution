package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchInContentResponse extends StObject {
  
  /**
    * List of search matches.
    */
  var result: js.Array[SearchMatch] = js.native
}
object SearchInContentResponse {
  
  @scala.inline
  def apply(result: js.Array[SearchMatch]): SearchInContentResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInContentResponse]
  }
  
  @scala.inline
  implicit class SearchInContentResponseMutableBuilder[Self <: SearchInContentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Array[SearchMatch]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: SearchMatch*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
