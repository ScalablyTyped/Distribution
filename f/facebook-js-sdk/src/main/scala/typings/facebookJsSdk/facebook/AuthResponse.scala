package typings.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////
//
//  RESPONSES
//
////////////////////////
@js.native
trait AuthResponse extends js.Object {
  
  var accessToken: String = js.native
  
  var expiresIn: Double = js.native
  
  var grantedScopes: js.UndefOr[String] = js.native
  
  var reauthorize_required_in: js.UndefOr[Double] = js.native
  
  var signedRequest: String = js.native
  
  var userID: String = js.native
}
object AuthResponse {
  
  @scala.inline
  def apply(accessToken: String, expiresIn: Double, signedRequest: String, userID: String): AuthResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], signedRequest = signedRequest.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResponse]
  }
  
  @scala.inline
  implicit class AuthResponseOps[Self <: AuthResponse] (val x: Self) extends AnyVal {
    
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresIn(value: Double): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedRequest(value: String): Self = this.set("signedRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserID(value: String): Self = this.set("userID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantedScopes(value: String): Self = this.set("grantedScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrantedScopes: Self = this.set("grantedScopes", js.undefined)
    
    @scala.inline
    def setReauthorize_required_in(value: Double): Self = this.set("reauthorize_required_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReauthorize_required_in: Self = this.set("reauthorize_required_in", js.undefined)
  }
}
