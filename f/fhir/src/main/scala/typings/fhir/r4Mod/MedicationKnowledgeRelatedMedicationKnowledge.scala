package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationKnowledgeRelatedMedicationKnowledge
  extends StObject
     with BackboneElement {
  
  /**
    * Associated documentation about the associated medication knowledge.
    */
  var reference: js.Array[Reference]
  
  /**
    * The category of the associated medication knowledge reference.
    */
  var `type`: CodeableConcept
}
object MedicationKnowledgeRelatedMedicationKnowledge {
  
  inline def apply(reference: js.Array[Reference], `type`: CodeableConcept): MedicationKnowledgeRelatedMedicationKnowledge = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationKnowledgeRelatedMedicationKnowledge]
  }
  
  extension [Self <: MedicationKnowledgeRelatedMedicationKnowledge](x: Self) {
    
    inline def setReference(value: js.Array[Reference]): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceVarargs(value: Reference*): Self = StObject.set(x, "reference", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
