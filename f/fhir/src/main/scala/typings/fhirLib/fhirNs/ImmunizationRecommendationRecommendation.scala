package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Vaccine administration recommendations
  */
trait ImmunizationRecommendationRecommendation extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'doseNumber'.
    */
  var _doseNumber: js.UndefOr[Element] = js.undefined
  /**
    * Date recommendation created
    */
  var date: dateTime
  /**
    * Dates governing proposed immunization
    */
  var dateCriterion: js.UndefOr[js.Array[ImmunizationRecommendationRecommendationDateCriterion]] = js.undefined
  /**
    * Recommended dose number
    */
  var doseNumber: js.UndefOr[positiveInt] = js.undefined
  /**
    * Vaccine administration status
    */
  var forecastStatus: CodeableConcept
  /**
    * Protocol used by recommendation
    */
  var protocol: js.UndefOr[ImmunizationRecommendationRecommendationProtocol] = js.undefined
  /**
    * Past immunizations supporting recommendation
    */
  var supportingImmunization: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Patient observations supporting recommendation
    */
  var supportingPatientInformation: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Disease to be immunized against
    */
  var targetDisease: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Vaccine recommendation applies to
    */
  var vaccineCode: js.UndefOr[CodeableConcept] = js.undefined
}

