package typings.firebaseInstallations.apiResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInstallationResponse extends js.Object {
  
  val authToken: GenerateAuthTokenResponse = js.native
  
  val fid: js.UndefOr[String] = js.native
  
  val refreshToken: String = js.native
}
object CreateInstallationResponse {
  
  @scala.inline
  def apply(authToken: GenerateAuthTokenResponse, refreshToken: String): CreateInstallationResponse = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstallationResponse]
  }
  
  @scala.inline
  implicit class CreateInstallationResponseOps[Self <: CreateInstallationResponse] (val x: Self) extends AnyVal {
    
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
    def setAuthToken(value: GenerateAuthTokenResponse): Self = this.set("authToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFid(value: String): Self = this.set("fid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFid: Self = this.set("fid", js.undefined)
  }
}
