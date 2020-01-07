package typings.googleapis.buildSrcApisClouderrorreportingV1beta1Mod.clouderrorreporting_v1beta1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarProjectsDollarGroupsDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * [Required] The group resource name. Written as
    * <code>projects/<var>projectID</var>/groups/<var>group_name</var></code>.
    * Call <a
    * href="/error-reporting/reference/rest/v1beta1/projects.groupStats/list">
    * <code>groupStats.list</code></a> to return a list of groups belonging to
    * this project.  Example:
    * <code>projects/my-project-123/groups/my-group</code>
    */
  var groupName: js.UndefOr[String] = js.native
}

