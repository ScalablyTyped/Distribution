package typings
package fhirLib.fhirNs

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
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    measureScore: js.UndefOr[decimal] = js.undefined,
    modifierExtension: js.Array[Extension] = null,
    population: js.Array[MeasureReportGroupPopulation] = null,
    stratifier: js.Array[MeasureReportGroupStratifier] = null
  ): MeasureReportGroup = {
    val __obj = js.Dynamic.literal(identifier = identifier)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_measureScore != null) __obj.updateDynamic("_measureScore")(_measureScore)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(measureScore)) __obj.updateDynamic("measureScore")(measureScore)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (population != null) __obj.updateDynamic("population")(population)
    if (stratifier != null) __obj.updateDynamic("stratifier")(stratifier)
    __obj.asInstanceOf[MeasureReportGroup]
  }
}

