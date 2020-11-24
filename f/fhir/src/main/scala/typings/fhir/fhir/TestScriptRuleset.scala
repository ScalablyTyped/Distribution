package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Assert ruleset used within the test script
  */
@js.native
trait TestScriptRuleset extends BackboneElement {
  
  /**
    * Assert ruleset resource reference
    */
  var resource: Reference = js.native
  
  /**
    * The referenced rule within the ruleset
    */
  var rule: js.Array[TestScriptRulesetRule] = js.native
}
object TestScriptRuleset {
  
  @scala.inline
  def apply(resource: Reference, rule: js.Array[TestScriptRulesetRule]): TestScriptRuleset = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptRuleset]
  }
  
  @scala.inline
  implicit class TestScriptRulesetOps[Self <: TestScriptRuleset] (val x: Self) extends AnyVal {
    
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
    def setResource(value: Reference): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVarargs(value: TestScriptRulesetRule*): Self = this.set("rule", js.Array(value :_*))
    
    @scala.inline
    def setRule(value: js.Array[TestScriptRulesetRule]): Self = this.set("rule", value.asInstanceOf[js.Any])
  }
}
