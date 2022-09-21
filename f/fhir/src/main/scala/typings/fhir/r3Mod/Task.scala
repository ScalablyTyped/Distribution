package typings.fhir.r3Mod

import typings.fhir.fhirStrings.`entered-in-error`
import typings.fhir.fhirStrings.`filler-order`
import typings.fhir.fhirStrings.`in-progress`
import typings.fhir.fhirStrings.`instance-order`
import typings.fhir.fhirStrings.`on-hold`
import typings.fhir.fhirStrings.`original-order`
import typings.fhir.fhirStrings.`reflex-order`
import typings.fhir.fhirStrings.accepted
import typings.fhir.fhirStrings.asap
import typings.fhir.fhirStrings.cancelled
import typings.fhir.fhirStrings.completed
import typings.fhir.fhirStrings.draft
import typings.fhir.fhirStrings.failed
import typings.fhir.fhirStrings.option
import typings.fhir.fhirStrings.order_
import typings.fhir.fhirStrings.plan
import typings.fhir.fhirStrings.proposal
import typings.fhir.fhirStrings.ready
import typings.fhir.fhirStrings.received
import typings.fhir.fhirStrings.rejected
import typings.fhir.fhirStrings.requested
import typings.fhir.fhirStrings.routine
import typings.fhir.fhirStrings.stat
import typings.fhir.fhirStrings.urgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Task
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  var _definitionUri: js.UndefOr[Element] = js.undefined
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _intent: js.UndefOr[Element] = js.undefined
  
  var _lastModified: js.UndefOr[Element] = js.undefined
  
  var _priority: js.UndefOr[Element] = js.undefined
  
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * The date and time this task was created.
    */
  var authoredOn: js.UndefOr[String] = js.undefined
  
  /**
    * BasedOn refers to a higher-level authorization that triggered the creation of the task.  It references a "request" resource such as a ProcedureRequest, MedicationRequest, ProcedureRequest, CarePlan, etc. which is distinct from the "request" resource the task is seeking to fulfil.  This latter resource is referenced by FocusOn.  For example, based on a ProcedureRequest (= BasedOn), a task is created to fulfil a procedureRequest ( = FocusOn ) to collect a specimen from a patient.
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Contains business-specific nuances of the business state.
    */
  var businessStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The title (eg "My Tasks", "Outstanding Tasks for Patient X") should go into the code.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The healthcare event  (e.g. a patient and healthcare provider interaction) during which this task was created.
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc.
    */
  var definitionReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * A reference to a formal or informal definition of the task.  For example, a protocol, a step within a defined workflow definition, etc.
    */
  var definitionUri: js.UndefOr[String] = js.undefined
  
  /**
    * A free-text description of what is to be performed.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies the time action was first taken against the task (start) and/or the time final action was taken against the task prior to marking it as completed (end).
    */
  var executionPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * If multiple resources need to be manipulated, use sub-tasks.  (This ensures that status can be tracked independently for each referenced resource.).
    */
  var focus: js.UndefOr[Reference] = js.undefined
  
  /**
    * The entity who benefits from the performance of the service specified in the task (e.g., the patient).
    */
  var `for`: js.UndefOr[Reference] = js.undefined
  
  /**
    * An identifier that links together multiple tasks and other requests that were created in the same context.
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The business identifier for this task.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Additional information that may be needed in the execution of the task.
    */
  var input: js.UndefOr[js.Array[TaskInput]] = js.undefined
  
  /**
    * This element is immutable.  Proposed tasks, planned tasks, etc. must be distinct instances.
    * In most cases, Tasks will have an intent of "order".
    */
  var intent: proposal | plan | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
  
  /**
    * The date and time of last modification to this task.
    */
  var lastModified: js.UndefOr[String] = js.undefined
  
  /**
    * Free-text information captured about the task as it progresses.
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Outputs produced by the Task.
    */
  var output: js.UndefOr[js.Array[TaskOutput]] = js.undefined
  
  /**
    * Tasks may be created with an owner not yet identified.
    */
  var owner: js.UndefOr[Reference] = js.undefined
  
  /**
    * This should usually be 0..1.
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The type of participant that can execute the task.
    */
  var performerType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Indicates how quickly the Task should be addressed with respect to other requests.
    */
  var priority: js.UndefOr[routine | urgent | asap | stat] = js.undefined
  
  /**
    * This should only be included if there is no focus or if it differs from the reason indicated on the focus.
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * This element does not point to the Provenance associated with the *current* version of the resource - as it would be created after this version existed.  The Provenance for the current version can be retrieved with a _revinclude.
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The creator of the task.
    */
  var requester: js.UndefOr[TaskRequester] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Task: typings.fhir.fhirStrings.Task
  
  /**
    * If the Task.focus is a request resource and the task is seeking fulfillment (i.e is asking for the request to be actioned), this element identifies any limitations on what parts of the referenced request should be actioned.
    */
  var restriction: js.UndefOr[TaskRestriction] = js.undefined
  
  /**
    * The current status of the task.
    */
  var status: draft | requested | received | accepted | rejected | ready | cancelled | `in-progress` | `on-hold` | failed | completed | `entered-in-error`
  
  /**
    * This applies to the current status.  Look at the history of the task to see reasons for past statuses.
    */
  var statusReason: js.UndefOr[CodeableConcept] = js.undefined
}
object Task {
  
