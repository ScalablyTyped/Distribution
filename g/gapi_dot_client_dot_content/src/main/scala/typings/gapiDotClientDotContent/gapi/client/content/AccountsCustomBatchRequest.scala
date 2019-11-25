package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchRequest extends js.Object {
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[AccountsCustomBatchRequestEntry]] = js.undefined
}

object AccountsCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[AccountsCustomBatchRequestEntry] = null): AccountsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountsCustomBatchRequest]
  }
}

