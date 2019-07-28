package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchResponse extends js.Object {
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[AccountsCustomBatchResponseEntry]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object AccountsCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[AccountsCustomBatchResponseEntry] = null, kind: String = null): AccountsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountsCustomBatchResponse]
  }
}

