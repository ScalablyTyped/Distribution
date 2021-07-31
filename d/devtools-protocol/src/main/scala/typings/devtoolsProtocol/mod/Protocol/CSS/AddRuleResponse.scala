package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddRuleResponse extends StObject {
  
  /**
    * The newly created rule.
    */
  var rule: CSSRule
}
object AddRuleResponse {
  
  @scala.inline
  def apply(rule: CSSRule): AddRuleResponse = {
    val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRuleResponse]
  }
  
  @scala.inline
  implicit class AddRuleResponseMutableBuilder[Self <: AddRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: CSSRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
