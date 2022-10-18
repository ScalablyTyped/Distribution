package typings.firebase.compatMod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @hidden
  */
trait TwitterAuthProviderInstance
  extends StObject
     with AuthProvider {
  
  /**
    * Sets the OAuth custom parameters to pass in a Twitter OAuth request for popup
    * and redirect sign-in operations.
    * Valid parameters include 'lang'.
    * Reserved required OAuth 1.0 parameters such as 'oauth_consumer_key',
    * 'oauth_token', 'oauth_signature', etc are not allowed and will be ignored.
    * @param customOAuthParameters The custom OAuth parameters to pass
    *     in the OAuth request.
    * @return The provider instance itself.
    */
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider
}
object TwitterAuthProviderInstance {
  
  inline def apply(providerId: String, setCustomParameters: js.Object => AuthProvider): TwitterAuthProviderInstance = {
    val __obj = js.Dynamic.literal(providerId = providerId.asInstanceOf[js.Any], setCustomParameters = js.Any.fromFunction1(setCustomParameters))
    __obj.asInstanceOf[TwitterAuthProviderInstance]
  }
  
  extension [Self <: TwitterAuthProviderInstance](x: Self) {
    
    inline def setSetCustomParameters(value: js.Object => AuthProvider): Self = StObject.set(x, "setCustomParameters", js.Any.fromFunction1(value))
  }
}
