package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dates governing proposed immunization
  */
trait ImmunizationRecommendationRecommendationDateCriterion extends BackboneElement {
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * Type of date
    */
  var code: CodeableConcept
  /**
    * Recommended date
    */
  var value: dateTime
}

object ImmunizationRecommendationRecommendationDateCriterion {
  @scala.inline
  def apply(
    code: CodeableConcept,
    value: dateTime,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _value: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): ImmunizationRecommendationRecommendationDateCriterion = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_value != null) __obj.updateDynamic("_value")(_value.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationRecommendationRecommendationDateCriterion]
  }
}

