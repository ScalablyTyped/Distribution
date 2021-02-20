package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSourceOrderHighlightObjectForTestResponse extends StObject {
  
  /**
    * Source order highlight data for the node id provided.
    */
  var highlight: js.Any = js.native
}
object GetSourceOrderHighlightObjectForTestResponse {
  
  @scala.inline
  def apply(highlight: js.Any): GetSourceOrderHighlightObjectForTestResponse = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSourceOrderHighlightObjectForTestResponse]
  }
  
  @scala.inline
  implicit class GetSourceOrderHighlightObjectForTestResponseMutableBuilder[Self <: GetSourceOrderHighlightObjectForTestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlight(value: js.Any): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
  }
}
