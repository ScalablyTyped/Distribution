package typings.gapiAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reference: https://developers.google.com/api-client-library/javascript/reference/referencedocs#gapiauth2authorizeresponse
  */
@js.native
trait AuthorizeResponse extends js.Object {
  
  var access_token: String = js.native
  
  var code: String = js.native
  
  var error: String = js.native
  
  var error_subtype: String = js.native
  
  var expires_at: Double = js.native
  
  var expires_in: Double = js.native
  
  var first_issued_at: Double = js.native
  
  var id_token: String = js.native
  
  var scope: String = js.native
}
object AuthorizeResponse {
  
  @scala.inline
  def apply(
    access_token: String,
    code: String,
    error: String,
    error_subtype: String,
    expires_at: Double,
    expires_in: Double,
    first_issued_at: Double,
    id_token: String,
    scope: String
  ): AuthorizeResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], error_subtype = error_subtype.asInstanceOf[js.Any], expires_at = expires_at.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], first_issued_at = first_issued_at.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeResponse]
  }
  
  @scala.inline
  implicit class AuthorizeResponseOps[Self <: AuthorizeResponse] (val x: Self) extends AnyVal {
    
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_subtype(value: String): Self = this.set("error_subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_at(value: Double): Self = this.set("expires_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_in(value: Double): Self = this.set("expires_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_issued_at(value: Double): Self = this.set("first_issued_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId_token(value: String): Self = this.set("id_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
}
