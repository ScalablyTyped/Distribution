package typings.gapiDotClientDotGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHistoryResponse extends js.Object {
  /** List of history records. Any messages contained in the response will typically only have id and threadId fields populated. */
  var history: js.UndefOr[js.Array[History]] = js.undefined
  /** The ID of the mailbox's current history record. */
  var historyId: js.UndefOr[String] = js.undefined
  /** Page token to retrieve the next page of results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListHistoryResponse {
  @scala.inline
  def apply(history: js.Array[History] = null, historyId: String = null, nextPageToken: String = null): ListHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHistoryResponse]
  }
}

