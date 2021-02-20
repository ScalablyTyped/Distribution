package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetRuleSelectorRequest extends StObject {
  
  var range: SourceRange = js.native
  
  var selector: String = js.native
  
  var styleSheetId: StyleSheetId = js.native
}
object SetRuleSelectorRequest {
  
  @scala.inline
  def apply(range: SourceRange, selector: String, styleSheetId: StyleSheetId): SetRuleSelectorRequest = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetRuleSelectorRequest]
  }
  
  @scala.inline
  implicit class SetRuleSelectorRequestMutableBuilder[Self <: SetRuleSelectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
