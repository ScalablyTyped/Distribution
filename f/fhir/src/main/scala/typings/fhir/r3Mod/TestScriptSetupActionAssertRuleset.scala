package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptSetupActionAssertRuleset
  extends StObject
     with BackboneElement {
  
  var _rulesetId: js.UndefOr[Element] = js.undefined
  
  /**
    * This qualifies each param name so that  a parameter with the same name can be used differently by the different rules with the ruleset.
    */
  var rule: js.UndefOr[js.Array[TestScriptSetupActionAssertRulesetRule]] = js.undefined
  
  /**
    * The TestScript.ruleset id value this assert will evaluate.
    */
  var rulesetId: String
}
object TestScriptSetupActionAssertRuleset {
  
  inline def apply(rulesetId: String): TestScriptSetupActionAssertRuleset = {
    val __obj = js.Dynamic.literal(rulesetId = rulesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssertRuleset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptSetupActionAssertRuleset] (val x: Self) extends AnyVal {
    
    inline def setRule(value: js.Array[TestScriptSetupActionAssertRulesetRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setRuleVarargs(value: TestScriptSetupActionAssertRulesetRule*): Self = StObject.set(x, "rule", js.Array(value*))
    
    inline def setRulesetId(value: String): Self = StObject.set(x, "rulesetId", value.asInstanceOf[js.Any])
    
    inline def set_rulesetId(value: Element): Self = StObject.set(x, "_rulesetId", value.asInstanceOf[js.Any])
    
    inline def set_rulesetIdUndefined: Self = StObject.set(x, "_rulesetId", js.undefined)
  }
}
