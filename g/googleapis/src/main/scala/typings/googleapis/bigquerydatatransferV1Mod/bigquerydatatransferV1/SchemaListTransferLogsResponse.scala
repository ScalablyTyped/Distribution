package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The returned list transfer run messages.
  */
@js.native
trait SchemaListTransferLogsResponse extends js.Object {
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the `GetTransferRunLogRequest.page_token` to
    * request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. The stored pipeline transfer messages.
    */
  var transferMessages: js.UndefOr[js.Array[SchemaTransferMessage]] = js.native
}

object SchemaListTransferLogsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, transferMessages: js.Array[SchemaTransferMessage] = null): SchemaListTransferLogsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (transferMessages != null) __obj.updateDynamic("transferMessages")(transferMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTransferLogsResponse]
  }
}

