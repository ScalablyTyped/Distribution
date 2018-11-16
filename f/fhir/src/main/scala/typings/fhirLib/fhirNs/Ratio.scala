package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A ratio of two Quantity values - a numerator and a denominator
     */

trait Ratio extends Element {
  /**
           * Denominator value
           */
  var denominator: js.UndefOr[Quantity] = js.undefined
  /**
           * Numerator value
           */
  var numerator: js.UndefOr[Quantity] = js.undefined
}

