package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1_AnnotateVideoProgress extends js.Object {
  /** Progress metadata for all videos specified in `AnnotateVideoRequest`. */
  var annotationProgress: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1_VideoAnnotationProgress]] = js.undefined
}

object GoogleCloudVideointelligenceV1_AnnotateVideoProgress {
  @scala.inline
  def apply(annotationProgress: js.Array[GoogleCloudVideointelligenceV1_VideoAnnotationProgress] = null): GoogleCloudVideointelligenceV1_AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    if (annotationProgress != null) __obj.updateDynamic("annotationProgress")(annotationProgress)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1_AnnotateVideoProgress]
  }
}

