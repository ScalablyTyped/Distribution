package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsJobsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Requested page size.  The maximum page size is 500. If unspecified, the
    * page size will be the maximum. Fewer jobs than requested might be
    * returned, even if more jobs exist; use next_page_token to determine if
    * more jobs exist.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server will return. To request
    * the first page results, page_token must be empty. To request the next
    * page of results, page_token must be the value of next_page_token returned
    * from the previous call to ListJobs. It is an error to switch the value of
    * filter or order_by while iterating through pages.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Required.  The location name. For example:
    * `projects/PROJECT_ID/locations/LOCATION_ID`.
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsJobsList {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsJobsListOps[Self <: ParamsResourceProjectsLocationsJobsList] (val x: Self) extends AnyVal {
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
  }
  
}

