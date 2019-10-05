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
    measureScore: Int | Double = null,
    modifierExtension: js.Array[Extension] = null,
    population: js.Array[MeasureReportGroupStratifierStratumPopulation] = null
  ): MeasureReportGroupStratifierStratum = {
    val __obj = js.Dynamic.literal(value = value)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_measureScore != null) __obj.updateDynamic("_measureScore")(_measureScore)
    if (_value != null) __obj.updateDynamic("_value")(_value)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (measureScore != null) __obj.updateDynamic("measureScore")(measureScore.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (population != null) __obj.updateDynamic("population")(population)
    __obj.asInstanceOf[MeasureReportGroupStratifierStratum]
  }
}