  inline def apply(
    intent: proposal | plan | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option,
    status: draft | requested | received | accepted | rejected | ready | cancelled | `in-progress` | `on-hold` | failed | completed | `entered-in-error`
  ): Task = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], resourceType = "Task", status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  extension [Self <: Task](x: Self) {
    
    inline def setAuthoredOn(value: String): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value*))
    
    inline def setBusinessStatus(value: CodeableConcept): Self = StObject.set(x, "businessStatus", value.asInstanceOf[js.Any])
    
    inline def setBusinessStatusUndefined: Self = StObject.set(x, "businessStatus", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDefinitionReference(value: Reference): Self = StObject.set(x, "definitionReference", value.asInstanceOf[js.Any])
    
    inline def setDefinitionReferenceUndefined: Self = StObject.set(x, "definitionReference", js.undefined)
    
    inline def setDefinitionUri(value: String): Self = StObject.set(x, "definitionUri", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUriUndefined: Self = StObject.set(x, "definitionUri", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExecutionPeriod(value: Period): Self = StObject.set(x, "executionPeriod", value.asInstanceOf[js.Any])
    
    inline def setExecutionPeriodUndefined: Self = StObject.set(x, "executionPeriod", js.undefined)
    
    inline def setFocus(value: Reference): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setFor(value: Reference): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    inline def setGroupIdentifier(value: Identifier): Self = StObject.set(x, "groupIdentifier", value.asInstanceOf[js.Any])
    
    inline def setGroupIdentifierUndefined: Self = StObject.set(x, "groupIdentifier", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setInput(value: js.Array[TaskInput]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setInputVarargs(value: TaskInput*): Self = StObject.set(x, "input", js.Array(value*))
    
    inline def setIntent(
      value: proposal | plan | order_ | `original-order` | `reflex-order` | `filler-order` | `instance-order` | option
    ): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value*))
    
    inline def setOutput(value: js.Array[TaskOutput]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOutputVarargs(value: TaskOutput*): Self = StObject.set(x, "output", js.Array(value*))
    
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
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRelevantHistory(value: js.Array[Reference]): Self = StObject.set(x, "relevantHistory", value.asInstanceOf[js.Any])
    
    inline def setRelevantHistoryUndefined: Self = StObject.set(x, "relevantHistory", js.undefined)
    
    inline def setRelevantHistoryVarargs(value: Reference*): Self = StObject.set(x, "relevantHistory", js.Array(value*))
    
    inline def setRequester(value: TaskRequester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Task): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setRestriction(value: TaskRestriction): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    inline def setRestrictionUndefined: Self = StObject.set(x, "restriction", js.undefined)
    
    inline def setStatus(
      value: draft | requested | received | accepted | rejected | ready | cancelled | `in-progress` | `on-hold` | failed | completed | `entered-in-error`
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: CodeableConcept): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    inline def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    inline def set_definitionUri(value: Element): Self = StObject.set(x, "_definitionUri", value.asInstanceOf[js.Any])
    
    inline def set_definitionUriUndefined: Self = StObject.set(x, "_definitionUri", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
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
