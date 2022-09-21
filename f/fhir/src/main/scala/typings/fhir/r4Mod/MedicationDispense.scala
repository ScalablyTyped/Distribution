package typings.fhir.r4Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.declined
import typings.fhir.fhirStrings.preparation
import typings.fhir.fhirStrings.stopped
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationDispense
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _whenHandedOver: js.UndefOr[Element] = js.undefined
  
  var _whenPrepared: js.UndefOr[Element] = js.undefined
  
  /**
    * Maps to basedOn in Event logical model.
    */
  var authorizingPrescription: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The category can be used to include where the medication is expected to be consumed or other types of dispenses.  Invariants can be used to bind to different value sets when profiling to bind.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The encounter or episode of care that establishes the context for this event.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * The amount of medication expressed as a timing amount.
    */
  var daysSupply: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Identification of the facility/location where the medication was shipped to, as part of the dispense event.
    */
  var destination: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element can include a detected issue that has been identified either by a decision support system or by a clinician and may include information on the steps that were taken to address the issue.
    */
  var detectedIssue: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * When the dose or rate is intended to change over the entire administration period (e.g. Tapering dose prescriptions), multiple instances of dosage instructions will need to be supplied to convey the different doses/rates.
    * The pharmacist reviews the medication order prior to dispense and updates the dosageInstruction based on the actual product being dispensed.
    */
  var dosageInstruction: js.UndefOr[js.Array[Dosage]] = js.undefined
  
  /**
    * This might not include provenances for all versions of the request – only those deemed “relevant” or important. This SHALL NOT include the Provenance associated with this current version of the resource. (If that provenance is deemed to be a “relevant” change, it will need to be added as part of a later update. Until then, it can be queried directly as the Provenance that points to this version using _revinclude All Provenances should have some historical version of this Request as their subject.).
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The principal physical location where the dispense was performed.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * If only a code is specified, then it needs to be a code for a specific product. If more information is required, then the use of the medication resource is recommended.  For example, if you require form or lot number, then you must reference the Medication resource.
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If only a code is specified, then it needs to be a code for a specific product. If more information is required, then the use of the medication resource is recommended.  For example, if you require form or lot number, then you must reference the Medication resource.
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Extra information about the dispense that could not be conveyed in the other attributes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The procedure that trigger the dispense.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates who or what performed the event.
    */
  var performer: js.UndefOr[js.Array[MedicationDispensePerformer]] = js.undefined
  
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
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: preparation | `in-progress` | cancelled | `on-hold` | completed | `entered-in-error` | stopped | declined | unknown
  
  /**
    * Indicates the reason why a dispense was not performed.
    */
  var statusReasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates the reason why a dispense was not performed.
    */
  var statusReasonReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * SubstanceAdministration->subject->Patient.
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Indicates whether or not substitution was made as part of the dispense.  In some cases, substitution will be expected but does not happen, in other cases substitution is not expected but does happen.  This block explains what substitution did or did not happen and why.  If nothing is specified, substitution was not done.
    */
  var substitution: js.UndefOr[MedicationDispenseSubstitution] = js.undefined
  
  /**
    * Additional information that supports the medication being dispensed.
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
  
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
  
  inline def apply(
    status: preparation | `in-progress` | cancelled | `on-hold` | completed | `entered-in-error` | stopped | declined | unknown
  ): MedicationDispense = {
    val __obj = js.Dynamic.literal(resourceType = "MedicationDispense", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationDispense]
  }
  
  extension [Self <: MedicationDispense](x: Self) {
    
    inline def setAuthorizingPrescription(value: js.Array[Reference]): Self = StObject.set(x, "authorizingPrescription", value.asInstanceOf[js.Any])
    
    inline def setAuthorizingPrescriptionUndefined: Self = StObject.set(x, "authorizingPrescription", js.undefined)
    
    inline def setAuthorizingPrescriptionVarargs(value: Reference*): Self = StObject.set(x, "authorizingPrescription", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDaysSupply(value: Quantity): Self = StObject.set(x, "daysSupply", value.asInstanceOf[js.Any])
    
    inline def setDaysSupplyUndefined: Self = StObject.set(x, "daysSupply", js.undefined)
    
    inline def setDestination(value: Reference): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setDetectedIssue(value: js.Array[Reference]): Self = StObject.set(x, "detectedIssue", value.asInstanceOf[js.Any])
    
    inline def setDetectedIssueUndefined: Self = StObject.set(x, "detectedIssue", js.undefined)
    
    inline def setDetectedIssueVarargs(value: Reference*): Self = StObject.set(x, "detectedIssue", js.Array(value*))
    
    inline def setDosageInstruction(value: js.Array[Dosage]): Self = StObject.set(x, "dosageInstruction", value.asInstanceOf[js.Any])
    
    inline def setDosageInstructionUndefined: Self = StObject.set(x, "dosageInstruction", js.undefined)
    
    inline def setDosageInstructionVarargs(value: Dosage*): Self = StObject.set(x, "dosageInstruction", js.Array(value*))
    
    inline def setEventHistory(value: js.Array[Reference]): Self = StObject.set(x, "eventHistory", value.asInstanceOf[js.Any])
    
    inline def setEventHistoryUndefined: Self = StObject.set(x, "eventHistory", js.undefined)
    
    inline def setEventHistoryVarargs(value: Reference*): Self = StObject.set(x, "eventHistory", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMedicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setMedicationCodeableConceptUndefined: Self = StObject.set(x, "medicationCodeableConcept", js.undefined)
    
    inline def setMedicationReference(value: Reference): Self = StObject.set(x, "medicationReference", value.asInstanceOf[js.Any])
    
    inline def setMedicationReferenceUndefined: Self = StObject.set(x, "medicationReference", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPerformer(value: js.Array[MedicationDispensePerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: MedicationDispensePerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReceiver(value: js.Array[Reference]): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setReceiverVarargs(value: Reference*): Self = StObject.set(x, "receiver", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicationDispense): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: preparation | `in-progress` | cancelled | `on-hold` | completed | `entered-in-error` | stopped | declined | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "statusReasonCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonCodeableConceptUndefined: Self = StObject.set(x, "statusReasonCodeableConcept", js.undefined)
    
    inline def setStatusReasonReference(value: Reference): Self = StObject.set(x, "statusReasonReference", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonReferenceUndefined: Self = StObject.set(x, "statusReasonReference", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubstitution(value: MedicationDispenseSubstitution): Self = StObject.set(x, "substitution", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionUndefined: Self = StObject.set(x, "substitution", js.undefined)
    
    inline def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    inline def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWhenHandedOver(value: String): Self = StObject.set(x, "whenHandedOver", value.asInstanceOf[js.Any])
    
    inline def setWhenHandedOverUndefined: Self = StObject.set(x, "whenHandedOver", js.undefined)
    
    inline def setWhenPrepared(value: String): Self = StObject.set(x, "whenPrepared", value.asInstanceOf[js.Any])
    
    inline def setWhenPreparedUndefined: Self = StObject.set(x, "whenPrepared", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_whenHandedOver(value: Element): Self = StObject.set(x, "_whenHandedOver", value.asInstanceOf[js.Any])
    
    inline def set_whenHandedOverUndefined: Self = StObject.set(x, "_whenHandedOver", js.undefined)
    
    inline def set_whenPrepared(value: Element): Self = StObject.set(x, "_whenPrepared", value.asInstanceOf[js.Any])
    
    inline def set_whenPreparedUndefined: Self = StObject.set(x, "_whenPrepared", js.undefined)
  }
}
