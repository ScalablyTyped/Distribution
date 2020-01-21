package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1LabelLocation extends js.Object {
  /** Confidence that the label is accurate. Range: [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  /** Label level. */
  var level: js.UndefOr[String] = js.undefined
  /**
    * Video segment. Unset for video-level labels.
    * Set to a frame timestamp for frame-level labels.
    * Otherwise, corresponds to one of `AnnotateSpec.segments`
    * (if specified) or to shot boundaries (if requested).
    */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1VideoSegment] = js.undefined
}

object GoogleCloudVideointelligenceV1LabelLocation {
  @scala.inline
  def apply(
    confidence: Int | Double = null,
    level: String = null,
    segment: GoogleCloudVideointelligenceV1VideoSegment = null
  ): GoogleCloudVideointelligenceV1LabelLocation = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1LabelLocation]
  }
}

