package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseAuthProviderConfig extends StObject {
  
  /**
    * The user-friendly display name to the current configuration. This name is
    * also used as the provider label in the Cloud Console.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the provider configuration is enabled or disabled. A user
    * cannot sign in using a disabled provider.
    */
  var enabled: Boolean
  
  /**
    * The provider ID defined by the developer.
    * For a SAML provider, this is always prefixed by `saml.`.
    * For an OIDC provider, this is always prefixed by `oidc.`.
    */
  var providerId: String
}
object BaseAuthProviderConfig {
  
  inline def apply(enabled: Boolean, providerId: String): BaseAuthProviderConfig = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAuthProviderConfig]
  }
  
  extension [Self <: BaseAuthProviderConfig](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
  }
}
