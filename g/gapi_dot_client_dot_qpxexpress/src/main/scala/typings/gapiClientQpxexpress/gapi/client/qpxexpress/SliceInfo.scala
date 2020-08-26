package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliceInfo extends js.Object {
  /** The duration of the slice in minutes. */
  var duration: js.UndefOr[Double] = js.native
  /**
    * Identifies this as a slice object. A slice represents a traveller's intent, the portion of a low-fare search corresponding to a traveler's request to
    * get between two points. One-way journeys are generally expressed using 1 slice, round-trips using 2. Value: the fixed string qpxexpress#sliceInfo.
    */
  var kind: js.UndefOr[String] = js.native
  /** The segment(s) constituting the slice. */
  var segment: js.UndefOr[js.Array[SegmentInfo]] = js.native
}

object SliceInfo {
  @scala.inline
  def apply(): SliceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliceInfo]
  }
  @scala.inline
  implicit class SliceInfoOps[Self <: SliceInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setSegmentVarargs(value: SegmentInfo*): Self = this.set("segment", js.Array(value :_*))
    @scala.inline
    def setSegment(value: js.Array[SegmentInfo]): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
  }
  
}

