package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a batch image annotation request.
  */
@js.native
trait Schema$GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse extends js.Object {
  /**
    * Individual responses to image annotation requests within the batch.
    */
  var responses: js.UndefOr[js.Array[Schema$GoogleCloudVisionV1p1beta1AnnotateImageResponse]] = js.native
}

object Schema$GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse {
  @scala.inline
  def apply(responses: js.Array[Schema$GoogleCloudVisionV1p1beta1AnnotateImageResponse] = null): Schema$GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p1beta1BatchAnnotateImagesResponse]
  }
}

