package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGridHighlightObjectsForTestResponse extends StObject {
  
  /**
    * Grid Highlight data for the node ids provided.
    */
  var highlights: js.Any
}
object GetGridHighlightObjectsForTestResponse {
  
  @scala.inline
  def apply(highlights: js.Any): GetGridHighlightObjectsForTestResponse = {
    val __obj = js.Dynamic.literal(highlights = highlights.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGridHighlightObjectsForTestResponse]
  }
  
  @scala.inline
  implicit class GetGridHighlightObjectsForTestResponseMutableBuilder[Self <: GetGridHighlightObjectsForTestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlights(value: js.Any): Self = StObject.set(x, "highlights", value.asInstanceOf[js.Any])
  }
}
