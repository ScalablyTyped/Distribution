package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHighlightObjectForTestResponse extends StObject {
  
  /**
    * Highlight data for the node.
    */
  var highlight: js.Any
}
object GetHighlightObjectForTestResponse {
  
  inline def apply(highlight: js.Any): GetHighlightObjectForTestResponse = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHighlightObjectForTestResponse]
  }
  
  extension [Self <: GetHighlightObjectForTestResponse](x: Self) {
    
    inline def setHighlight(value: js.Any): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
  }
}
