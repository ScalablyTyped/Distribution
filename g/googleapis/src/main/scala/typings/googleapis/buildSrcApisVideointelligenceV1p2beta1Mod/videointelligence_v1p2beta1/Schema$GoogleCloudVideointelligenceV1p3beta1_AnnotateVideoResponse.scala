package typings.googleapis.buildSrcApisVideointelligenceV1p2beta1Mod.videointelligence_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video annotation response. Included in the `response` field of the
  * `Operation` returned by the `GetOperation` call of the
  * `google::longrunning::Operations` service.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p3beta1_AnnotateVideoResponse extends js.Object {
  /**
    * Annotation results for all videos specified in `AnnotateVideoRequest`.
    */
  var annotationResults: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_VideoAnnotationResults]] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p3beta1_AnnotateVideoResponse {
  @scala.inline
  def apply(
    annotationResults: js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_VideoAnnotationResults] = null
  ): Schema$GoogleCloudVideointelligenceV1p3beta1_AnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    if (annotationResults != null) __obj.updateDynamic("annotationResults")(annotationResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p3beta1_AnnotateVideoResponse]
  }
}

