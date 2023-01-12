package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetRuleSelectorRequest extends StObject {
  
  var range: SourceRange
  
  var selector: String
  
  var styleSheetId: StyleSheetId
}
object SetRuleSelectorRequest {
  
  inline def apply(range: SourceRange, selector: String, styleSheetId: StyleSheetId): SetRuleSelectorRequest = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRuleSelectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetRuleSelectorRequest] (val x: Self) extends AnyVal {
    
    inline def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
