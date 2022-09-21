package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureMapGroupRuleDependent
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Name of a rule or group to apply.
    */
  var name: String
  
  /**
    * Parameter to pass to the rule or group.
    */
  var parameter: js.Array[StructureMapGroupRuleTargetParameter]
}
object StructureMapGroupRuleDependent {
  
  inline def apply(name: String, parameter: js.Array[StructureMapGroupRuleTargetParameter]): StructureMapGroupRuleDependent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapGroupRuleDependent]
  }
  
  extension [Self <: StructureMapGroupRuleDependent](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: js.Array[StructureMapGroupRuleTargetParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterVarargs(value: StructureMapGroupRuleTargetParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
