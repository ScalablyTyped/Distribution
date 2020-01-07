package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Multiple image annotation requests are batched into a single service call.
  */
@js.native
trait Schema$BatchAnnotateImagesRequest extends js.Object {
  /**
    * Individual image annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[Schema$AnnotateImageRequest]] = js.native
}

object Schema$BatchAnnotateImagesRequest {
  @scala.inline
  def apply(requests: js.Array[Schema$AnnotateImageRequest] = null): Schema$BatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchAnnotateImagesRequest]
  }
}

