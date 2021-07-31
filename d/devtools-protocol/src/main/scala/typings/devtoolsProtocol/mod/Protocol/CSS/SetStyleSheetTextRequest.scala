package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetStyleSheetTextRequest extends StObject {
  
  var styleSheetId: StyleSheetId
  
  var text: String
}
object SetStyleSheetTextRequest {
  
  @scala.inline
  def apply(styleSheetId: StyleSheetId, text: String): SetStyleSheetTextRequest = {
    val __obj = js.Dynamic.literal(styleSheetId = styleSheetId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetStyleSheetTextRequest]
  }
  
  @scala.inline
  implicit class SetStyleSheetTextRequestMutableBuilder[Self <: SetStyleSheetTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
