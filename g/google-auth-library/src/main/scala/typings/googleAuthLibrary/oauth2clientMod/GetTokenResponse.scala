package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import typings.googleAuthLibrary.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTokenResponse extends js.Object {
  
  var res: GaxiosResponse[_] | Null = js.native
  
  var tokens: Credentials = js.native
}
object GetTokenResponse {
  
  @scala.inline
  def apply(tokens: Credentials): GetTokenResponse = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTokenResponse]
  }
  
  @scala.inline
  implicit class GetTokenResponseOps[Self <: GetTokenResponse] (val x: Self) extends AnyVal {
    
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
    def setTokens(value: Credentials): Self = this.set("tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: GaxiosResponse[_]): Self = this.set("res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResNull: Self = this.set("res", null)
  }
}
