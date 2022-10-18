package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailSignInProviderConfig extends StObject {
  
  /**
    * Whether email provider is enabled.
    */
  var enabled: Boolean
  
  /**
    * Whether password is required for email sign-in. When not required,
    * email sign-in can be performed with password or via email link sign-in.
    */
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
}
object EmailSignInProviderConfig {
  
  inline def apply(enabled: Boolean): EmailSignInProviderConfig = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailSignInProviderConfig]
  }
  
  extension [Self <: EmailSignInProviderConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
  }
}
