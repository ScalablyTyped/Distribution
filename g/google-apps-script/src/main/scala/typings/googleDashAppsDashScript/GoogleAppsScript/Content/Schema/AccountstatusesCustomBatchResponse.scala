package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountstatusesCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[AccountstatusesCustomBatchResponseEntry]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object AccountstatusesCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[AccountstatusesCustomBatchResponseEntry] = null, kind: String = null): AccountstatusesCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[AccountstatusesCustomBatchResponse]
  }
}

