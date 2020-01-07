package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to an async batch file annotation request.
  */
@js.native
trait Schema$GoogleCloudVisionV1p4beta1AsyncBatchAnnotateFilesResponse extends js.Object {
  /**
    * The list of file annotation responses, one for each request in
    * AsyncBatchAnnotateFilesRequest.
    */
  var responses: js.UndefOr[js.Array[Schema$GoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse]] = js.native
}

object Schema$GoogleCloudVisionV1p4beta1AsyncBatchAnnotateFilesResponse {
  @scala.inline
  def apply(responses: js.Array[Schema$GoogleCloudVisionV1p4beta1AsyncAnnotateFileResponse] = null): Schema$GoogleCloudVisionV1p4beta1AsyncBatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p4beta1AsyncBatchAnnotateFilesResponse]
  }
}

