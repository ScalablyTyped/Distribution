package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionDefinitionPlan
  extends StObject
     with BackboneElement {
  
  /**
    * The actual plan.
    */
  var reference: Reference
  
  /**
    * Use for the plan.
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}
object ConditionDefinitionPlan {
  
  inline def apply(reference: Reference): ConditionDefinitionPlan = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionDefinitionPlan]
  }
  
  extension [Self <: ConditionDefinitionPlan](x: Self) {
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
