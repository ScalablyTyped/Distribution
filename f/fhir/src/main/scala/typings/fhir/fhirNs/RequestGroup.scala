package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group of related requests
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhirNs.Resource because Already inherited */ trait RequestGroup extends DomainResource {
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Proposed actions, if any
    */
  var action: js.UndefOr[js.Array[RequestGroupAction]] = js.undefined
  /**
    * Device or practitioner that authored the request group
    */
  var author: js.UndefOr[Reference] = js.undefined
  /**
    * When the request group was authored
    */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  /**
    * Fulfills plan, proposal, or order
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Encounter or Episode for the request group
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Instantiates protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Composite request this is part of
    */
  var groupIdentifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * proposal | plan | order
    */
  var intent: code
  /**
    * Additional notes about the response
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * routine | urgent | asap | stat
    */
  var priority: js.UndefOr[code] = js.undefined
  /**
    * Reason for the request group
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Reason for the request group
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  /**
    * Request(s) replaced by this request
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * draft | active | suspended | cancelled | completed | entered-in-error | unknown
    */
  var status: code
  /**
    * Who the request group is about
    */
  var subject: js.UndefOr[Reference] = js.undefined
}

object RequestGroup {
  @scala.inline
  def apply(
    intent: code,
    status: code,
    _authoredOn: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _intent: Element = null,
    _language: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    action: js.Array[RequestGroupAction] = null,
    author: Reference = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    groupIdentifier: Identifier = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    priority: code = null,
    reasonCodeableConcept: CodeableConcept = null,
    reasonReference: Reference = null,
    replaces: js.Array[Reference] = null,
    resourceType: code = null,
    subject: Reference = null,
    text: Narrative = null
  ): RequestGroup = {
    val __obj = js.Dynamic.literal(intent = intent, status = status)
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_intent != null) __obj.updateDynamic("_intent")(_intent)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_priority != null) __obj.updateDynamic("_priority")(_priority)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (action != null) __obj.updateDynamic("action")(action)
    if (author != null) __obj.updateDynamic("author")(author)
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn)
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (groupIdentifier != null) __obj.updateDynamic("groupIdentifier")(groupIdentifier)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (note != null) __obj.updateDynamic("note")(note)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (reasonCodeableConcept != null) __obj.updateDynamic("reasonCodeableConcept")(reasonCodeableConcept)
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference)
    if (replaces != null) __obj.updateDynamic("replaces")(replaces)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[RequestGroup]
  }
}

