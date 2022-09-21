package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`not-done`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.stopped
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicationAdministration
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _instantiatesCanonical: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _instantiatesUri: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _occurenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _recorded: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A plan that is fulfilled in whole or in part by this MedicationAdministration.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The type of medication administration (for example, drug classification like ATC, where meds would be administered, legal category of the medication).
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The device used in administering the medication to the patient.  For example, a particular infusion pump.
    */
  var device: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
    */
  var dosage: js.UndefOr[MedicationAdministrationDosage] = js.undefined
  
  /**
    * The visit, admission, or other contact between patient and health care provider during which the medication administration was performed.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * This might not include provenances for all versions of the request – only those deemed “relevant” or important. This SHALL NOT include the Provenance associated with this current version of the resource. (If that provenance is deemed to be a “relevant” change, it will need to be added as part of a later update. Until then, it can be queried directly as the Provenance that points to this version using _revinclude All Provenances should have some historical version of this Request as their subject.
    */
  var eventHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A protocol, guideline, orderset, or other definition that was adhered to in whole or in part by this event.
    */
  var instantiatesCanonical: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The URL pointing to an externally maintained protocol, guideline, orderset or other definition that is adhered to in whole or in part by this MedicationAdministration.
    */
  var instantiatesUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If only a code is specified, then it needs to be a code for a specific product. If more information is required, then the use of the medication resource is recommended.  For example, if you require form or lot number, then you must reference the Medication resource.
    */
  var medication: CodeableReference
  
  /**
    * Extra information about the medication administration that is not conveyed by the other attributes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * A specific date/time or interval of time during which the administration took place (or did not take place). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
    */
  var occurenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * A specific date/time or interval of time during which the administration took place (or did not take place). For many administrations, such as swallowing a tablet the use of dateTime is more appropriate.
    */
  var occurencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * A larger event of which this particular event is a component or step.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates who or what performed the medication administration and how they were involved.
    */
  var performer: js.UndefOr[js.Array[MedicationAdministrationPerformer]] = js.undefined
  
  /**
    * A code, Condition or observation that supports why the medication was administered.
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The date the occurrence of the  MedicationAdministration was first captured in the record - potentially significantly after the occurrence of the event.
    */
  var recorded: js.UndefOr[String] = js.undefined
  
  /**
    * This is a reference to the MedicationRequest  where the intent is either order or instance-order.  It should not reference MedicationRequests where the intent is any other value.
    */
  var request: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_MedicationAdministration: typings.fhir.fhirStrings.MedicationAdministration
  
  /**
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: `in-progress` | `not-done` | `on-hold` | completed | `entered-in-error` | stopped | unknown
  
  /**
    * A code indicating why the administration was not performed.
    */
  var statusReason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The person or animal or group receiving the medication.
    */
  var subject: Reference
  
  /**
    * Additional information (for example, patient height and weight) that supports the administration of the medication.  This attribute can be used to provide documentation of specific characteristics of the patient present at the time of administration.  For example, if the dose says "give "x" if the heartrate exceeds "y"", then the heart rate can be included using this attribute.
    */
  var supportingInformation: js.UndefOr[js.Array[Reference]] = js.undefined
}
object MedicationAdministration {
  
  inline def apply(
    medication: CodeableReference,
    status: `in-progress` | `not-done` | `on-hold` | completed | `entered-in-error` | stopped | unknown,
    subject: Reference
  ): MedicationAdministration = {
    val __obj = js.Dynamic.literal(medication = medication.asInstanceOf[js.Any], resourceType = "MedicationAdministration", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicationAdministration]
  }
  
  extension [Self <: MedicationAdministration](x: Self) {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setDevice(value: js.Array[Reference]): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setDeviceVarargs(value: Reference*): Self = StObject.set(x, "device", js.Array(value*))
    
    inline def setDosage(value: MedicationAdministrationDosage): Self = StObject.set(x, "dosage", value.asInstanceOf[js.Any])
    
    inline def setDosageUndefined: Self = StObject.set(x, "dosage", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setEventHistory(value: js.Array[Reference]): Self = StObject.set(x, "eventHistory", value.asInstanceOf[js.Any])
    
    inline def setEventHistoryUndefined: Self = StObject.set(x, "eventHistory", js.undefined)
    
    inline def setEventHistoryVarargs(value: Reference*): Self = StObject.set(x, "eventHistory", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: js.Array[String]): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesCanonicalVarargs(value: String*): Self = StObject.set(x, "instantiatesCanonical", js.Array(value*))
    
    inline def setInstantiatesUri(value: js.Array[String]): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setInstantiatesUriVarargs(value: String*): Self = StObject.set(x, "instantiatesUri", js.Array(value*))
    
    inline def setMedication(value: CodeableReference): Self = StObject.set(x, "medication", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOccurenceDateTime(value: String): Self = StObject.set(x, "occurenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurenceDateTimeUndefined: Self = StObject.set(x, "occurenceDateTime", js.undefined)
    
    inline def setOccurencePeriod(value: Period): Self = StObject.set(x, "occurencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurencePeriodUndefined: Self = StObject.set(x, "occurencePeriod", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPerformer(value: js.Array[MedicationAdministrationPerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: MedicationAdministrationPerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRecorded(value: String): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
    
    inline def setRecordedUndefined: Self = StObject.set(x, "recorded", js.undefined)
    
    inline def setRequest(value: Reference): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.MedicationAdministration): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: `in-progress` | `not-done` | `on-hold` | completed | `entered-in-error` | stopped | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: js.Array[CodeableConcept]): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusReasonVarargs(value: CodeableConcept*): Self = StObject.set(x, "statusReason", js.Array(value*))
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformation(value: js.Array[Reference]): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    inline def setSupportingInformationVarargs(value: Reference*): Self = StObject.set(x, "supportingInformation", js.Array(value*))
    
    inline def set_instantiatesCanonical(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesCanonicalVarargs(value: Element*): Self = StObject.set(x, "_instantiatesCanonical", js.Array(value*))
    
    inline def set_instantiatesUri(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_instantiatesUriVarargs(value: Element*): Self = StObject.set(x, "_instantiatesUri", js.Array(value*))
    
    inline def set_occurenceDateTime(value: Element): Self = StObject.set(x, "_occurenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurenceDateTimeUndefined: Self = StObject.set(x, "_occurenceDateTime", js.undefined)
    
    inline def set_recorded(value: Element): Self = StObject.set(x, "_recorded", value.asInstanceOf[js.Any])
    
    inline def set_recordedUndefined: Self = StObject.set(x, "_recorded", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
