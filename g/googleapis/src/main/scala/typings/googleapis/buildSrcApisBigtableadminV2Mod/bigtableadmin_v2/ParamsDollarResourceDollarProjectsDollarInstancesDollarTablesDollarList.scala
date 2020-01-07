package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarInstancesDollarTablesDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Maximum number of results per page. CURRENTLY UNIMPLEMENTED AND IGNORED.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value of `next_page_token` returned by a previous call.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The unique name of the instance for which tables should be listed. Values
    * are of the form `projects/<project>/instances/<instance>`.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The view to be applied to the returned tables' fields. Defaults to
    * `NAME_ONLY` if unspecified; no others are currently supported.
    */
  var view: js.UndefOr[String] = js.native
}

