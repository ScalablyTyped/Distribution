package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListScanRuns` method.
  */
@js.native
trait Schema$ListScanRunsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of ScanRuns returned.
    */
  var scanRuns: js.UndefOr[js.Array[Schema$ScanRun]] = js.native
}

object Schema$ListScanRunsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, scanRuns: js.Array[Schema$ScanRun] = null): Schema$ListScanRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (scanRuns != null) __obj.updateDynamic("scanRuns")(scanRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListScanRunsResponse]
  }
}

