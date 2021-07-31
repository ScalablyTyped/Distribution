package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Assert rule used within the test script
  */
trait TestScriptRule
  extends StObject
     with BackboneElement {
  
  /**
    * Rule parameter template
    */
  var param: js.UndefOr[js.Array[TestScriptRuleParam]] = js.undefined
  
  /**
    * Assert rule resource reference
    */
  var resource: Reference
}
object TestScriptRule {
  
  @scala.inline
  def apply(resource: Reference): TestScriptRule = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptRule]
  }
  
  @scala.inline
  implicit class TestScriptRuleMutableBuilder[Self <: TestScriptRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParam(value: js.Array[TestScriptRuleParam]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    @scala.inline
    def setParamVarargs(value: TestScriptRuleParam*): Self = StObject.set(x, "param", js.Array(value :_*))
    
    @scala.inline
    def setResource(value: Reference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
