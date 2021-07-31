package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Administration of medication to a patient
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait MedicationAdministration
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'effectiveDateTime'.
    */
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'notGiven'.
    */
  var _notGiven: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Type of medication usage
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Encounter or Episode of Care administered as part of
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Device used to administer
    */
  var device: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Details of how medication was taken
    */
  var dosage: js.UndefOr[MedicationAdministrationDosage] = js.undefined
  
  /**
    * Start and end time of administration
    */
  var effectiveDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Start and end time of administration
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * A list of events of interest in the lifecycle
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * External identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * What was administered
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * What was administered
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * True if medication not administered
    */
  var notGiven: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the administration
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Part of referenced event
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Who administered substance
    */
  var performer: js.UndefOr[js.Array[MedicationAdministrationPerformer]] = js.undefined
  
  /**
    * Request administration performed against
    */
  var prescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * Reason administration performed
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Reason administration not performed
    */
  var reasonNotGiven: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Condition or Observation that supports why the medication was administered
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * in-progress | on-hold | completed | entered-in-error | stopped | unknown
    */
  var status: code
  
  /**
    * Who received medication
    */
  var subject: Reference
  
  /**
    * Additional information to support administration
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
}
object MedicationAdministration {
  
  @scala.inline
  def apply(status: code, subject: Reference): MedicationAdministration = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationAdministration]
  }
  
  @scala.inline
  implicit class MedicationAdministrationMutableBuilder[Self <: MedicationAdministration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value :_*))
    
    @scala.inline
    def setDevice(value: js.Array[Reference]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setDeviceVarargs(value: Reference*): Self = StObject.set(x, "device", js.Array(value :_*))
    
    @scala.inline
    def setDosage(value: MedicationAdministrationDosage): Self = StObject.set(x, "dosage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDosageUndefined: Self = StObject.set(x, "dosage", js.undefined)
    
    @scala.inline
    def setEffectiveDateTime(value: dateTime): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    @scala.inline
    def setEventHistory(value: js.Array[Reference]): Self = StObject.set(x, "eventHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventHistoryUndefined: Self = StObject.set(x, "eventHistory", js.undefined)
    
    @scala.inline
    def setEventHistoryVarargs(value: Reference*): Self = StObject.set(x, "eventHistory", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setMedicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicationCodeableConceptUndefined: Self = StObject.set(x, "medicationCodeableConcept", js.undefined)
    
    @scala.inline
    def setMedicationReference(value: Reference): Self = StObject.set(x, "medicationReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicationReferenceUndefined: Self = StObject.set(x, "medicationReference", js.undefined)
    
    @scala.inline
    def setNotGiven(value: Boolean): Self = StObject.set(x, "notGiven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotGivenUndefined: Self = StObject.set(x, "notGiven", js.undefined)
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    @scala.inline
    def setPerformer(value: js.Array[MedicationAdministrationPerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    @scala.inline
    def setPerformerVarargs(value: MedicationAdministrationPerformer*): Self = StObject.set(x, "performer", js.Array(value :_*))
    
    @scala.inline
    def setPrescription(value: Reference): Self = StObject.set(x, "prescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrescriptionUndefined: Self = StObject.set(x, "prescription", js.undefined)
    
    @scala.inline
    def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    @scala.inline
    def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value :_*))
    
    @scala.inline
    def setReasonNotGiven(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonNotGiven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonNotGivenUndefined: Self = StObject.set(x, "reasonNotGiven", js.undefined)
    
    @scala.inline
    def setReasonNotGivenVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonNotGiven", js.Array(value :_*))
    
    @scala.inline
    def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    @scala.inline
    def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    @scala.inline
    def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value :_*))
    
    @scala.inline
    def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    @scala.inline
    def set_notGiven(value: Element): Self = StObject.set(x, "_notGiven", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_notGivenUndefined: Self = StObject.set(x, "_notGiven", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
