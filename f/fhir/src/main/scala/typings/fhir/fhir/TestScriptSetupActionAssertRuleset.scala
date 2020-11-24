package typings.fhir.fhir

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
  implicit class TestScriptSetupActionAssertRulesetOps[Self <: TestScriptSetupActionAssertRuleset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRulesetId(value: id): Self = this.set("rulesetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rulesetId(value: Element): Self = this.set("_rulesetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_rulesetId: Self = this.set("_rulesetId", js.undefined)
    
    @scala.inline
    def setRuleVarargs(value: TestScriptSetupActionAssertRulesetRule*): Self = this.set("rule", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: js.Array[TestScriptSetupActionAssertRulesetRule]): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
}
