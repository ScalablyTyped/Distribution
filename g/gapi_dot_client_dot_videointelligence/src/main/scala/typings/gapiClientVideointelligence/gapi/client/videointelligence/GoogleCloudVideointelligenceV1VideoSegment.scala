package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1VideoSegment extends js.Object {
  /**
    * Time-offset, relative to the beginning of the video,
    * corresponding to the end of the segment (inclusive).
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Time-offset, relative to the beginning of the video,
    * corresponding to the start of the segment (inclusive).
    */
  var startTime: js.UndefOr[String] = js.native
}

object GoogleCloudVideointelligenceV1VideoSegment {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1VideoSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1VideoSegment]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1VideoSegmentOps[Self <: GoogleCloudVideointelligenceV1VideoSegment] (val x: Self) extends AnyVal {
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

