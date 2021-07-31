package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Optionally caller-specified in CreateJob, after which it becomes output
    * only.  The job name. For example:
    * `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.  * `PROJECT_ID`
    * can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens (-), colons
    * (:), or periods (.).    For more information, see    [Identifying
    * projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects)
    * * `LOCATION_ID` is the canonical ID for the job's location.    The list
    * of available locations can be obtained by calling    ListLocations. For
    * more information, see https://cloud.google.com/about/locations/. *
    * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]),    hyphens
    * (-), or underscores (_). The maximum length is 500 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaJob] = js.undefined
  
  /**
    * A  mask used to specify which fields of the job are being updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsJobsPatch {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsJobsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsJobsPatchMutableBuilder[Self <: ParamsResourceProjectsLocationsJobsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaJob): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
