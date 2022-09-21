package typings.fhir.r5Mod

import typings.fhir.fhirStrings.continuous
import typings.fhir.fhirStrings.dichotomous
import typings.fhir.fhirStrings.ordinal
import typings.fhir.fhirStrings.polychotomous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EvidenceStatisticModelCharacteristicVariable
  extends StObject
     with BackboneElement {
  
  var _handling: js.UndefOr[Element] = js.undefined
  
  /**
    * How the variable is classified for use in adjusted analysis.
    */
  var handling: js.UndefOr[continuous | dichotomous | ordinal | polychotomous] = js.undefined
  
  /**
    * Description for grouping of ordinal or polychotomous variables.
    */
  var valueCategory: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Discrete value for grouping of ordinal or polychotomous variables.
    */
  var valueQuantity: js.UndefOr[js.Array[Quantity]] = js.undefined
  
  /**
    * Range of values for grouping of ordinal or polychotomous variables.
    */
  var valueRange: js.UndefOr[js.Array[Range]] = js.undefined
  
  /**
    * Description of the variable.
    */
  var variableDefinition: Reference
}
object EvidenceStatisticModelCharacteristicVariable {
  
  inline def apply(variableDefinition: Reference): EvidenceStatisticModelCharacteristicVariable = {
    val __obj = js.Dynamic.literal(variableDefinition = variableDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvidenceStatisticModelCharacteristicVariable]
  }
  
  extension [Self <: EvidenceStatisticModelCharacteristicVariable](x: Self) {
    
    inline def setHandling(value: continuous | dichotomous | ordinal | polychotomous): Self = StObject.set(x, "handling", value.asInstanceOf[js.Any])
    
    inline def setHandlingUndefined: Self = StObject.set(x, "handling", js.undefined)
    
    inline def setValueCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "valueCategory", value.asInstanceOf[js.Any])
    
    inline def setValueCategoryUndefined: Self = StObject.set(x, "valueCategory", js.undefined)
    
    inline def setValueCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "valueCategory", js.Array(value*))
    
    inline def setValueQuantity(value: js.Array[Quantity]): Self = StObject.set(x, "valueQuantity", value.asInstanceOf[js.Any])
    
    inline def setValueQuantityUndefined: Self = StObject.set(x, "valueQuantity", js.undefined)
    
    inline def setValueQuantityVarargs(value: Quantity*): Self = StObject.set(x, "valueQuantity", js.Array(value*))
    
    inline def setValueRange(value: js.Array[Range]): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
    
    inline def setValueRangeVarargs(value: Range*): Self = StObject.set(x, "valueRange", js.Array(value*))
    
    inline def setVariableDefinition(value: Reference): Self = StObject.set(x, "variableDefinition", value.asInstanceOf[js.Any])
    
    inline def set_handling(value: Element): Self = StObject.set(x, "_handling", value.asInstanceOf[js.Any])
    
    inline def set_handlingUndefined: Self = StObject.set(x, "_handling", js.undefined)
  }
}
