package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Ruleset rule parameter template
  */
trait TestScriptRulesetRuleParam
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
    * Parameter name matching external assert ruleset rule parameter
    */
  var name: String
  
  /**
    * Parameter value defined either explicitly or dynamically
    */
  var value: js.UndefOr[String] = js.undefined
}
object TestScriptRulesetRuleParam {
  
  @scala.inline
  def apply(name: String): TestScriptRulesetRuleParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptRulesetRuleParam]
  }
  
  @scala.inline
  implicit class TestScriptRulesetRuleParamMutableBuilder[Self <: TestScriptRulesetRuleParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
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
