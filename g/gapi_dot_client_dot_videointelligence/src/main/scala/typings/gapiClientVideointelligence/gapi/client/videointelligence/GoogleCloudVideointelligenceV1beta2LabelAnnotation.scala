package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2LabelAnnotation extends js.Object {
  /**
    * Common categories for the detected entity.
    * E.g. when the label is `Terrier` the category is likely `dog`. And in some
    * cases there might be more than one categories e.g. `Terrier` could also be
    * a `pet`.
    */
  var categoryEntities: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2Entity]] = js.undefined
  /** Detected entity. */
  var entity: js.UndefOr[GoogleCloudVideointelligenceV1beta2Entity] = js.undefined
  /** All video frames where a label was detected. */
  var frames: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelFrame]] = js.undefined
  /** All video segments where a label was detected. */
  var segments: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta2LabelSegment]] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2LabelAnnotation {
  @scala.inline
  def apply(
    categoryEntities: js.Array[GoogleCloudVideointelligenceV1beta2Entity] = null,
    entity: GoogleCloudVideointelligenceV1beta2Entity = null,
    frames: js.Array[GoogleCloudVideointelligenceV1beta2LabelFrame] = null,
    segments: js.Array[GoogleCloudVideointelligenceV1beta2LabelSegment] = null
  ): GoogleCloudVideointelligenceV1beta2LabelAnnotation = {
    val __obj = js.Dynamic.literal()
    if (categoryEntities != null) __obj.updateDynamic("categoryEntities")(categoryEntities.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (segments != null) __obj.updateDynamic("segments")(segments.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2LabelAnnotation]
  }
}

