package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Measure results for each group
  */
trait MeasureReportGroup extends BackboneElement {
  /**
    * Contains extended information for property 'measureScore'.
    */
  var _measureScore: js.UndefOr[Element] = js.undefined
  /**
    * What group of the measure
    */
  var identifier: Identifier
  /**
    * What score this group achieved
    */
  var measureScore: js.UndefOr[decimal] = js.undefined
  /**
    * The populations in the group
    */
  var population: js.UndefOr[js.Array[MeasureReportGroupPopulation]] = js.undefined
  /**
    * Stratification results
    */
  var stratifier: js.UndefOr[js.Array[MeasureReportGroupStratifier]] = js.undefined
}

object MeasureReportGroup {
  @scala.inline
  def apply(
    identifier: Identifier,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _measureScore: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    measureScore: js.UndefOr[decimal] = js.undefined,
    modifierExtension: js.Array[Extension] = null,
    population: js.Array[MeasureReportGroupPopulation] = null,
    stratifier: js.Array[MeasureReportGroupStratifier] = null
  ): MeasureReportGroup = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_measureScore != null) __obj.updateDynamic("_measureScore")(_measureScore.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(measureScore)) __obj.updateDynamic("measureScore")(measureScore.get.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (population != null) __obj.updateDynamic("population")(population.asInstanceOf[js.Any])
    if (stratifier != null) __obj.updateDynamic("stratifier")(stratifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeasureReportGroup]
  }
}

