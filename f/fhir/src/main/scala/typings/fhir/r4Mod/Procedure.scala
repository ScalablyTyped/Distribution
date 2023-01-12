package typings.fhir.r4Mod

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
  
  var _performedDateTime: js.UndefOr[Element] = js.undefined
  
  var _performedString: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Individual who is making the procedure statement.
    */
  var asserter: js.UndefOr[Reference] = js.undefined
  
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
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
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
    * If outcome contains narrative text only, it can be captured using the CodeableConcept.text.
    */
  var outcome: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The MedicationAdministration resource has a partOf reference to Procedure, but this is not a circular reference.   For example, the anesthesia MedicationAdministration is part of the surgical Procedure (MedicationAdministration.partOf = Procedure).  For example, the procedure to insert the IV port for an IV medication administration is part of the medication administration (Procedure.partOf = MedicationAdministration).
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the procedure was performed. Range is generally used when the patient reports an age range when the procedure was performed, such as sometime between 20-25 years old.  dateTime supports a range of precision due to some procedures being reported as past procedures that might not have millisecond precision while other procedures performed and documented during the encounter might have more precise UTC timestamps with timezone.
    */
  var performedAge: js.UndefOr[Age] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the procedure was performed. Range is generally used when the patient reports an age range when the procedure was performed, such as sometime between 20-25 years old.  dateTime supports a range of precision due to some procedures being reported as past procedures that might not have millisecond precision while other procedures performed and documented during the encounter might have more precise UTC timestamps with timezone.
    */
  var performedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the procedure was performed. Range is generally used when the patient reports an age range when the procedure was performed, such as sometime between 20-25 years old.  dateTime supports a range of precision due to some procedures being reported as past procedures that might not have millisecond precision while other procedures performed and documented during the encounter might have more precise UTC timestamps with timezone.
    */
  var performedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the procedure was performed. Range is generally used when the patient reports an age range when the procedure was performed, such as sometime between 20-25 years old.  dateTime supports a range of precision due to some procedures being reported as past procedures that might not have millisecond precision while other procedures performed and documented during the encounter might have more precise UTC timestamps with timezone.
    */
  var performedRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Age is generally used when the patient reports an age at which the procedure was performed. Range is generally used when the patient reports an age range when the procedure was performed, such as sometime between 20-25 years old.  dateTime supports a range of precision due to some procedures being reported as past procedures that might not have millisecond precision while other procedures performed and documented during the encounter might have more precise UTC timestamps with timezone.
    */
  var performedString: js.UndefOr[String] = js.undefined
  
  /**
    * Limited to "real" people rather than equipment.
    */
  var performer: js.UndefOr[js.Array[ProcedurePerformer]] = js.undefined
  
  /**
    * Use Procedure.reasonCode when a code sufficiently describes the reason.  Use Procedure.reasonReference when referencing a resource, which allows more information to be conveyed, such as onset date. Procedure.reasonCode and Procedure.reasonReference are not meant to be duplicative.  For a single reason, either Procedure.reasonCode or Procedure.reasonReference can be used.  Procedure.reasonCode may be a summary code, or Procedure.reasonReference may be used to reference a very precise definition of the reason using Condition | Observation | Procedure | DiagnosticReport | DocumentReference.  Both Procedure.reasonCode and Procedure.reasonReference can be used if they are describing different reasons for the procedure.
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * It is possible for a procedure to be a reason (such as C-Section) for another procedure (such as an epidural). Other examples include endoscopy for dilatation and biopsy (a combination of diagnostic and therapeutic use).
    * Use Procedure.reasonCode when a code sufficiently describes the reason.  Use Procedure.reasonReference when referencing a resource, which allows more information to be conveyed, such as onset date. Procedure.reasonCode and Procedure.reasonReference are not meant to be duplicative.  For a single reason, either Procedure.reasonCode or Procedure.reasonReference can be used.  Procedure.reasonCode may be a summary code, or Procedure.reasonReference may be used to reference a very precise definition of the reason using Condition | Observation | Procedure | DiagnosticReport | DocumentReference.  Both Procedure.reasonCode and Procedure.reasonReference can be used if they are describing different reasons for the procedure.
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Individual who recorded the record and takes responsibility for its content.
    */
  var recorder: js.UndefOr[Reference] = js.undefined
  
  /**
    * There could potentially be multiple reports - e.g. if this was a procedure which took multiple biopsies resulting in a number of anatomical pathology reports.
    */
  var report: js.UndefOr[js.Array[Reference]] = js.undefined
  
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
    * The person, animal or group on which the procedure was performed.
    */
  var subject: Reference
  
  /**
    * For devices actually implanted or removed, use Procedure.device.
    */
  var usedCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * For devices actually implanted or removed, use Procedure.device.
    */
  var usedReference: js.UndefOr[js.Array[Reference]] = js.undefined
}
object Procedure {
  
