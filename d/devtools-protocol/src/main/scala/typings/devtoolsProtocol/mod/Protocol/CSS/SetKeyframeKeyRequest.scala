package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetKeyframeKeyRequest extends StObject {
  
  var keyText: String
  
  var range: SourceRange
  
  var styleSheetId: StyleSheetId
}
object SetKeyframeKeyRequest {
  
  @scala.inline
  def apply(keyText: String, range: SourceRange, styleSheetId: StyleSheetId): SetKeyframeKeyRequest = {
    val __obj = js.Dynamic.literal(keyText = keyText.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeyframeKeyRequest]
  }
  
  @scala.inline
  implicit class SetKeyframeKeyRequestMutableBuilder[Self <: SetKeyframeKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyText(value: String): Self = StObject.set(x, "keyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
