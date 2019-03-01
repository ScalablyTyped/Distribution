package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1_AnnotateVideoResponse extends js.Object {
  /** Annotation results for all videos specified in `AnnotateVideoRequest`. */
  var annotationResults: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1_VideoAnnotationResults]] = js.undefined
}

object GoogleCloudVideointelligenceV1_AnnotateVideoResponse {
  @scala.inline
  def apply(annotationResults: js.Array[GoogleCloudVideointelligenceV1_VideoAnnotationResults] = null): GoogleCloudVideointelligenceV1_AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    if (annotationResults != null) __obj.updateDynamic("annotationResults")(annotationResults)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1_AnnotateVideoResponse]
  }
}

