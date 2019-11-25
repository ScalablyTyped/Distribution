package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Outcome predicted
  */
trait RiskAssessmentPrediction extends BackboneElement {
  /**
    * Contains extended information for property 'probabilityDecimal'.
    */
  var _probabilityDecimal: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'rationale'.
    */
  var _rationale: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'relativeRisk'.
    */
  var _relativeRisk: js.UndefOr[Element] = js.undefined
  /**
    * Possible outcome for the subject
    */
  var outcome: CodeableConcept
  /**
    * Likelihood of specified outcome
    */
  var probabilityDecimal: js.UndefOr[decimal] = js.undefined
  /**
    * Likelihood of specified outcome
    */
  var probabilityRange: js.UndefOr[Range] = js.undefined
  /**
    * Likelihood of specified outcome as a qualitative value
    */
  var qualitativeRisk: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Explanation of prediction
    */
  var rationale: js.UndefOr[String] = js.undefined
  /**
    * Relative likelihood
    */
  var relativeRisk: js.UndefOr[decimal] = js.undefined
  /**
    * Timeframe or age range
    */
  var whenPeriod: js.UndefOr[Period] = js.undefined
  /**
    * Timeframe or age range
    */
  var whenRange: js.UndefOr[Range] = js.undefined
}

object RiskAssessmentPrediction {
  @scala.inline
  def apply(
    outcome: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _probabilityDecimal: Element = null,
    _rationale: Element = null,
    _relativeRisk: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    probabilityDecimal: Int | Double = null,
    probabilityRange: Range = null,
    qualitativeRisk: CodeableConcept = null,
    rationale: String = null,
    relativeRisk: Int | Double = null,
    whenPeriod: Period = null,
    whenRange: Range = null
  ): RiskAssessmentPrediction = {
    val __obj = js.Dynamic.literal(outcome = outcome.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_probabilityDecimal != null) __obj.updateDynamic("_probabilityDecimal")(_probabilityDecimal.asInstanceOf[js.Any])
    if (_rationale != null) __obj.updateDynamic("_rationale")(_rationale.asInstanceOf[js.Any])
    if (_relativeRisk != null) __obj.updateDynamic("_relativeRisk")(_relativeRisk.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (probabilityDecimal != null) __obj.updateDynamic("probabilityDecimal")(probabilityDecimal.asInstanceOf[js.Any])
    if (probabilityRange != null) __obj.updateDynamic("probabilityRange")(probabilityRange.asInstanceOf[js.Any])
    if (qualitativeRisk != null) __obj.updateDynamic("qualitativeRisk")(qualitativeRisk.asInstanceOf[js.Any])
    if (rationale != null) __obj.updateDynamic("rationale")(rationale.asInstanceOf[js.Any])
    if (relativeRisk != null) __obj.updateDynamic("relativeRisk")(relativeRisk.asInstanceOf[js.Any])
    if (whenPeriod != null) __obj.updateDynamic("whenPeriod")(whenPeriod.asInstanceOf[js.Any])
    if (whenRange != null) __obj.updateDynamic("whenRange")(whenRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RiskAssessmentPrediction]
  }
}

