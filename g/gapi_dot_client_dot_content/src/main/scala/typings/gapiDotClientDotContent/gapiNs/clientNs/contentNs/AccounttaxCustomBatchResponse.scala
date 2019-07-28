package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxCustomBatchResponse extends js.Object {
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[AccounttaxCustomBatchResponseEntry]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#accounttaxCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object AccounttaxCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[AccounttaxCustomBatchResponseEntry] = null, kind: String = null): AccounttaxCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccounttaxCustomBatchResponse]
  }
}

