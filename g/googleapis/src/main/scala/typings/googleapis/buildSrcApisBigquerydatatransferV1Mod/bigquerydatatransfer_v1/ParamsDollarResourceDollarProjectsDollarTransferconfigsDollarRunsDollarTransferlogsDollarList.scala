package typings.googleapis.buildSrcApisBigquerydatatransferV1Mod.bigquerydatatransfer_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarTransferconfigsDollarRunsDollarTransferlogsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Message types to return. If not populated - INFO, WARNING and ERROR
    * messages are returned.
    */
  var messageTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Page size. The default page size is the maximum value of 1000 results.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Pagination token, which can be used to request a specific page of
    * `ListTransferLogsRequest` list results. For multiple-page results,
    * `ListTransferLogsResponse` outputs a `next_page` token, which can be used
    * as the `page_token` value to request the next page of list results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Transfer run name in the form:
    * `projects/{project_id}/transferConfigs/{config_Id}/runs/{run_id}`.
    */
  var parent: js.UndefOr[String] = js.native
}

