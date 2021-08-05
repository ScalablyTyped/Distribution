package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dispensing a medication to a named patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait MedicationDispense
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'notDone'.
    */
  var _notDone: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'whenHandedOver'.
    */
  var _whenHandedOver: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'whenPrepared'.
    */
  var _whenPrepared: js.UndefOr[Element] = js.undefined
  
  /**
    * Medication order that authorizes the dispense
    */
  var authorizingPrescription: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Type of medication dispense
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Encounter / Episode associated with event
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Amount of medication expressed as a timing amount
    */
  var daysSupply: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Where the medication was sent
    */
  var destination: js.UndefOr[Reference] = js.undefined
  
  /**
    * Clinical issue with action
    */
  var detectedIssue: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * How the medication is to be used by the patient or administered by the caregiver
    */
  var dosageInstruction: js.UndefOr[js.Array[Dosage]] = js.undefined
  
  /**
    * A list of releveant lifecycle events
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * External identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * What medication was supplied
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * What medication was supplied
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Whether the dispense was or was not performed
    */
  var notDone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Why a dispense was not performed
    */
  var notDoneReasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Why a dispense was not performed
    */
  var notDoneReasonReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Information about the dispense
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Event that dispense is part of
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Who performed event
    */
  var performer: js.UndefOr[js.Array[MedicationDispensePerformer]] = js.undefined
  
  /**
    * Amount dispensed
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Who collected the medication
    */
  var receiver: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * preparation | in-progress | on-hold | completed | entered-in-error | stopped
    */
  var status: js.UndefOr[code] = js.undefined
  
  /**
    * Who the dispense is for
    */
  var subject: js.UndefOr[Reference] = js.undefined
  
  /**
    * Whether a substitution was performed on the dispense
    */
  var substitution: js.UndefOr[MedicationDispenseSubstitution] = js.undefined
  
  /**
    * Information that supports the dispensing of the medication
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Trial fill, partial fill, emergency fill, etc.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * When product was given out
    */
  var whenHandedOver: js.UndefOr[dateTime] = js.undefined
  
  /**
    * When product was packaged and reviewed
    */
  var whenPrepared: js.UndefOr[dateTime] = js.undefined
}
object MedicationDispense {
  
  inline def apply(): MedicationDispense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationDispense]
  }
  
  extension [Self <: MedicationDispense](x: Self) {
    
    inline def setAuthorizingPrescription(value: js.Array[Reference]): Self = StObject.set(x, "authorizingPrescription", value.asInstanceOf[js.Any])
    
    inline def setAuthorizingPrescriptionUndefined: Self = StObject.set(x, "authorizingPrescription", js.undefined)
    
    inline def setAuthorizingPrescriptionVarargs(value: Reference*): Self = StObject.set(x, "authorizingPrescription", js.Array(value :_*))
    
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
    
    inline def setDetectedIssueVarargs(value: Reference*): Self = StObject.set(x, "detectedIssue", js.Array(value :_*))
    
    inline def setDosageInstruction(value: js.Array[Dosage]): Self = StObject.set(x, "dosageInstruction", value.asInstanceOf[js.Any])
    
    inline def setDosageInstructionUndefined: Self = StObject.set(x, "dosageInstruction", js.undefined)
    
    inline def setDosageInstructionVarargs(value: Dosage*): Self = StObject.set(x, "dosageInstruction", js.Array(value :_*))
    
    inline def setEventHistory(value: js.Array[Reference]): Self = StObject.set(x, "eventHistory", value.asInstanceOf[js.Any])
    
    inline def setEventHistoryUndefined: Self = StObject.set(x, "eventHistory", js.undefined)
    
    inline def setEventHistoryVarargs(value: Reference*): Self = StObject.set(x, "eventHistory", js.Array(value :_*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setMedicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setMedicationCodeableConceptUndefined: Self = StObject.set(x, "medicationCodeableConcept", js.undefined)
    
    inline def setMedicationReference(value: Reference): Self = StObject.set(x, "medicationReference", value.asInstanceOf[js.Any])
    
    inline def setMedicationReferenceUndefined: Self = StObject.set(x, "medicationReference", js.undefined)
    
    inline def setNotDone(value: Boolean): Self = StObject.set(x, "notDone", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReasonCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "notDoneReasonCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReasonCodeableConceptUndefined: Self = StObject.set(x, "notDoneReasonCodeableConcept", js.undefined)
    
    inline def setNotDoneReasonReference(value: Reference): Self = StObject.set(x, "notDoneReasonReference", value.asInstanceOf[js.Any])
    
    inline def setNotDoneReasonReferenceUndefined: Self = StObject.set(x, "notDoneReasonReference", js.undefined)
    
    inline def setNotDoneUndefined: Self = StObject.set(x, "notDone", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    inline def setPerformer(value: js.Array[MedicationDispensePerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: MedicationDispensePerformer*): Self = StObject.set(x, "performer", js.Array(value :_*))
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReceiver(value: js.Array[Reference]): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setReceiverVarargs(value: Reference*): Self = StObject.set(x, "receiver", js.Array(value :_*))
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setSubstitution(value: MedicationDispenseSubstitution): Self = StObject.set(x, "substitution", value.asInstanceOf[js.Any])
    
    inline def setSubstitutionUndefined: Self = StObject.set(x, "substitution", js.undefined)
    
    inline def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    inline def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value :_*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWhenHandedOver(value: dateTime): Self = StObject.set(x, "whenHandedOver", value.asInstanceOf[js.Any])
    
    inline def setWhenHandedOverUndefined: Self = StObject.set(x, "whenHandedOver", js.undefined)
    
    inline def setWhenPrepared(value: dateTime): Self = StObject.set(x, "whenPrepared", value.asInstanceOf[js.Any])
    
    inline def setWhenPreparedUndefined: Self = StObject.set(x, "whenPrepared", js.undefined)
    
    inline def set_notDone(value: Element): Self = StObject.set(x, "_notDone", value.asInstanceOf[js.Any])
    
    inline def set_notDoneUndefined: Self = StObject.set(x, "_notDone", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_whenHandedOver(value: Element): Self = StObject.set(x, "_whenHandedOver", value.asInstanceOf[js.Any])
    
    inline def set_whenHandedOverUndefined: Self = StObject.set(x, "_whenHandedOver", js.undefined)
    
    inline def set_whenPrepared(value: Element): Self = StObject.set(x, "_whenPrepared", value.asInstanceOf[js.Any])
    
    inline def set_whenPreparedUndefined: Self = StObject.set(x, "_whenPrepared", js.undefined)
  }
}
