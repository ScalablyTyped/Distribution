package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGridHighlightObjectsForTestResponse extends StObject {
  
  /**
    * Grid Highlight data for the node ids provided.
    */
  var highlights: Any
}
object GetGridHighlightObjectsForTestResponse {
  
  inline def apply(highlights: Any): GetGridHighlightObjectsForTestResponse = {
    val __obj = js.Dynamic.literal(highlights = highlights.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGridHighlightObjectsForTestResponse]
  }
  
  extension [Self <: GetGridHighlightObjectsForTestResponse](x: Self) {
    
    inline def setHighlights(value: Any): Self = StObject.set(x, "highlights", value.asInstanceOf[js.Any])
  }
}
