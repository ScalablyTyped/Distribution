package typings.fhir.fhir

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
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIntent(value: code): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_authoredOn(value: Element): Self = this.set("_authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_authoredOn: Self = this.set("_authoredOn", js.undefined)
    
    @scala.inline
    def set_definitionUri(value: Element): Self = this.set("_definitionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_definitionUri: Self = this.set("_definitionUri", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_intent(value: Element): Self = this.set("_intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_intent: Self = this.set("_intent", js.undefined)
    
    @scala.inline
    def set_lastModified(value: Element): Self = this.set("_lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_lastModified: Self = this.set("_lastModified", js.undefined)
    
    @scala.inline
    def set_priority(value: Element): Self = this.set("_priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_priority: Self = this.set("_priority", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def setAuthoredOn(value: dateTime): Self = this.set("authoredOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthoredOn: Self = this.set("authoredOn", js.undefined)
    
    @scala.inline
    def setBasedOnVarargs(value: Reference*): Self = this.set("basedOn", js.Array(value :_*))
    
    @scala.inline
    def setBasedOn(value: js.Array[Reference]): Self = this.set("basedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasedOn: Self = this.set("basedOn", js.undefined)
    
    @scala.inline
    def setBusinessStatus(value: CodeableConcept): Self = this.set("businessStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessStatus: Self = this.set("businessStatus", js.undefined)
    
    @scala.inline
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setContext(value: Reference): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDefinitionReference(value: Reference): Self = this.set("definitionReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitionReference: Self = this.set("definitionReference", js.undefined)
    
    @scala.inline
    def setDefinitionUri(value: uri): Self = this.set("definitionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitionUri: Self = this.set("definitionUri", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExecutionPeriod(value: Period): Self = this.set("executionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionPeriod: Self = this.set("executionPeriod", js.undefined)
    
    @scala.inline
    def setFocus(value: Reference): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocus: Self = this.set("focus", js.undefined)
    
    @scala.inline
    def setFor(value: Reference): Self = this.set("for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFor: Self = this.set("for", js.undefined)
    
    @scala.inline
    def setGroupIdentifier(value: Identifier): Self = this.set("groupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupIdentifier: Self = this.set("groupIdentifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setInputVarargs(value: TaskInput*): Self = this.set("input", js.Array(value :_*))
    
    @scala.inline
    def setInput(value: js.Array[TaskInput]): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLastModified(value: dateTime): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    
    @scala.inline
    def setNoteVarargs(value: Annotation*): Self = this.set("note", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: js.Array[Annotation]): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setOutputVarargs(value: TaskOutput*): Self = this.set("output", js.Array(value :_*))
    
    @scala.inline
    def setOutput(value: js.Array[TaskOutput]): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setOwner(value: Reference): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPartOfVarargs(value: Reference*): Self = this.set("partOf", js.Array(value :_*))
    
    @scala.inline
    def setPartOf(value: js.Array[Reference]): Self = this.set("partOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartOf: Self = this.set("partOf", js.undefined)
    
    @scala.inline
    def setPerformerTypeVarargs(value: CodeableConcept*): Self = this.set("performerType", js.Array(value :_*))
    
    @scala.inline
    def setPerformerType(value: js.Array[CodeableConcept]): Self = this.set("performerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformerType: Self = this.set("performerType", js.undefined)
    
    @scala.inline
    def setPriority(value: code): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setReason(value: CodeableConcept): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setRelevantHistoryVarargs(value: Reference*): Self = this.set("relevantHistory", js.Array(value :_*))
    
    @scala.inline
    def setRelevantHistory(value: js.Array[Reference]): Self = this.set("relevantHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelevantHistory: Self = this.set("relevantHistory", js.undefined)
    
    @scala.inline
    def setRequester(value: TaskRequester): Self = this.set("requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequester: Self = this.set("requester", js.undefined)
    
    @scala.inline
    def setRestriction(value: TaskRestriction): Self = this.set("restriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestriction: Self = this.set("restriction", js.undefined)
    
    @scala.inline
    def setStatusReason(value: CodeableConcept): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
  }
}
