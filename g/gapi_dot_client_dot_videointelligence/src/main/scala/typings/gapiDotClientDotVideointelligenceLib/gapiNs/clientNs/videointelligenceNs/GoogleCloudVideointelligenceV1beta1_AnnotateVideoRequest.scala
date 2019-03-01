package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1_AnnotateVideoRequest extends js.Object {
  /** Requested video annotation features. */
  var features: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The video data bytes. Encoding: base64. If unset, the input video(s)
    * should be specified via `input_uri`. If set, `input_uri` should be unset.
    */
  var inputContent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Input video location. Currently, only
    * [Google Cloud Storage](https://cloud.google.com/storage/) URIs are
    * supported, which must be specified in the following format:
    * `gs://bucket-id/object-id` (other URI formats return
    * google.rpc.Code.INVALID_ARGUMENT). For more information, see
    * [Request URIs](/storage/docs/reference-uris).
    * A video URI may include wildcards in `object-id`, and thus identify
    * multiple videos. Supported wildcards: '&#42;' to match 0 or more characters;
    * '?' to match 1 character. If unset, the input video should be embedded
    * in the request as `input_content`. If set, `input_content` should be unset.
    */
  var inputUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional cloud region where annotation should take place. Supported cloud
    * regions: `us-east1`, `us-west1`, `europe-west1`, `asia-east1`. If no region
    * is specified, a region will be determined based on video file location.
    */
  var locationId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional location where the output (in JSON format) should be stored.
    * Currently, only [Google Cloud Storage](https://cloud.google.com/storage/)
    * URIs are supported, which must be specified in the following format:
    * `gs://bucket-id/object-id` (other URI formats return
    * google.rpc.Code.INVALID_ARGUMENT). For more information, see
    * [Request URIs](/storage/docs/reference-uris).
    */
  var outputUri: js.UndefOr[java.lang.String] = js.undefined
  /** Additional video context and/or feature-specific parameters. */
  var videoContext: js.UndefOr[GoogleCloudVideointelligenceV1beta1_VideoContext] = js.undefined
}

object GoogleCloudVideointelligenceV1beta1_AnnotateVideoRequest {
  @scala.inline
  def apply(
    features: js.Array[java.lang.String] = null,
    inputContent: java.lang.String = null,
    inputUri: java.lang.String = null,
    locationId: java.lang.String = null,
    outputUri: java.lang.String = null,
    videoContext: GoogleCloudVideointelligenceV1beta1_VideoContext = null
  ): GoogleCloudVideointelligenceV1beta1_AnnotateVideoRequest = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features)
    if (inputContent != null) __obj.updateDynamic("inputContent")(inputContent)
    if (inputUri != null) __obj.updateDynamic("inputUri")(inputUri)
    if (locationId != null) __obj.updateDynamic("locationId")(locationId)
    if (outputUri != null) __obj.updateDynamic("outputUri")(outputUri)
    if (videoContext != null) __obj.updateDynamic("videoContext")(videoContext)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1_AnnotateVideoRequest]
  }
}

