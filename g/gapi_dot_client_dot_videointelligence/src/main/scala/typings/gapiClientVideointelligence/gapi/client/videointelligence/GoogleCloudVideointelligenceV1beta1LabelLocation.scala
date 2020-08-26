package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta1LabelLocation extends js.Object {
  /** Confidence that the label is accurate. Range: [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
  /** Label level. */
  var level: js.UndefOr[String] = js.native
  /**
    * Video segment. Set to [-1, -1] for video-level labels.
    * Set to [timestamp, timestamp] for frame-level labels.
    * Otherwise, corresponds to one of `AnnotateSpec.segments`
    * (if specified) or to shot boundaries (if requested).
    */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1beta1VideoSegment] = js.native
}

object GoogleCloudVideointelligenceV1beta1LabelLocation {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta1LabelLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1LabelLocation]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta1LabelLocationOps[Self <: GoogleCloudVideointelligenceV1beta1LabelLocation] (val x: Self) extends AnyVal {
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
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setSegment(value: GoogleCloudVideointelligenceV1beta1VideoSegment): Self = this.set("segment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegment: Self = this.set("segment", js.undefined)
  }
  
}

