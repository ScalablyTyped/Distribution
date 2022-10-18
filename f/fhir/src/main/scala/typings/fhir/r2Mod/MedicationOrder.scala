package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationOrder
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dateEnded: js.UndefOr[Element] = js.undefined
  
  var _dateWritten: js.UndefOr[Element] = js.undefined
  
  var _note: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The date (and perhaps time) when the prescription was stopped.
    */
  var dateEnded: js.UndefOr[String] = js.undefined
  
  /**
    * The date (and perhaps time) when the prescription was written.
    */
  var dateWritten: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the specific details for the dispense or medication supply part of a medication order (also known as a Medication Prescription).  Note that this information is NOT always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system support for completing the dispense details in the pharmacy department.
    */
  var dispenseRequest: js.UndefOr[MedicationOrderDispenseRequest] = js.undefined
  
  /**
    * Indicates how the medication is to be used by the patient.
    */
  var dosageInstruction: js.UndefOr[js.Array[MedicationOrderDosageInstruction]] = js.undefined
  
  /**
    * A link to a resource that identifies the particular occurrence of contact between patient and health care provider.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * External identifier - one that would be used by another non-FHIR system - for example a re-imbursement system might issue its own id for each prescription that is created.  This is particularly important where FHIR only provides part of an entire workflow process where records have to be tracked through an entire system.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the medication being administered. This is a link to a resource that represents the medication which may be the details of the medication or simply an attribute carrying a code that identifies the medication from a known list of medications.
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Extra information about the prescription that could not be conveyed by the other attributes.
    */
  var note: js.UndefOr[String] = js.undefined
  
  /**
    * A link to a resource representing the person to whom the medication will be given.
    */
  var patient: js.UndefOr[Reference] = js.undefined
  
  /**
    * The healthcare professional responsible for authorizing the prescription.
    */
  var prescriber: js.UndefOr[Reference] = js.undefined
  
  /**
    * A link to a resource representing an earlier order or prescription that this order supersedes.
    */
  var priorPrescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * Can be the reason or the indication for writing the prescription.
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The reason why the prescription was stopped, if it was.
    */
  var reasonEnded: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Can be the reason or the indication for writing the prescription.
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicationOrder: typings.fhir.fhirStrings.MedicationOrder
  
  /**
    * A code specifying the state of the order.  Generally this will be active or completed state.
    */
  var status: js.UndefOr[active | `on-hold` | completed | `entered-in-error` | stopped | draft] = js.undefined
  
  /**
    * Indicates whether or not substitution can or should be part of the dispense. In some cases substitution must happen, in other cases substitution must not happen, and in others it does not matter. This block explains the prescriber's intent. If nothing is specified substitution may be done.
    */
  var substitution: js.UndefOr[MedicationOrderSubstitution] = js.undefined
}
object MedicationOrder {
  
  inline def apply(): MedicationOrder = {
    val __obj = js.Dynamic.literal(resourceType = "MedicationOrder")
    __obj.asInstanceOf[MedicationOrder]
  }
  
  extension [Self <: MedicationOrder](x: Self) {
    
    inline def setDateEnded(value: String): Self = StObject.set(x, "dateEnded", value.asInstanceOf[js.Any])
    
    inline def setDateEndedUndefined: Self = StObject.set(x, "dateEnded", js.undefined)
    
    inline def setDateWritten(value: String): Self = StObject.set(x, "dateWritten", value.asInstanceOf[js.Any])
    
    inline def setDateWrittenUndefined: Self = StObject.set(x, "dateWritten", js.undefined)
    
    inline def setDispenseRequest(value: MedicationOrderDispenseRequest): Self = StObject.set(x, "dispenseRequest", value.asInstanceOf[js.Any])
    
    inline def setDispenseRequestUndefined: Self = StObject.set(x, "dispenseRequest", js.undefined)
    
    inline def setDosageInstruction(value: js.Array[MedicationOrderDosageInstruction]): Self = StObject.set(x, "dosageInstruction", value.asInstanceOf[js.Any])
    
    inline def setDosageInstructionUndefined: Self = StObject.set(x, "dosageInstruction", js.undefined)
    
    inline def setDosageInstructionVarargs(value: MedicationOrderDosageInstruction*): Self = StObject.set(x, "dosageInstruction", js.Array(value*))
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMedicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setMedicationCodeableConceptUndefined: Self = StObject.set(x, "medicationCodeableConcept", js.undefined)
    
    inline def setMedicationReference(value: Reference): Self = StObject.set(x, "medicationReference", value.asInstanceOf[js.Any])
    
    inline def setMedicationReferenceUndefined: Self = StObject.set(x, "medicationReference", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPatientUndefined: Self = StObject.set(x, "patient", js.undefined)
    
    inline def setPrescriber(value: Reference): Self = StObject.set(x, "prescriber", value.asInstanceOf[js.Any])
    
    inline def setPrescriberUndefined: Self = StObject.set(x, "prescriber", js.undefined)
    
    inline def setPriorPrescription(value: Reference): Self = StObject.set(x, "priorPrescription", value.asInstanceOf[js.Any])
    
    inline def setPriorPrescriptionUndefined: Self = StObject.set(x, "priorPrescription", js.undefined)
    
    inline def setReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeableConceptUndefined: Self = StObject.set(x, "reasonCodeableConcept", js.undefined)
    
    inline def setReasonEnded(value: CodeableConcept): Self = StObject.set(x, "reasonEnded", value.asInstanceOf[js.Any])
    
    inline def setReasonEndedUndefined: Self = StObject.set(x, "reasonEnded", js.undefined)
    
    inline def setReasonReference(value: Reference): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicationOrder): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | `on-hold` | completed | `entered-in-error` | stopped | draft): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubstitution(value: MedicationOrderSubstitution): Self = StObject.set(x, "substitution", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionUndefined: Self = StObject.set(x, "substitution", js.undefined)
    
    inline def set_dateEnded(value: Element): Self = StObject.set(x, "_dateEnded", value.asInstanceOf[js.Any])
    
    inline def set_dateEndedUndefined: Self = StObject.set(x, "_dateEnded", js.undefined)
    
    inline def set_dateWritten(value: Element): Self = StObject.set(x, "_dateWritten", value.asInstanceOf[js.Any])
    
    inline def set_dateWrittenUndefined: Self = StObject.set(x, "_dateWritten", js.undefined)
    
    inline def set_note(value: Element): Self = StObject.set(x, "_note", value.asInstanceOf[js.Any])
    
    inline def set_noteUndefined: Self = StObject.set(x, "_note", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
