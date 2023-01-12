package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.intended
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationStatement
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _dateAsserted: js.UndefOr[Element] = js.undefined
  
  var _effectiveDateTime: js.UndefOr[Element] = js.undefined
  
  var _note: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _wasNotTaken: js.UndefOr[Element] = js.undefined
  
  /**
    * The date when the medication statement was asserted by the information source.
    */
  var dateAsserted: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates how the medication is/was used by the patient.
    */
  var dosage: js.UndefOr[js.Array[MedicationStatementDosage]] = js.undefined
  
  /**
    * The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).
    */
  var effectiveDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).
    */
  var effectivePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The person who provided the information about the taking of this medication.
    */
  var informationSource: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Provides extra information about the medication statement that is not conveyed by the other attributes.
    */
  var note: js.UndefOr[String] = js.undefined
  
  /**
    * The person or animal who is/was taking the medication.
    */
  var patient: Reference
  
  /**
    * A reason for why the medication is being/was taken.
    */
  var reasonForUseCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A reason for why the medication is being/was taken.
    */
  var reasonForUseReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A code indicating why the medication was not taken.
    */
  var reasonNotTaken: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicationStatement: typings.fhir.fhirStrings.MedicationStatement
  
  /**
    * A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.
    */
  var status: active | completed | `entered-in-error` | intended
  
  /**
    * Allows linking the MedicationStatement to the underlying MedicationOrder, or to other information that supports the MedicationStatement.
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Set this to true if the record is saying that the medication was NOT taken.
    */
  var wasNotTaken: js.UndefOr[Boolean] = js.undefined
}
object MedicationStatement {
  
  inline def apply(patient: Reference, status: active | completed | `entered-in-error` | intended): MedicationStatement = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "MedicationStatement", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicationStatement] (val x: Self) extends AnyVal {
    
    inline def setDateAsserted(value: String): Self = StObject.set(x, "dateAsserted", value.asInstanceOf[js.Any])
    
    inline def setDateAssertedUndefined: Self = StObject.set(x, "dateAsserted", js.undefined)
    
    inline def setDosage(value: js.Array[MedicationStatementDosage]): Self = StObject.set(x, "dosage", value.asInstanceOf[js.Any])
    
    inline def setDosageUndefined: Self = StObject.set(x, "dosage", js.undefined)
    
    inline def setDosageVarargs(value: MedicationStatementDosage*): Self = StObject.set(x, "dosage", js.Array(value*))
    
    inline def setEffectiveDateTime(value: String): Self = StObject.set(x, "effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDateTimeUndefined: Self = StObject.set(x, "effectiveDateTime", js.undefined)
    
    inline def setEffectivePeriod(value: Period): Self = StObject.set(x, "effectivePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectivePeriodUndefined: Self = StObject.set(x, "effectivePeriod", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInformationSource(value: Reference): Self = StObject.set(x, "informationSource", value.asInstanceOf[js.Any])
    
    inline def setInformationSourceUndefined: Self = StObject.set(x, "informationSource", js.undefined)
    
    inline def setMedicationCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "medicationCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setMedicationCodeableConceptUndefined: Self = StObject.set(x, "medicationCodeableConcept", js.undefined)
    
    inline def setMedicationReference(value: Reference): Self = StObject.set(x, "medicationReference", value.asInstanceOf[js.Any])
    
    inline def setMedicationReferenceUndefined: Self = StObject.set(x, "medicationReference", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setReasonForUseCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "reasonForUseCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setReasonForUseCodeableConceptUndefined: Self = StObject.set(x, "reasonForUseCodeableConcept", js.undefined)
    
    inline def setReasonForUseReference(value: Reference): Self = StObject.set(x, "reasonForUseReference", value.asInstanceOf[js.Any])
    
    inline def setReasonForUseReferenceUndefined: Self = StObject.set(x, "reasonForUseReference", js.undefined)
    
    inline def setReasonNotTaken(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonNotTaken", value.asInstanceOf[js.Any])
    
    inline def setReasonNotTakenUndefined: Self = StObject.set(x, "reasonNotTaken", js.undefined)
    
    inline def setReasonNotTakenVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonNotTaken", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicationStatement): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: active | completed | `entered-in-error` | intended): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    inline def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value*))
    
    inline def setWasNotTaken(value: Boolean): Self = StObject.set(x, "wasNotTaken", value.asInstanceOf[js.Any])
    
    inline def setWasNotTakenUndefined: Self = StObject.set(x, "wasNotTaken", js.undefined)
    
    inline def set_dateAsserted(value: Element): Self = StObject.set(x, "_dateAsserted", value.asInstanceOf[js.Any])
    
    inline def set_dateAssertedUndefined: Self = StObject.set(x, "_dateAsserted", js.undefined)
    
    inline def set_effectiveDateTime(value: Element): Self = StObject.set(x, "_effectiveDateTime", value.asInstanceOf[js.Any])
    
    inline def set_effectiveDateTimeUndefined: Self = StObject.set(x, "_effectiveDateTime", js.undefined)
    
    inline def set_note(value: Element): Self = StObject.set(x, "_note", value.asInstanceOf[js.Any])
    
    inline def set_noteUndefined: Self = StObject.set(x, "_note", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_wasNotTaken(value: Element): Self = StObject.set(x, "_wasNotTaken", value.asInstanceOf[js.Any])
    
    inline def set_wasNotTakenUndefined: Self = StObject.set(x, "_wasNotTaken", js.undefined)
  }
}
