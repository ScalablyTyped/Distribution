package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics
  extends StObject
     with BackboneElement {
  
  var _value: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Specific characteristic that is relevant to the administration guideline (e.g. height, weight, gender).
    */
  var characteristicCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Specific characteristic that is relevant to the administration guideline (e.g. height, weight, gender).
    */
  var characteristicQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The specific characteristic (e.g. height, weight, gender, etc.).
    */
  var value: js.UndefOr[js.Array[String]] = js.undefined
}
object MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics {
  
  inline def apply(): MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics] (val x: Self) extends AnyVal {
    
    inline def setCharacteristicCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "characteristicCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicCodeableConceptUndefined: Self = StObject.set(x, "characteristicCodeableConcept", js.undefined)
    
    inline def setCharacteristicQuantity(value: Quantity): Self = StObject.set(x, "characteristicQuantity", value.asInstanceOf[js.Any])
    
    inline def setCharacteristicQuantityUndefined: Self = StObject.set(x, "characteristicQuantity", js.undefined)
    
    inline def setValue(value: js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def set_value(value: js.Array[Element]): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    
    inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
    
    inline def set_valueVarargs(value: Element*): Self = StObject.set(x, "_value", js.Array(value*))
  }
}
