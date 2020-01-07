package typings.googleapis.buildSrcApisBigtableadminV2Mod.bigtableadmin_v2

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarInstancesDollarAppprofilesDollarList extends StandardParameters {
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
    * The unique name of the instance for which a list of app profiles is
    * requested. Values are of the form
    * `projects/<project>/instances/<instance>`. Use `<instance> = '-'` to list
    * AppProfiles for all Instances in a project, e.g.,
    * `projects/myproject/instances/-`.
    */
  var parent: js.UndefOr[String] = js.native
}

