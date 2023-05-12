package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductIndicationOtherTherapy
  extends StObject
     with BackboneElement {
  
  /**
    * Reference to a specific medication (active substance, medicinal product or class of products) as part of an indication or contraindication.
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Reference to a specific medication (active substance, medicinal product or class of products) as part of an indication or contraindication.
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * The type of relationship between the medicinal product indication or contraindication and another therapy.
    */
  var therapyRelationshipType: CodeableConcept
}
object MedicinalProductIndicationOtherTherapy {
  
  inline def apply(therapyRelationshipType: CodeableConcept): MedicinalProductIndicationOtherTherapy = {
    val __obj = js.Dynamic.literal(therapyRelationshipType = therapyRelationshipType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductIndicationOtherTherapy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductIndicationOtherTherapy] (val x: Self) extends AnyVal {
    
    inline def setMedicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setMedicationCodeableConceptUndefined: Self = StObject.set(x, "medicationCodeableConcept", js.undefined)
    
    inline def setMedicationReference(value: Reference): Self = StObject.set(x, "medicationReference", value.asInstanceOf[js.Any])
    
    inline def setMedicationReferenceUndefined: Self = StObject.set(x, "medicationReference", js.undefined)
    
    inline def setTherapyRelationshipType(value: CodeableConcept): Self = StObject.set(x, "therapyRelationshipType", value.asInstanceOf[js.Any])
  }
}
