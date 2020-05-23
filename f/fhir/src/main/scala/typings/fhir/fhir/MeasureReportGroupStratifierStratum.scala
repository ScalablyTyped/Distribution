package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stratum results, one for each unique value in the stratifier
  */
trait MeasureReportGroupStratifierStratum extends BackboneElement {
  /**
    * Contains extended information for property 'measureScore'.
    */
  var _measureScore: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * What score this stratum achieved
    */
  var measureScore: js.UndefOr[decimal] = js.undefined
  /**
    * Population results in this stratum
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupStratifierStratumPopulation]] = js.undefined
  /**
    * The stratum value, e.g. male
    */
  var value: String
}

object MeasureReportGroupStratifierStratum {
  @scala.inline
  def apply(
    value: String,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _measureScore: Element = null,
    _value: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    measureScore: js.UndefOr[decimal] = js.undefined,
    modifierExtension: js.Array[Extension] = null,
    population: js.Array[MeasureReportGroupStratifierStratumPopulation] = null
  ): MeasureReportGroupStratifierStratum = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_measureScore != null) __obj.updateDynamic("_measureScore")(_measureScore.asInstanceOf[js.Any])
    if (_value != null) __obj.updateDynamic("_value")(_value.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(measureScore)) __obj.updateDynamic("measureScore")(measureScore.get.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (population != null) __obj.updateDynamic("population")(population.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroupStratifierStratum]
  }
}

