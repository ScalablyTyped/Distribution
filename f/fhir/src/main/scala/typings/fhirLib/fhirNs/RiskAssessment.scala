package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Potential outcomes for a subject with likelihood
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait RiskAssessment extends DomainResource {
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
  var comment: js.UndefOr[java.lang.String] = js.undefined
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
  var mitigation: js.UndefOr[java.lang.String] = js.undefined
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
    comment: java.lang.String = null,
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
    mitigation: java.lang.String = null,
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
    val __obj = js.Dynamic.literal(status = status)
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_mitigation != null) __obj.updateDynamic("_mitigation")(_mitigation)
    if (_occurrenceDateTime != null) __obj.updateDynamic("_occurrenceDateTime")(_occurrenceDateTime)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (basedOn != null) __obj.updateDynamic("basedOn")(basedOn)
    if (basis != null) __obj.updateDynamic("basis")(basis)
    if (code != null) __obj.updateDynamic("code")(code)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (context != null) __obj.updateDynamic("context")(context)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mitigation != null) __obj.updateDynamic("mitigation")(mitigation)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (occurrenceDateTime != null) __obj.updateDynamic("occurrenceDateTime")(occurrenceDateTime)
    if (occurrencePeriod != null) __obj.updateDynamic("occurrencePeriod")(occurrencePeriod)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (performer != null) __obj.updateDynamic("performer")(performer)
    if (prediction != null) __obj.updateDynamic("prediction")(prediction)
    if (reasonCodeableConcept != null) __obj.updateDynamic("reasonCodeableConcept")(reasonCodeableConcept)
    if (reasonReference != null) __obj.updateDynamic("reasonReference")(reasonReference)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[RiskAssessment]
  }
}

