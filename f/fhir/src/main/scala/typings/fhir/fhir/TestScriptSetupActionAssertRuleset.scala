package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The reference to a TestScript.ruleset
  */
trait TestScriptSetupActionAssertRuleset
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'rulesetId'.
    */
  var _rulesetId: js.UndefOr[Element] = js.undefined
  
  /**
    * The referenced rule within the ruleset
    */
  var rule: js.UndefOr[js.Array[TestScriptSetupActionAssertRulesetRule]] = js.undefined
  
  /**
    * Id of the TestScript.ruleset
    */
  var rulesetId: id
}
object TestScriptSetupActionAssertRuleset {
  
  inline def apply(rulesetId: id): TestScriptSetupActionAssertRuleset = {
    val __obj = js.Dynamic.literal(rulesetId = rulesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssertRuleset]
  }
  
  extension [Self <: TestScriptSetupActionAssertRuleset](x: Self) {
    
    inline def setRule(value: js.Array[TestScriptSetupActionAssertRulesetRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setRuleVarargs(value: TestScriptSetupActionAssertRulesetRule*): Self = StObject.set(x, "rule", js.Array(value :_*))
    
    inline def setRulesetId(value: id): Self = StObject.set(x, "rulesetId", value.asInstanceOf[js.Any])
    
    inline def set_rulesetId(value: Element): Self = StObject.set(x, "_rulesetId", value.asInstanceOf[js.Any])
    
    inline def set_rulesetIdUndefined: Self = StObject.set(x, "_rulesetId", js.undefined)
  }
}
