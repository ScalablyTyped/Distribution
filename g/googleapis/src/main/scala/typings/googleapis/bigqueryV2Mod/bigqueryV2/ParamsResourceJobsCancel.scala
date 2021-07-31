package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJobsCancel
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * [Required] Job ID of the job to cancel
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * The geographic location of the job. Required except for US and EU. See
    * details at
    * https://cloud.google.com/bigquery/docs/locations#specifying_your_location.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * [Required] Project ID of the job to cancel
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceJobsCancel {
  
  @scala.inline
  def apply(): ParamsResourceJobsCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsCancel]
  }
  
  @scala.inline
  implicit class ParamsResourceJobsCancelMutableBuilder[Self <: ParamsResourceJobsCancel] (val x: Self) extends AnyVal {
    
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
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
