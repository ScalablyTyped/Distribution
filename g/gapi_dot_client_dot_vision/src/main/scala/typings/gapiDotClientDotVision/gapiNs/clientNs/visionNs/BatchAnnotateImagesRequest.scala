package typings.gapiDotClientDotVision.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAnnotateImagesRequest extends js.Object {
  /** Individual image annotation requests for this batch. */
  var requests: js.UndefOr[js.Array[AnnotateImageRequest]] = js.undefined
}

object BatchAnnotateImagesRequest {
  @scala.inline
  def apply(requests: js.Array[AnnotateImageRequest] = null): BatchAnnotateImagesRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests)
    __obj.asInstanceOf[BatchAnnotateImagesRequest]
  }
}

