package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceEnterprisesCompletesignup extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The Completion token initially returned by GenerateSignupUrl.
    */
  var completionToken: js.UndefOr[String] = js.native
  
  /**
    * The Enterprise token appended to the Callback URL.
    */
  var enterpriseToken: js.UndefOr[String] = js.native
}
object ParamsResourceEnterprisesCompletesignup {
  
  @scala.inline
  def apply(): ParamsResourceEnterprisesCompletesignup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesCompletesignup]
  }
  
  @scala.inline
  implicit class ParamsResourceEnterprisesCompletesignupOps[Self <: ParamsResourceEnterprisesCompletesignup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCompletionToken(value: String): Self = this.set("completionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionToken: Self = this.set("completionToken", js.undefined)
    
    @scala.inline
    def setEnterpriseToken(value: String): Self = this.set("enterpriseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnterpriseToken: Self = this.set("enterpriseToken", js.undefined)
  }
}
