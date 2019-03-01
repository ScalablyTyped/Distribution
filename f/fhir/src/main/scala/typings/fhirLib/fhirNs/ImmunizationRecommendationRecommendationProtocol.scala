package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Protocol used by recommendation
  */
trait ImmunizationRecommendationRecommendationProtocol extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'doseSequence'.
    */
  var _doseSequence: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'series'.
    */
  var _series: js.UndefOr[Element] = js.undefined
  /**
    * Who is responsible for protocol
    */
  var authority: js.UndefOr[Reference] = js.undefined
  /**
    * Protocol details
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Dose number within sequence
    */
  var doseSequence: js.UndefOr[positiveInt] = js.undefined
  /**
    * Name of vaccination series
    */
  var series: js.UndefOr[java.lang.String] = js.undefined
}

object ImmunizationRecommendationRecommendationProtocol {
  @scala.inline
  def apply(
    _description: Element = null,
    _doseSequence: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _series: Element = null,
    authority: Reference = null,
    description: java.lang.String = null,
    doseSequence: js.UndefOr[positiveInt] = js.undefined,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    series: java.lang.String = null
  ): ImmunizationRecommendationRecommendationProtocol = {
    val __obj = js.Dynamic.literal()
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_doseSequence != null) __obj.updateDynamic("_doseSequence")(_doseSequence)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_series != null) __obj.updateDynamic("_series")(_series)
    if (authority != null) __obj.updateDynamic("authority")(authority)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(doseSequence)) __obj.updateDynamic("doseSequence")(doseSequence)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (series != null) __obj.updateDynamic("series")(series)
    __obj.asInstanceOf[ImmunizationRecommendationRecommendationProtocol]
  }
}

