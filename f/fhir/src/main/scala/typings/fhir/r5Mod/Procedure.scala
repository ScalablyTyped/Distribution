package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`not-done`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.preparation
import typings.fhir.fhirStrings.stopped
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Procedure
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _instantiatesCanonical: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _instantiatesUri: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _occurrenceString: js.UndefOr[Element] = js.undefined
  
  var _recorded: js.UndefOr[Element] = js.undefined
  
  var _reportedBoolean: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * A reference to a resource that contains details of the request for this procedure.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If the use case requires attributes from the BodySite resource (e.g. to identify and track separately) then use the standard extension [procedure-targetbodystructure](extension-procedure-targetbodystructure.html).
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * A code that classifies the procedure for searching, sorting and display purposes (e.g. "Surgical Procedure").
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * The specific procedure that is performed. Use text if the exact nature of the procedure cannot be coded (e.g. "Laparoscopic Appendectomy").
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If complications are only expressed by the narrative text, they can be captured using the CodeableConcept.text.
    */
  var complication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Any complications that occurred during the procedure, or in the immediate post-performance period.
    */
  var complicationDetail: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This will typically be the encounter the event occurred within, but some activities may be initiated prior to or after the official completion of an encounter but still be tied to the context of the encounter.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * A device that is implanted, removed or otherwise manipulated (calibration, battery replacement, fitting a prosthesis, attaching a wound-vac, etc.) as a focal portion of the Procedure.
    */
  var focalDevice: js.UndefOr[js.Array[ProcedureFocalDevice]] = js.undefined
  
  /**
    * If the procedure required specific follow up - e.g. removal of sutures. The follow up may be represented as a simple note or could potentially be more complex, in which case the CarePlan resource can be used.
    */
  var followUp: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and Person resource instances might share the same social insurance number.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The URL pointing to a FHIR-defined protocol, guideline, order set or other definition that is adhered to in whole or in part by this Procedure.
    */
  var instantiatesCanonical: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This might be an HTML page, PDF, etc. or could just be a non-resolvable URI identifier.
    */
  var instantiatesUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The location where the procedure actually happened.  E.g. a newborn at home, a tracheostomy at a restaurant.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Any other notes and comments about the procedure.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * This indicates when the procedure actually occurred or is occurring, not when it was asked/requested/ordered to occur. For the latter, look at the occurence element of the Request this Procedure is "basedOn". The status code allows differentiation of whether the timing reflects a historic event or an ongoing event. Ongoing events should not include an upper bound in the Period or Timing.bounds.
    * Age is generally used when the patient reports an age at which the procedure was performed. Range is generally used when the patient reports an age range when the procedure was performed, such as sometime between 20-25 years old.  dateTime supports a range of precision due to some procedures being reported as past procedures that might not have millisecond precision while other procedures performed and documented during the encounter might have more precise UTC timestamps with timezone.
    */
  var occurrenceAge: js.UndefOr[Age] = js.undefined
  
  /**
    * This indicates when the procedure actually occurred or is occurring, not when it was asked/requested/ordered to occur. For the latter, look at the occurence element of the Request this Procedure is "basedOn". The status code allows differentiation of whether the timing reflects a historic event or an ongoing event. Ongoing events should not include an upper bound in the Period or Timing.bounds.
    * Age is generally used when the patient reports an age at which the procedure was performed. Range is generally used when the patient reports an age range when the procedure was performed, such as sometime between 20-25 years old.  dateTime supports a range of precision due to some procedures being reported as past procedures that might not have millisecond precision while other procedures performed and documented during the encounter might have more precise UTC timestamps with timezone.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * This indicates when the procedure actually occurred or is occurring, not when it was asked/requested/ordered to occur. For the latter, look at the occurence element of the Request this Procedure is "basedOn". The status code allows differentiation of whether the timing reflects a historic event or an ongoing event. Ongoing events should not include an upper bound in the Period or Timing.bounds.
    * Age is generally used when the patient reports an age at which the procedure was performed. Range is generally used when the patient reports an age range when the procedure was performed, such as sometime between 20-25 years old.  dateTime supports a range of precision due to some procedures being reported as past procedures that might not have millisecond precision while other procedures performed and documented during the encounter might have more precise UTC timestamps with timezone.
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * This indicates when the procedure actually occurred or is occurring, not when it was asked/requested/ordered to occur. For the latter, look at the occurence element of the Request this Procedure is "basedOn". The status code allows differentiation of whether the timing reflects a historic event or an ongoing event. Ongoing events should not include an upper bound in the Period or Timing.bounds.
    * Age is generally used when the patient reports an age at which the procedure was performed. Range is generally used when the patient reports an age range when the procedure was performed, such as sometime between 20-25 years old.  dateTime supports a range of precision due to some procedures being reported as past procedures that might not have millisecond precision while other procedures performed and documented during the encounter might have more precise UTC timestamps with timezone.
    */
  var occurrenceRange: js.UndefOr[Range] = js.undefined
  
  /**
    * This indicates when the procedure actually occurred or is occurring, not when it was asked/requested/ordered to occur. For the latter, look at the occurence element of the Request this Procedure is "basedOn". The status code allows differentiation of whether the timing reflects a historic event or an ongoing event. Ongoing events should not include an upper bound in the Period or Timing.bounds.
    * Age is generally used when the patient reports an age at which the procedure was performed. Range is generally used when the patient reports an age range when the procedure was performed, such as sometime between 20-25 years old.  dateTime supports a range of precision due to some procedures being reported as past procedures that might not have millisecond precision while other procedures performed and documented during the encounter might have more precise UTC timestamps with timezone.
    */
  var occurrenceString: js.UndefOr[String] = js.undefined
  
  /**
    * This indicates when the procedure actually occurred or is occurring, not when it was asked/requested/ordered to occur. For the latter, look at the occurence element of the Request this Procedure is "basedOn". The status code allows differentiation of whether the timing reflects a historic event or an ongoing event. Ongoing events should not include an upper bound in the Period or Timing.bounds.
    * Age is generally used when the patient reports an age at which the procedure was performed. Range is generally used when the patient reports an age range when the procedure was performed, such as sometime between 20-25 years old.  dateTime supports a range of precision due to some procedures being reported as past procedures that might not have millisecond precision while other procedures performed and documented during the encounter might have more precise UTC timestamps with timezone.
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * If outcome contains narrative text only, it can be captured using the CodeableConcept.text.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The MedicationAdministration resource has a partOf reference to Procedure, but this is not a circular reference.   For example, the anesthesia MedicationAdministration is part of the surgical Procedure (MedicationAdministration.partOf = Procedure).  For example, the procedure to insert the IV port for an IV medication administration is part of the medication administration (Procedure.partOf = MedicationAdministration).
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Limited to "real" people rather than equipment.
    */
  var performer: js.UndefOr[js.Array[ProcedurePerformer]] = js.undefined
  
  /**
    * Use Procedure.reason.concept when a code sufficiently describes the reason.  Use Procedure.reason.reference when referencing a resource, which allows more information to be conveyed, such as onset date. Procedure.reason.concept and Procedure.reason.reference are not meant to be duplicative.  For a single reason, either Procedure.reason.concept or Procedure.reason.reference can be used.  Procedure.reason.concept may be a summary code, or Procedure.reason.reference may be used to reference a very precise definition of the reason using Condition | Observation | Procedure | DiagnosticReport | DocumentReference.  Both Procedure.reason.concept and Procedure.reason.reference can be used if they are describing different reasons for the procedure.
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * The date the occurrence of the procedure was first captured in the record regardless of Procedure.status (potentially after the occurrence of the event).
    */
  var recorded: js.UndefOr[String] = js.undefined
  
  /**
    * Individual who recorded the record and takes responsibility for its content.
    */
  var recorder: js.UndefOr[Reference] = js.undefined
  
  /**
    * There could potentially be multiple reports - e.g. if this was a procedure which took multiple biopsies resulting in a number of anatomical pathology reports.
    */
  var report: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record.  It may also indicate the source of the report.
    */
  var reportedBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if this record was captured as a secondary 'reported' record rather than as an original primary source-of-truth record.  It may also indicate the source of the report.
    */
  var reportedReference: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Procedure: typings.fhir.fhirStrings.Procedure
  
  /**
    * The "unknown" code is not to be used to convey other statuses.  The "unknown" code should be used when one of the statuses applies, but the authoring system doesn't know the current state of the procedure.
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: preparation | `in-progress` | `not-done` | `on-hold` | stopped | completed | `entered-in-error` | unknown
  
  /**
    * This is generally only used for "exception" statuses such as "not-done", "suspended" or "aborted". The reason for performing the event at all is captured in reasonCode, not here.
    */
  var statusReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * On whom or what the procedure was performed. This is usually an individual human, but can also be performed on animals, groups of humans or animals, organizations or practitioners (for licensing), locations or devices (for safety inspections or regulatory authorizations).
    */
  var subject: Reference
  
  /**
    * Other resources from the patient record that may be relevant to the procedure.  The information from these resources was either used to create the instance or is provided to help with its interpretation. This extension should not be used if more specific inline elements or extensions are available.
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * For devices actually implanted or removed, use Procedure.device.
    */
  var used: js.UndefOr[js.Array[CodeableReference]] = js.undefined
}
object Procedure {
  
