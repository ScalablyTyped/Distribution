package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesGeneratesignupurl
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The callback URL to which the Admin will be redirected after successfully
    * creating an enterprise. Before redirecting there the system will add a
    * single query parameter to this URL named "enterpriseToken" which will
    * contain an opaque token to be used for the CompleteSignup request. Beware
    * that this means that the URL will be parsed, the parameter added and then
    * a new URL formatted, i.e. there may be some minor formatting changes and,
    * more importantly, the URL must be well-formed so that it can be parsed.
    */
  var callbackUrl: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesGeneratesignupurl {
  
  @scala.inline
  def apply(): ParamsResourceEnterprisesGeneratesignupurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesGeneratesignupurl]
  }
  
  @scala.inline
  implicit class ParamsResourceEnterprisesGeneratesignupurlMutableBuilder[Self <: ParamsResourceEnterprisesGeneratesignupurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
  }
}
