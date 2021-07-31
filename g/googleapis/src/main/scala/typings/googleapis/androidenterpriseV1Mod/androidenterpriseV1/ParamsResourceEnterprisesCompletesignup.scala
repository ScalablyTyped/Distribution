package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesCompletesignup
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The Completion token initially returned by GenerateSignupUrl.
    */
  var completionToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Enterprise token appended to the Callback URL.
    */
  var enterpriseToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesCompletesignup {
  
  @scala.inline
  def apply(): ParamsResourceEnterprisesCompletesignup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesCompletesignup]
  }
  
  @scala.inline
  implicit class ParamsResourceEnterprisesCompletesignupMutableBuilder[Self <: ParamsResourceEnterprisesCompletesignup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCompletionToken(value: String): Self = StObject.set(x, "completionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionTokenUndefined: Self = StObject.set(x, "completionToken", js.undefined)
    
    @scala.inline
    def setEnterpriseToken(value: String): Self = StObject.set(x, "enterpriseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseTokenUndefined: Self = StObject.set(x, "enterpriseToken", js.undefined)
  }
}
