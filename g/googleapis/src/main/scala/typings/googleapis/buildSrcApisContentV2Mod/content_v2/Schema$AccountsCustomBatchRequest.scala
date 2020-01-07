package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$AccountsCustomBatchRequest extends js.Object {
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[Schema$AccountsCustomBatchRequestEntry]] = js.native
}

object Schema$AccountsCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[Schema$AccountsCustomBatchRequestEntry] = null): Schema$AccountsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountsCustomBatchRequest]
  }
}

