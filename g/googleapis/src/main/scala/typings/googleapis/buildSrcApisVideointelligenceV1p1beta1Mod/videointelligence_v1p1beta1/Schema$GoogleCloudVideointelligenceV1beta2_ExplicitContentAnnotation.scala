package typings.googleapis.buildSrcApisVideointelligenceV1p1beta1Mod.videointelligence_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Explicit content annotation (based on per-frame visual signals only). If no
  * explicit content has been detected in a frame, no annotations are present
  * for that frame.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1beta2_ExplicitContentAnnotation extends js.Object {
  /**
    * All video frames where explicit content was detected.
    */
  var frames: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1beta2_ExplicitContentFrame]] = js.native
}

object Schema$GoogleCloudVideointelligenceV1beta2_ExplicitContentAnnotation {
  @scala.inline
  def apply(frames: js.Array[Schema$GoogleCloudVideointelligenceV1beta2_ExplicitContentFrame] = null): Schema$GoogleCloudVideointelligenceV1beta2_ExplicitContentAnnotation = {
    val __obj = js.Dynamic.literal()
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1beta2_ExplicitContentAnnotation]
  }
}

