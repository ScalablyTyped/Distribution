package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RegionalinventoryCustomBatchRequest extends js.Object {
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[Schema$RegionalinventoryCustomBatchRequestEntry]] = js.native
}

object Schema$RegionalinventoryCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[Schema$RegionalinventoryCustomBatchRequestEntry] = null): Schema$RegionalinventoryCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionalinventoryCustomBatchRequest]
  }
}

