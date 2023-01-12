package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureMapGroupRuleDependent
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _variable: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Name of a rule or group to apply.
    */
  var name: String
  
  /**
    * Variable to pass to the rule or group.
    */
  var variable: js.Array[String]
}
object StructureMapGroupRuleDependent {
  
  inline def apply(name: String, variable: js.Array[String]): StructureMapGroupRuleDependent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRuleDependent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructureMapGroupRuleDependent] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVariable(value: js.Array[String]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableVarargs(value: String*): Self = StObject.set(x, "variable", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_variable(value: js.Array[Element]): Self = StObject.set(x, "_variable", value.asInstanceOf[js.Any])
    
    inline def set_variableUndefined: Self = StObject.set(x, "_variable", js.undefined)
    
    inline def set_variableVarargs(value: Element*): Self = StObject.set(x, "_variable", js.Array(value*))
  }
}
