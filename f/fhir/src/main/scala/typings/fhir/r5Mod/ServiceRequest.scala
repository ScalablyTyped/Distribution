package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`filler-order`
import typings.fhir.fhirStrings.`instance-order`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.`original-order`
import typings.fhir.fhirStrings.`reflex-order`
import typings.fhir.fhirStrings.active
import typings.fhir.fhirStrings.asap
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.directive
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.option
import typings.fhir.fhirStrings.order_
import typings.fhir.fhirStrings.plan
import typings.fhir.fhirStrings.proposal
import typings.fhir.fhirStrings.revoked
import typings.fhir.fhirStrings.routine
import typings.fhir.fhirStrings.stat
import typings.fhir.fhirStrings.unknown
import typings.fhir.fhirStrings.urgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceRequest
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _asNeededBoolean: js.UndefOr[Element] = js.undefined
  
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  var _doNotPerform: js.UndefOr[Element] = js.undefined
  
  var _instantiatesCanonical: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _instantiatesUri: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _intent: js.UndefOr[Element] = js.undefined
  
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  
  var _patientInstruction: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * If a CodeableConcept is present, it indicates the pre-condition for performing the service.  For example "pain", "on flare-up", etc.
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If a CodeableConcept is present, it indicates the pre-condition for performing the service.  For example "pain", "on flare-up", etc.
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
    * Only used if not implicit in the code found in ServiceRequest.code.  If the use case requires BodySite to be handled as a separate resource instead of an inline coded element (e.g. to identify and track separately)  then use the standard extension [procedure-targetBodyStructure](extension-procedure-targetbodystructure.html).
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * There may be multiple axis of categorization depending on the context or use case for retrieving or displaying the resource.  The level of granularity is defined by the category concepts in the value set.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Many laboratory and radiology procedure codes embed the specimen/organ system in the test order name, for example,  serum or serum/plasma glucose, or a chest x-ray. The specimen might not be recorded separately from the test code.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * In general, only the code and timeframe will be present, though occasional additional qualifiers such as body site or even performer could be included to narrow the scope of the prohibition.  If the ServiceRequest.code and ServiceRequest.doNotPerform both contain negation, that will reinforce prohibition and should not have a double negative interpretation.
    */
  var doNotPerform: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An encounter that provides additional information about the healthcare context in which this request is made.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * The identifier.type element is used to distinguish between the identifiers assigned by the orderer (known as the 'Placer' in HL7 v2) and the producer of the observations in response to the order (known as the 'Filler' in HL7 v2).  For further discussion and examples see the resource notes section below.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Note: This is a business identifier, not a resource identifier (see [discussion](resource.html#identifiers)).  It is best practice for the identifier to only appear on a single resource instance, however business practices may occasionally dictate that multiple resource instances with the same identifier can exist - possibly even with different resource types.  For example, multiple Patient and a Person resource instance might share the same social insurance number.
    */
  var instantiatesCanonical: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * This might be an HTML page, PDF, etc. or could just be a non-resolvable URI identifier.
    */
  var instantiatesUri: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be needed for delivering the requested service.
    */
  var insurance: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This element is labeled as a modifier because the intent alters when and how the resource is actually applicable.
    */
  var intent: proposal | plan | directive | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
  
  /**
    * The preferred location(s) where the procedure should actually happen in coded or free text form. E.g. at home or nursing day care center.
    */
  var location: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Any other notes and comments made about the service request. For example, internal billing notes.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * The date/time at which the requested service should occur.
    */
  var occurrenceDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date/time at which the requested service should occur.
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * The date/time at which the requested service should occur.
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  
  /**
    * For information from the medical record intended to support the delivery of the requested services, use the `supportingInformation` element.
    */
  var orderDetail: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Instructions in terms that are understood by the patient or consumer.
    */
  var patientInstruction: js.UndefOr[String] = js.undefined
  
  /**
    * If multiple performers are present, it is interpreted as a list of *alternative* performers without any preference regardless of order.  If order of preference is needed use the [request-performerOrder extension](extension-request-performerorder.html).  Use CareTeam to represent a group of performers (for example, Practitioner A *and* Practitioner B).
    */
  var performer: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This is a  role, not  a participation type.  In other words, does not describe the task but describes the capacity.  For example, “compounding pharmacy”, “psychiatrist” or “internal referral”.
    */
  var performerType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Indicates how quickly the ServiceRequest should be addressed with respect to other requests.
    */
  var priority: js.UndefOr[routine | urgent | asap | stat] = js.undefined
  
  /**
    * An amount of service being requested which can be a quantity ( for example $1,500 home modification), a ratio ( for example, 20 half day visits per month), or a range (2.0 to 1.8 Gy per fraction).
    */
  var quantityQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * An amount of service being requested which can be a quantity ( for example $1,500 home modification), a ratio ( for example, 20 half day visits per month), or a range (2.0 to 1.8 Gy per fraction).
    */
  var quantityRange: js.UndefOr[Range] = js.undefined
  
  /**
    * An amount of service being requested which can be a quantity ( for example $1,500 home modification), a ratio ( for example, 20 half day visits per month), or a range (2.0 to 1.8 Gy per fraction).
    */
  var quantityRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * This element represents why the referral is being made and may be used to decide how the service will be performed, or even if it will be performed at all. To be as specific as possible,  a reference to  *Observation* or *Condition* should be used if available.  Otherwise, use `concept.text` element if the data is free (uncoded) text as shown in the [CT Scan example](servicerequest-example-di.html).
    */
  var reason: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * This might not include provenances for all versions of the request – only those deemed “relevant” or important.
    * This SHALL NOT include the Provenance associated with this current version of the resource.  (If that provenance is deemed to be a “relevant” change, it will need to be added as part of a later update.  Until then, it can be queried directly as the Provenance that points to this version using _revinclude
    * All Provenances should have some historical version of this Request as their subject.
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The request takes the place of the referenced completed or terminated request(s).
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This not the dispatcher, but rather who is the authorizer.  This element is not intended to handle delegation which would generally be managed through the Provenance resource.
    */
  var requester: js.UndefOr[Reference] = js.undefined
  
  /**
    * Requests are linked either by a "basedOn" relationship (i.e. one request is fulfilling another) or by having a common requisition. Requests that are part of the same requisition are generally treated independently from the perspective of changing their state or maintaining them after initial creation.
    */
  var requisition: js.UndefOr[Identifier] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ServiceRequest: typings.fhir.fhirStrings.ServiceRequest
  
  /**
    * Many diagnostic procedures need a specimen, but the request itself is not actually about the specimen. This element is for when the diagnostic is requested on already existing specimens and the request points to the specimen it applies to.    Conversely, if the request is entered first with an unknown specimen, then the [Specimen](specimen.html) resource points to the ServiceRequest.
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The status is generally fully in the control of the requester - they determine whether the order is draft or active and, after it has been activated, competed, cancelled or suspended. States relating to the activities of the performer are reflected on either the corresponding event (see [Event Pattern](event.html) for general discussion) or using the [Task](task.html) resource.
    */
  var status: draft | active | `on-hold` | revoked | completed | `entered-in-error` | unknown
  
  /**
    * On whom or what the service is to be performed. This is usually a human patient, but can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans).
    */
  var subject: Reference
  
  /**
    * To represent information about how the services are to be delivered use the `instructions` element.
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
}
object ServiceRequest {
  
  inline def apply(
    intent: proposal | plan | directive | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option,
    status: draft | active | `on-hold` | revoked | completed | `entered-in-error` | unknown,
    subject: Reference
  ): ServiceRequest = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], resourceType = "ServiceRequest", status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceRequest]
  }
  
  extension [Self <: ServiceRequest](x: Self) {
    
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
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDoNotPerform(value: Boolean): Self = StObject.set(x, "doNotPerform", value.asInstanceOf[js.Any])
    
    inline def setDoNotPerformUndefined: Self = StObject.set(x, "doNotPerform", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: js.Array[String]): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesCanonicalVarargs(value: String*): Self = StObject.set(x, "instantiatesCanonical", js.Array(value*))
    
    inline def setInstantiatesUri(value: js.Array[String]): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setInstantiatesUriVarargs(value: String*): Self = StObject.set(x, "instantiatesUri", js.Array(value*))
    
    inline def setInsurance(value: js.Array[Reference]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setInsuranceVarargs(value: Reference*): Self = StObject.set(x, "insurance", js.Array(value*))
    
    inline def setIntent(
      value: proposal | plan | directive | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
    ): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: js.Array[CodeableReference]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLocationVarargs(value: CodeableReference*): Self = StObject.set(x, "location", js.Array(value*))
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOccurrenceDateTime(value: String): Self = StObject.set(x, "occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceDateTimeUndefined: Self = StObject.set(x, "occurrenceDateTime", js.undefined)
    
    inline def setOccurrencePeriod(value: Period): Self = StObject.set(x, "occurrencePeriod", value.asInstanceOf[js.Any])
    
    inline def setOccurrencePeriodUndefined: Self = StObject.set(x, "occurrencePeriod", js.undefined)
    
    inline def setOccurrenceTiming(value: Timing): Self = StObject.set(x, "occurrenceTiming", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceTimingUndefined: Self = StObject.set(x, "occurrenceTiming", js.undefined)
    
    inline def setOrderDetail(value: js.Array[CodeableConcept]): Self = StObject.set(x, "orderDetail", value.asInstanceOf[js.Any])
    
    inline def setOrderDetailUndefined: Self = StObject.set(x, "orderDetail", js.undefined)
    
    inline def setOrderDetailVarargs(value: CodeableConcept*): Self = StObject.set(x, "orderDetail", js.Array(value*))
    
    inline def setPatientInstruction(value: String): Self = StObject.set(x, "patientInstruction", value.asInstanceOf[js.Any])
    
    inline def setPatientInstructionUndefined: Self = StObject.set(x, "patientInstruction", js.undefined)
    
    inline def setPerformer(value: js.Array[Reference]): Self = StObject.set(x, "performer", value.asInstanceOf[js.Any])
    
    inline def setPerformerType(value: CodeableConcept): Self = StObject.set(x, "performerType", value.asInstanceOf[js.Any])
    
    inline def setPerformerTypeUndefined: Self = StObject.set(x, "performerType", js.undefined)
    
    inline def setPerformerUndefined: Self = StObject.set(x, "performer", js.undefined)
    
    inline def setPerformerVarargs(value: Reference*): Self = StObject.set(x, "performer", js.Array(value*))
    
    inline def setPriority(value: routine | urgent | asap | stat): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setQuantityQuantity(value: Quantity): Self = StObject.set(x, "quantityQuantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityQuantityUndefined: Self = StObject.set(x, "quantityQuantity", js.undefined)
    
    inline def setQuantityRange(value: Range): Self = StObject.set(x, "quantityRange", value.asInstanceOf[js.Any])
    
    inline def setQuantityRangeUndefined: Self = StObject.set(x, "quantityRange", js.undefined)
    
    inline def setQuantityRatio(value: Ratio): Self = StObject.set(x, "quantityRatio", value.asInstanceOf[js.Any])
    
    inline def setQuantityRatioUndefined: Self = StObject.set(x, "quantityRatio", js.undefined)
    
    inline def setReason(value: js.Array[CodeableReference]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setReasonVarargs(value: CodeableReference*): Self = StObject.set(x, "reason", js.Array(value*))
    
    inline def setRelevantHistory(value: js.Array[Reference]): Self = StObject.set(x, "relevantHistory", value.asInstanceOf[js.Any])
    
    inline def setRelevantHistoryUndefined: Self = StObject.set(x, "relevantHistory", js.undefined)
    
    inline def setRelevantHistoryVarargs(value: Reference*): Self = StObject.set(x, "relevantHistory", js.Array(value*))
    
    inline def setReplaces(value: js.Array[Reference]): Self = StObject.set(x, "replaces", value.asInstanceOf[js.Any])
    
    inline def setReplacesUndefined: Self = StObject.set(x, "replaces", js.undefined)
    
    inline def setReplacesVarargs(value: Reference*): Self = StObject.set(x, "replaces", js.Array(value*))
    
    inline def setRequester(value: Reference): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setRequisition(value: Identifier): Self = StObject.set(x, "requisition", value.asInstanceOf[js.Any])
    
    inline def setRequisitionUndefined: Self = StObject.set(x, "requisition", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.ServiceRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSpecimen(value: js.Array[Reference]): Self = StObject.set(x, "specimen", value.asInstanceOf[js.Any])
    
    inline def setSpecimenUndefined: Self = StObject.set(x, "specimen", js.undefined)
    
    inline def setSpecimenVarargs(value: Reference*): Self = StObject.set(x, "specimen", js.Array(value*))
    
    inline def setStatus(value: draft | active | `on-hold` | revoked | completed | `entered-in-error` | unknown): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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
    
    inline def set_instantiatesCanonical(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesCanonicalVarargs(value: Element*): Self = StObject.set(x, "_instantiatesCanonical", js.Array(value*))
    
    inline def set_instantiatesUri(value: js.Array[Element]): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_instantiatesUriVarargs(value: Element*): Self = StObject.set(x, "_instantiatesUri", js.Array(value*))
    
    inline def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    inline def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    inline def set_occurrenceDateTime(value: Element): Self = StObject.set(x, "_occurrenceDateTime", value.asInstanceOf[js.Any])
    
    inline def set_occurrenceDateTimeUndefined: Self = StObject.set(x, "_occurrenceDateTime", js.undefined)
    
    inline def set_patientInstruction(value: Element): Self = StObject.set(x, "_patientInstruction", value.asInstanceOf[js.Any])
    
    inline def set_patientInstructionUndefined: Self = StObject.set(x, "_patientInstruction", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
