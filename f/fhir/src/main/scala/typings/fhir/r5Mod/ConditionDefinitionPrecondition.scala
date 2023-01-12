package typings.fhir.r5Mod

import typings.fhir.fhirStrings.sensitive
import typings.fhir.fhirStrings.specific
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionDefinitionPrecondition
  extends StObject
     with BackboneElement {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Code for relevant Observation.
    */
  var code: CodeableConcept
  
  /**
    * Kind of pre-condition.
    */
  var `type`: sensitive | specific
  
  /**
    * Value of Observation.
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Value of Observation.
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
}
object ConditionDefinitionPrecondition {
  
  inline def apply(code: CodeableConcept, `type`: sensitive | specific): ConditionDefinitionPrecondition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionDefinitionPrecondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionDefinitionPrecondition] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setType(value: sensitive | specific): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "valueCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setValueCodeableConceptUndefined: Self = StObject.set(x, "valueCodeableConcept", js.undefined)
    
    inline def setValueQuantity(value: Quantity): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
