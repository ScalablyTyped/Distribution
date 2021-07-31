package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The referenced rule within the ruleset
  */
trait TestScriptRulesetRule
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'ruleId'.
    */
  var _ruleId: js.UndefOr[Element] = js.undefined
  
  /**
    * Ruleset rule parameter template
    */
  var param: js.UndefOr[js.Array[TestScriptRulesetRuleParam]] = js.undefined
  
  /**
    * Id of referenced rule within the ruleset
    */
  var ruleId: id
}
object TestScriptRulesetRule {
  
  @scala.inline
  def apply(ruleId: id): TestScriptRulesetRule = {
    val __obj = js.Dynamic.literal(ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptRulesetRule]
  }
  
  @scala.inline
  implicit class TestScriptRulesetRuleMutableBuilder[Self <: TestScriptRulesetRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParam(value: js.Array[TestScriptRulesetRuleParam]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    @scala.inline
    def setParamVarargs(value: TestScriptRulesetRuleParam*): Self = StObject.set(x, "param", js.Array(value :_*))
    
    @scala.inline
    def setRuleId(value: id): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ruleId(value: Element): Self = StObject.set(x, "_ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ruleIdUndefined: Self = StObject.set(x, "_ruleId", js.undefined)
  }
}
