package typings.googleapis.buildSrcApisVideointelligenceV1p1beta1Mod.videointelligence_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video annotation request.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p1beta1_AnnotateVideoRequest extends js.Object {
  /**
    * Requested video annotation features.
    */
  var features: js.UndefOr[js.Array[String]] = js.native
  /**
    * The video data bytes. If unset, the input video(s) should be specified
    * via `input_uri`. If set, `input_uri` should be unset.
    */
  var inputContent: js.UndefOr[String] = js.native
  /**
    * Input video location. Currently, only [Google Cloud
    * Storage](https://cloud.google.com/storage/) URIs are supported, which
    * must be specified in the following format: `gs://bucket-id/object-id`
    * (other URI formats return google.rpc.Code.INVALID_ARGUMENT). For more
    * information, see [Request URIs](/storage/docs/reference-uris). A video
    * URI may include wildcards in `object-id`, and thus identify multiple
    * videos. Supported wildcards: &#39;*&#39; to match 0 or more characters;
    * &#39;?&#39; to match 1 character. If unset, the input video should be
    * embedded in the request as `input_content`. If set, `input_content`
    * should be unset.
    */
  var inputUri: js.UndefOr[String] = js.native
  /**
    * Optional cloud region where annotation should take place. Supported cloud
    * regions: `us-east1`, `us-west1`, `europe-west1`, `asia-east1`. If no
    * region is specified, a region will be determined based on video file
    * location.
    */
  var locationId: js.UndefOr[String] = js.native
  /**
    * Optional location where the output (in JSON format) should be stored.
    * Currently, only [Google Cloud Storage](https://cloud.google.com/storage/)
    * URIs are supported, which must be specified in the following format:
    * `gs://bucket-id/object-id` (other URI formats return
    * google.rpc.Code.INVALID_ARGUMENT). For more information, see [Request
    * URIs](/storage/docs/reference-uris).
    */
  var outputUri: js.UndefOr[String] = js.native
  /**
    * Additional video context and/or feature-specific parameters.
    */
  var videoContext: js.UndefOr[Schema$GoogleCloudVideointelligenceV1p1beta1_VideoContext] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p1beta1_AnnotateVideoRequest {
  @scala.inline
  def apply(
    features: js.Array[String] = null,
    inputContent: String = null,
    inputUri: String = null,
    locationId: String = null,
    outputUri: String = null,
    videoContext: Schema$GoogleCloudVideointelligenceV1p1beta1_VideoContext = null
  ): Schema$GoogleCloudVideointelligenceV1p1beta1_AnnotateVideoRequest = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (inputContent != null) __obj.updateDynamic("inputContent")(inputContent.asInstanceOf[js.Any])
    if (inputUri != null) __obj.updateDynamic("inputUri")(inputUri.asInstanceOf[js.Any])
    if (locationId != null) __obj.updateDynamic("locationId")(locationId.asInstanceOf[js.Any])
    if (outputUri != null) __obj.updateDynamic("outputUri")(outputUri.asInstanceOf[js.Any])
    if (videoContext != null) __obj.updateDynamic("videoContext")(videoContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p1beta1_AnnotateVideoRequest]
  }
}

