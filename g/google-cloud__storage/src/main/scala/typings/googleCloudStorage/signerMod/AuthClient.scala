package typings.googleCloudStorage.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthClient extends js.Object {
  
  def getCredentials(): js.Promise[GetCredentialsResponse] = js.native
  
  def sign(blobToSign: String): js.Promise[String] = js.native
}
object AuthClient {
  
  @scala.inline
  def apply(getCredentials: () => js.Promise[GetCredentialsResponse], sign: String => js.Promise[String]): AuthClient = {
    val __obj = js.Dynamic.literal(getCredentials = js.Any.fromFunction0(getCredentials), sign = js.Any.fromFunction1(sign))
    __obj.asInstanceOf[AuthClient]
  }
  
  @scala.inline
  implicit class AuthClientOps[Self <: AuthClient] (val x: Self) extends AnyVal {
    
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
    def setGetCredentials(value: () => js.Promise[GetCredentialsResponse]): Self = this.set("getCredentials", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSign(value: String => js.Promise[String]): Self = this.set("sign", js.Any.fromFunction1(value))
  }
}
