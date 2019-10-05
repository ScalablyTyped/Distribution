package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the intended objective(s) for a patient, group or organization
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Goal extends DomainResource {
  /**
    * Contains extended information for property 'startDate'.
    */
  var _startDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'statusDate'.
    */
  var _statusDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'statusReason'.
    */
  var _statusReason: js.UndefOr[Element] = js.undefined
  /**
    * Issues addressed by this goal
    */
  var addresses: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * E.g. Treatment, dietary, behavioral, etc.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Code or text describing goal
    */
  var description: CodeableConcept
  /**
    * Who's responsible for creating Goal?
    */
  var expressedBy: js.UndefOr[Reference] = js.undefined
  /**
    * External Ids for this goal
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * Comments about the goal
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * What result was achieved regarding the goal?
    */
  var outcomeCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Observation that resulted from goal
    */
  var outcomeReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * high-priority | medium-priority | low-priority
    */
  var priority: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * When goal pursuit begins
    */
  var startCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * When goal pursuit begins
    */
  var startDate: js.UndefOr[date] = js.undefined
  /**
    * proposed | accepted | planned | in-progress | on-target | ahead-of-target | behind-target | sustaining | achieved | on-hold | cancelled | entered-in-error | rejected
    */
  var status: code
  /**
    * When goal status took effect
    */
  var statusDate: js.UndefOr[date] = js.undefined
  /**
    * Reason for current status
    */
  var statusReason: js.UndefOr[String] = js.undefined
  /**
    * Who this goal is intended for
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * Target outcome for the goal
    */
  var target: js.UndefOr[GoalTarget] = js.undefined
}

object Goal {
  @scala.inline
  def apply(
    description: CodeableConcept,
    status: code,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _resourceType: Element = null,
    _startDate: Element = null,
    _status: Element = null,
    _statusDate: Element = null,
    _statusReason: Element = null,
    addresses: js.Array[Reference] = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    expressedBy: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    outcomeCode: js.Array[CodeableConcept] = null,
    outcomeReference: js.Array[Reference] = null,
    priority: CodeableConcept = null,
    resourceType: code = null,
    startCodeableConcept: CodeableConcept = null,
    startDate: date = null,
    statusDate: date = null,
    statusReason: String = null,
    subject: Reference = null,
    target: GoalTarget = null,
    text: Narrative = null
  ): Goal = {
    val __obj = js.Dynamic.literal(description = description, status = status)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_startDate != null) __obj.updateDynamic("_startDate")(_startDate)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_statusDate != null) __obj.updateDynamic("_statusDate")(_statusDate)
    if (_statusReason != null) __obj.updateDynamic("_statusReason")(_statusReason)
    if (addresses != null) __obj.updateDynamic("addresses")(addresses)
    if (category != null) __obj.updateDynamic("category")(category)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (expressedBy != null) __obj.updateDynamic("expressedBy")(expressedBy)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (note != null) __obj.updateDynamic("note")(note)
    if (outcomeCode != null) __obj.updateDynamic("outcomeCode")(outcomeCode)
    if (outcomeReference != null) __obj.updateDynamic("outcomeReference")(outcomeReference)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (startCodeableConcept != null) __obj.updateDynamic("startCodeableConcept")(startCodeableConcept)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (statusDate != null) __obj.updateDynamic("statusDate")(statusDate)
    if (statusReason != null) __obj.updateDynamic("statusReason")(statusReason)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (target != null) __obj.updateDynamic("target")(target)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Goal]
  }
}

