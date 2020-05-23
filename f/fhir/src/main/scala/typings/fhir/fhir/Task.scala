package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task to be performed
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Task extends DomainResource {
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
  @scala.inline
  def apply(
    intent: code,
    status: code,
    _authoredOn: Element = null,
    _definitionUri: Element = null,
    _description: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _intent: Element = null,
    _language: Element = null,
    _lastModified: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    businessStatus: CodeableConcept = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definitionReference: Reference = null,
    definitionUri: uri = null,
    description: String = null,
    executionPeriod: Period = null,
    extension: js.Array[Extension] = null,
    focus: Reference = null,
    `for`: Reference = null,
    groupIdentifier: Identifier = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    input: js.Array[TaskInput] = null,
    language: code = null,
    lastModified: dateTime = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    output: js.Array[TaskOutput] = null,
    owner: Reference = null,
    partOf: js.Array[Reference] = null,
    performerType: js.Array[CodeableConcept] = null,
    priority: code = null,
    reason: CodeableConcept = null,
    relevantHistory: js.Array[Reference] = null,
    requester: TaskRequester = null,
    resourceType: code = null,
    restriction: TaskRestriction = null,
    statusReason: CodeableConcept = null,
    text: Narrative = null
  ): Task = {
    val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn.asInstanceOf[js.Any])
    if (_definitionUri != null) __obj.updateDynamic("_definitionUri")(_definitionUri.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_intent != null) __obj.updateDynamic("_intent")(_intent.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_lastModified != null) __obj.updateDynamic("_lastModified")(_lastModified.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (businessStatus != null) __obj.updateDynamic("businessStatus")(businessStatus.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definitionReference != null) __obj.updateDynamic("definitionReference")(definitionReference.asInstanceOf[js.Any])
    if (definitionUri != null) __obj.updateDynamic("definitionUri")(definitionUri.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (executionPeriod != null) __obj.updateDynamic("executionPeriod")(executionPeriod.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (focus != null) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (`for` != null) __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (groupIdentifier != null) __obj.updateDynamic("groupIdentifier")(groupIdentifier.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (partOf != null) __obj.updateDynamic("partOf")(partOf.asInstanceOf[js.Any])
    if (performerType != null) __obj.updateDynamic("performerType")(performerType.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (relevantHistory != null) __obj.updateDynamic("relevantHistory")(relevantHistory.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (restriction != null) __obj.updateDynamic("restriction")(restriction.asInstanceOf[js.Any])
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
}

