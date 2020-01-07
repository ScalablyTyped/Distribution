package typings.googleapis.buildSrcApisWebsecurityscannerV1betaMod.websecurityscanner_v1beta

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarFindingtypestatsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required. The parent resource name, which should be a scan run resource
    * name in the format
    * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    */
  var parent: js.UndefOr[String] = js.native
}

