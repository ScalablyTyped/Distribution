package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Which other rules to apply in the context of this rule
  */
trait StructureMapGroupRuleDependent
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'variable'.
    */
  var _variable: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Name of a rule or group to apply
    */
  var name: id
  
  /**
    * Variable to pass to the rule or group
    */
  var variable: js.Array[String]
}
object StructureMapGroupRuleDependent {
  
  @scala.inline
  def apply(name: id, variable: js.Array[String]): StructureMapGroupRuleDependent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRuleDependent]
  }
  
  @scala.inline
  implicit class StructureMapGroupRuleDependentMutableBuilder[Self <: StructureMapGroupRuleDependent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: id): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable(value: js.Array[String]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableVarargs(value: String*): Self = StObject.set(x, "variable", js.Array(value :_*))
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_variable(value: js.Array[Element]): Self = StObject.set(x, "_variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_variableUndefined: Self = StObject.set(x, "_variable", js.undefined)
    
    @scala.inline
    def set_variableVarargs(value: Element*): Self = StObject.set(x, "_variable", js.Array(value :_*))
  }
}
