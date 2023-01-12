package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptSetupActionAssertRulesetRule
  extends StObject
     with BackboneElement {
  
  var _ruleId: js.UndefOr[Element] = js.undefined
  
  /**
    * The parameter value can be dynamic at runtime.
    */
  var param: js.UndefOr[js.Array[TestScriptSetupActionAssertRulesetRuleParam]] = js.undefined
  
  /**
    * Id of the referenced rule within the external ruleset template.
    */
  var ruleId: String
}
object TestScriptSetupActionAssertRulesetRule {
  
  inline def apply(ruleId: String): TestScriptSetupActionAssertRulesetRule = {
    val __obj = js.Dynamic.literal(ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssertRulesetRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptSetupActionAssertRulesetRule] (val x: Self) extends AnyVal {
    
    inline def setParam(value: js.Array[TestScriptSetupActionAssertRulesetRuleParam]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setParamVarargs(value: TestScriptSetupActionAssertRulesetRuleParam*): Self = StObject.set(x, "param", js.Array(value*))
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def set_ruleId(value: Element): Self = StObject.set(x, "_ruleId", value.asInstanceOf[js.Any])
    
    inline def set_ruleIdUndefined: Self = StObject.set(x, "_ruleId", js.undefined)
  }
}
