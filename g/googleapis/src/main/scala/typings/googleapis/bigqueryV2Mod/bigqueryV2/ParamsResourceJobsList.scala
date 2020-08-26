package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceJobsList extends StandardParameters {
  /**
    * Whether to display jobs owned by all users in the project. Default false
    */
  var allUsers: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Max value for job creation time, in milliseconds since the POSIX epoch.
    * If set, only jobs created before or at this timestamp are returned
    */
  var maxCreationTime: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * Min value for job creation time, in milliseconds since the POSIX epoch.
    * If set, only jobs created after or at this timestamp are returned
    */
  var minCreationTime: js.UndefOr[String] = js.native
  /**
    * Page token, returned by a previous call, to request the next page of
    * results
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Project ID of the jobs to list
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Restrict information returned to a set of selected fields
    */
  var projection: js.UndefOr[String] = js.native
  /**
    * Filter for job state
    */
  var stateFilter: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceJobsList {
  @scala.inline
  def apply(): ParamsResourceJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsList]
  }
  @scala.inline
  implicit class ParamsResourceJobsListOps[Self <: ParamsResourceJobsList] (val x: Self) extends AnyVal {
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
    def setAllUsers(value: Boolean): Self = this.set("allUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllUsers: Self = this.set("allUsers", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setMaxCreationTime(value: String): Self = this.set("maxCreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCreationTime: Self = this.set("maxCreationTime", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setMinCreationTime(value: String): Self = this.set("minCreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCreationTime: Self = this.set("minCreationTime", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setStateFilterVarargs(value: String*): Self = this.set("stateFilter", js.Array(value :_*))
    @scala.inline
    def setStateFilter(value: js.Array[String]): Self = this.set("stateFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateFilter: Self = this.set("stateFilter", js.undefined)
  }
  
}

