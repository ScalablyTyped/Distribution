package typings.googleapis.buildSrcApisVideointelligenceV1Mod.videointelligence_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video annotation progress. Included in the `metadata` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1beta2_AnnotateVideoProgress extends js.Object {
  /**
    * Progress metadata for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationProgress: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1beta2_VideoAnnotationProgress]] = js.native
}

object Schema$GoogleCloudVideointelligenceV1beta2_AnnotateVideoProgress {
  @scala.inline
  def apply(
    annotationProgress: js.Array[Schema$GoogleCloudVideointelligenceV1beta2_VideoAnnotationProgress] = null
  ): Schema$GoogleCloudVideointelligenceV1beta2_AnnotateVideoProgress = {
    val __obj = js.Dynamic.literal()
    if (annotationProgress != null) __obj.updateDynamic("annotationProgress")(annotationProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1beta2_AnnotateVideoProgress]
  }
}

