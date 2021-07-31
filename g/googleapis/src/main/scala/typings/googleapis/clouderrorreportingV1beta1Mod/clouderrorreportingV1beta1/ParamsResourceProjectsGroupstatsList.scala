package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGroupstatsList
  extends StObject
     with StandardParameters {
  
  /**
    * [Optional] The alignment of the timed counts to be returned. Default is
    * `ALIGNMENT_EQUAL_AT_END`.
    */
  var alignment: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] Time where the timed counts shall be aligned if rounded
    * alignment is chosen. Default is 00:00 UTC.
    */
  var alignmentTime: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * [Optional] List all <code>ErrorGroupStats</code> with these IDs.
    */
  var groupId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * [Optional] The sort order in which the results are returned. Default is
    * `COUNT_DESC`.
    */
  var order: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The maximum number of results to return per response. Default
    * is 20.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * [Optional] A `next_page_token` provided by a previous response. To view
    * additional results, pass this token along with the identical query
    * parameters as the first request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * [Required] The resource name of the Google Cloud Platform project.
    * Written as <code>projects/</code> plus the <a
    * href="https://support.google.com/cloud/answer/6158840">Google Cloud
    * Platform project ID</a>.  Example: <code>projects/my-project-123</code>.
    */
  var projectName: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
    */
  @JSName("serviceFilter.resourceType")
  var serviceFilterDotresourceType: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
    */
  @JSName("serviceFilter.service")
  var serviceFilterDotservice: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The exact value to match against
    * [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
    */
  @JSName("serviceFilter.version")
  var serviceFilterDotversion: js.UndefOr[String] = js.undefined
  
  /**
    * Restricts the query to the specified time range.
    */
  @JSName("timeRange.period")
  var timeRangeDotperiod: js.UndefOr[String] = js.undefined
  
  /**
    * [Optional] The preferred duration for a single returned `TimedCount`. If
    * not set, no timed counts are returned.
    */
  var timedCountDuration: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGroupstatsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsGroupstatsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGroupstatsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsGroupstatsListMutableBuilder[Self <: ParamsResourceProjectsGroupstatsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentTime(value: String): Self = StObject.set(x, "alignmentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentTimeUndefined: Self = StObject.set(x, "alignmentTime", js.undefined)
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setGroupId(value: js.Array[String]): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setGroupIdVarargs(value: String*): Self = StObject.set(x, "groupId", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: String): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
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
    
    @scala.inline
    def setTimedCountDuration(value: String): Self = StObject.set(x, "timedCountDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedCountDurationUndefined: Self = StObject.set(x, "timedCountDuration", js.undefined)
  }
}
