package typings.gapiDotClientDotVideointelligence.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2_LabelFrame extends js.Object {
  /** Confidence that the label is accurate. Range: [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * video frame for this location.
    */
  var timeOffset: js.UndefOr[String] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2_LabelFrame {
  @scala.inline
  def apply(confidence: Int | Double = null, timeOffset: String = null): GoogleCloudVideointelligenceV1beta2_LabelFrame = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2_LabelFrame]
  }
}

