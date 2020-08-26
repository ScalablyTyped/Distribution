package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta1VideoContext extends js.Object {
  /**
    * If label detection has been requested, what labels should be detected
    * in addition to video-level labels or segment-level labels. If unspecified,
    * defaults to `SHOT_MODE`.
    */
  var labelDetectionMode: js.UndefOr[String] = js.native
  /**
    * Model to use for label detection.
    * Supported values: "latest" and "stable" (the default).
    */
  var labelDetectionModel: js.UndefOr[String] = js.native
  /**
    * Model to use for safe search detection.
    * Supported values: "latest" and "stable" (the default).
    */
  var safeSearchDetectionModel: js.UndefOr[String] = js.native
  /**
    * Video segments to annotate. The segments may overlap and are not required
    * to be contiguous or span the whole video. If unspecified, each video
    * is treated as a single segment.
    */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1VideoSegment]] = js.native
  /**
    * Model to use for shot change detection.
    * Supported values: "latest" and "stable" (the default).
    */
  var shotChangeDetectionModel: js.UndefOr[String] = js.native
  /**
    * Whether the video has been shot from a stationary (i.e. non-moving) camera.
    * When set to true, might improve detection accuracy for moving objects.
    */
  var stationaryCamera: js.UndefOr[Boolean] = js.native
}

object GoogleCloudVideointelligenceV1beta1VideoContext {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta1VideoContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1VideoContext]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta1VideoContextOps[Self <: GoogleCloudVideointelligenceV1beta1VideoContext] (val x: Self) extends AnyVal {
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
    def setLabelDetectionMode(value: String): Self = this.set("labelDetectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDetectionMode: Self = this.set("labelDetectionMode", js.undefined)
    @scala.inline
    def setLabelDetectionModel(value: String): Self = this.set("labelDetectionModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDetectionModel: Self = this.set("labelDetectionModel", js.undefined)
    @scala.inline
    def setSafeSearchDetectionModel(value: String): Self = this.set("safeSearchDetectionModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSafeSearchDetectionModel: Self = this.set("safeSearchDetectionModel", js.undefined)
    @scala.inline
    def setSegmentsVarargs(value: GoogleCloudVideointelligenceV1beta1VideoSegment*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[GoogleCloudVideointelligenceV1beta1VideoSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegments: Self = this.set("segments", js.undefined)
    @scala.inline
    def setShotChangeDetectionModel(value: String): Self = this.set("shotChangeDetectionModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShotChangeDetectionModel: Self = this.set("shotChangeDetectionModel", js.undefined)
    @scala.inline
    def setStationaryCamera(value: Boolean): Self = this.set("stationaryCamera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStationaryCamera: Self = this.set("stationaryCamera", js.undefined)
  }
  
}

