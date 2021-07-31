package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthToken extends StObject {
  
  var access_token: String
  
  var expires_in: Double
  
  var refresh_token: js.UndefOr[String] = js.undefined
  
  var token_type: String
}
object AuthToken {
  
  @scala.inline
  def apply(access_token: String, expires_in: Double, token_type: String): AuthToken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthToken]
  }
  
  @scala.inline
  implicit class AuthTokenMutableBuilder[Self <: AuthToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
    
    @scala.inline
    def setToken_type(value: String): Self = StObject.set(x, "token_type", value.asInstanceOf[js.Any])
  }
}
