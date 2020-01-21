package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1VideoContext extends js.Object {
  /**
    * If label detection has been requested, what labels should be detected
    * in addition to video-level labels or segment-level labels. If unspecified,
    * defaults to `SHOT_MODE`.
    */
  var labelDetectionMode: js.UndefOr[String] = js.undefined
  /**
    * Model to use for label detection.
    * Supported values: "latest" and "stable" (the default).
    */
  var labelDetectionModel: js.UndefOr[String] = js.undefined
  /**
    * Model to use for safe search detection.
    * Supported values: "latest" and "stable" (the default).
    */
  var safeSearchDetectionModel: js.UndefOr[String] = js.undefined
  /**
    * Video segments to annotate. The segments may overlap and are not required
    * to be contiguous or span the whole video. If unspecified, each video
    * is treated as a single segment.
    */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1VideoSegment]] = js.undefined
  /**
    * Model to use for shot change detection.
    * Supported values: "latest" and "stable" (the default).
    */
  var shotChangeDetectionModel: js.UndefOr[String] = js.undefined
  /**
    * Whether the video has been shot from a stationary (i.e. non-moving) camera.
    * When set to true, might improve detection accuracy for moving objects.
    */
  var stationaryCamera: js.UndefOr[Boolean] = js.undefined
}

object GoogleCloudVideointelligenceV1beta1VideoContext {
  @scala.inline
  def apply(
    labelDetectionMode: String = null,
    labelDetectionModel: String = null,
    safeSearchDetectionModel: String = null,
    segments: js.Array[GoogleCloudVideointelligenceV1beta1VideoSegment] = null,
    shotChangeDetectionModel: String = null,
    stationaryCamera: js.UndefOr[Boolean] = js.undefined
  ): GoogleCloudVideointelligenceV1beta1VideoContext = {
    val __obj = js.Dynamic.literal()
    if (labelDetectionMode != null) __obj.updateDynamic("labelDetectionMode")(labelDetectionMode.asInstanceOf[js.Any])
    if (labelDetectionModel != null) __obj.updateDynamic("labelDetectionModel")(labelDetectionModel.asInstanceOf[js.Any])
    if (safeSearchDetectionModel != null) __obj.updateDynamic("safeSearchDetectionModel")(safeSearchDetectionModel.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (shotChangeDetectionModel != null) __obj.updateDynamic("shotChangeDetectionModel")(shotChangeDetectionModel.asInstanceOf[js.Any])
    if (!js.isUndefined(stationaryCamera)) __obj.updateDynamic("stationaryCamera")(stationaryCamera.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1VideoContext]
  }
}

