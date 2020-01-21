package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2VideoAnnotationResults extends js.Object {
  /**
    * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
    * some videos may succeed and some may fail.
    */
  var error: js.UndefOr[GoogleRpcStatus] = js.undefined
  /** Explicit content annotation. */
  var explicitAnnotation: js.UndefOr[GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation] = js.undefined
  /**
    * Label annotations on frame level.
    * There is exactly one element for each unique label.
    */
  var frameLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.undefined
  /**
    * Video file location in
    * [Google Cloud Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.undefined
  /**
    * Label annotations on video level or user specified segment level.
    * There is exactly one element for each unique label.
    */
  var segmentLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.undefined
  /** Shot annotations. Each shot is represented as a video segment. */
  var shotAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2VideoSegment]] = js.undefined
  /**
    * Label annotations on shot level.
    * There is exactly one element for each unique label.
    */
  var shotLabelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation]] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2VideoAnnotationResults {
  @scala.inline
  def apply(
    error: GoogleRpcStatus = null,
    explicitAnnotation: GoogleCloudVideointelligenceV1beta2ExplicitContentAnnotation = null,
    frameLabelAnnotations: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation] = null,
    inputUri: String = null,
    segmentLabelAnnotations: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation] = null,
    shotAnnotations: js.Array[GoogleCloudVideointelligenceV1beta2VideoSegment] = null,
    shotLabelAnnotations: js.Array[GoogleCloudVideointelligenceV1beta2LabelAnnotation] = null
  ): GoogleCloudVideointelligenceV1beta2VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (explicitAnnotation != null) __obj.updateDynamic("explicitAnnotation")(explicitAnnotation.asInstanceOf[js.Any])
    if (frameLabelAnnotations != null) __obj.updateDynamic("frameLabelAnnotations")(frameLabelAnnotations.asInstanceOf[js.Any])
    if (inputUri != null) __obj.updateDynamic("inputUri")(inputUri.asInstanceOf[js.Any])
    if (segmentLabelAnnotations != null) __obj.updateDynamic("segmentLabelAnnotations")(segmentLabelAnnotations.asInstanceOf[js.Any])
    if (shotAnnotations != null) __obj.updateDynamic("shotAnnotations")(shotAnnotations.asInstanceOf[js.Any])
    if (shotLabelAnnotations != null) __obj.updateDynamic("shotLabelAnnotations")(shotLabelAnnotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2VideoAnnotationResults]
  }
}

