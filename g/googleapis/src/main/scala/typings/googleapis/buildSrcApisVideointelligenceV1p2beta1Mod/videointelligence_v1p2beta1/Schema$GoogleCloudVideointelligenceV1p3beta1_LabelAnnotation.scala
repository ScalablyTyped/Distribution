package typings.googleapis.buildSrcApisVideointelligenceV1p2beta1Mod.videointelligence_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Label annotation.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p3beta1_LabelAnnotation extends js.Object {
  /**
    * Common categories for the detected entity. E.g. when the label is
    * `Terrier` the category is likely `dog`. And in some cases there might be
    * more than one categories e.g. `Terrier` could also be a `pet`.
    */
  var categoryEntities: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_Entity]] = js.native
  /**
    * Detected entity.
    */
  var entity: js.UndefOr[Schema$GoogleCloudVideointelligenceV1p3beta1_Entity] = js.native
  /**
    * All video frames where a label was detected.
    */
  var frames: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_LabelFrame]] = js.native
  /**
    * All video segments where a label was detected.
    */
  var segments: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_LabelSegment]] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p3beta1_LabelAnnotation {
  @scala.inline
  def apply(
    categoryEntities: js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_Entity] = null,
    entity: Schema$GoogleCloudVideointelligenceV1p3beta1_Entity = null,
    frames: js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_LabelFrame] = null,
    segments: js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_LabelSegment] = null
  ): Schema$GoogleCloudVideointelligenceV1p3beta1_LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    if (categoryEntities != null) __obj.updateDynamic("categoryEntities")(categoryEntities.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p3beta1_LabelAnnotation]
  }
}

