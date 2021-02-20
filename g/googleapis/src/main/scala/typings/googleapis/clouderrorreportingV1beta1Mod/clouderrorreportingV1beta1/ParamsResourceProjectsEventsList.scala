package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ParamsResourceProjectsEventsListMutableBuilder[Self <: ParamsResourceProjectsEventsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    @scala.inline
    def setServiceFilterDotresourceType(value: String): Self = StObject.set(x, "serviceFilter.resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceFilterDotresourceTypeUndefined: Self = StObject.set(x, "serviceFilter.resourceType", js.undefined)
    
    @scala.inline
    def setServiceFilterDotservice(value: String): Self = StObject.set(x, "serviceFilter.service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceFilterDotserviceUndefined: Self = StObject.set(x, "serviceFilter.service", js.undefined)
    
    @scala.inline
    def setServiceFilterDotversion(value: String): Self = StObject.set(x, "serviceFilter.version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceFilterDotversionUndefined: Self = StObject.set(x, "serviceFilter.version", js.undefined)
    
    @scala.inline
    def setTimeRangeDotperiod(value: String): Self = StObject.set(x, "timeRange.period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeRangeDotperiodUndefined: Self = StObject.set(x, "timeRange.period", js.undefined)
  }
}
