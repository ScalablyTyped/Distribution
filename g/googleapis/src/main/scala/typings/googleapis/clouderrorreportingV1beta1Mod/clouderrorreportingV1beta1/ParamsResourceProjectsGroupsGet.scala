package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsGroupsGet extends StandardParameters {
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

