package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersCustomBatchRequest extends js.Object {
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[Schema$OrdersCustomBatchRequestEntry]] = js.native
}

object Schema$OrdersCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[Schema$OrdersCustomBatchRequestEntry] = null): Schema$OrdersCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersCustomBatchRequest]
  }
}

