package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The returned list of pipelines in the project.
  */
@js.native
trait SchemaListTransferRunsResponse extends js.Object {
  /**
    * Output only. The next-pagination token. For multiple-page list results,
    * this token can be used as the `ListTransferRunsRequest.page_token` to
    * request the next page of list results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Output only. The stored pipeline transfer runs.
    */
  var transferRuns: js.UndefOr[js.Array[SchemaTransferRun]] = js.native
}

object SchemaListTransferRunsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, transferRuns: js.Array[SchemaTransferRun] = null): SchemaListTransferRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (transferRuns != null) __obj.updateDynamic("transferRuns")(transferRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTransferRunsResponse]
  }
}

