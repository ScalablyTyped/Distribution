package typings.gapiDotClientDotBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTransferLogsResponse extends js.Object {
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the
    * `GetTransferRunLogRequest.page_token`
    * to request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Output only. The stored pipeline transfer messages. */
  var transferMessages: js.UndefOr[js.Array[TransferMessage]] = js.undefined
}

object ListTransferLogsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, transferMessages: js.Array[TransferMessage] = null): ListTransferLogsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (transferMessages != null) __obj.updateDynamic("transferMessages")(transferMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTransferLogsResponse]
  }
}

