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

