package typings.gapiDotClientDotVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1_AnnotateVideoProgress extends js.Object {
  /** Progress metadata for all videos specified in `AnnotateVideoRequest`. */
  var annotationProgress: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1_VideoAnnotationProgress]] = js.undefined
}

object GoogleCloudVideointelligenceV1beta1_AnnotateVideoProgress {
  @scala.inline
  def apply(annotationProgress: js.Array[GoogleCloudVideointelligenceV1beta1_VideoAnnotationProgress] = null): GoogleCloudVideointelligenceV1beta1_AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    if (annotationProgress != null) __obj.updateDynamic("annotationProgress")(annotationProgress)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1_AnnotateVideoProgress]
  }
}

