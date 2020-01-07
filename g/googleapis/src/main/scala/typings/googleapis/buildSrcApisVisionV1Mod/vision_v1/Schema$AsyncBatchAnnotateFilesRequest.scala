package typings.googleapis.buildSrcApisVisionV1Mod.vision_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Multiple async file annotation requests are batched into a single service
  * call.
  */
@js.native
trait Schema$AsyncBatchAnnotateFilesRequest extends js.Object {
  /**
    * Individual async file annotation requests for this batch.
    */
  var requests: js.UndefOr[js.Array[Schema$AsyncAnnotateFileRequest]] = js.native
}

object Schema$AsyncBatchAnnotateFilesRequest {
  @scala.inline
  def apply(requests: js.Array[Schema$AsyncAnnotateFileRequest] = null): Schema$AsyncBatchAnnotateFilesRequest = {
    val __obj = js.Dynamic.literal()
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AsyncBatchAnnotateFilesRequest]
  }
}

