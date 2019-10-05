package typings.gapiDotClientDotBigquerydatatransfer.gapi.client.bigquerydatatransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTransferRunsResponse extends js.Object {
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the
    * `ListTransferRunsRequest.page_token`
    * to request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Output only. The stored pipeline transfer runs. */
  var transferRuns: js.UndefOr[js.Array[TransferRun]] = js.undefined
}

object ListTransferRunsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, transferRuns: js.Array[TransferRun] = null): ListTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (transferRuns != null) __obj.updateDynamic("transferRuns")(transferRuns)
    __obj.asInstanceOf[ListTransferRunsResponse]
  }
}

