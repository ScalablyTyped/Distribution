package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request for a procedure or diagnostic to be performed
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ProcedureRequest extends DomainResource {
  /**
    * Contains extended information for property 'asNeededBoolean'.
    */
  var _asNeededBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'authoredOn'.
    */
  var _authoredOn: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'doNotPerform'.
    */
  var _doNotPerform: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'intent'.
    */
  var _intent: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'priority'.
    */
  var _priority: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Preconditions for procedure or diagnostic
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.undefined
  /**
    * Preconditions for procedure or diagnostic
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Date request signed
    */
  var authoredOn: js.UndefOr[dateTime] = js.undefined
  /**
    * What request fulfills
    */
  var basedOn: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Location on Body
    */
  var bodySite: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Classification of procedure
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * What is being requested/ordered
    */
  var code: CodeableConcept
  /**
    * Encounter or Episode during which request was created
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Protocol or definition
    */
  var definition: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * True if procedure should not be performed
    */
  var doNotPerform: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifiers assigned to this order
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * proposal | plan | order +
    */
  var intent: code
  /**
    * Comments
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * When procedure should occur
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * When procedure should occur
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
    * When procedure should occur
    */
  var occurrenceTiming: js.UndefOr[Timing] = js.undefined
  /**
    * Requested perfomer
    */
  var performer: js.UndefOr[Reference] = js.undefined
  /**
    * Performer role
    */
  var performerType: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * routine | urgent | asap | stat
    */
  var priority: js.UndefOr[code] = js.undefined
  /**
    * Explanation/Justification for test
    */
  var reasonCode: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Explanation/Justification for test
    */
  var reasonReference: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Request provenance
    */
  var relevantHistory: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * What request replaces
    */
  var replaces: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Who/what is requesting procedure or diagnostic
    */
  var requester: js.UndefOr[ProcedureRequestRequester] = js.undefined
  /**
    * Composite Request ID
    */
  var requisition: js.UndefOr[Identifier] = js.undefined
  /**
    * Procedure Samples
    */
  var specimen: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * draft | active | suspended | completed | entered-in-error | cancelled
    */
  var status: code
  /**
    * Individual the service is ordered for
    */
  var subject: Reference
  /**
    * Additional clinical information
    */
  var supportingInfo: js.UndefOr[js.Array[Reference]] = js.undefined
}

object ProcedureRequest {
  @scala.inline
  def apply(
    code: CodeableConcept,
    intent: code,
    status: code,
    subject: Reference,
    _asNeededBoolean: Element = null,
    _authoredOn: Element = null,
    _doNotPerform: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _intent: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _priority: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    asNeededBoolean: js.UndefOr[Boolean] = js.undefined,
    asNeededCodeableConcept: CodeableConcept = null,
    authoredOn: dateTime = null,
    basedOn: js.Array[Reference] = null,
    bodySite: js.Array[CodeableConcept] = null,
    category: js.Array[CodeableConcept] = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    definition: js.Array[Reference] = null,
    doNotPerform: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    occurrenceTiming: Timing = null,
    performer: Reference = null,
    performerType: CodeableConcept = null,
    priority: code = null,
    reasonCode: js.Array[CodeableConcept] = null,
    reasonReference: js.Array[Reference] = null,
    relevantHistory: js.Array[Reference] = null,
    replaces: js.Array[Reference] = null,
    requester: ProcedureRequestRequester = null,
    requisition: Identifier = null,
    resourceType: code = null,
    specimen: js.Array[Reference] = null,
    supportingInfo: js.Array[Reference] = null,
    text: Narrative = null
  ): ProcedureRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (_asNeededBoolean != null) __obj.updateDynamic("_asNeededBoolean")(_asNeededBoolean.asInstanceOf[js.Any])
    if (_authoredOn != null) __obj.updateDynamic("_authoredOn")(_authoredOn.asInstanceOf[js.Any])
    if (_doNotPerform != null) __obj.updateDynamic("_doNotPerform")(_doNotPerform.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_intent != null) __obj.updateDynamic("_intent")(_intent.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_priority != null) __obj.updateDynamic("_priority")(_priority.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (!js.isUndefined(asNeededBoolean)) __obj.updateDynamic("asNeededBoolean")(asNeededBoolean.get.asInstanceOf[js.Any])
    if (asNeededCodeableConcept != null) __obj.updateDynamic("asNeededCodeableConcept")(asNeededCodeableConcept.asInstanceOf[js.Any])
    if (authoredOn != null) __obj.updateDynamic("authoredOn")(authoredOn.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (bodySite != null) __obj.updateDynamic("bodySite")(bodySite.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotPerform)) __obj.updateDynamic("doNotPerform")(doNotPerform.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (occurrenceTiming != null) __obj.updateDynamic("occurrenceTiming")(occurrenceTiming.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (performerType != null) __obj.updateDynamic("performerType")(performerType.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (reasonCode != null) __obj.updateDynamic("reasonCode")(reasonCode.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (relevantHistory != null) __obj.updateDynamic("relevantHistory")(relevantHistory.asInstanceOf[js.Any])
    if (replaces != null) __obj.updateDynamic("replaces")(replaces.asInstanceOf[js.Any])
    if (requester != null) __obj.updateDynamic("requester")(requester.asInstanceOf[js.Any])
    if (requisition != null) __obj.updateDynamic("requisition")(requisition.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (specimen != null) __obj.updateDynamic("specimen")(specimen.asInstanceOf[js.Any])
    if (supportingInfo != null) __obj.updateDynamic("supportingInfo")(supportingInfo.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcedureRequest]
  }
}