  inline def apply(
    status: preparation | `in-progress` | `not-done` | `on-hold` | stopped | completed | `entered-in-error` | unknown,
    subject: Reference
  ): Procedure = {
    val __obj = js.Dynamic.literal(resourceType = "Procedure", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
  
  extension [Self <: Procedure](x: Self) {
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value*))
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setComplication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "complication", value.asInstanceOf[js.Any])
    
    inline def setComplicationDetail(value: js.Array[Reference]): Self = StObject.set(x, "complicationDetail", value.asInstanceOf[js.Any])
    
    inline def setComplicationDetailUndefined: Self = StObject.set(x, "complicationDetail", js.undefined)
    
    inline def setComplicationDetailVarargs(value: Reference*): Self = StObject.set(x, "complicationDetail", js.Array(value*))
    
    inline def setComplicationUndefined: Self = StObject.set(x, "complication", js.undefined)
    
    inline def setComplicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "complication", js.Array(value*))
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setFocalDevice(value: js.Array[ProcedureFocalDevice]): Self = StObject.set(x, "focalDevice", value.asInstanceOf[js.Any])
    
    inline def setFocalDeviceUndefined: Self = StObject.set(x, "focalDevice", js.undefined)
    
    inline def setFocalDeviceVarargs(value: ProcedureFocalDevice*): Self = StObject.set(x, "focalDevice", js.Array(value*))
    
    inline def setFollowUp(value: js.Array[CodeableConcept]): Self = StObject.set(x, "followUp", value.asInstanceOf[js.Any])
    
    inline def setFollowUpUndefined: Self = StObject.set(x, "followUp", js.undefined)
    
    inline def setFollowUpVarargs(value: CodeableConcept*): Self = StObject.set(x, "followUp", js.Array(value*))
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: js.Array[String]): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesCanonicalVarargs(value: String*): Self = StObject.set(x, "instantiatesCanonical", js.Array(value*))
    
    inline def setInstantiatesUri(value: js.Array[String]): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setInstantiatesUriVarargs(value: String*): Self = StObject.set(x, "instantiatesUri", js.Array(value*))
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOccurrenceAge(value: Age): Self = StObject.set(x, "occurrenceAge", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceAgeUndefined: Self = StObject.set(x, "occurrenceAge", js.undefined)
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOccurrenceRange(value: Range): Self = StObject.set(x, "occurrenceRange", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceRangeUndefined: Self = StObject.set(x, "occurrenceRange", js.undefined)
    
    inline def setOccurrenceString(value: String): Self = StObject.set(x, "occurrenceString", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceStringUndefined: Self = StObject.set(x, "occurrenceString", js.undefined)
    
    inline def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPerformer(value: js.Array[ProcedurePerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: ProcedurePerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRecorded(value: String): Self = StObject.set(x, "recorded", value.asInstanceOf[js.Any])
    
    inline def setRecordedUndefined: Self = StObject.set(x, "recorded", js.undefined)
    
    inline def setRecorder(value: Reference): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
    
    inline def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
    
    inline def setReport(value: js.Array[Reference]): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setReportVarargs(value: Reference*): Self = StObject.set(x, "report", js.Array(value*))
    
    inline def setReportedBoolean(value: Boolean): Self = StObject.set(x, "reportedBoolean", value.asInstanceOf[js.Any])
    
    inline def setReportedBooleanUndefined: Self = StObject.set(x, "reportedBoolean", js.undefined)
    
    inline def setReportedReference(value: Reference): Self = StObject.set(x, "reportedReference", value.asInstanceOf[js.Any])
    
    inline def setReportedReferenceUndefined: Self = StObject.set(x, "reportedReference", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Procedure): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: preparation | `in-progress` | `not-done` | `on-hold` | stopped | completed | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: CodeableConcept): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfo(value: js.Array[Reference]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    inline def setSupportingInfoVarargs(value: Reference*): Self = StObject.set(x, "supportingInfo", js.Array(value*))
    
    inline def setUsed(value: js.Array[CodeableReference]): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    
    inline def setUsedUndefined: Self = StObject.set(x, "used", js.undefined)
    
    inline def setUsedVarargs(value: CodeableReference*): Self = StObject.set(x, "used", js.Array(value*))
    
    inline def set_instantiatesCanonical(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesCanonicalVarargs(value: Element*): Self = StObject.set(x, "_instantiatesCanonical", js.Array(value*))
    
    inline def set_instantiatesUri(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_instantiatesUriVarargs(value: Element*): Self = StObject.set(x, "_instantiatesUri", js.Array(value*))
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_occurrenceString(value: Element): Self = StObject.set(x, "_occurrenceString", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceStringUndefined: Self = StObject.set(x, "_occurrenceString", js.undefined)
    
    inline def set_recorded(value: Element): Self = StObject.set(x, "_recorded", value.asInstanceOf[js.Any])
    
    inline def set_recordedUndefined: Self = StObject.set(x, "_recorded", js.undefined)
    
    inline def set_reportedBoolean(value: Element): Self = StObject.set(x, "_reportedBoolean", value.asInstanceOf[js.Any])
    
    inline def set_reportedBooleanUndefined: Self = StObject.set(x, "_reportedBoolean", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
