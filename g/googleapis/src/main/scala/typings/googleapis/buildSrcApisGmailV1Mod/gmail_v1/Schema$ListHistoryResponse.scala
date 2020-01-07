package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListHistoryResponse extends js.Object {
  /**
    * List of history records. Any messages contained in the response will
    * typically only have id and threadId fields populated.
    */
  var history: js.UndefOr[js.Array[Schema$History]] = js.native
  /**
    * The ID of the mailbox&#39;s current history record.
    */
  var historyId: js.UndefOr[String] = js.native
  /**
    * Page token to retrieve the next page of results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListHistoryResponse {
  @scala.inline
  def apply(history: js.Array[Schema$History] = null, historyId: String = null, nextPageToken: String = null): Schema$ListHistoryResponse = {
    val __obj = js.Dynamic.literal()
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (historyId != null) __obj.updateDynamic("historyId")(historyId.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListHistoryResponse]
  }
}