  inline def apply(
    status: preparation | `in-progress` | `not-done` | `on-hold` | stopped | completed | `entered-in-error` | unknown,
    subject: Reference
  ): Procedure = {
    val __obj = js.Dynamic.literal(resourceType = "Procedure", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Procedure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Procedure] (val x: Self) extends AnyVal {
    
    inline def setAsserter(value: Reference): Self = StObject.set(x, "asserter", value.asInstanceOf[js.Any])
    
    inline def setAsserterUndefined: Self = StObject.set(x, "asserter", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setBodySite(value: js.Array[CodeableConcept]): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setBodySiteVarargs(value: CodeableConcept*): Self = StObject.set(x, "bodySite", js.Array(value*))
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
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
    
    inline def setOutcome(value: CodeableConcept): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPerformedAge(value: Age): Self = StObject.set(x, "performedAge", value.asInstanceOf[js.Any])
    
    inline def setPerformedAgeUndefined: Self = StObject.set(x, "performedAge", js.undefined)
    
    inline def setPerformedDateTime(value: String): Self = StObject.set(x, "performedDateTime", value.asInstanceOf[js.Any])
    
    inline def setPerformedDateTimeUndefined: Self = StObject.set(x, "performedDateTime", js.undefined)
    
    inline def setPerformedPeriod(value: Period): Self = StObject.set(x, "performedPeriod", value.asInstanceOf[js.Any])
    
    inline def setPerformedPeriodUndefined: Self = StObject.set(x, "performedPeriod", js.undefined)
    
    inline def setPerformedRange(value: Range): Self = StObject.set(x, "performedRange", value.asInstanceOf[js.Any])
    
    inline def setPerformedRangeUndefined: Self = StObject.set(x, "performedRange", js.undefined)
    
    inline def setPerformedString(value: String): Self = StObject.set(x, "performedString", value.asInstanceOf[js.Any])
    
    inline def setPerformedStringUndefined: Self = StObject.set(x, "performedString", js.undefined)
    
    inline def setPerformer(value: js.Array[ProcedurePerformer]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: ProcedurePerformer*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value*))
    
    inline def setRecorder(value: Reference): Self = StObject.set(x, "recorder", value.asInstanceOf[js.Any])
    
    inline def setRecorderUndefined: Self = StObject.set(x, "recorder", js.undefined)
    
    inline def setReport(value: js.Array[Reference]): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setReportUndefined: Self = StObject.set(x, "report", js.undefined)
    
    inline def setReportVarargs(value: Reference*): Self = StObject.set(x, "report", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Procedure): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setStatus(
      value: preparation | `in-progress` | `not-done` | `on-hold` | stopped | completed | `entered-in-error` | unknown
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: CodeableConcept): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setUsedCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "usedCode", value.asInstanceOf[js.Any])
    
    inline def setUsedCodeUndefined: Self = StObject.set(x, "usedCode", js.undefined)
    
    inline def setUsedCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "usedCode", js.Array(value*))
    
    inline def setUsedReference(value: js.Array[Reference]): Self = StObject.set(x, "usedReference", value.asInstanceOf[js.Any])
    
    inline def setUsedReferenceUndefined: Self = StObject.set(x, "usedReference", js.undefined)
    
    inline def setUsedReferenceVarargs(value: Reference*): Self = StObject.set(x, "usedReference", js.Array(value*))
    
    inline def set_instantiatesCanonical(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesCanonicalVarargs(value: Element*): Self = StObject.set(x, "_instantiatesCanonical", js.Array(value*))
    
    inline def set_instantiatesUri(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_instantiatesUriVarargs(value: Element*): Self = StObject.set(x, "_instantiatesUri", js.Array(value*))
    
    inline def set_performedDateTime(value: Element): Self = StObject.set(x, "_performedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_performedDateTimeUndefined: Self = StObject.set(x, "_performedDateTime", js.undefined)
    
    inline def set_performedString(value: Element): Self = StObject.set(x, "_performedString", value.asInstanceOf[js.Any])
    
    inline def set_performedStringUndefined: Self = StObject.set(x, "_performedString", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
