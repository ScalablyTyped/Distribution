package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The reference to a TestScript.ruleset
  */
@js.native
trait TestScriptSetupActionAssertRuleset extends BackboneElement {
  
  /**
    * Contains extended information for property 'rulesetId'.
    */
  var _rulesetId: js.UndefOr[Element] = js.native
  
  /**
    * The referenced rule within the ruleset
    */
  var rule: js.UndefOr[js.Array[TestScriptSetupActionAssertRulesetRule]] = js.native
  
  /**
    * Id of the TestScript.ruleset
    */
  var rulesetId: id = js.native
}
object TestScriptSetupActionAssertRuleset {
  
  @scala.inline
  def apply(rulesetId: id): TestScriptSetupActionAssertRuleset = {
    val __obj = js.Dynamic.literal(rulesetId = rulesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssertRuleset]
  }
  
  @scala.inline
  implicit class TestScriptSetupActionAssertRulesetMutableBuilder[Self <: TestScriptSetupActionAssertRuleset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: js.Array[TestScriptSetupActionAssertRulesetRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setRuleVarargs(value: TestScriptSetupActionAssertRulesetRule*): Self = StObject.set(x, "rule", js.Array(value :_*))
    
    @scala.inline
    def setRulesetId(value: id): Self = StObject.set(x, "rulesetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rulesetId(value: Element): Self = StObject.set(x, "_rulesetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rulesetIdUndefined: Self = StObject.set(x, "_rulesetId", js.undefined)
  }
}
