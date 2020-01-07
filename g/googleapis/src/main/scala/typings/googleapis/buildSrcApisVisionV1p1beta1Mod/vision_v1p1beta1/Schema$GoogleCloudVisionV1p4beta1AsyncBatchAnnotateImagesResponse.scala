package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to an async batch image annotation request.
  */
@js.native
trait Schema$GoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse extends js.Object {
  /**
    * The output location and metadata from AsyncBatchAnnotateImagesRequest.
    */
  var outputConfig: js.UndefOr[Schema$GoogleCloudVisionV1p4beta1OutputConfig] = js.native
}

object Schema$GoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse {
  @scala.inline
  def apply(outputConfig: Schema$GoogleCloudVisionV1p4beta1OutputConfig = null): Schema$GoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p4beta1AsyncBatchAnnotateImagesResponse]
  }
}

