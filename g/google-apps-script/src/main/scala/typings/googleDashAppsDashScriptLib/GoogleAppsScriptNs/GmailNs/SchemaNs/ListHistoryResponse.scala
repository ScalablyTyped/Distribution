package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHistoryResponse extends js.Object {
  var history: js.UndefOr[js.Array[History]] = js.undefined
  var historyId: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListHistoryResponse {
  @scala.inline
  def apply(
    history: js.Array[History] = null,
    historyId: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): ListHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (history != null) __obj.updateDynamic("history")(history)
    if (historyId != null) __obj.updateDynamic("historyId")(historyId)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListHistoryResponse]
  }
}

