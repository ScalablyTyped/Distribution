package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AccountstatusesCustomBatchRequest extends js.Object {
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[Schema$AccountstatusesCustomBatchRequestEntry]] = js.native
}

object Schema$AccountstatusesCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[Schema$AccountstatusesCustomBatchRequestEntry] = null): Schema$AccountstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountstatusesCustomBatchRequest]
  }
}

