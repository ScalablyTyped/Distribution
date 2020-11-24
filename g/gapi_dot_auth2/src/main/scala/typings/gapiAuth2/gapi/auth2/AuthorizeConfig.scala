package typings.gapiAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeconfig
  */
@js.native
trait AuthorizeConfig extends js.Object {
  
  var app_package_name: js.UndefOr[String] = js.native
  
  var client_id: String = js.native
  
  var cookie_policy: js.UndefOr[String] = js.native
  
  var hosted_domain: js.UndefOr[String] = js.native
  
  var include_granted_scopes: js.UndefOr[Boolean] = js.native
  
  var login_hint: js.UndefOr[String] = js.native
  
  var openid_realm: js.UndefOr[String] = js.native
  
  var prompt: js.UndefOr[String] = js.native
  
  var response_type: js.UndefOr[String] = js.native
  
  var scope: String = js.native
}
object AuthorizeConfig {
  
  @scala.inline
  def apply(client_id: String, scope: String): AuthorizeConfig = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeConfig]
  }
  
  @scala.inline
  implicit class AuthorizeConfigOps[Self <: AuthorizeConfig] (val x: Self) extends AnyVal {
    
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_package_name(value: String): Self = this.set("app_package_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApp_package_name: Self = this.set("app_package_name", js.undefined)
    
    @scala.inline
    def setCookie_policy(value: String): Self = this.set("cookie_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie_policy: Self = this.set("cookie_policy", js.undefined)
    
    @scala.inline
    def setHosted_domain(value: String): Self = this.set("hosted_domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHosted_domain: Self = this.set("hosted_domain", js.undefined)
    
    @scala.inline
    def setInclude_granted_scopes(value: Boolean): Self = this.set("include_granted_scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_granted_scopes: Self = this.set("include_granted_scopes", js.undefined)
    
    @scala.inline
    def setLogin_hint(value: String): Self = this.set("login_hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogin_hint: Self = this.set("login_hint", js.undefined)
    
    @scala.inline
    def setOpenid_realm(value: String): Self = this.set("openid_realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenid_realm: Self = this.set("openid_realm", js.undefined)
    
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    
    @scala.inline
    def setResponse_type(value: String): Self = this.set("response_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse_type: Self = this.set("response_type", js.undefined)
  }
}
