package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of values bounded by low and high
  */
trait Range extends Element {
  /**
    * High limit
    */
  var high: js.UndefOr[Quantity] = js.undefined
  /**
    * Low limit
    */
  var low: js.UndefOr[Quantity] = js.undefined
}

