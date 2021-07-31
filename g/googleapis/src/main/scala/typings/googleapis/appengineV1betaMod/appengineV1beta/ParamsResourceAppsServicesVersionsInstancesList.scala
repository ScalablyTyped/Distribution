package typings.googleapis.appengineV1betaMod.appengineV1beta

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsServicesVersionsInstancesList
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `parent`. Name of the parent Version resource. Example:
    * apps/myapp/services/default/versions/v1.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Maximum results to return per page.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `parent`. See documentation of `appsId`.
    */
  var servicesId: js.UndefOr[String] = js.undefined
  
  /**
    * Part of `parent`. See documentation of `appsId`.
    */
  var versionsId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsServicesVersionsInstancesList {
  
  @scala.inline
  def apply(): ParamsResourceAppsServicesVersionsInstancesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsServicesVersionsInstancesList]
  }
  
  @scala.inline
  implicit class ParamsResourceAppsServicesVersionsInstancesListMutableBuilder[Self <: ParamsResourceAppsServicesVersionsInstancesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
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
    def setServicesId(value: String): Self = StObject.set(x, "servicesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesIdUndefined: Self = StObject.set(x, "servicesId", js.undefined)
    
    @scala.inline
    def setVersionsId(value: String): Self = StObject.set(x, "versionsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsIdUndefined: Self = StObject.set(x, "versionsId", js.undefined)
  }
}
