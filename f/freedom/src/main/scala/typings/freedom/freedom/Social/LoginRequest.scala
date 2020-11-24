package typings.freedom.freedom.Social

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// A request to login to a specific network as a specific agent
@js.native
trait LoginRequest extends js.Object {
  
  // Name of the application connecting to the network. Other logins with
  // the same agent field will be listed as having status |ONLINE|, where
  // those with different agents will be listed as
  // |ONLINE_WITH_OTHER_CLIENT|
  var agent: String = js.native
  
  // When |interactive === true| social will always prompt user for login.
  // Promise fails if the user did not login or provided invalid
  // credentials. When |interactive === false|, promise fails unless the
  // social provider has  cached tokens/credentials.
  var interactive: Boolean = js.native
  
  // When true, social provider will remember the token/credentials.
  var rememberLogin: Boolean = js.native
  
  // URL of application
  var url: String = js.native
  
  // Version of application
  var version: String = js.native
}
object LoginRequest {
  
  @scala.inline
  def apply(agent: String, interactive: Boolean, rememberLogin: Boolean, url: String, version: String): LoginRequest = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], rememberLogin = rememberLogin.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginRequest]
  }
  
  @scala.inline
  implicit class LoginRequestOps[Self <: LoginRequest] (val x: Self) extends AnyVal {
    
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
    def setAgent(value: String): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRememberLogin(value: Boolean): Self = this.set("rememberLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
