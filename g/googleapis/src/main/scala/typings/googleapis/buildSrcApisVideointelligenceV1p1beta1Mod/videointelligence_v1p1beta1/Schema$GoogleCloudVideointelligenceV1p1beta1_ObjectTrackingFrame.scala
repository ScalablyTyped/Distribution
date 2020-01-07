package typings.googleapis.buildSrcApisVideointelligenceV1p1beta1Mod.videointelligence_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotations for object detection and tracking. This field
  * stores per frame location, time offset, and confidence.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p1beta1_ObjectTrackingFrame extends js.Object {
  /**
    * The normalized bounding box location of this object track for the frame.
    */
  var normalizedBoundingBox: js.UndefOr[Schema$GoogleCloudVideointelligenceV1p1beta1_NormalizedBoundingBox] = js.native
  /**
    * The timestamp of the frame in microseconds.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p1beta1_ObjectTrackingFrame {
  @scala.inline
  def apply(
    normalizedBoundingBox: Schema$GoogleCloudVideointelligenceV1p1beta1_NormalizedBoundingBox = null,
    timeOffset: String = null
  ): Schema$GoogleCloudVideointelligenceV1p1beta1_ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    if (normalizedBoundingBox != null) __obj.updateDynamic("normalizedBoundingBox")(normalizedBoundingBox.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p1beta1_ObjectTrackingFrame]
  }
}

