package typings.googleapis.cloudiotV1Mod.cloudiotV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsLocationsRegistriesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of registries to return in the response. If this value
    * is zero, the service will select a default size. A call may return fewer
    * objects than requested. A non-empty `next_page_token` in the response
    * indicates that more data is available.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The value returned by the last `ListDeviceRegistriesResponse`; indicates
    * that this is a continuation of a prior `ListDeviceRegistries` call and
    * the system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The project and cloud region path. For example,
    * `projects/example-project/locations/us-central1`.
    */
  var parent: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsLocationsRegistriesList {
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsRegistriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsLocationsRegistriesListOps[Self <: ParamsResourceProjectsLocationsRegistriesList] (val x: Self) extends AnyVal {
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

