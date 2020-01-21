package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1AnnotateVideoResponse extends js.Object {
  /** Annotation results for all videos specified in `AnnotateVideoRequest`. */
  var annotationResults: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1VideoAnnotationResults]] = js.undefined
}

object GoogleCloudVideointelligenceV1beta1AnnotateVideoResponse {
  @scala.inline
  def apply(annotationResults: js.Array[GoogleCloudVideointelligenceV1beta1VideoAnnotationResults] = null): GoogleCloudVideointelligenceV1beta1AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    if (annotationResults != null) __obj.updateDynamic("annotationResults")(annotationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1AnnotateVideoResponse]
  }
}

