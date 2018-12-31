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

