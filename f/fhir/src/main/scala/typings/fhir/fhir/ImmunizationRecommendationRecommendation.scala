package typings.fhir.fhir

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

object ImmunizationRecommendationRecommendation {
  @scala.inline
  def apply(
    date: dateTime,
    forecastStatus: CodeableConcept,
    _date: Element = null,
    _doseNumber: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    dateCriterion: js.Array[ImmunizationRecommendationRecommendationDateCriterion] = null,
    doseNumber: Int | Double = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    protocol: ImmunizationRecommendationRecommendationProtocol = null,
    supportingImmunization: js.Array[Reference] = null,
    supportingPatientInformation: js.Array[Reference] = null,
    targetDisease: CodeableConcept = null,
    vaccineCode: CodeableConcept = null
  ): ImmunizationRecommendationRecommendation = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], forecastStatus = forecastStatus.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_doseNumber != null) __obj.updateDynamic("_doseNumber")(_doseNumber.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (dateCriterion != null) __obj.updateDynamic("dateCriterion")(dateCriterion.asInstanceOf[js.Any])
    if (doseNumber != null) __obj.updateDynamic("doseNumber")(doseNumber.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (supportingImmunization != null) __obj.updateDynamic("supportingImmunization")(supportingImmunization.asInstanceOf[js.Any])
    if (supportingPatientInformation != null) __obj.updateDynamic("supportingPatientInformation")(supportingPatientInformation.asInstanceOf[js.Any])
    if (targetDisease != null) __obj.updateDynamic("targetDisease")(targetDisease.asInstanceOf[js.Any])
    if (vaccineCode != null) __obj.updateDynamic("vaccineCode")(vaccineCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationRecommendationRecommendation]
  }
}

