package typings.fhir.mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationDispense
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _note: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _whenHandedOver: js.UndefOr[Element] = js.undefined
  
  var _whenPrepared: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the medication order that is being dispensed against.
    */
  var authorizingPrescription: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The amount of medication expressed as a timing amount.
    */
  var daysSupply: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Identification of the facility/location where the medication was shipped to, as part of the dispense event.
    */
  var destination: js.UndefOr[Reference] = js.undefined
  
  /**
    * The individual responsible for dispensing the medication.
    */
  var dispenser: js.UndefOr[Reference] = js.undefined
  
  /**
    * Indicates how the medication is to be used by the patient.
    */
  var dosageInstruction: js.UndefOr[js.Array[MedicationDispenseDosageInstruction]] = js.undefined
  
  /**
    * Identifier assigned by the dispensing facility - this is an identifier assigned outside FHIR.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Extra information about the dispense that could not be conveyed in the other attributes.
    */
  var note: js.UndefOr[String] = js.undefined
  
  /**
    * A link to a resource representing the person to whom the medication will be given.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * The amount of medication that has been dispensed. Includes unit of measure.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Identifies the person who picked up the medication.  This will usually be a patient or their caregiver, but some cases exist where it can be a healthcare professional.
    */
  var receiver: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicationDispense: typings.fhir.fhirStrings.MedicationDispense
  
  /**
    * A code specifying the state of the set of dispense events.
    */
  var status: js.UndefOr[`in-progress` | `on-hold` | completed | `entered-in-error` | stopped] = js.undefined
  
  /**
    * Indicates whether or not substitution was made as part of the dispense.  In some cases substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.
    */
  var substitution: js.UndefOr[MedicationDispenseSubstitution] = js.undefined
  
  /**
    * Indicates the type of dispensing event that is performed. For example, Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The time the dispensed product was provided to the patient or their representative.
    */
  var whenHandedOver: js.UndefOr[String] = js.undefined
  
  /**
    * The time when the dispensed product was packaged and reviewed.
    */
  var whenPrepared: js.UndefOr[String] = js.undefined
}
object MedicationDispense {
  
  inline def apply(): MedicationDispense = {
    val __obj = js.Dynamic.literal(resourceType = "MedicationDispense")
    __obj.asInstanceOf[MedicationDispense]
  }
  
  extension [Self <: MedicationDispense](x: Self) {
    
    inline def setAuthorizingPrescription(value: js.Array[Reference]): Self = StObject.set(x, "authorizingPrescription", value.asInstanceOf[js.Any])
    
    inline def setAuthorizingPrescriptionUndefined: Self = StObject.set(x, "authorizingPrescription", js.undefined)
    
    inline def setAuthorizingPrescriptionVarargs(value: Reference*): Self = StObject.set(x, "authorizingPrescription", js.Array(value*))
    
    inline def setDaysSupply(value: Quantity): Self = StObject.set(x, "daysSupply", value.asInstanceOf[js.Any])
    
    inline def setDaysSupplyUndefined: Self = StObject.set(x, "daysSupply", js.undefined)
    
    inline def setDestination(value: Reference): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDispenser(value: Reference): Self = StObject.set(x, "dispenser", value.asInstanceOf[js.Any])
    
    inline def setDispenserUndefined: Self = StObject.set(x, "dispenser", js.undefined)
    
    inline def setDosageInstruction(value: js.Array[MedicationDispenseDosageInstruction]): Self = StObject.set(x, "dosageInstruction", value.asInstanceOf[js.Any])
    
    inline def setDosageInstructionUndefined: Self = StObject.set(x, "dosageInstruction", js.undefined)
    
    inline def setDosageInstructionVarargs(value: MedicationDispenseDosageInstruction*): Self = StObject.set(x, "dosageInstruction", js.Array(value*))
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setMedicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setMedicationCodeableConceptUndefined: Self = StObject.set(x, "medicationCodeableConcept", js.undefined)
    
    inline def setMedicationReference(value: Reference): Self = StObject.set(x, "medicationReference", value.asInstanceOf[js.Any])
    
    inline def setMedicationReferenceUndefined: Self = StObject.set(x, "medicationReference", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReceiver(value: js.Array[Reference]): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setReceiverVarargs(value: Reference*): Self = StObject.set(x, "receiver", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicationDispense): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `in-progress` | `on-hold` | completed | `entered-in-error` | stopped): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubstitution(value: MedicationDispenseSubstitution): Self = StObject.set(x, "substitution", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionUndefined: Self = StObject.set(x, "substitution", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWhenHandedOver(value: String): Self = StObject.set(x, "whenHandedOver", value.asInstanceOf[js.Any])
    
    inline def setWhenHandedOverUndefined: Self = StObject.set(x, "whenHandedOver", js.undefined)
    
    inline def setWhenPrepared(value: String): Self = StObject.set(x, "whenPrepared", value.asInstanceOf[js.Any])
    
    inline def setWhenPreparedUndefined: Self = StObject.set(x, "whenPrepared", js.undefined)
    
    inline def set_note(value: Element): Self = StObject.set(x, "_note", value.asInstanceOf[js.Any])
    
    inline def set_noteUndefined: Self = StObject.set(x, "_note", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_whenHandedOver(value: Element): Self = StObject.set(x, "_whenHandedOver", value.asInstanceOf[js.Any])
    
    inline def set_whenHandedOverUndefined: Self = StObject.set(x, "_whenHandedOver", js.undefined)
    
    inline def set_whenPrepared(value: Element): Self = StObject.set(x, "_whenPrepared", value.asInstanceOf[js.Any])
    
    inline def set_whenPreparedUndefined: Self = StObject.set(x, "_whenPrepared", js.undefined)
  }
}
