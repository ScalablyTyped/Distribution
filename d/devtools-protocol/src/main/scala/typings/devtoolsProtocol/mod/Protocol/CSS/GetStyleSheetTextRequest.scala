package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStyleSheetTextRequest extends StObject {
  
  var styleSheetId: StyleSheetId
}
object GetStyleSheetTextRequest {
  
  @scala.inline
  def apply(styleSheetId: StyleSheetId): GetStyleSheetTextRequest = {
    val __obj = js.Dynamic.literal(styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStyleSheetTextRequest]
  }
  
  @scala.inline
  implicit class GetStyleSheetTextRequestMutableBuilder[Self <: GetStyleSheetTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
