package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of Diagnosis
  */
trait ExplanationOfBenefitDiagnosis extends BackboneElement {
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.undefined
  /**
    * Patient's diagnosis
    */
  var diagnosisCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Patient's diagnosis
    */
  var diagnosisReference: js.UndefOr[Reference] = js.undefined
  /**
    * Package billing code
    */
  var packageCode: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Number to covey order of diagnosis
    */
  var sequence: positiveInt
  /**
    * Timing or nature of the diagnosis
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

