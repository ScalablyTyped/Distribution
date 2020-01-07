package typings.googleapis.buildSrcApisSpannerV1Mod.spanner_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarInstancesDollarDatabasesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Number of databases to be returned in the response. If 0 or less,
    * defaults to the server's maximum allowed page size.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * If non-empty, `page_token` should contain a next_page_token from a
    * previous ListDatabasesResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required. The instance whose databases should be listed. Values are of
    * the form `projects/<project>/instances/<instance>`.
    */
  var parent: js.UndefOr[String] = js.native
}

