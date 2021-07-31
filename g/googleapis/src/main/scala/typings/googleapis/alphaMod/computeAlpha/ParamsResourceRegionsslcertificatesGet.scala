package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegionsslcertificatesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region scoping this request.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the SslCertificate resource to return.
    */
  var sslCertificate: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegionsslcertificatesGet {
  
  @scala.inline
  def apply(): ParamsResourceRegionsslcertificatesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegionsslcertificatesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceRegionsslcertificatesGetMutableBuilder[Self <: ParamsResourceRegionsslcertificatesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setSslCertificate(value: String): Self = StObject.set(x, "sslCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslCertificateUndefined: Self = StObject.set(x, "sslCertificate", js.undefined)
  }
}
