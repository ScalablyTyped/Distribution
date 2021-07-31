package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rule parameter template
  */
trait TestScriptSetupActionAssertRuleParam
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  
  /**
    * Parameter name matching external assert rule parameter
    */
  var name: String
  
  /**
    * Parameter value defined either explicitly or dynamically
    */
  var value: String
}
object TestScriptSetupActionAssertRuleParam {
  
  @scala.inline
  def apply(name: String, value: String): TestScriptSetupActionAssertRuleParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptSetupActionAssertRuleParam]
  }
  
  @scala.inline
  implicit class TestScriptSetupActionAssertRuleParamMutableBuilder[Self <: TestScriptSetupActionAssertRuleParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_value(value: Element): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
  }
}
