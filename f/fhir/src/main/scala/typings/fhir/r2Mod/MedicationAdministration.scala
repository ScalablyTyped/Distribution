package typings.fhir.r2Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.stopped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationAdministration
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _effectiveTimeDateTime: js.UndefOr[Element] = js.undefined
  
  var _note: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  var _wasNotGiven: js.UndefOr[Element] = js.undefined
  
  /**
    * The device used in administering the medication to the patient.  For example, a particular infusion pump.
    */
  var device: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
    */
  var dosage: js.UndefOr[MedicationAdministrationDosage] = js.undefined
  
  /**
    * A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
    */
  var effectiveTimeDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * A specific date/time or interval of time during which the administration took place (or did not take place, when the 'notGiven' attribute is true). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
    */
  var effectiveTimePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The visit, admission or other contact between patient and health care provider the medication administration was performed as part of.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
    */
  var medicationCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the medication that was administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
    */
  var medicationReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Extra information about the medication administration that is not conveyed by the other attributes.
    */
  var note: js.UndefOr[String] = js.undefined
  
  /**
    * The person or animal receiving the medication.
    */
  var patient: Reference
  
  /**
    * The individual who was responsible for giving the medication to the patient.
    */
  var practitioner: js.UndefOr[Reference] = js.undefined
  
  /**
    * The original request, instruction or authority to perform the administration.
    */
  var prescription: js.UndefOr[Reference] = js.undefined
  
  /**
    * A code indicating why the medication was given.
    */
  var reasonGiven: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A code indicating why the administration was not performed.
    */
  var reasonNotGiven: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicationAdministration: typings.fhir.fhirStrings.MedicationAdministration
  
  /**
    * Will generally be set to show that the administration has been completed.  For some long running administrations such as infusions it is possible for an administration to be started but not completed or it may be paused while some other process is under way.
    */
  var status: `in-progress` | `on-hold` | completed | `entered-in-error` | stopped
  
  /**
    * Set this to true if the record is saying that the medication was NOT administered.
    */
  var wasNotGiven: js.UndefOr[Boolean] = js.undefined
}
object MedicationAdministration {
  
  inline def apply(patient: Reference, status: `in-progress` | `on-hold` | completed | `entered-in-error` | stopped): MedicationAdministration = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "MedicationAdministration", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationAdministration]
  }
  
  extension [Self <: MedicationAdministration](x: Self) {
    
    inline def setDevice(value: js.Array[Reference]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDeviceVarargs(value: Reference*): Self = StObject.set(x, "device", js.Array(value*))
    
    inline def setDosage(value: MedicationAdministrationDosage): Self = StObject.set(x, "dosage", value.asInstanceOf[js.Any])
    
    inline def setDosageUndefined: Self = StObject.set(x, "dosage", js.undefined)
    
    inline def setEffectiveTimeDateTime(value: String): Self = StObject.set(x, "effectiveTimeDateTime", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTimeDateTimeUndefined: Self = StObject.set(x, "effectiveTimeDateTime", js.undefined)
    
    inline def setEffectiveTimePeriod(value: Period): Self = StObject.set(x, "effectiveTimePeriod", value.asInstanceOf[js.Any])
    
    inline def setEffectiveTimePeriodUndefined: Self = StObject.set(x, "effectiveTimePeriod", js.undefined)
    
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
    
    inline def setPractitioner(value: Reference): Self = StObject.set(x, "practitioner", value.asInstanceOf[js.Any])
    
    inline def setPractitionerUndefined: Self = StObject.set(x, "practitioner", js.undefined)
    
    inline def setPrescription(value: Reference): Self = StObject.set(x, "prescription", value.asInstanceOf[js.Any])
    
    inline def setPrescriptionUndefined: Self = StObject.set(x, "prescription", js.undefined)
    
    inline def setReasonGiven(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonGiven", value.asInstanceOf[js.Any])
    
    inline def setReasonGivenUndefined: Self = StObject.set(x, "reasonGiven", js.undefined)
    
    inline def setReasonGivenVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonGiven", js.Array(value*))
    
    inline def setReasonNotGiven(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonNotGiven", value.asInstanceOf[js.Any])
    
    inline def setReasonNotGivenUndefined: Self = StObject.set(x, "reasonNotGiven", js.undefined)
    
    inline def setReasonNotGivenVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonNotGiven", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicationAdministration): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `in-progress` | `on-hold` | completed | `entered-in-error` | stopped): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setWasNotGiven(value: Boolean): Self = StObject.set(x, "wasNotGiven", value.asInstanceOf[js.Any])
    
    inline def setWasNotGivenUndefined: Self = StObject.set(x, "wasNotGiven", js.undefined)
    
    inline def set_effectiveTimeDateTime(value: Element): Self = StObject.set(x, "_effectiveTimeDateTime", value.asInstanceOf[js.Any])
    
    inline def set_effectiveTimeDateTimeUndefined: Self = StObject.set(x, "_effectiveTimeDateTime", js.undefined)
    
    inline def set_note(value: Element): Self = StObject.set(x, "_note", value.asInstanceOf[js.Any])
    
    inline def set_noteUndefined: Self = StObject.set(x, "_note", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    inline def set_wasNotGiven(value: Element): Self = StObject.set(x, "_wasNotGiven", value.asInstanceOf[js.Any])
    
    inline def set_wasNotGivenUndefined: Self = StObject.set(x, "_wasNotGiven", js.undefined)
  }
}
