package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptRule
  extends StObject
     with BackboneElement {
  
  /**
    * The parameter value can be dynamic at runtime.
    */
  var param: js.UndefOr[js.Array[TestScriptRuleParam]] = js.undefined
  
  /**
    * Reference to the resource (containing the contents of the rule needed for assertions).
    */
  var resource: Reference
}
object TestScriptRule {
  
  inline def apply(resource: Reference): TestScriptRule = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptRule] (val x: Self) extends AnyVal {
    
    inline def setParam(value: js.Array[TestScriptRuleParam]): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    inline def setParamVarargs(value: TestScriptRuleParam*): Self = StObject.set(x, "param", js.Array(value*))
    
    inline def setResource(value: Reference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
