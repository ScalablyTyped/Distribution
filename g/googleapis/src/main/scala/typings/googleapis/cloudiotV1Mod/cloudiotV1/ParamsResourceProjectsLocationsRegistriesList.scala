package typings.googleapis.cloudiotV1Mod.cloudiotV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRegistriesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The maximum number of registries to return in the response. If this value
    * is zero, the service will select a default size. A call may return fewer
    * objects than requested. A non-empty `next_page_token` in the response
    * indicates that more data is available.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The value returned by the last `ListDeviceRegistriesResponse`; indicates
    * that this is a continuation of a prior `ListDeviceRegistries` call and
    * the system should return the next page of data.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The project and cloud region path. For example,
    * `projects/example-project/locations/us-central1`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRegistriesList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsRegistriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRegistriesList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsRegistriesListMutableBuilder[Self <: ParamsResourceProjectsLocationsRegistriesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
