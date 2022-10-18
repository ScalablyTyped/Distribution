package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationOrderDispenseRequest
  extends StObject
     with BackboneElement {
  
  /**
    * Identifies the period time over which the supplied product is expected to be used, or the length of time the dispense is expected to last.
    */
  var expectedSupplyDuration: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * An integer indicating the number of additional times (aka refills or repeats) the patient can receive the prescribed medication.   Usage Notes: This integer does NOT include the original order dispense.   This means that if an order indicates dispense 30 tablets plus  "3 repeats", then the order can be dispensed a total of 4 times and the patient can receive a total of 120 tablets.
    */
  var numberOfRepeatsAllowed: js.UndefOr[Double] = js.undefined
  
  /**
    * The amount that is to be dispensed for one fill.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Indicates when the Prescription becomes valid, and when it ceases to be a dispensable Prescription.
    */
  var validityPeriod: js.UndefOr[Period] = js.undefined
}
object MedicationOrderDispenseRequest {
  
  inline def apply(): MedicationOrderDispenseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationOrderDispenseRequest]
  }
  
  extension [Self <: MedicationOrderDispenseRequest](x: Self) {
    
    inline def setExpectedSupplyDuration(value: Quantity): Self = StObject.set(x, "expectedSupplyDuration", value.asInstanceOf[js.Any])
    
    inline def setExpectedSupplyDurationUndefined: Self = StObject.set(x, "expectedSupplyDuration", js.undefined)
    
    inline def setMedicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setMedicationCodeableConceptUndefined: Self = StObject.set(x, "medicationCodeableConcept", js.undefined)
    
    inline def setMedicationReference(value: Reference): Self = StObject.set(x, "medicationReference", value.asInstanceOf[js.Any])
    
    inline def setMedicationReferenceUndefined: Self = StObject.set(x, "medicationReference", js.undefined)
    
    inline def setNumberOfRepeatsAllowed(value: Double): Self = StObject.set(x, "numberOfRepeatsAllowed", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRepeatsAllowedUndefined: Self = StObject.set(x, "numberOfRepeatsAllowed", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setValidityPeriod(value: Period): Self = StObject.set(x, "validityPeriod", value.asInstanceOf[js.Any])
    
    inline def setValidityPeriodUndefined: Self = StObject.set(x, "validityPeriod", js.undefined)
  }
}
