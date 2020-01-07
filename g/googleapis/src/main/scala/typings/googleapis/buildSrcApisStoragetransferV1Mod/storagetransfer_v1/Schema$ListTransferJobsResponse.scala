package typings.googleapis.buildSrcApisStoragetransferV1Mod.storagetransfer_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from ListTransferJobs.
  */
@js.native
trait Schema$ListTransferJobsResponse extends js.Object {
  /**
    * The list next page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of transfer jobs.
    */
  var transferJobs: js.UndefOr[js.Array[Schema$TransferJob]] = js.native
}

object Schema$ListTransferJobsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, transferJobs: js.Array[Schema$TransferJob] = null): Schema$ListTransferJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (transferJobs != null) __obj.updateDynamic("transferJobs")(transferJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListTransferJobsResponse]
  }
}

