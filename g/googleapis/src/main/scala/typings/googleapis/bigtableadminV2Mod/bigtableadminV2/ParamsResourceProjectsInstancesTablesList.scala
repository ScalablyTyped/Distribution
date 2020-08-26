package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsInstancesTablesList extends StandardParameters {
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

object ParamsResourceProjectsInstancesTablesList {
  @scala.inline
  def apply(): ParamsResourceProjectsInstancesTablesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesTablesList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsInstancesTablesListOps[Self <: ParamsResourceProjectsInstancesTablesList] (val x: Self) extends AnyVal {
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
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

