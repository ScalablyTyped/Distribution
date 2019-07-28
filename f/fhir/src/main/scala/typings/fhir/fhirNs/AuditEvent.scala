package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event record kept for security purposes
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait AuditEvent extends DomainResource {
  /**
    * Contains extended information for property 'action'.
    */
  var _action: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'outcome'.
    */
  var _outcome: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'outcomeDesc'.
    */
  var _outcomeDesc: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'recorded'.
    */
  var _recorded: js.UndefOr[Element] = js.undefined
  /**
    * Type of action performed during the event
    */
  var action: js.UndefOr[code] = js.undefined
  /**
    * Actor involved in the event
    */
  var agent: js.Array[AuditEventAgent]
  /**
    * Data or objects used
    */
  var entity: js.UndefOr[js.Array[AuditEventEntity]] = js.undefined
  /**
    * Whether the event succeeded or failed
    */
  var outcome: js.UndefOr[code] = js.undefined
  /**
    * Description of the event outcome
    */
  var outcomeDesc: js.UndefOr[String] = js.undefined
  /**
    * The purposeOfUse of the event
    */
  var purposeOfEvent: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Time when the event occurred on source
    */
  var recorded: instant
  /**
    * Audit Event Reporter
    */
  var source: AuditEventSource
  /**
    * More specific type/id for the event
    */
  var subtype: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Type/identifier of event
    */
  var `type`: Coding
}

object AuditEvent {
  @scala.inline
  def apply(
    agent: js.Array[AuditEventAgent],
    recorded: instant,
    source: AuditEventSource,
    `type`: Coding,
    _action: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _outcome: Element = null,
    _outcomeDesc: Element = null,
    _recorded: Element = null,
    _resourceType: Element = null,
    action: code = null,
    contained: js.Array[Resource] = null,
    entity: js.Array[AuditEventEntity] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    outcome: code = null,
    outcomeDesc: String = null,
    purposeOfEvent: js.Array[CodeableConcept] = null,
    resourceType: code = null,
    subtype: js.Array[Coding] = null,
    text: Narrative = null
  ): AuditEvent = {
    val __obj = js.Dynamic.literal(agent = agent, recorded = recorded, source = source)
    __obj.updateDynamic("type")(`type`)
    if (_action != null) __obj.updateDynamic("_action")(_action)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_outcome != null) __obj.updateDynamic("_outcome")(_outcome)
    if (_outcomeDesc != null) __obj.updateDynamic("_outcomeDesc")(_outcomeDesc)
    if (_recorded != null) __obj.updateDynamic("_recorded")(_recorded)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (action != null) __obj.updateDynamic("action")(action)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (outcome != null) __obj.updateDynamic("outcome")(outcome)
    if (outcomeDesc != null) __obj.updateDynamic("outcomeDesc")(outcomeDesc)
    if (purposeOfEvent != null) __obj.updateDynamic("purposeOfEvent")(purposeOfEvent)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (subtype != null) __obj.updateDynamic("subtype")(subtype)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[AuditEvent]
  }
}

