package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Assert ruleset used within the test script
  */
trait TestScriptRuleset
  extends StObject
     with BackboneElement {
  
  /**
    * Assert ruleset resource reference
    */
  var resource: Reference
  
  /**
    * The referenced rule within the ruleset
    */
  var rule: js.Array[TestScriptRulesetRule]
}
object TestScriptRuleset {
  
  inline def apply(resource: Reference, rule: js.Array[TestScriptRulesetRule]): TestScriptRuleset = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptRuleset]
  }
  
  extension [Self <: TestScriptRuleset](x: Self) {
    
    inline def setResource(value: Reference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setRule(value: js.Array[TestScriptRulesetRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleVarargs(value: TestScriptRulesetRule*): Self = StObject.set(x, "rule", js.Array(value :_*))
  }
}
