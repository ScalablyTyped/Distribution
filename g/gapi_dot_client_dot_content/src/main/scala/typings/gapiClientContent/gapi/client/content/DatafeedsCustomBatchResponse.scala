package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsCustomBatchResponse extends js.Object {
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[DatafeedsCustomBatchResponseEntry]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#datafeedsCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object DatafeedsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[DatafeedsCustomBatchResponseEntry] = null, kind: String = null): DatafeedsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatafeedsCustomBatchResponse]
  }
}

