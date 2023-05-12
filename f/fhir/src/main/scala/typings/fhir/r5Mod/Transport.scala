package typings.fhir.r5Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`filler-order`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`instance-order`
import typings.fhir.fhirStrings.`original-order`
import typings.fhir.fhirStrings.`reflex-order`
import typings.fhir.fhirStrings.abandoned
import typings.fhir.fhirStrings.asap
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.option
import typings.fhir.fhirStrings.order_
import typings.fhir.fhirStrings.plan
import typings.fhir.fhirStrings.planned
import typings.fhir.fhirStrings.proposal
import typings.fhir.fhirStrings.routine
import typings.fhir.fhirStrings.stat
import typings.fhir.fhirStrings.unknown
import typings.fhir.fhirStrings.urgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transport
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  var _completionTime: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _instantiatesCanonical: js.UndefOr[Element] = js.undefined
  
  var _instantiatesUri: js.UndefOr[Element] = js.undefined
  
  var _intent: js.UndefOr[Element] = js.undefined
  
  var _lastModified: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The date and time this transport was created.
    */
  var authoredOn: js.UndefOr[String] = js.undefined
  
  /**
    * BasedOn refers to a higher-level authorization that triggered the creation of the transport.  It references a "request" resource such as a ServiceRequest or Transport, which is distinct from the "request" resource the Transport is seeking to fulfill.  This latter resource is referenced by FocusOn.  For example, based on a ServiceRequest (= BasedOn), a transport is created to fulfill a procedureRequest ( = FocusOn ) to transport a specimen to the lab.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The title (eg "My Transports", "Outstanding Transports for Patient X") should go into the code.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Identifies the completion time of the event (the occurrence).
    */
  var completionTime: js.UndefOr[String] = js.undefined
  
  /**
    * The current location for the entity to be transported.
    */
  var currentLocation: Reference
  
  /**
    * A free-text description of what is to be performed.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The healthcare event  (e.g. a patient and healthcare provider interaction) during which this transport was created.
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  
  /**
    * If multiple resources need to be manipulated, use sub-transports.  (This ensures that status can be tracked independently for each referenced resource.).
    */
  var focus: js.UndefOr[Reference] = js.undefined
  
  /**
    * The entity who benefits from the performance of the service specified in the transport (e.g., the patient).
    */
  var `for`: js.UndefOr[Reference] = js.undefined
  
  /**
    * A shared identifier common to multiple independent Request instances that were activated/authorized more or less simultaneously by a single author.  The presence of the same identifier on each request ties those requests together and may have business ramifications in terms of reporting of results, billing, etc.  E.g. a requisition number shared by a set of lab tests ordered together, or a prescription number shared by all meds ordered at one time.
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The transport event prior to this one.
    */
  var history: js.UndefOr[Reference] = js.undefined
  
  /**
    * This identifier is typically assigned by the dispenser, and may be used to reference the delivery when exchanging information about it with other systems.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Additional information that may be needed in the execution of the transport.
    */
  var input: js.UndefOr[js.Array[TransportInput]] = js.undefined
  
  /**
    * The URL pointing to a *FHIR*-defined protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Transport.
    */
  var instantiatesCanonical: js.UndefOr[String] = js.undefined
  
  /**
    * The URL pointing to an *externally* maintained  protocol, guideline, orderset or other definition that is adhered to in whole or in part by this Transport.
    */
  var instantiatesUri: js.UndefOr[String] = js.undefined
  
  /**
    * Insurance plans, coverage extensions, pre-authorizations and/or pre-determinations that may be relevant to the Transport.
    */
  var insurance: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * This element is immutable.  Proposed transports, planned transports, etc. must be distinct instances.
    * In most cases, Transports will have an intent of "order".
    */
  var intent: unknown | proposal | plan | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
  
  /**
    * The date and time of last modification to this transport.
    */
  var lastModified: js.UndefOr[String] = js.undefined
  
  /**
    * Principal physical location where this transport is performed.
    */
  var location: js.UndefOr[Reference] = js.undefined
  
  /**
    * Free-text information captured about the transport as it progresses.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Outputs produced by the Transport.
    */
  var output: js.UndefOr[js.Array[TransportOutput]] = js.undefined
  
  /**
    * Transports may be created with an owner not yet identified.
    */
  var owner: js.UndefOr[Reference] = js.undefined
  
  /**
    * Not to be used to link an event to an Encounter - use Event.context for that.
    * [The allowed reference resources may be adjusted as appropriate for the event resource].
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The kind of participant that should perform the transport.
    */
  var performerType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Indicates how quickly the Transport should be addressed with respect to other requests.
    */
  var priority: js.UndefOr[routine | urgent | asap | stat] = js.undefined
  
  /**
    * Transports might be justified based on an Observation, a Condition, a past or planned procedure, etc. This should only be included if there is no focus or if it differs from the reason indicated on the focus.    Use the CodeableConcept text element in `Transport.reasonCode` if the data is free (uncoded) text.
    */
  var reason: js.UndefOr[CodeableReference] = js.undefined
  
  /**
    * This element does not point to the Provenance associated with the *current* version of the resource - as it would be created after this version existed.  The Provenance for the current version can be retrieved with a _revinclude.
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The desired or final location for the transport.
    */
  var requestedLocation: Reference
  
  /**
    * The creator of the transport.
    */
  var requester: js.UndefOr[Reference] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Transport: typings.fhir.fhirStrings.Transport
  
  /**
    * If the Transport.focus is a request resource and the transport is seeking fulfillment (i.e. is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.
    */
  var restriction: js.UndefOr[TransportRestriction] = js.undefined
  
  /**
    * A code specifying the state of the transport event.
    */
  var status: js.UndefOr[`in-progress` | completed | abandoned | cancelled | planned | `entered-in-error`] = js.undefined
  
  /**
    * This applies to the current status.  Look at the history of the transport to see reasons for past statuses.
    */
  var statusReason: js.UndefOr[CodeableConcept] = js.undefined
}
object Transport {
  
