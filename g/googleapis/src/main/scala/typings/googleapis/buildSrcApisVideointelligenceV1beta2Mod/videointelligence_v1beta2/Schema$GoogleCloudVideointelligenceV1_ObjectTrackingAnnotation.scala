package typings.googleapis.buildSrcApisVideointelligenceV1beta2Mod.videointelligence_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotations corresponding to one tracked object.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1_ObjectTrackingAnnotation extends js.Object {
  /**
    * Object category&#39;s labeling confidence of this track.
    */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Entity to specify the object category that this track is labeled as.
    */
  var entity: js.UndefOr[Schema$GoogleCloudVideointelligenceV1_Entity] = js.native
  /**
    * Information corresponding to all frames where this object track appears.
    * Non-streaming batch mode: it may be one or multiple ObjectTrackingFrame
    * messages in frames. Streaming mode: it can only be one
    * ObjectTrackingFrame message in frames.
    */
  var frames: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1_ObjectTrackingFrame]] = js.native
  /**
    * Non-streaming batch mode ONLY. Each object track corresponds to one video
    * segment where it appears.
    */
  var segment: js.UndefOr[Schema$GoogleCloudVideointelligenceV1_VideoSegment] = js.native
  /**
    * Streaming mode ONLY. In streaming mode, we do not know the end time of a
    * tracked object before it is completed. Hence, there is no VideoSegment
    * info returned. Instead, we provide a unique identifiable integer track_id
    * so that the customers can correlate the results of the ongoing
    * ObjectTrackAnnotation of the same track_id over time.
    */
  var trackId: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVideointelligenceV1_ObjectTrackingAnnotation {
  @scala.inline
  def apply(
    confidence: Int | Double = null,
    entity: Schema$GoogleCloudVideointelligenceV1_Entity = null,
    frames: js.Array[Schema$GoogleCloudVideointelligenceV1_ObjectTrackingFrame] = null,
    segment: Schema$GoogleCloudVideointelligenceV1_VideoSegment = null,
    trackId: String = null
  ): Schema$GoogleCloudVideointelligenceV1_ObjectTrackingAnnotation = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    if (segment != null) __obj.updateDynamic("segment")(segment.asInstanceOf[js.Any])
    if (trackId != null) __obj.updateDynamic("trackId")(trackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1_ObjectTrackingAnnotation]
  }
}

