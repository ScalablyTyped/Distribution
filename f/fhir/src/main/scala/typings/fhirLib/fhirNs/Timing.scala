package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A timing schedule that specifies an event that may occur multiple times
     */

trait Timing extends Element {
  /**
           * Contains extended information for property 'event'.
           */
  var _event: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * BID | TID | QID | AM | PM | QD | QOD | Q4H | Q6H +
           */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * When the event occurs
           */
  var event: js.UndefOr[js.Array[dateTime]] = js.undefined
  /**
           * When the event is to occur
           */
  var repeat: js.UndefOr[TimingRepeat] = js.undefined
}

