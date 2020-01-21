package typings.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAnnotateImagesResponse extends js.Object {
  /** Individual responses to image annotation requests within the batch. */
  var responses: js.UndefOr[js.Array[AnnotateImageResponse]] = js.undefined
}

object BatchAnnotateImagesResponse {
  @scala.inline
  def apply(responses: js.Array[AnnotateImageResponse] = null): BatchAnnotateImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAnnotateImagesResponse]
  }
}

