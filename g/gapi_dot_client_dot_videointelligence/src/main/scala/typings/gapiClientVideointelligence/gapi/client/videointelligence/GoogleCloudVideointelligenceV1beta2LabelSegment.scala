package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta2LabelSegment extends js.Object {
  /** Confidence that the label is accurate. Range: [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
  /** Video segment where a label was detected. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1beta2VideoSegment] = js.native
}

object GoogleCloudVideointelligenceV1beta2LabelSegment {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta2LabelSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2LabelSegment]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta2LabelSegmentOps[Self <: GoogleCloudVideointelligenceV1beta2LabelSegment] (val x: Self) extends AnyVal {
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
    def setConfidence(value: Double): Self = this.set("confidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfidence: Self = this.set("confidence", js.undefined)
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1beta2VideoSegment): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
  }
  
}

