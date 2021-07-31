package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The reference to a TestScript.rule
  */
trait TestScriptSetupActionAssertRule
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'ruleId'.
    */
  var _ruleId: js.UndefOr[Element] = js.undefined
  
  /**
    * Rule parameter template
    */
  var param: js.UndefOr[js.Array[TestScriptSetupActionAssertRuleParam]] = js.undefined
  
  /**
    * Id of the TestScript.rule
    */
  var ruleId: id
}
object TestScriptSetupActionAssertRule {
  
  @scala.inline
  def apply(ruleId: id): TestScriptSetupActionAssertRule = {
    val __obj = js.Dynamic.literal(ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssertRule]
  }
  
  @scala.inline
  implicit class TestScriptSetupActionAssertRuleMutableBuilder[Self <: TestScriptSetupActionAssertRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParam(value: js.Array[TestScriptSetupActionAssertRuleParam]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    @scala.inline
    def setParamVarargs(value: TestScriptSetupActionAssertRuleParam*): Self = StObject.set(x, "param", js.Array(value :_*))
    
    @scala.inline
    def setRuleId(value: id): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ruleId(value: Element): Self = StObject.set(x, "_ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ruleIdUndefined: Self = StObject.set(x, "_ruleId", js.undefined)
  }
}
