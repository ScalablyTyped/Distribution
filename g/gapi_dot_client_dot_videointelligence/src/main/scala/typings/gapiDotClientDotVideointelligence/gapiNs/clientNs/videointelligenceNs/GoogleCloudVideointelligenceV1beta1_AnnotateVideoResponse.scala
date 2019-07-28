package typings.gapiDotClientDotVideointelligence.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1_AnnotateVideoResponse extends js.Object {
  /** Annotation results for all videos specified in `AnnotateVideoRequest`. */
  var annotationResults: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1_VideoAnnotationResults]] = js.undefined
}

object GoogleCloudVideointelligenceV1beta1_AnnotateVideoResponse {
  @scala.inline
  def apply(annotationResults: js.Array[GoogleCloudVideointelligenceV1beta1_VideoAnnotationResults] = null): GoogleCloudVideointelligenceV1beta1_AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    if (annotationResults != null) __obj.updateDynamic("annotationResults")(annotationResults)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1_AnnotateVideoResponse]
  }
}

