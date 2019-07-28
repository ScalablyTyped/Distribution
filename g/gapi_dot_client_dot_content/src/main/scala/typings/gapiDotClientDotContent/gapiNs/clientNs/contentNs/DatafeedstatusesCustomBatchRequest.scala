package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesCustomBatchRequest extends js.Object {
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[DatafeedstatusesCustomBatchRequestEntry]] = js.undefined
}

object DatafeedstatusesCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[DatafeedstatusesCustomBatchRequestEntry] = null): DatafeedstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[DatafeedstatusesCustomBatchRequest]
  }
}

