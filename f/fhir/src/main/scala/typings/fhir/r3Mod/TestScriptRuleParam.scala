package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptRuleParam
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * The external rule template would be looking for the parameter by this name.
    */
  var name: String
  
  /**
    * This value can be overwritten by the assert.rule.param.value i.e. TestScript.rule.param.value will be used if assert.rule.param.value is not specified.  The param value can be a string-representation of a number, string, or boolean that is expected. Test engines do have to look for placeholders (${}) and replace the variable placeholders with the variable values at runtime before supplying this value to the external rule template.
    */
  var value: js.UndefOr[String] = js.undefined
}
object TestScriptRuleParam {
  
  inline def apply(name: String): TestScriptRuleParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptRuleParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptRuleParam] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
