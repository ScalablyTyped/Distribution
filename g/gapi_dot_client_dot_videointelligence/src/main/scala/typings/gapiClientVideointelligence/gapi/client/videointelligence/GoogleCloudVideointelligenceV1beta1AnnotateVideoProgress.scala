package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1AnnotateVideoProgress extends js.Object {
  /** Progress metadata for all videos specified in `AnnotateVideoRequest`. */
  var annotationProgress: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1VideoAnnotationProgress]] = js.undefined
}

object GoogleCloudVideointelligenceV1beta1AnnotateVideoProgress {
  @scala.inline
  def apply(annotationProgress: js.Array[GoogleCloudVideointelligenceV1beta1VideoAnnotationProgress] = null): GoogleCloudVideointelligenceV1beta1AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    if (annotationProgress != null) __obj.updateDynamic("annotationProgress")(annotationProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1AnnotateVideoProgress]
  }
}

