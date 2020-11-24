package typings.firebaseInstallations.apiResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateAuthTokenResponse extends js.Object {
  
  /**
    * Encoded as a string with the suffix 's' (indicating seconds), preceded by
    * the number of seconds.
    *
    * Example: "604800s".
    */
  val expiresIn: String = js.native
  
  val token: String = js.native
}
object GenerateAuthTokenResponse {
  
  @scala.inline
  def apply(expiresIn: String, token: String): GenerateAuthTokenResponse = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateAuthTokenResponse]
  }
  
  @scala.inline
  implicit class GenerateAuthTokenResponseOps[Self <: GenerateAuthTokenResponse] (val x: Self) extends AnyVal {
    
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
    def setExpiresIn(value: String): Self = this.set("expiresIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
}
