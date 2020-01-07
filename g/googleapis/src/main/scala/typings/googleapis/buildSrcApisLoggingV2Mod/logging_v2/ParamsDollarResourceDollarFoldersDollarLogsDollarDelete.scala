package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarFoldersDollarLogsDollarDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The resource name of the log to delete:
    * "projects/[PROJECT_ID]/logs/[LOG_ID]"
    * "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
    * "folders/[FOLDER_ID]/logs/[LOG_ID]" [LOG_ID] must be URL-encoded. For
    * example, "projects/my-project-id/logs/syslog",
    * "organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity".
    * For more information about log names, see LogEntry.
    */
  var logName: js.UndefOr[String] = js.native
}

