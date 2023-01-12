package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeIndicationGuidelineDosingGuidelineDosage
  extends StObject
     with BackboneElement {
  
  /**
    * Dosage for the medication for the specific guidelines.
    */
  var dosage: js.Array[Dosage]
  
  /**
    * The type or category of dosage for a given medication (for example, prophylaxis, maintenance, therapeutic, etc.).
    */
  var `type`: CodeableConcept
}
object MedicationKnowledgeIndicationGuidelineDosingGuidelineDosage {
  
  inline def apply(dosage: js.Array[Dosage], `type`: CodeableConcept): MedicationKnowledgeIndicationGuidelineDosingGuidelineDosage = {
    val __obj = js.Dynamic.literal(dosage = dosage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeIndicationGuidelineDosingGuidelineDosage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationKnowledgeIndicationGuidelineDosingGuidelineDosage] (val x: Self) extends AnyVal {
    
    inline def setDosage(value: js.Array[Dosage]): Self = StObject.set(x, "dosage", value.asInstanceOf[js.Any])
    
    inline def setDosageVarargs(value: Dosage*): Self = StObject.set(x, "dosage", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
