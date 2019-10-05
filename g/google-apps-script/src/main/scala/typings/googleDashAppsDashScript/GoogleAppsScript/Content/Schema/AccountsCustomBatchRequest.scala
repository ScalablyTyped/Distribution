package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountsCustomBatchRequest extends js.Object {
  var entries: js.UndefOr[js.Array[AccountsCustomBatchRequestEntry]] = js.undefined
}

object AccountsCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[AccountsCustomBatchRequestEntry] = null): AccountsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[AccountsCustomBatchRequest]
  }
}

