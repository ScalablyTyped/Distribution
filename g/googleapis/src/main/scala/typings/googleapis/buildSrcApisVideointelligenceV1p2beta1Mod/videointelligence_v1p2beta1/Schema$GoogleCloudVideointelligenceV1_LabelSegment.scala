package typings.googleapis.buildSrcApisVideointelligenceV1p2beta1Mod.videointelligence_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video segment level annotation results for label detection.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1_LabelSegment extends js.Object {
  /**
    * Confidence that the label is accurate. Range: [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Video segment where a label was detected.
    */
  var segment: js.UndefOr[Schema$GoogleCloudVideointelligenceV1_VideoSegment] = js.native
}

object Schema$GoogleCloudVideointelligenceV1_LabelSegment {
  @scala.inline
  def apply(
    confidence: Int | Double = null,
    segment: Schema$GoogleCloudVideointelligenceV1_VideoSegment = null
  ): Schema$GoogleCloudVideointelligenceV1_LabelSegment = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1_LabelSegment]
  }
}

