package typings.googleapis.buildSrcApisVideointelligenceV1p1beta1Mod.videointelligence_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video segment level annotation results for text detection.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p3beta1_TextSegment extends js.Object {
  /**
    * Confidence for the track of detected text. It is calculated as the
    * highest over all frames where OCR detected text appears.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Information related to the frames where OCR detected text appears.
    */
  var frames: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_TextFrame]] = js.native
  /**
    * Video segment where a text snippet was detected.
    */
  var segment: js.UndefOr[Schema$GoogleCloudVideointelligenceV1p3beta1_VideoSegment] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p3beta1_TextSegment {
  @scala.inline
  def apply(
    confidence: Int | Double = null,
    frames: js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_TextFrame] = null,
    segment: Schema$GoogleCloudVideointelligenceV1p3beta1_VideoSegment = null
  ): Schema$GoogleCloudVideointelligenceV1p3beta1_TextSegment = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p3beta1_TextSegment]
  }
}

