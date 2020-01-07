package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarLogsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. The maximum number of results to return from this request.
    * Non-positive values are ignored. The presence of nextPageToken in the
    * response indicates that more results might be available.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional. If present, then retrieve the next batch of results from the
    * preceding call to this method. pageToken must be the value of
    * nextPageToken from the previous response. The values of other method
    * parameters should be identical to those in the previous call.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The resource name that owns the logs: "projects/[PROJECT_ID]"
    * "organizations/[ORGANIZATION_ID]" "billingAccounts/[BILLING_ACCOUNT_ID]"
    * "folders/[FOLDER_ID]"
    */
  var parent: js.UndefOr[String] = js.native
}

