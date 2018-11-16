package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Constraints on fulfillment tasks
     */

trait TaskRestriction extends BackboneElement {
  /**
           * Contains extended information for property 'repetitions'.
           */
  var _repetitions: js.UndefOr[Element] = js.undefined
  /**
           * When fulfillment sought
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * For whom is fulfillment sought?
           */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * How many times to repeat
           */
  var repetitions: js.UndefOr[positiveInt] = js.undefined
}

