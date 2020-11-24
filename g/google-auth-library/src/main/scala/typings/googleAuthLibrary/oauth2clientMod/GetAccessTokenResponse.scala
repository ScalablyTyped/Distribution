package typings.googleAuthLibrary.oauth2clientMod

import typings.gaxios.commonMod.GaxiosResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAccessTokenResponse extends js.Object {
  
  var res: js.UndefOr[GaxiosResponse[_] | Null] = js.native
  
  var token: js.UndefOr[String | Null] = js.native
}
object GetAccessTokenResponse {
  
  @scala.inline
  def apply(): GetAccessTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccessTokenResponse]
  }
  
  @scala.inline
  implicit class GetAccessTokenResponseOps[Self <: GetAccessTokenResponse] (val x: Self) extends AnyVal {
    
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
    def setRes(value: GaxiosResponse[_]): Self = this.set("res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRes: Self = this.set("res", js.undefined)
    
    @scala.inline
    def setResNull: Self = this.set("res", null)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setTokenNull: Self = this.set("token", null)
  }
}
