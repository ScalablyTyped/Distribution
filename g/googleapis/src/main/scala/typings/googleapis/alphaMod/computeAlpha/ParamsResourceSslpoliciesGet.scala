package typings.googleapis.alphaMod.computeAlpha

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSslpoliciesGet
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
    * Name of the SSL policy to update. The name must be 1-63 characters long,
    * and comply with RFC1035.
    */
  var sslPolicy: js.UndefOr[String] = js.undefined
}
object ParamsResourceSslpoliciesGet {
  
  @scala.inline
  def apply(): ParamsResourceSslpoliciesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSslpoliciesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceSslpoliciesGetMutableBuilder[Self <: ParamsResourceSslpoliciesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setSslPolicy(value: String): Self = StObject.set(x, "sslPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslPolicyUndefined: Self = StObject.set(x, "sslPolicy", js.undefined)
  }
}
