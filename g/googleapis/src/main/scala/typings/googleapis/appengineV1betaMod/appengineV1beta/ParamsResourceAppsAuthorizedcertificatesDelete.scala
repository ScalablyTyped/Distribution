package typings.googleapis.appengineV1betaMod.appengineV1beta

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsAuthorizedcertificatesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the resource to delete. Example:
    * apps/myapp/authorizedCertificates/12345.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var authorizedCertificatesId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsAuthorizedcertificatesDelete {
  
  @scala.inline
  def apply(): ParamsResourceAppsAuthorizedcertificatesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsAuthorizedcertificatesDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceAppsAuthorizedcertificatesDeleteMutableBuilder[Self <: ParamsResourceAppsAuthorizedcertificatesDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setAuthorizedCertificatesId(value: String): Self = StObject.set(x, "authorizedCertificatesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizedCertificatesIdUndefined: Self = StObject.set(x, "authorizedCertificatesId", js.undefined)
  }
}
