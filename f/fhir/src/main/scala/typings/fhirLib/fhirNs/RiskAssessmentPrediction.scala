package typings
package fhirLib.fhirNs

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
  var rationale: js.UndefOr[java.lang.String] = js.undefined
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
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    probabilityDecimal: js.UndefOr[decimal] = js.undefined,
    probabilityRange: Range = null,
    qualitativeRisk: CodeableConcept = null,
    rationale: java.lang.String = null,
    relativeRisk: js.UndefOr[decimal] = js.undefined,
    whenPeriod: Period = null,
    whenRange: Range = null
  ): RiskAssessmentPrediction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("outcome")(outcome)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_probabilityDecimal != null) __obj.updateDynamic("_probabilityDecimal")(_probabilityDecimal)
    if (_rationale != null) __obj.updateDynamic("_rationale")(_rationale)
    if (_relativeRisk != null) __obj.updateDynamic("_relativeRisk")(_relativeRisk)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(probabilityDecimal)) __obj.updateDynamic("probabilityDecimal")(probabilityDecimal)
    if (probabilityRange != null) __obj.updateDynamic("probabilityRange")(probabilityRange)
    if (qualitativeRisk != null) __obj.updateDynamic("qualitativeRisk")(qualitativeRisk)
    if (rationale != null) __obj.updateDynamic("rationale")(rationale)
    if (!js.isUndefined(relativeRisk)) __obj.updateDynamic("relativeRisk")(relativeRisk)
    if (whenPeriod != null) __obj.updateDynamic("whenPeriod")(whenPeriod)
    if (whenRange != null) __obj.updateDynamic("whenRange")(whenRange)
    __obj.asInstanceOf[RiskAssessmentPrediction]
  }
}

