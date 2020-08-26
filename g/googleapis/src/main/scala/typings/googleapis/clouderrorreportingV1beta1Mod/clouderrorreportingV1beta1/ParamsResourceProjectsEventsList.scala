package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceProjectsEventsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * [Required] The group for which events shall be returned.
    */
  var groupId: js.UndefOr[String] = js.native
  /**
    * [Optional] The maximum number of results to return per response.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * [Optional] A `next_page_token` provided by a previous response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * [Required] The resource name of the Google Cloud Platform project.
    * Written as `projects/` plus the [Google Cloud Platform project
    * ID](https://support.google.com/cloud/answer/6158840). Example:
    * `projects/my-project-123`.
    */
  var projectName: js.UndefOr[String] = js.native
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
    */
  @JSName("serviceFilter.resourceType")
  var serviceFilterDotresourceType: js.UndefOr[String] = js.native
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
    */
  @JSName("serviceFilter.service")
  var serviceFilterDotservice: js.UndefOr[String] = js.native
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
    */
  @JSName("serviceFilter.version")
  var serviceFilterDotversion: js.UndefOr[String] = js.native
  /**
    * Restricts the query to the specified time range.
    */
  @JSName("timeRange.period")
  var timeRangeDotperiod: js.UndefOr[String] = js.native
}

object ParamsResourceProjectsEventsList {
  @scala.inline
  def apply(): ParamsResourceProjectsEventsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsEventsList]
  }
  @scala.inline
  implicit class ParamsResourceProjectsEventsListOps[Self <: ParamsResourceProjectsEventsList] (val x: Self) extends AnyVal {
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
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setProjectName(value: String): Self = this.set("projectName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectName: Self = this.set("projectName", js.undefined)
    @scala.inline
    def setServiceFilterDotresourceType(value: String): Self = this.set("serviceFilter.resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceFilterDotresourceType: Self = this.set("serviceFilter.resourceType", js.undefined)
    @scala.inline
    def setServiceFilterDotservice(value: String): Self = this.set("serviceFilter.service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceFilterDotservice: Self = this.set("serviceFilter.service", js.undefined)
    @scala.inline
    def setServiceFilterDotversion(value: String): Self = this.set("serviceFilter.version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceFilterDotversion: Self = this.set("serviceFilter.version", js.undefined)
    @scala.inline
    def setTimeRangeDotperiod(value: String): Self = this.set("timeRange.period", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeRangeDotperiod: Self = this.set("timeRange.period", js.undefined)
  }
  
}

