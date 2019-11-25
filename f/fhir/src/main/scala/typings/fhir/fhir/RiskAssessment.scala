package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Potential outcomes for a subject with likelihood
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait RiskAssessment extends DomainResource {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mitigation'.
    */
  var _mitigation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'occurrenceDateTime'.
    */
  var _occurrenceDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Request fulfilled by this assessment
    */
  var basedOn: js.UndefOr[Reference] = js.undefined
  /**
    * Information used in assessment
    */
  var basis: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Type of assessment
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Comments on the risk assessment
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Condition assessed
    */
  var condition: js.UndefOr[Reference] = js.undefined
  /**
    * Where was assessment performed?
    */
  var context: js.UndefOr[Reference] = js.undefined
  /**
    * Unique identifier for the assessment
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Evaluation mechanism
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * How to reduce risk
    */
  var mitigation: js.UndefOr[String] = js.undefined
  /**
    * When was assessment made?
    */
  var occurrenceDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * When was assessment made?
    */
  var occurrencePeriod: js.UndefOr[Period] = js.undefined
  /**
    * Part of this occurrence
    */
  var parent: js.UndefOr[Reference] = js.undefined
  /**
    * Who did assessment?
    */
  var performer: js.UndefOr[Reference] = js.undefined
  /**
    * Outcome predicted
    */
  var prediction: js.UndefOr[js.Array[RiskAssessmentPrediction]] = js.undefined
  /**
    * Why the assessment was necessary?
    */
  var reasonCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Why the assessment was necessary?
    */
  var reasonReference: js.UndefOr[Reference] = js.undefined
  /**
    * registered | preliminary | final | amended +
    */
  var status: code
  /**
    * Who/what does assessment apply to?
    */
  var subject: js.UndefOr[Reference] = js.undefined
}

object RiskAssessment {
  @scala.inline
  def apply(
    status: code,
    _comment: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _mitigation: Element = null,
    _occurrenceDateTime: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    basedOn: Reference = null,
    basis: js.Array[Reference] = null,
    code: CodeableConcept = null,
    comment: String = null,
    condition: Reference = null,
    contained: js.Array[Resource] = null,
    context: Reference = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: Identifier = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    method: CodeableConcept = null,
    mitigation: String = null,
    modifierExtension: js.Array[Extension] = null,
    occurrenceDateTime: dateTime = null,
    occurrencePeriod: Period = null,
    parent: Reference = null,
    performer: Reference = null,
    prediction: js.Array[RiskAssessmentPrediction] = null,
    reasonCodeableConcept: CodeableConcept = null,
    reasonReference: Reference = null,
    resourceType: code = null,
    subject: Reference = null,
    text: Narrative = null
  ): RiskAssessment = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (_comment != null) __obj.updateDynamic("_comment")(_comment.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules.asInstanceOf[js.Any])
    if (_language != null) __obj.updateDynamic("_language")(_language.asInstanceOf[js.Any])
    if (_mitigation != null) __obj.updateDynamic("_mitigation")(_mitigation.asInstanceOf[js.Any])
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime.asInstanceOf[js.Any])
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType.asInstanceOf[js.Any])
    if (_status != null) __obj.updateDynamic("_status")(_status.asInstanceOf[js.Any])
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn.asInstanceOf[js.Any])
    if (basis != null) __obj.updateDynamic("basis")(basis.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (contained != null) __obj.updateDynamic("contained")(contained.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mitigation != null) __obj.updateDynamic("mitigation")(mitigation.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime.asInstanceOf[js.Any])
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (performer != null) __obj.updateDynamic("performer")(performer.asInstanceOf[js.Any])
    if (prediction != null) __obj.updateDynamic("prediction")(prediction.asInstanceOf[js.Any])
    if (reasonCodeableConcept != null) __obj.updateDynamic("reasonCodeableConcept")(reasonCodeableConcept.asInstanceOf[js.Any])
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskAssessment]
  }
}

