package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceJobsGetqueryresults extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * [Required] Job ID of the query job
    */
  var jobId: js.UndefOr[String] = js.native
  
  /**
    * The geographic location where the job should run. Required except for US
    * and EU. See details at
    * https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Maximum number of results to read
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Page token, returned by a previous call, to request the next page of
    * results
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * [Required] Project ID of the query job
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Zero-based index of the starting row
    */
  var startIndex: js.UndefOr[String] = js.native
  
  /**
    * How long to wait for the query to complete, in milliseconds, before
    * returning. Default is 10 seconds. If the timeout passes before the job
    * completes, the 'jobComplete' field in the response will be false
    */
  var timeoutMs: js.UndefOr[Double] = js.native
}
object ParamsResourceJobsGetqueryresults {
  
  @scala.inline
  def apply(): ParamsResourceJobsGetqueryresults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsGetqueryresults]
  }
  
  @scala.inline
  implicit class ParamsResourceJobsGetqueryresultsMutableBuilder[Self <: ParamsResourceJobsGetqueryresults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setStartIndex(value: String): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
  }
}
