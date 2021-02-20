package typings.gapi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiOAuth2TokenObject extends StObject {
  
  /**
    * The OAuth 2.0 token. Only present in successful responses
    */
  var access_token: String = js.native
  
  /**
    * Details about the error. Only present in error responses
    */
  var error: String = js.native
  
  /**
    * The duration, in seconds, the token is valid for. Only present in successful responses
    */
  var expires_in: String = js.native
  
  var session_state: js.UndefOr[GoogleApiOAuth2TokenSessionState] = js.native
  
  /**
    * The Google API scopes related to this token
    */
  var state: String = js.native
}
object GoogleApiOAuth2TokenObject {
  
  @scala.inline
  def apply(access_token: String, error: String, expires_in: String, state: String): GoogleApiOAuth2TokenObject = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiOAuth2TokenObject]
  }
  
  @scala.inline
  implicit class GoogleApiOAuth2TokenObjectMutableBuilder[Self <: GoogleApiOAuth2TokenObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires_in(value: String): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_state(value: GoogleApiOAuth2TokenSessionState): Self = StObject.set(x, "session_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_stateUndefined: Self = StObject.set(x, "session_state", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
