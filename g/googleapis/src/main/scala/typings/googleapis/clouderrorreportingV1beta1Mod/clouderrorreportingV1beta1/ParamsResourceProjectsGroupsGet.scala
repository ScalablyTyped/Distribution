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

object ParamsResourceProjectsGroupsGet {
  @scala.inline
  def apply(): ParamsResourceProjectsGroupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGroupsGet]
  }
  @scala.inline
  implicit class ParamsResourceProjectsGroupsGetOps[Self <: ParamsResourceProjectsGroupsGet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
  }
  
}

