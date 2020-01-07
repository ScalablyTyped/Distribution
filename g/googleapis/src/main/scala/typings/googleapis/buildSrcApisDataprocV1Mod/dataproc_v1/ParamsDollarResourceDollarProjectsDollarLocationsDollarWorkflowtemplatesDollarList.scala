package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarLocationsDollarWorkflowtemplatesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Optional. The maximum number of results to return in each response.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional. The page token, returned by a previous call, to request the
    * next page of results.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The "resource name" of the region, as described in
    * https://cloud.google.com/apis/design/resource_names of the form
    * projects/{project_id}/regions/{region}
    */
  var parent: js.UndefOr[String] = js.native
}

