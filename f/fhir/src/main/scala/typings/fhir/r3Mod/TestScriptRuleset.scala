package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptRuleset
  extends StObject
     with BackboneElement {
  
  /**
    * Reference to the resource (containing the contents of the ruleset needed for assertions).
    */
  var resource: Reference
  
  /**
    * This qualifies each param name so that  a parameter with the same name can be used differently by the different rules with the ruleset.
    */
  var rule: js.Array[TestScriptRulesetRule]
}
object TestScriptRuleset {
  
  inline def apply(resource: Reference, rule: js.Array[TestScriptRulesetRule]): TestScriptRuleset = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptRuleset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptRuleset] (val x: Self) extends AnyVal {
    
    inline def setResource(value: Reference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setRule(value: js.Array[TestScriptRulesetRule]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleVarargs(value: TestScriptRulesetRule*): Self = StObject.set(x, "rule", js.Array(value*))
  }
}
