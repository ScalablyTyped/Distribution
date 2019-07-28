package typings.gapiDotClientDotVideointelligence.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2_AnnotateVideoProgress extends js.Object {
  /** Progress metadata for all videos specified in `AnnotateVideoRequest`. */
  var annotationProgress: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2_VideoAnnotationProgress]] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2_AnnotateVideoProgress {
  @scala.inline
  def apply(annotationProgress: js.Array[GoogleCloudVideointelligenceV1beta2_VideoAnnotationProgress] = null): GoogleCloudVideointelligenceV1beta2_AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    if (annotationProgress != null) __obj.updateDynamic("annotationProgress")(annotationProgress)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2_AnnotateVideoProgress]
  }
}

