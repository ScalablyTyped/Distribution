package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`filler-order`
import typings.fhir.fhirStrings.`instance-order`
import typings.fhir.fhirStrings.`original-order`
import typings.fhir.fhirStrings.`reflex-order`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.asap
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.option
import typings.fhir.fhirStrings.order_
import typings.fhir.fhirStrings.plan
import typings.fhir.fhirStrings.proposal
import typings.fhir.fhirStrings.routine
import typings.fhir.fhirStrings.stat
import typings.fhir.fhirStrings.suspended
import typings.fhir.fhirStrings.unknown
import typings.fhir.fhirStrings.urgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcedureRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _asNeededBoolean: js.UndefOr[Element] = js.undefined
  
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  var _doNotPerform: js.UndefOr[Element] = js.undefined
  
  var _intent: js.UndefOr[Element] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.  For example "pain", "on flare-up", etc.
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If a CodeableConcept is present, it indicates the pre-condition for performing the procedure.  For example "pain", "on flare-up", etc.
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * When the request transitioned to being actionable.
    */
  var authoredOn: js.UndefOr[String] = js.undefined
  
  /**
    * Plan/proposal/order fulfilled by this request.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Only used if not implicit in the code found in ProcedureRequest.type.  If the use case requires BodySite to be handled as a separate resource instead of an inline coded element (e.g. to identify and track separately)  then use the standard extension [procedurerequest-targetBodySite](extension-procedurerequest-targetbodysite.html).
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * There may be multiple axis of categorization depending on the context or use case for retrieving or displaying the resource.  The level of granularity is defined by the category concepts in the value set.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Many laboratory and radiology procedure codes embed the specimen/organ system in the test ordeer name, for example,  serum or serum/plasma glucose, or a chest xray. The specimen may not be recorded separately from the test code.
    */
  var code: CodeableConcept
  
  /**
    * An encounter or episode of care that provides additional information about the healthcare context in which this request is made.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Protocol or definition followed by this request.
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This element is labeled as a [modifier](conformance-rules.html#isModifier.html) because it indicates that a procedure shouldn't happen, instead of a request for it to happen.  In general, only the code and timeframe will be present, though occasional additional qualifiers such as body site or even performer could be included to narrow the scope of the prohibition.  If the ProcedureRequest.code and ProcedureRequest.doNotPerform both contain negation, that will reinforce prohibition and should not have a double negative interpretation.
    */
  var doNotPerform: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier.type element is used to distinguish between the identifiers assigned by the orderer (known as the 'Placer' in HL7 v2) and the producer of the observations in response to the order (known as the 'Filler' in HL7 v2).  For further discussion and examples see the resource notes section below.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * This element is labeled as a modifier because the intent alters when and how the resource is actually applicable.
    */
  var intent: proposal | plan | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
  
  /**
    * Any other notes and comments made about the service request. For example, letting provider know that "patient hates needles" or other provider instructions.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The date/time at which the diagnostic testing should occur.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date/time at which the diagnostic testing should occur.
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The date/time at which the diagnostic testing should occur.
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * If needed, use an [extension](extensibility.html) for listing alternative performers and/or roles and/or preference.
    */
  var performer: js.UndefOr[Reference] = js.undefined
  
  /**
    * this is a  role, not  a participation type.  I.e. does not describe the task, but describes the capacity.  For example, “compounding pharmacy” or “psychiatrist” or “internal referral”.
    */
  var performerType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates how quickly the ProcedureRequest should be addressed with respect to other requests.
    */
  var priority: js.UndefOr[routine | urgent | asap | stat] = js.undefined
  
  /**
    * This may be used to decide how the diagnostic investigation will be performed, or even if it will be performed at all.   Use CodeableConcept text element if the data is free (uncoded) text as shown in the [CT Scan example](procedurerequest-example-di.html).
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * This may be used to decide how the diagnostic investigation will be performed, or even if it will be performed at all.   Use CodeableConcept text element if the data is free (uncoded) text as shown in the [CT Scan example](procedurerequest-example-di.html).
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This may not include provenances for all versions of the request – only those deemed “relevant” or important.
    * This SHALL NOT include the Provenance associated with this current version of the resource.  (If that provenance is deemed to be a “relevant” change, it will need to be added as part of a later update.  Until then, it can be queried directly as the Provenance that points to this version using _revinclude
    * All Provenances should have some historical version of this Request as their subject.
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The request takes the place of the referenced completed or terminated request(s).
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This not the dispatcher, but rather who is the authorizer.
    */
  var requester: js.UndefOr[ProcedureRequestRequester] = js.undefined
  
  /**
    * Requests are linked either by a "basedOn" relationship (i.e. one request is fulfilling another) or by having a common requisition. Requests that are part of the same requisition are generally treated independently from the perspective of changing their state or maintaining them after initial creation.
    */
  var requisition: js.UndefOr[Identifier] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ProcedureRequest: typings.fhir.fhirStrings.ProcedureRequest
  
  /**
    * Many diagnostic procedures need a specimen, but the request itself is not actually about the specimen. This element is for when the diagnostic is requested on already existing specimens and the request points to the specimen it applies to.    Conversely, If the request is entered first with an unknown specimen, The [Specimen](specimen.html) resource references to the ProcedureRequest.
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The status is generally fully in the control of the requester - they determine whether the order is draft or active and, after it has been activated, competed, cancelled or suspended. States relating to the activities of the performer are reflected on either the corresponding event (see [Event Pattern](event.html) for general discussion) or using the [Task](task.html) resource.
    * This element is labeled as a modifier because the status contains codes that mark the resource as not currently valid.
    */
  var status: draft | active | suspended | cancelled | completed | `entered-in-error` | unknown
  
  /**
    * On whom or what the procedure or diagnostic is to be performed. This is usually a human patient, but can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).
    */
  var subject: Reference
  
  /**
    * Additional clinical information about the patient or specimen that may influence the procedure or diagnostics or their interpretations.     This information includes diagnosis, clinical findings and other observations.  In laboratory ordering these are typically referred to as "ask at order entry questions (AOEs)".  This includes observations explicitly requested by the producer (filler) to provide context or supporting information needed to complete the order. For example,  reporting the amount of inspired oxygen for blood gas measurements.
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
}
object ProcedureRequest {
  
  inline def apply(
    code: CodeableConcept,
    intent: proposal | plan | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option,
    status: draft | active | suspended | cancelled | completed | `entered-in-error` | unknown,
    subject: Reference
  ): ProcedureRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], resourceType = "ProcedureRequest", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureRequest]
  }
  
  extension [Self <: ProcedureRequest](x: Self) {
    
    inline def setAsNeededBoolean(value: Boolean): Self = StObject.set(x, "asNeededBoolean", value.asInstanceOf[js.Any])
    
    inline def setAsNeededBooleanUndefined: Self = StObject.set(x, "asNeededBoolean", js.undefined)
    
    inline def setAsNeededCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "asNeededCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setAsNeededCodeableConceptUndefined: Self = StObject.set(x, "asNeededCodeableConcept", js.undefined)
    
    inline def setAuthoredOn(value: String): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
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
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDefinition(value: js.Array[Reference]): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDefinitionVarargs(value: Reference*): Self = StObject.set(x, "definition", js.Array(value*))
    
    inline def setDoNotPerform(value: Boolean): Self = StObject.set(x, "doNotPerform", value.asInstanceOf[js.Any])
    
    inline def setDoNotPerformUndefined: Self = StObject.set(x, "doNotPerform", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setIntent(
      value: proposal | plan | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
    ): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    inline def setPerformer(value: Reference): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerType(value: CodeableConcept): Self = StObject.set(x, "performerType", value.asInstanceOf[js.Any])
    
    inline def setPerformerTypeUndefined: Self = StObject.set(x, "performerType", js.undefined)
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPriority(value: routine | urgent | asap | stat): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReasonCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "reasonCode", value.asInstanceOf[js.Any])
    
    inline def setReasonCodeUndefined: Self = StObject.set(x, "reasonCode", js.undefined)
    
    inline def setReasonCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "reasonCode", js.Array(value*))
    
    inline def setReasonReference(value: js.Array[Reference]): Self = StObject.set(x, "reasonReference", value.asInstanceOf[js.Any])
    
    inline def setReasonReferenceUndefined: Self = StObject.set(x, "reasonReference", js.undefined)
    
    inline def setReasonReferenceVarargs(value: Reference*): Self = StObject.set(x, "reasonReference", js.Array(value*))
    
    inline def setRelevantHistory(value: js.Array[Reference]): Self = StObject.set(x, "relevantHistory", value.asInstanceOf[js.Any])
    
    inline def setRelevantHistoryUndefined: Self = StObject.set(x, "relevantHistory", js.undefined)
    
    inline def setRelevantHistoryVarargs(value: Reference*): Self = StObject.set(x, "relevantHistory", js.Array(value*))
    
    inline def setReplaces(value: js.Array[Reference]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    inline def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
    
    inline def setReplacesVarargs(value: Reference*): Self = StObject.set(x, "replaces", js.Array(value*))
    
    inline def setRequester(value: ProcedureRequestRequester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setRequisition(value: Identifier): Self = StObject.set(x, "requisition", value.asInstanceOf[js.Any])
    
    inline def setRequisitionUndefined: Self = StObject.set(x, "requisition", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ProcedureRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSpecimen(value: js.Array[Reference]): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setSpecimenVarargs(value: Reference*): Self = StObject.set(x, "specimen", js.Array(value*))
    
    inline def setStatus(value: draft | active | suspended | cancelled | completed | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Reference): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfo(value: js.Array[Reference]): Self = StObject.set(x, "supportingInfo", value.asInstanceOf[js.Any])
    
    inline def setSupportingInfoUndefined: Self = StObject.set(x, "supportingInfo", js.undefined)
    
    inline def setSupportingInfoVarargs(value: Reference*): Self = StObject.set(x, "supportingInfo", js.Array(value*))
    
    inline def set_asNeededBoolean(value: Element): Self = StObject.set(x, "_asNeededBoolean", value.asInstanceOf[js.Any])
    
    inline def set_asNeededBooleanUndefined: Self = StObject.set(x, "_asNeededBoolean", js.undefined)
    
    inline def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    inline def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    inline def set_doNotPerform(value: Element): Self = StObject.set(x, "_doNotPerform", value.asInstanceOf[js.Any])
    
    inline def set_doNotPerformUndefined: Self = StObject.set(x, "_doNotPerform", js.undefined)
    
    inline def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    inline def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
