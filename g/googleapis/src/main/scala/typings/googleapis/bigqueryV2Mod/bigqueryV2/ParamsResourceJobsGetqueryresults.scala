package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJobsGetqueryresults
  extends StObject
     with StandardParameters {
  
  /**
    * [Required] Job ID of the query job
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * The geographic location where the job should run. Required except for US and EU. See details at https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results to read
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token, returned by a previous call, to request the next page of results
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * [Required] Project ID of the query job
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Zero-based index of the starting row
    */
  var startIndex: js.UndefOr[String] = js.undefined
  
  /**
    * How long to wait for the query to complete, in milliseconds, before returning. Default is 10 seconds. If the timeout passes before the job completes, the 'jobComplete' field in the response will be false
    */
  var timeoutMs: js.UndefOr[Double] = js.undefined
}
object ParamsResourceJobsGetqueryresults {
  
  inline def apply(): ParamsResourceJobsGetqueryresults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsGetqueryresults]
  }
  
  extension [Self <: ParamsResourceJobsGetqueryresults](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setStartIndex(value: String): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
    
    inline def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
  }
}
