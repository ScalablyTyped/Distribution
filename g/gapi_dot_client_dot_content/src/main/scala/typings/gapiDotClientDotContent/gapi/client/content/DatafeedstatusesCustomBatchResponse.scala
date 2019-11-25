package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesCustomBatchResponse extends js.Object {
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[DatafeedstatusesCustomBatchResponseEntry]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#datafeedstatusesCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object DatafeedstatusesCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[DatafeedstatusesCustomBatchResponseEntry] = null, kind: String = null): DatafeedstatusesCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedstatusesCustomBatchResponse]
  }
}

