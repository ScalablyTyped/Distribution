package typings.googleapis.buildSrcApisVideointelligenceV1beta2Mod.videointelligence_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotation results for label detection.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1_LabelFrame extends js.Object {
  /**
    * Confidence that the label is accurate. Range: [0, 1].
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * video frame for this location.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVideointelligenceV1_LabelFrame {
  @scala.inline
  def apply(confidence: Int | Double = null, timeOffset: String = null): Schema$GoogleCloudVideointelligenceV1_LabelFrame = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1_LabelFrame]
  }
}

