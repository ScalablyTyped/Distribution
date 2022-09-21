package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeMedicineClassification
  extends StObject
     with BackboneElement {
  
  /**
    * Specific category assigned to the medication (e.g. anti-infective, anti-hypertensive, antibiotic, etc.).
    */
  var classification: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The type of category for the medication (for example, therapeutic classification, therapeutic sub-classification).
    */
  var `type`: CodeableConcept
}
object MedicationKnowledgeMedicineClassification {
  
  inline def apply(`type`: CodeableConcept): MedicationKnowledgeMedicineClassification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeMedicineClassification]
  }
  
  extension [Self <: MedicationKnowledgeMedicineClassification](x: Self) {
    
    inline def setClassification(value: js.Array[CodeableConcept]): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setClassificationVarargs(value: CodeableConcept*): Self = StObject.set(x, "classification", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
