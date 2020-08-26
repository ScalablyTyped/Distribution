package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta1VideoSegment extends js.Object {
  /** End offset in microseconds (inclusive). Unset means 0. */
  var endTimeOffset: js.UndefOr[String] = js.native
  /** Start offset in microseconds (inclusive). Unset means 0. */
  var startTimeOffset: js.UndefOr[String] = js.native
}

object GoogleCloudVideointelligenceV1beta1VideoSegment {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta1VideoSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1VideoSegment]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta1VideoSegmentOps[Self <: GoogleCloudVideointelligenceV1beta1VideoSegment] (val x: Self) extends AnyVal {
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
    def setEndTimeOffset(value: String): Self = this.set("endTimeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTimeOffset: Self = this.set("endTimeOffset", js.undefined)
    @scala.inline
    def setStartTimeOffset(value: String): Self = this.set("startTimeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimeOffset: Self = this.set("startTimeOffset", js.undefined)
  }
  
}

