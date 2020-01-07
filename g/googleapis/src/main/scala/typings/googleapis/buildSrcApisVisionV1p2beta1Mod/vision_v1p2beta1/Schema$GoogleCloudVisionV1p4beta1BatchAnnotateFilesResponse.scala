package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of file annotation responses.
  */
@js.native
trait Schema$GoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse extends js.Object {
  /**
    * The list of file annotation responses, each response corresponding to
    * each AnnotateFileRequest in BatchAnnotateFilesRequest.
    */
  var responses: js.UndefOr[js.Array[Schema$GoogleCloudVisionV1p4beta1AnnotateFileResponse]] = js.native
}

object Schema$GoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse {
  @scala.inline
  def apply(responses: js.Array[Schema$GoogleCloudVisionV1p4beta1AnnotateFileResponse] = null): Schema$GoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p4beta1BatchAnnotateFilesResponse]
  }
}

