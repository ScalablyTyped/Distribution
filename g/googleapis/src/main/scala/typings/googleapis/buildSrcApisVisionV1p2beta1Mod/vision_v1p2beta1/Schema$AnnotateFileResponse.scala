package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response to a single file annotation request. A file may contain one or
  * more images, which individually have their own responses.
  */
@js.native
trait Schema$AnnotateFileResponse extends js.Object {
  /**
    * Information about the file for which this response is generated.
    */
  var inputConfig: js.UndefOr[Schema$InputConfig] = js.native
  /**
    * Individual responses to images found within the file.
    */
  var responses: js.UndefOr[js.Array[Schema$AnnotateImageResponse]] = js.native
}

object Schema$AnnotateFileResponse {
  @scala.inline
  def apply(inputConfig: Schema$InputConfig = null, responses: js.Array[Schema$AnnotateImageResponse] = null): Schema$AnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    if (inputConfig != null) __obj.updateDynamic("inputConfig")(inputConfig.asInstanceOf[js.Any])
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AnnotateFileResponse]
  }
}

