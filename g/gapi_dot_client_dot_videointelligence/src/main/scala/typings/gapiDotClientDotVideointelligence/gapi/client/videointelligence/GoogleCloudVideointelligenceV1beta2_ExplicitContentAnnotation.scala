package typings.gapiDotClientDotVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2_ExplicitContentAnnotation extends js.Object {
  /** All video frames where explicit content was detected. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2_ExplicitContentFrame]] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2_ExplicitContentAnnotation {
  @scala.inline
  def apply(frames: js.Array[GoogleCloudVideointelligenceV1beta2_ExplicitContentFrame] = null): GoogleCloudVideointelligenceV1beta2_ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2_ExplicitContentAnnotation]
  }
}

