package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2_LabelSegment extends js.Object {
  /** Confidence that the label is accurate. Range: [0, 1]. */
  var confidence: js.UndefOr[scala.Double] = js.undefined
  /** Video segment where a label was detected. */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1beta2_VideoSegment] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2_LabelSegment {
  @scala.inline
  def apply(
    confidence: scala.Int | scala.Double = null,
    segment: GoogleCloudVideointelligenceV1beta2_VideoSegment = null
  ): GoogleCloudVideointelligenceV1beta2_LabelSegment = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2_LabelSegment]
  }
}

