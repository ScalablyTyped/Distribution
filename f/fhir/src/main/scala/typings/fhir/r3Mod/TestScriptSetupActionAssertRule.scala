package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptSetupActionAssertRule
  extends StObject
     with BackboneElement {
  
  var _ruleId: js.UndefOr[Element] = js.undefined
  
  /**
    * The parameter value can be dynamic at runtime.
    */
  var param: js.UndefOr[js.Array[TestScriptSetupActionAssertRuleParam]] = js.undefined
  
  /**
    * The TestScript.rule id value this assert will evaluate.
    */
  var ruleId: String
}
object TestScriptSetupActionAssertRule {
  
  inline def apply(ruleId: String): TestScriptSetupActionAssertRule = {
    val __obj = js.Dynamic.literal(ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssertRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptSetupActionAssertRule] (val x: Self) extends AnyVal {
    
    inline def setParam(value: js.Array[TestScriptSetupActionAssertRuleParam]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setParamVarargs(value: TestScriptSetupActionAssertRuleParam*): Self = StObject.set(x, "param", js.Array(value*))
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def set_ruleId(value: Element): Self = StObject.set(x, "_ruleId", value.asInstanceOf[js.Any])
    
    inline def set_ruleIdUndefined: Self = StObject.set(x, "_ruleId", js.undefined)
  }
}
