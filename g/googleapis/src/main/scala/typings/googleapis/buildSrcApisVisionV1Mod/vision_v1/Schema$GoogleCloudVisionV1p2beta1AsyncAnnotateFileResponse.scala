package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for a single offline file annotation request.
  */
@js.native
trait Schema$GoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse extends js.Object {
  /**
    * The output location and metadata from AsyncAnnotateFileRequest.
    */
  var outputConfig: js.UndefOr[Schema$GoogleCloudVisionV1p2beta1OutputConfig] = js.native
}

object Schema$GoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse {
  @scala.inline
  def apply(outputConfig: Schema$GoogleCloudVisionV1p2beta1OutputConfig = null): Schema$GoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p2beta1AsyncAnnotateFileResponse]
  }
}

