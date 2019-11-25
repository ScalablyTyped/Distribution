package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The formal response to a guidance request
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait GuidanceResponse extends DomainResource {
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'requestId'.
    */
  var _requestId: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Encounter or Episode during which the response was returned
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Additional required data
    */
  var dataRequirement: js.UndefOr[js.Array[DataRequirement]] = js.undefined
  /**
    * Messages resulting from the evaluation of the artifact or artifacts
    */
  var evaluationMessage: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * A reference to a knowledge module
    */
  var module: Reference
  /**
    * Additional notes about the response
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * When the guidance response was processed
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * The output parameters of the evaluation, if any
    */
  var outputParameters: js.UndefOr[Reference] = js.undefined
  /**
    * Device returning the guidance
    */
  var performer: js.UndefOr[Reference] = js.undefined
  /**
    * Reason for the response
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Reason for the response
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  /**
    * The id of the request associated with this response, if any
    */
  var requestId: js.UndefOr[id] = js.undefined
  /**
    * Proposed actions, if any
    */
  var result: js.UndefOr[Reference] = js.undefined
  /**
    * success | data-requested | data-required | in-progress | failure | entered-in-error
    */
  var status: code
  /**
    * Patient the request was performed for
    */
  var subject: js.UndefOr[Reference] = js.undefined
}

object GuidanceResponse {
  @scala.inline
  def apply(
    module: Reference,
    status: code,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _occurrenceDateTime: Element = null,
    _requestId: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    dataRequirement: js.Array[DataRequirement] = null,
    evaluationMessage: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    occurrenceDateTime: dateTime = null,
    outputParameters: Reference = null,
    performer: Reference = null,
    reasonCodeableConcept: CodeableConcept = null,
    reasonReference: Reference = null,
    requestId: id = null,
    resourceType: code = null,
    result: Reference = null,
    subject: Reference = null,
    text: Narrative = null
  ): GuidanceResponse = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_requestId != null) __obj.updateDynamic("_requestId")(_requestId.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (dataRequirement != null) __obj.updateDynamic("dataRequirement")(dataRequirement.asInstanceOf[js.Any])
    if (evaluationMessage != null) __obj.updateDynamic("evaluationMessage")(evaluationMessage.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (outputParameters != null) __obj.updateDynamic("outputParameters")(outputParameters.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (reasonCodeableConcept != null) __obj.updateDynamic("reasonCodeableConcept")(reasonCodeableConcept.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuidanceResponse]
  }
}

