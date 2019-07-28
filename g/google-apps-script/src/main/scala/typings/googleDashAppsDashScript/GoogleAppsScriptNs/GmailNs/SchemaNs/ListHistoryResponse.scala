package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHistoryResponse extends js.Object {
  var history: js.UndefOr[js.Array[History]] = js.undefined
  var historyId: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListHistoryResponse {
  @scala.inline
  def apply(history: js.Array[History] = null, historyId: String = null, nextPageToken: String = null): ListHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (history != null) __obj.updateDynamic("history")(history)
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListHistoryResponse]
  }
}

