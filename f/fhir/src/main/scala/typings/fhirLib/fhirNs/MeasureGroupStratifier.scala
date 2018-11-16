package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Stratifier criteria for the measure
     */

trait MeasureGroupStratifier extends BackboneElement {
  /**
           * Contains extended information for property 'criteria'.
           */
  var _criteria: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'path'.
           */
  var _path: js.UndefOr[Element] = js.undefined
  /**
           * How the measure should be stratified
           */
  var criteria: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The identifier for the stratifier used to coordinate the reported data back to this stratifier
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Path to the stratifier
           */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

