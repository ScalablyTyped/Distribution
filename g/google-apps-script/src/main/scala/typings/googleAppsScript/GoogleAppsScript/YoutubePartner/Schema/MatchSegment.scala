package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchSegment extends js.Object {
  var channel: js.UndefOr[String] = js.native
  var reference_segment: js.UndefOr[Segment] = js.native
  var video_segment: js.UndefOr[Segment] = js.native
}

object MatchSegment {
  @scala.inline
  def apply(): MatchSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatchSegment]
  }
  @scala.inline
  implicit class MatchSegmentOps[Self <: MatchSegment] (val x: Self) extends AnyVal {
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
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    @scala.inline
    def setReference_segment(value: Segment): Self = this.set("reference_segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference_segment: Self = this.set("reference_segment", js.undefined)
    @scala.inline
    def setVideo_segment(value: Segment): Self = this.set("video_segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo_segment: Self = this.set("video_segment", js.undefined)
  }
  
}

