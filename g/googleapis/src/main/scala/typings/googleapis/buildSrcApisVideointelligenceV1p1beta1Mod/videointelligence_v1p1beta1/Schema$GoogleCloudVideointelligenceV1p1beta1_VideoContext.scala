package typings.googleapis.buildSrcApisVideointelligenceV1p1beta1Mod.videointelligence_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video context and/or feature-specific parameters.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p1beta1_VideoContext extends js.Object {
  /**
    * Config for EXPLICIT_CONTENT_DETECTION.
    */
  var explicitContentDetectionConfig: js.UndefOr[Schema$GoogleCloudVideointelligenceV1p1beta1_ExplicitContentDetectionConfig] = js.native
  /**
    * Config for LABEL_DETECTION.
    */
  var labelDetectionConfig: js.UndefOr[Schema$GoogleCloudVideointelligenceV1p1beta1_LabelDetectionConfig] = js.native
  /**
    * Video segments to annotate. The segments may overlap and are not required
    * to be contiguous or span the whole video. If unspecified, each video is
    * treated as a single segment.
    */
  var segments: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1p1beta1_VideoSegment]] = js.native
  /**
    * Config for SHOT_CHANGE_DETECTION.
    */
  var shotChangeDetectionConfig: js.UndefOr[Schema$GoogleCloudVideointelligenceV1p1beta1_ShotChangeDetectionConfig] = js.native
  /**
    * Config for SPEECH_TRANSCRIPTION.
    */
  var speechTranscriptionConfig: js.UndefOr[Schema$GoogleCloudVideointelligenceV1p1beta1_SpeechTranscriptionConfig] = js.native
  /**
    * Config for TEXT_DETECTION.
    */
  var textDetectionConfig: js.UndefOr[Schema$GoogleCloudVideointelligenceV1p1beta1_TextDetectionConfig] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p1beta1_VideoContext {
  @scala.inline
  def apply(
    explicitContentDetectionConfig: Schema$GoogleCloudVideointelligenceV1p1beta1_ExplicitContentDetectionConfig = null,
    labelDetectionConfig: Schema$GoogleCloudVideointelligenceV1p1beta1_LabelDetectionConfig = null,
    segments: js.Array[Schema$GoogleCloudVideointelligenceV1p1beta1_VideoSegment] = null,
    shotChangeDetectionConfig: Schema$GoogleCloudVideointelligenceV1p1beta1_ShotChangeDetectionConfig = null,
    speechTranscriptionConfig: Schema$GoogleCloudVideointelligenceV1p1beta1_SpeechTranscriptionConfig = null,
    textDetectionConfig: Schema$GoogleCloudVideointelligenceV1p1beta1_TextDetectionConfig = null
  ): Schema$GoogleCloudVideointelligenceV1p1beta1_VideoContext = {
    val __obj = js.Dynamic.literal()
    if (explicitContentDetectionConfig != null) __obj.updateDynamic("explicitContentDetectionConfig")(explicitContentDetectionConfig.asInstanceOf[js.Any])
    if (labelDetectionConfig != null) __obj.updateDynamic("labelDetectionConfig")(labelDetectionConfig.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    if (shotChangeDetectionConfig != null) __obj.updateDynamic("shotChangeDetectionConfig")(shotChangeDetectionConfig.asInstanceOf[js.Any])
    if (speechTranscriptionConfig != null) __obj.updateDynamic("speechTranscriptionConfig")(speechTranscriptionConfig.asInstanceOf[js.Any])
    if (textDetectionConfig != null) __obj.updateDynamic("textDetectionConfig")(textDetectionConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p1beta1_VideoContext]
  }
}

