package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.mod.Protocol.Debugger.SearchMatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchInResourceResponse extends StObject {
  
  /**
    * List of search matches.
    */
  var result: js.Array[SearchMatch]
}
object SearchInResourceResponse {
  
  inline def apply(result: js.Array[SearchMatch]): SearchInResourceResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInResourceResponse]
  }
  
  extension [Self <: SearchInResourceResponse](x: Self) {
    
    inline def setResult(value: js.Array[SearchMatch]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: SearchMatch*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
