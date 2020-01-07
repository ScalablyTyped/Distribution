package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarFoldersDollarSinksDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The resource name of the sink:
    * "projects/[PROJECT_ID]/sinks/[SINK_ID]"
    * "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
    * "folders/[FOLDER_ID]/sinks/[SINK_ID]" Example:
    * "projects/my-project-id/sinks/my-sink-id".
    */
  var sinkName: js.UndefOr[String] = js.native
}

