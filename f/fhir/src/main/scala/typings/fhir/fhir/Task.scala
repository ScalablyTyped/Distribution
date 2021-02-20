package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A task to be performed
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Task extends DomainResource {
  
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'definitionUri'.
    */
  var _definitionUri: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'lastModified'.
    */
  var _lastModified: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Task Creation Date
    */
  var authoredOn: js.UndefOr[dateTime] = js.native
  
  /**
    * Request fulfilled by this task
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * E.g. "Specimen collected", "IV prepped"
    */
  var businessStatus: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Task Type
    */
  var code: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Healthcare event during which this task originated
    */
  var context: js.UndefOr[Reference] = js.native
  
  /**
    * Formal definition of task
    */
  var definitionReference: js.UndefOr[Reference] = js.native
  
  /**
    * Formal definition of task
    */
  var definitionUri: js.UndefOr[uri] = js.native
  
  /**
    * Human-readable explanation of task
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Start and end time of execution
    */
  var executionPeriod: js.UndefOr[Period] = js.native
  
  /**
    * What task is acting on
    */
  var focus: js.UndefOr[Reference] = js.native
  
  /**
    * Beneficiary of the Task
    */
  var `for`: js.UndefOr[Reference] = js.native
  
  /**
    * Requisition or grouper id
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Task Instance Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Information used to perform task
    */
  var input: js.UndefOr[js.Array[TaskInput]] = js.native
  
  /**
    * proposal | plan | order +
    */
  var intent: code = js.native
  
  /**
    * Task Last Modified Date
    */
  var lastModified: js.UndefOr[dateTime] = js.native
  
  /**
    * Comments made about the task
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.native
  
  /**
    * Information produced as part of task
    */
  var output: js.UndefOr[js.Array[TaskOutput]] = js.native
  
  /**
    * Responsible individual
    */
  var owner: js.UndefOr[Reference] = js.native
  
  /**
    * Composite task
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * requester | dispatcher | scheduler | performer | monitor | manager | acquirer | reviewer
    */
  var performerType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * normal | urgent | asap | stat
    */
  var priority: js.UndefOr[code] = js.native
  
  /**
    * Why task is needed
    */
  var reason: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Key events in history of the Task
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Who is asking for task to be done
    */
  var requester: js.UndefOr[TaskRequester] = js.native
  
  /**
    * Constraints on fulfillment tasks
    */
  var restriction: js.UndefOr[TaskRestriction] = js.native
  
  /**
    * draft | requested | received | accepted | +
    */
  var status: code = js.native
  
  /**
    * Reason for current status
    */
  var statusReason: js.UndefOr[CodeableConcept] = js.native
}
object Task {
  
  @scala.inline
  def apply(intent: code, status: code): Task = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  @scala.inline
  implicit class TaskMutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthoredOn(value: dateTime): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    @scala.inline
    def setBusinessStatus(value: CodeableConcept): Self = StObject.set(x, "businessStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessStatusUndefined: Self = StObject.set(x, "businessStatus", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDefinitionReference(value: Reference): Self = StObject.set(x, "definitionReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionReferenceUndefined: Self = StObject.set(x, "definitionReference", js.undefined)
    
    @scala.inline
    def setDefinitionUri(value: uri): Self = StObject.set(x, "definitionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUriUndefined: Self = StObject.set(x, "definitionUri", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExecutionPeriod(value: Period): Self = StObject.set(x, "executionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionPeriodUndefined: Self = StObject.set(x, "executionPeriod", js.undefined)
    
    @scala.inline
    def setFocus(value: Reference): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    @scala.inline
    def setFor(value: Reference): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    @scala.inline
    def setGroupIdentifier(value: Identifier): Self = StObject.set(x, "groupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdentifierUndefined: Self = StObject.set(x, "groupIdentifier", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: js.Array[TaskInput]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setInputVarargs(value: TaskInput*): Self = StObject.set(x, "input", js.Array(value :_*))
    
    @scala.inline
    def setIntent(value: code): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModified(value: dateTime): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    @scala.inline
    def setOutput(value: js.Array[TaskOutput]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setOutputVarargs(value: TaskOutput*): Self = StObject.set(x, "output", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    @scala.inline
    def setPerformerType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "performerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformerTypeUndefined: Self = StObject.set(x, "performerType", js.undefined)
    
    @scala.inline
    def setPerformerTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "performerType", js.Array(value :_*))
    
    @scala.inline
    def setPriority(value: code): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setRelevantHistory(value: js.Array[Reference]): Self = StObject.set(x, "relevantHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevantHistoryUndefined: Self = StObject.set(x, "relevantHistory", js.undefined)
    
    @scala.inline
    def setRelevantHistoryVarargs(value: Reference*): Self = StObject.set(x, "relevantHistory", js.Array(value :_*))
    
    @scala.inline
    def setRequester(value: TaskRequester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    @scala.inline
    def setRestriction(value: TaskRestriction): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionUndefined: Self = StObject.set(x, "restriction", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: CodeableConcept): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    @scala.inline
    def set_authoredOn(value: Element): Self = StObject.set(x, "_authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_authoredOnUndefined: Self = StObject.set(x, "_authoredOn", js.undefined)
    
    @scala.inline
    def set_definitionUri(value: Element): Self = StObject.set(x, "_definitionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_definitionUriUndefined: Self = StObject.set(x, "_definitionUri", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_intent(value: Element): Self = StObject.set(x, "_intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_intentUndefined: Self = StObject.set(x, "_intent", js.undefined)
    
    @scala.inline
    def set_lastModified(value: Element): Self = StObject.set(x, "_lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lastModifiedUndefined: Self = StObject.set(x, "_lastModified", js.undefined)
    
    @scala.inline
    def set_priority(value: Element): Self = StObject.set(x, "_priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_priorityUndefined: Self = StObject.set(x, "_priority", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
  }
}
