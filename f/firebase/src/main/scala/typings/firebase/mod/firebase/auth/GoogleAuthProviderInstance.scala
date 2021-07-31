package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  */
trait GoogleAuthProviderInstance
  extends StObject
     with AuthProvider {
  
  /**
    * @param scope Google OAuth scope.
    * @return The provider instance itself.
    */
  def addScope(scope: String): AuthProvider
  
  /**
    * Sets the OAuth custom parameters to pass in a Google OAuth request for popup
    * and redirect sign-in operations.
    * Valid parameters include 'hd', 'hl', 'include_granted_scopes', 'login_hint'
    * and 'prompt'.
    * For a detailed list, check the
    * {@link https://goo.gl/Xo01Jm Google}
    * documentation.
    * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
    * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
    * @param customOAuthParameters The custom OAuth parameters to pass
    *     in the OAuth request.
    * @return The provider instance itself.
    */
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider
}
object GoogleAuthProviderInstance {
  
  @scala.inline
  def apply(
    addScope: String => AuthProvider,
    providerId: String,
    setCustomParameters: js.Object => AuthProvider
  ): GoogleAuthProviderInstance = {
    val __obj = js.Dynamic.literal(addScope = js.Any.fromFunction1(addScope), providerId = providerId.asInstanceOf[js.Any], setCustomParameters = js.Any.fromFunction1(setCustomParameters))
    __obj.asInstanceOf[GoogleAuthProviderInstance]
  }
  
  @scala.inline
  implicit class GoogleAuthProviderInstanceMutableBuilder[Self <: GoogleAuthProviderInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddScope(value: String => AuthProvider): Self = StObject.set(x, "addScope", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCustomParameters(value: js.Object => AuthProvider): Self = StObject.set(x, "setCustomParameters", js.Any.fromFunction1(value))
  }
}
