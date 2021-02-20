package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  */
@js.native
trait GithubAuthProviderInstance extends AuthProvider {
  
  /**
    * @param scope Github OAuth scope.
    * @return The provider instance itself.
    */
  def addScope(scope: String): AuthProvider = js.native
  
  /**
    * Sets the OAuth custom parameters to pass in a GitHub OAuth request for popup
    * and redirect sign-in operations.
    * Valid parameters include 'allow_signup'.
    * For a detailed list, check the
    * {@link https://developer.github.com/v3/oauth/ GitHub} documentation.
    * Reserved required OAuth 2.0 parameters such as 'client_id', 'redirect_uri',
    * 'scope', 'response_type' and 'state' are not allowed and will be ignored.
    * @param customOAuthParameters The custom OAuth parameters to pass
    *     in the OAuth request.
    * @return The provider instance itself.
    */
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
}
object GithubAuthProviderInstance {
  
  @scala.inline
  def apply(
    addScope: String => AuthProvider,
    providerId: String,
    setCustomParameters: js.Object => AuthProvider
  ): GithubAuthProviderInstance = {
    val __obj = js.Dynamic.literal(addScope = js.Any.fromFunction1(addScope), providerId = providerId.asInstanceOf[js.Any], setCustomParameters = js.Any.fromFunction1(setCustomParameters))
    __obj.asInstanceOf[GithubAuthProviderInstance]
  }
  
  @scala.inline
  implicit class GithubAuthProviderInstanceMutableBuilder[Self <: GithubAuthProviderInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddScope(value: String => AuthProvider): Self = StObject.set(x, "addScope", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCustomParameters(value: js.Object => AuthProvider): Self = StObject.set(x, "setCustomParameters", js.Any.fromFunction1(value))
  }
}
