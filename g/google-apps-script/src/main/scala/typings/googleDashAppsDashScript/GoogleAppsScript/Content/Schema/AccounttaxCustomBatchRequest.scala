package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxCustomBatchRequest extends js.Object {
  var entries: js.UndefOr[js.Array[AccounttaxCustomBatchRequestEntry]] = js.undefined
}

object AccounttaxCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[AccounttaxCustomBatchRequestEntry] = null): AccounttaxCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[AccounttaxCustomBatchRequest]
  }
}

