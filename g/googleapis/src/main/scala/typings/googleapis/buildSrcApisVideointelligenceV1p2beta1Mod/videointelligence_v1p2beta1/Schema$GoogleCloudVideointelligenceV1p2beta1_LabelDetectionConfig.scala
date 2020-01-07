package typings.googleapis.buildSrcApisVideointelligenceV1p2beta1Mod.videointelligence_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config for LABEL_DETECTION.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p2beta1_LabelDetectionConfig extends js.Object {
  /**
    * The confidence threshold we perform filtering on the labels from
    * frame-level detection. If not set, it is set to 0.4 by default. The valid
    * range for this threshold is [0.1, 0.9]. Any value set outside of this
    * range will be clipped. Note: for best results please follow the default
    * threshold. We will update the default threshold everytime when we release
    * a new model.
    */
  var frameConfidenceThreshold: js.UndefOr[Double] = js.native
  /**
    * What labels should be detected with LABEL_DETECTION, in addition to
    * video-level labels or segment-level labels. If unspecified, defaults to
    * `SHOT_MODE`.
    */
  var labelDetectionMode: js.UndefOr[String] = js.native
  /**
    * Model to use for label detection. Supported values:
    * &quot;builtin/stable&quot; (the default if unset) and
    * &quot;builtin/latest&quot;.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * Whether the video has been shot from a stationary (i.e. non-moving)
    * camera. When set to true, might improve detection accuracy for moving
    * objects. Should be used with `SHOT_AND_FRAME_MODE` enabled.
    */
  var stationaryCamera: js.UndefOr[Boolean] = js.native
  /**
    * The confidence threshold we perform filtering on the labels from
    * video-level and shot-level detections. If not set, it is set to 0.3 by
    * default. The valid range for this threshold is [0.1, 0.9]. Any value set
    * outside of this range will be clipped. Note: for best results please
    * follow the default threshold. We will update the default threshold
    * everytime when we release a new model.
    */
  var videoConfidenceThreshold: js.UndefOr[Double] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p2beta1_LabelDetectionConfig {
  @scala.inline
  def apply(
    frameConfidenceThreshold: Int | Double = null,
    labelDetectionMode: String = null,
    model: String = null,
    stationaryCamera: js.UndefOr[Boolean] = js.undefined,
    videoConfidenceThreshold: Int | Double = null
  ): Schema$GoogleCloudVideointelligenceV1p2beta1_LabelDetectionConfig = {
    val __obj = js.Dynamic.literal()
    if (frameConfidenceThreshold != null) __obj.updateDynamic("frameConfidenceThreshold")(frameConfidenceThreshold.asInstanceOf[js.Any])
    if (labelDetectionMode != null) __obj.updateDynamic("labelDetectionMode")(labelDetectionMode.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (!js.isUndefined(stationaryCamera)) __obj.updateDynamic("stationaryCamera")(stationaryCamera.asInstanceOf[js.Any])
    if (videoConfidenceThreshold != null) __obj.updateDynamic("videoConfidenceThreshold")(videoConfidenceThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p2beta1_LabelDetectionConfig]
  }
}

