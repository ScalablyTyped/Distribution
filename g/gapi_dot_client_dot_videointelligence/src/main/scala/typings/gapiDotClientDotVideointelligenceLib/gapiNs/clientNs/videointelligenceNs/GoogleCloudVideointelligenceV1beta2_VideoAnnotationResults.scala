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

