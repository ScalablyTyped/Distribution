package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2LabelSegment extends js.Object {
  /** Confidence that the label is accurate. Range: [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  /** Video segment where a label was detected. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1beta2VideoSegment] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2LabelSegment {
  @scala.inline
  def apply(
    confidence: js.UndefOr[Double] = js.undefined,
    segment: GoogleCloudVideointelligenceV1beta2VideoSegment = null
  ): GoogleCloudVideointelligenceV1beta2LabelSegment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(confidence)) __obj.updateDynamic("confidence")(confidence.get.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2LabelSegment]
  }
}

