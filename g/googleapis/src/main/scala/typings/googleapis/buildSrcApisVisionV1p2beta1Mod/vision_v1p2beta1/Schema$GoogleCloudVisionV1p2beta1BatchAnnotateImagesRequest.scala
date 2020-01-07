package typings.googleapis.buildSrcApisVisionV1p2beta1Mod.vision_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Multiple image annotation requests are batched into a single service call.
  */
@js.native
trait Schema$GoogleCloudVisionV1p2beta1BatchAnnotateImagesRequest extends js.Object {
  /**
    * Individual image annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[Schema$GoogleCloudVisionV1p2beta1AnnotateImageRequest]] = js.native
}

object Schema$GoogleCloudVisionV1p2beta1BatchAnnotateImagesRequest {
  @scala.inline
  def apply(requests: js.Array[Schema$GoogleCloudVisionV1p2beta1AnnotateImageRequest] = null): Schema$GoogleCloudVisionV1p2beta1BatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p2beta1BatchAnnotateImagesRequest]
  }
}

