package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a batch image annotation request.
  */
@js.native
trait Schema$BatchAnnotateImagesResponse extends js.Object {
  /**
    * Individual responses to image annotation requests within the batch.
    */
  var responses: js.UndefOr[js.Array[Schema$AnnotateImageResponse]] = js.native
}

object Schema$BatchAnnotateImagesResponse {
  @scala.inline
  def apply(responses: js.Array[Schema$AnnotateImageResponse] = null): Schema$BatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchAnnotateImagesResponse]
  }
}

