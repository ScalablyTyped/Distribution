package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stratification results
  */
trait MeasureReportGroupStratifier extends BackboneElement {
  /**
    * What stratifier of the group
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
    * Stratum results, one for each unique value in the stratifier
    */
  var stratum: js.UndefOr[js.Array[MeasureReportGroupStratifierStratum]] = js.undefined
}

