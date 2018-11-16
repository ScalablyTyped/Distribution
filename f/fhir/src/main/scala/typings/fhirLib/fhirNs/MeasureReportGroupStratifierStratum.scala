package typings
package fhirLib.fhirNs

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
  var value: java.lang.String
}

