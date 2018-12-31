package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceInfo extends js.Object {
  /** The duration of the slice in minutes. */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Identifies this as a slice object. A slice represents a traveller's intent, the portion of a low-fare search corresponding to a traveler's request to
    * get between two points. One-way journeys are generally expressed using 1 slice, round-trips using 2. Value: the fixed string qpxexpress#sliceInfo.
    */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The segment(s) constituting the slice. */
  var segment: js.UndefOr[js.Array[SegmentInfo]] = js.undefined
}

