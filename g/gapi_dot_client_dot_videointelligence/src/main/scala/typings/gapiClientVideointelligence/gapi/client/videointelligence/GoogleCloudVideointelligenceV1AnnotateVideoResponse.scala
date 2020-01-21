package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1AnnotateVideoResponse extends js.Object {
  /** Annotation results for all videos specified in `AnnotateVideoRequest`. */
  var annotationResults: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1VideoAnnotationResults]] = js.undefined
}

object GoogleCloudVideointelligenceV1AnnotateVideoResponse {
  @scala.inline
  def apply(annotationResults: js.Array[GoogleCloudVideointelligenceV1VideoAnnotationResults] = null): GoogleCloudVideointelligenceV1AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    if (annotationResults != null) __obj.updateDynamic("annotationResults")(annotationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1AnnotateVideoResponse]
  }
}

