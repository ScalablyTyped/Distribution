package typings.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchInContentResponse extends StObject {
  
  /**
    * List of search matches.
    */
  var result: js.Array[SearchMatch]
}
object SearchInContentResponse {
  
  inline def apply(result: js.Array[SearchMatch]): SearchInContentResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInContentResponse]
  }
  
  extension [Self <: SearchInContentResponse](x: Self) {
    
    inline def setResult(value: js.Array[SearchMatch]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: SearchMatch*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
