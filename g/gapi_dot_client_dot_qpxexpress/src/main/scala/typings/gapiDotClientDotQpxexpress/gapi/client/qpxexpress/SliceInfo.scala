package typings.gapiDotClientDotQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceInfo extends js.Object {
  /** The duration of the slice in minutes. */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Identifies this as a slice object. A slice represents a traveller's intent, the portion of a low-fare search corresponding to a traveler's request to
    * get between two points. One-way journeys are generally expressed using 1 slice, round-trips using 2. Value: the fixed string qpxexpress#sliceInfo.
    */
  var kind: js.UndefOr[String] = js.undefined
  /** The segment(s) constituting the slice. */
  var segment: js.UndefOr[js.Array[SegmentInfo]] = js.undefined
}

object SliceInfo {
  @scala.inline
  def apply(duration: Int | Double = null, kind: String = null, segment: js.Array[SegmentInfo] = null): SliceInfo = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    __obj.asInstanceOf[SliceInfo]
  }
}

