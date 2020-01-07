package typings.googleapis.buildSrcApisVideointelligenceV1p3beta1Mod.videointelligence_v1p3beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `StreamingAnnotateVideoResponse` is the only message returned to the client
  * by `StreamingAnnotateVideo`. A series of zero or more
  * `StreamingAnnotateVideoResponse` messages are streamed back to the client.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p3beta1_StreamingAnnotateVideoResponse extends js.Object {
  /**
    * Streaming annotation results.
    */
  var annotationResults: js.UndefOr[Schema$GoogleCloudVideointelligenceV1p3beta1_StreamingVideoAnnotationResults] = js.native
  /**
    * GCS URI that stores annotation results of one streaming session. It is a
    * directory that can hold multiple files in JSON format. Example uri
    * format: gs://bucket_id/object_id/cloud_project_name-session_id
    */
  var annotationResultsUri: js.UndefOr[String] = js.native
  /**
    * If set, returns a google.rpc.Status message that specifies the error for
    * the operation.
    */
  var error: js.UndefOr[Schema$GoogleRpc_Status] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p3beta1_StreamingAnnotateVideoResponse {
  @scala.inline
  def apply(
    annotationResults: Schema$GoogleCloudVideointelligenceV1p3beta1_StreamingVideoAnnotationResults = null,
    annotationResultsUri: String = null,
    error: Schema$GoogleRpc_Status = null
  ): Schema$GoogleCloudVideointelligenceV1p3beta1_StreamingAnnotateVideoResponse = {
    val __obj = js.Dynamic.literal()
    if (annotationResults != null) __obj.updateDynamic("annotationResults")(annotationResults.asInstanceOf[js.Any])
    if (annotationResultsUri != null) __obj.updateDynamic("annotationResultsUri")(annotationResultsUri.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p3beta1_StreamingAnnotateVideoResponse]
  }
}

