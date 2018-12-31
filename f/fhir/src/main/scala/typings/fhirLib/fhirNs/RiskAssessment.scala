package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Potential outcomes for a subject with likelihood
  */
trait RiskAssessment extends DomainResource {
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

