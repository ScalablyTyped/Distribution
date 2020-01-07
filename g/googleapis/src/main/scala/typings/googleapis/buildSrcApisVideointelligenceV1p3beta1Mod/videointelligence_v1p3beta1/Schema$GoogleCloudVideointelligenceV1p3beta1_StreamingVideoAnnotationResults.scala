package typings.googleapis.buildSrcApisVideointelligenceV1p3beta1Mod.videointelligence_v1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Streaming annotation results corresponding to a portion of the video that
  * is currently being processed.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p3beta1_StreamingVideoAnnotationResults extends js.Object {
  /**
    * Explicit content annotation results.
    */
  var explicitAnnotation: js.UndefOr[Schema$GoogleCloudVideointelligenceV1p3beta1_ExplicitContentAnnotation] = js.native
  /**
    * Label annotation results.
    */
  var labelAnnotations: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_LabelAnnotation]] = js.native
  /**
    * Object tracking results.
    */
  var objectAnnotations: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_ObjectTrackingAnnotation]] = js.native
  /**
    * Shot annotation results. Each shot is represented as a video segment.
    */
  var shotAnnotations: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_VideoSegment]] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p3beta1_StreamingVideoAnnotationResults {
  @scala.inline
  def apply(
    explicitAnnotation: Schema$GoogleCloudVideointelligenceV1p3beta1_ExplicitContentAnnotation = null,
    labelAnnotations: js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_LabelAnnotation] = null,
    objectAnnotations: js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_ObjectTrackingAnnotation] = null,
    shotAnnotations: js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_VideoSegment] = null
  ): Schema$GoogleCloudVideointelligenceV1p3beta1_StreamingVideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    if (explicitAnnotation != null) __obj.updateDynamic("explicitAnnotation")(explicitAnnotation.asInstanceOf[js.Any])
    if (labelAnnotations != null) __obj.updateDynamic("labelAnnotations")(labelAnnotations.asInstanceOf[js.Any])
    if (objectAnnotations != null) __obj.updateDynamic("objectAnnotations")(objectAnnotations.asInstanceOf[js.Any])
    if (shotAnnotations != null) __obj.updateDynamic("shotAnnotations")(shotAnnotations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p3beta1_StreamingVideoAnnotationResults]
  }
}