  inline def apply(
    currentLocation: Reference,
    intent: unknown | proposal | plan | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option,
    requestedLocation: Reference
  ): Transport = {
    val __obj = js.Dynamic.literal(currentLocation = currentLocation.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], requestedLocation = requestedLocation.asInstanceOf[js.Any], resourceType = "Transport")
    __obj.asInstanceOf[Transport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transport] (val x: Self) extends AnyVal {
    
    inline def setAuthoredOn(value: String): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCompletionTime(value: String): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setCurrentLocation(value: Reference): Self = StObject.set(x, "currentLocation", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncounter(value: Reference): Self = StObject.set(x, "encounter", value.asInstanceOf[js.Any])
    
    inline def setEncounterUndefined: Self = StObject.set(x, "encounter", js.undefined)
    
    inline def setFocus(value: Reference): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFor(value: Reference): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    inline def setGroupIdentifier(value: Identifier): Self = StObject.set(x, "groupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGroupIdentifierUndefined: Self = StObject.set(x, "groupIdentifier", js.undefined)
    
    inline def setHistory(value: Reference): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInput(value: js.Array[TransportInput]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setInputVarargs(value: TransportInput*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setInstantiatesCanonical(value: String): Self = StObject.set(x, "instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesCanonicalUndefined: Self = StObject.set(x, "instantiatesCanonical", js.undefined)
    
    inline def setInstantiatesUri(value: String): Self = StObject.set(x, "instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def setInstantiatesUriUndefined: Self = StObject.set(x, "instantiatesUri", js.undefined)
    
    inline def setInsurance(value: js.Array[Reference]): Self = StObject.set(x, "insurance", value.asInstanceOf[js.Any])
    
    inline def setInsuranceUndefined: Self = StObject.set(x, "insurance", js.undefined)
    
    inline def setInsuranceVarargs(value: Reference*): Self = StObject.set(x, "insurance", js.Array(value*))
    
    inline def setIntent(
      value: unknown | proposal | plan | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
    ): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setLocation(value: Reference): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOutput(value: js.Array[TransportOutput]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOutputVarargs(value: TransportOutput*): Self = StObject.set(x, "output", js.Array(value*))
    
    inline def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value*))
    
    inline def setPerformerType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "performerType", value.asInstanceOf[js.Any])
    
    inline def setPerformerTypeUndefined: Self = StObject.set(x, "performerType", js.undefined)
    
    inline def setPerformerTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "performerType", js.Array(value*))
    
    inline def setPriority(value: routine | urgent | asap | stat): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReason(value: CodeableReference): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRelevantHistory(value: js.Array[Reference]): Self = StObject.set(x, "relevantHistory", value.asInstanceOf[js.Any])
    
    inline def setRelevantHistoryUndefined: Self = StObject.set(x, "relevantHistory", js.undefined)
    
    inline def setRelevantHistoryVarargs(value: Reference*): Self = StObject.set(x, "relevantHistory", js.Array(value*))
    
    inline def setRequestedLocation(value: Reference): Self = StObject.set(x, "requestedLocation", value.asInstanceOf[js.Any])
    
    inline def setRequester(value: Reference): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Transport): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRestriction(value: TransportRestriction): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    inline def setRestrictionUndefined: Self = StObject.set(x, "restriction", js.undefined)
    
    inline def setStatus(value: `in-progress` | completed | abandoned | cancelled | planned | `entered-in-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: CodeableConcept): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    inline def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    inline def set_completionTime(value: Element): Self = StObject.set(x, "_completionTime", value.asInstanceOf[js.Any])
    
    inline def set_completionTimeUndefined: Self = StObject.set(x, "_completionTime", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_instantiatesCanonical(value: Element): Self = StObject.set(x, "_instantiatesCanonical", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesCanonicalUndefined: Self = StObject.set(x, "_instantiatesCanonical", js.undefined)
    
    inline def set_instantiatesUri(value: Element): Self = StObject.set(x, "_instantiatesUri", value.asInstanceOf[js.Any])
    
    inline def set_instantiatesUriUndefined: Self = StObject.set(x, "_instantiatesUri", js.undefined)
    
    inline def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    inline def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    inline def set_lastModified(value: Element): Self = StObject.set(x, "_lastModified", value.asInstanceOf[js.Any])
    
    inline def set_lastModifiedUndefined: Self = StObject.set(x, "_lastModified", js.undefined)
    
    inline def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    inline def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    inline def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    inline def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
