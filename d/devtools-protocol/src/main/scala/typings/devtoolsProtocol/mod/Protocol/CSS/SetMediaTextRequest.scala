package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetMediaTextRequest extends StObject {
  
  var range: SourceRange
  
  var styleSheetId: StyleSheetId
  
  var text: String
}
object SetMediaTextRequest {
  
  @scala.inline
  def apply(range: SourceRange, styleSheetId: StyleSheetId, text: String): SetMediaTextRequest = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetMediaTextRequest]
  }
  
  @scala.inline
  implicit class SetMediaTextRequestMutableBuilder[Self <: SetMediaTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
