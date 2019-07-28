package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesCustomBatchRequest extends js.Object {
  var entries: js.UndefOr[js.Array[AccountstatusesCustomBatchRequestEntry]] = js.undefined
}

object AccountstatusesCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[AccountstatusesCustomBatchRequestEntry] = null): AccountstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[AccountstatusesCustomBatchRequest]
  }
}

