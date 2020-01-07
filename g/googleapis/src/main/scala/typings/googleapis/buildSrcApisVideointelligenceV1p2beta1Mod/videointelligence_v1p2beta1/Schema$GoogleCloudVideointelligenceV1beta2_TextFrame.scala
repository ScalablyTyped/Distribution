package typings.googleapis.buildSrcApisVideointelligenceV1p2beta1Mod.videointelligence_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotation results for text annotation (OCR). Contains
  * information regarding timestamp and bounding box locations for the frames
  * containing detected OCR text snippets.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1beta2_TextFrame extends js.Object {
  /**
    * Bounding polygon of the detected text for this frame.
    */
  var rotatedBoundingBox: js.UndefOr[Schema$GoogleCloudVideointelligenceV1beta2_NormalizedBoundingPoly] = js.native
  /**
    * Timestamp of this frame.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVideointelligenceV1beta2_TextFrame {
  @scala.inline
  def apply(
    rotatedBoundingBox: Schema$GoogleCloudVideointelligenceV1beta2_NormalizedBoundingPoly = null,
    timeOffset: String = null
  ): Schema$GoogleCloudVideointelligenceV1beta2_TextFrame = {
    val __obj = js.Dynamic.literal()
    if (rotatedBoundingBox != null) __obj.updateDynamic("rotatedBoundingBox")(rotatedBoundingBox.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1beta2_TextFrame]
  }
}

