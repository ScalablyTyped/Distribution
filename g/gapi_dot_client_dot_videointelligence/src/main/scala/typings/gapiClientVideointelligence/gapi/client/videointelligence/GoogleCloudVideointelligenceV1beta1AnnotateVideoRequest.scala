package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudVideointelligenceV1beta1AnnotateVideoRequest extends js.Object {
  /** Requested video annotation features. */
  var features: js.UndefOr[js.Array[String]] = js.native
  /**
    * The video data bytes. Encoding: base64. If unset, the input video(s)
    * should be specified via `input_uri`. If set, `input_uri` should be unset.
    */
  var inputContent: js.UndefOr[String] = js.native
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
  var inputUri: js.UndefOr[String] = js.native
  /**
    * Optional cloud region where annotation should take place. Supported cloud
    * regions: `us-east1`, `us-west1`, `europe-west1`, `asia-east1`. If no region
    * is specified, a region will be determined based on video file location.
    */
  var locationId: js.UndefOr[String] = js.native
  /**
    * Optional location where the output (in JSON format) should be stored.
    * Currently, only [Google Cloud Storage](https://cloud.google.com/storage/)
    * URIs are supported, which must be specified in the following format:
    * `gs://bucket-id/object-id` (other URI formats return
    * google.rpc.Code.INVALID_ARGUMENT). For more information, see
    * [Request URIs](/storage/docs/reference-uris).
    */
  var outputUri: js.UndefOr[String] = js.native
  /** Additional video context and/or feature-specific parameters. */
  var videoContext: js.UndefOr[GoogleCloudVideointelligenceV1beta1VideoContext] = js.native
}

object GoogleCloudVideointelligenceV1beta1AnnotateVideoRequest {
  @scala.inline
  def apply(): GoogleCloudVideointelligenceV1beta1AnnotateVideoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1AnnotateVideoRequest]
  }
  @scala.inline
  implicit class GoogleCloudVideointelligenceV1beta1AnnotateVideoRequestOps[Self <: GoogleCloudVideointelligenceV1beta1AnnotateVideoRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setInputContent(value: String): Self = this.set("inputContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputContent: Self = this.set("inputContent", js.undefined)
    @scala.inline
    def setInputUri(value: String): Self = this.set("inputUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputUri: Self = this.set("inputUri", js.undefined)
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    @scala.inline
    def setOutputUri(value: String): Self = this.set("outputUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputUri: Self = this.set("outputUri", js.undefined)
    @scala.inline
    def setVideoContext(value: GoogleCloudVideointelligenceV1beta1VideoContext): Self = this.set("videoContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoContext: Self = this.set("videoContext", js.undefined)
  }
  
}

