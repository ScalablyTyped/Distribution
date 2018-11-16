package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SegmentPricing extends js.Object {
  /** A segment identifier unique within a single solution. It is used to refer to different parts of the same solution. */
  var fareId: js.UndefOr[java.lang.String] = js.undefined
  /** Details of the free baggage allowance on this segment. */
  var freeBaggageOption: js.UndefOr[js.Array[FreeBaggageAllowance]] = js.undefined
  /** Identifies this as a segment pricing object, representing the price of this segment. Value: the fixed string qpxexpress#segmentPricing. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier in the response of this segment. */
  var segmentId: js.UndefOr[java.lang.String] = js.undefined
}

