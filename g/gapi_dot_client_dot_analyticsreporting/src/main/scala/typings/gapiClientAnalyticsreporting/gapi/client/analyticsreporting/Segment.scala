package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Segment extends js.Object {
  /** A dynamic segment definition in the request. */
  var dynamicSegment: js.UndefOr[DynamicSegment] = js.native
  /** The segment ID of a built-in or custom segment, for example `gaid::-3`. */
  var segmentId: js.UndefOr[String] = js.native
}

object Segment {
  @scala.inline
  def apply(): Segment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segment]
  }
  @scala.inline
  implicit class SegmentOps[Self <: Segment] (val x: Self) extends AnyVal {
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
    def setDynamicSegment(value: DynamicSegment): Self = this.set("dynamicSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicSegment: Self = this.set("dynamicSegment", js.undefined)
    @scala.inline
    def setSegmentId(value: String): Self = this.set("segmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentId: Self = this.set("segmentId", js.undefined)
  }
  
}

