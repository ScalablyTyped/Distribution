package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A task to be performed
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Task
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'definitionUri'.
    */
  var _definitionUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'lastModified'.
    */
  var _lastModified: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Task Creation Date
    */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Request fulfilled by this task
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * E.g. "Specimen collected", "IV prepped"
    */
  var businessStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Task Type
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Healthcare event during which this task originated
    */
  var context: js.UndefOr[Reference] = js.undefined
  
  /**
    * Formal definition of task
    */
  var definitionReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Formal definition of task
    */
  var definitionUri: js.UndefOr[uri] = js.undefined
  
  /**
    * Human-readable explanation of task
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Start and end time of execution
    */
  var executionPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * What task is acting on
    */
  var focus: js.UndefOr[Reference] = js.undefined
  
  /**
    * Beneficiary of the Task
    */
  var `for`: js.UndefOr[Reference] = js.undefined
  
  /**
    * Requisition or grouper id
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Task Instance Identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Information used to perform task
    */
  var input: js.UndefOr[js.Array[TaskInput]] = js.undefined
  
  /**
    * proposal | plan | order +
    */
  var intent: code
  
  /**
    * Task Last Modified Date
    */
  var lastModified: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Comments made about the task
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  
  /**
    * Information produced as part of task
    */
  var output: js.UndefOr[js.Array[TaskOutput]] = js.undefined
  
  /**
    * Responsible individual
    */
  var owner: js.UndefOr[Reference] = js.undefined
  
  /**
    * Composite task
    */
  var partOf: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * requester | dispatcher | scheduler | performer | monitor | manager | acquirer | reviewer
    */
  var performerType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * normal | urgent | asap | stat
    */
  var priority: js.UndefOr[code] = js.undefined
  
  /**
    * Why task is needed
    */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Key events in history of the Task
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Who is asking for task to be done
    */
  var requester: js.UndefOr[TaskRequester] = js.undefined
  
  /**
    * Constraints on fulfillment tasks
    */
  var restriction: js.UndefOr[TaskRestriction] = js.undefined
  
  /**
    * draft | requested | received | accepted | +
    */
  var status: code
  
  /**
    * Reason for current status
    */
  var statusReason: js.UndefOr[CodeableConcept] = js.undefined
}
object Task {
  
  inline def apply(intent: code, status: code): Task = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  extension [Self <: Task](x: Self) {
    
    inline def setAuthoredOn(value: dateTime): Self = StObject.set(x, "authoredOn", value.asInstanceOf[js.Any])
    
    inline def setAuthoredOnUndefined: Self = StObject.set(x, "authoredOn", js.undefined)
    
    inline def setBasedOn(value: js.Array[Reference]): Self = StObject.set(x, "basedOn", value.asInstanceOf[js.Any])
    
    inline def setBasedOnUndefined: Self = StObject.set(x, "basedOn", js.undefined)
    
    inline def setBasedOnVarargs(value: Reference*): Self = StObject.set(x, "basedOn", js.Array(value :_*))
    
    inline def setBusinessStatus(value: CodeableConcept): Self = StObject.set(x, "businessStatus", value.asInstanceOf[js.Any])
    
    inline def setBusinessStatusUndefined: Self = StObject.set(x, "businessStatus", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setContext(value: Reference): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDefinitionReference(value: Reference): Self = StObject.set(x, "definitionReference", value.asInstanceOf[js.Any])
    
    inline def setDefinitionReferenceUndefined: Self = StObject.set(x, "definitionReference", js.undefined)
    
    inline def setDefinitionUri(value: uri): Self = StObject.set(x, "definitionUri", value.asInstanceOf[js.Any])
    
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
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    inline def setInput(value: js.Array[TaskInput]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setInputVarargs(value: TaskInput*): Self = StObject.set(x, "input", js.Array(value :_*))
    
    inline def setIntent(value: code): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: dateTime): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setNote(value: js.Array[Annotation]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setNoteVarargs(value: Annotation*): Self = StObject.set(x, "note", js.Array(value :_*))
    
    inline def setOutput(value: js.Array[TaskOutput]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setOutputVarargs(value: TaskOutput*): Self = StObject.set(x, "output", js.Array(value :_*))
    
    inline def setOwner(value: Reference): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPartOf(value: js.Array[Reference]): Self = StObject.set(x, "partOf", value.asInstanceOf[js.Any])
    
    inline def setPartOfUndefined: Self = StObject.set(x, "partOf", js.undefined)
    
    inline def setPartOfVarargs(value: Reference*): Self = StObject.set(x, "partOf", js.Array(value :_*))
    
    inline def setPerformerType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "performerType", value.asInstanceOf[js.Any])
    
    inline def setPerformerTypeUndefined: Self = StObject.set(x, "performerType", js.undefined)
    
    inline def setPerformerTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "performerType", js.Array(value :_*))
    
    inline def setPriority(value: code): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReason(value: CodeableConcept): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRelevantHistory(value: js.Array[Reference]): Self = StObject.set(x, "relevantHistory", value.asInstanceOf[js.Any])
    
    inline def setRelevantHistoryUndefined: Self = StObject.set(x, "relevantHistory", js.undefined)
    
    inline def setRelevantHistoryVarargs(value: Reference*): Self = StObject.set(x, "relevantHistory", js.Array(value :_*))
    
    inline def setRequester(value: TaskRequester): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
    
    inline def setRestriction(value: TaskRestriction): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
    
    inline def setRestrictionUndefined: Self = StObject.set(x, "restriction", js.undefined)
    
    inline def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
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
