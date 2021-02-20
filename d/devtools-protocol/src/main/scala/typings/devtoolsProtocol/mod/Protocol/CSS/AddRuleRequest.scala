package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddRuleRequest extends StObject {
  
  /**
    * Text position of a new rule in the target style sheet.
    */
  var location: SourceRange = js.native
  
  /**
    * The text of a new rule.
    */
  var ruleText: String = js.native
  
  /**
    * The css style sheet identifier where a new rule should be inserted.
    */
  var styleSheetId: StyleSheetId = js.native
}
object AddRuleRequest {
  
  @scala.inline
  def apply(location: SourceRange, ruleText: String, styleSheetId: StyleSheetId): AddRuleRequest = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], ruleText = ruleText.asInstanceOf[js.Any], styleSheetId = styleSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRuleRequest]
  }
  
  @scala.inline
  implicit class AddRuleRequestMutableBuilder[Self <: AddRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: SourceRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleText(value: String): Self = StObject.set(x, "ruleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
  }
}
