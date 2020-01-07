package typings.googleapis.buildSrcApisWebsecurityscannerV1alphaMod.websecurityscanner_v1alpha

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarScanconfigsDollarScanrunsDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of ScanRuns to return, can be limited by server. If
    * not specified or not positive, the implementation will select a
    * reasonable value.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results to be returned. This should be a
    * `next_page_token` value returned from a previous List request. If
    * unspecified, the first page of results is returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The parent resource name, which should be a scan resource name
    * in the format 'projects/{projectId}/scanConfigs/{scanConfigId}'.
    */
  var parent: js.UndefOr[String] = js.native
}

