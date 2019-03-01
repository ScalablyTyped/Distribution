package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2_VideoAnnotationResults extends js.Object {
  /**
    * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
    * some videos may succeed and some may fail.
    */
  var error: js.UndefOr[GoogleRpc_Status] = js.undefined
  /** Explicit content annotation. */
  var explicitAnnotation: js.UndefOr[GoogleCloudVideointelligenceV1beta2_ExplicitContentAnnotation] = js.undefined
  /**
    * Label annotations on frame level.
    * There is exactly one element for each unique label.
    */
  var frameLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2_LabelAnnotation]] = js.undefined
  /**
    * Video file location in
    * [Google Cloud Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Label annotations on video level or user specified segment level.
    * There is exactly one element for each unique label.
    */
  var segmentLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2_LabelAnnotation]] = js.undefined
  /** Shot annotations. Each shot is represented as a video segment. */
  var shotAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2_VideoSegment]] = js.undefined
  /**
    * Label annotations on shot level.
    * There is exactly one element for each unique label.
    */
  var shotLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2_LabelAnnotation]] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2_VideoAnnotationResults {
  @scala.inline
  def apply(
    error: GoogleRpc_Status = null,
    explicitAnnotation: GoogleCloudVideointelligenceV1beta2_ExplicitContentAnnotation = null,
    frameLabelAnnotations: js.Array[GoogleCloudVideointelligenceV1beta2_LabelAnnotation] = null,
    inputUri: java.lang.String = null,
    segmentLabelAnnotations: js.Array[GoogleCloudVideointelligenceV1beta2_LabelAnnotation] = null,
    shotAnnotations: js.Array[GoogleCloudVideointelligenceV1beta2_VideoSegment] = null,
    shotLabelAnnotations: js.Array[GoogleCloudVideointelligenceV1beta2_LabelAnnotation] = null
  ): GoogleCloudVideointelligenceV1beta2_VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (explicitAnnotation != null) __obj.updateDynamic("explicitAnnotation")(explicitAnnotation)
    if (frameLabelAnnotations != null) __obj.updateDynamic("frameLabelAnnotations")(frameLabelAnnotations)
    if (inputUri != null) __obj.updateDynamic("inputUri")(inputUri)
    if (segmentLabelAnnotations != null) __obj.updateDynamic("segmentLabelAnnotations")(segmentLabelAnnotations)
    if (shotAnnotations != null) __obj.updateDynamic("shotAnnotations")(shotAnnotations)
    if (shotLabelAnnotations != null) __obj.updateDynamic("shotLabelAnnotations")(shotLabelAnnotations)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2_VideoAnnotationResults]
  }
}

