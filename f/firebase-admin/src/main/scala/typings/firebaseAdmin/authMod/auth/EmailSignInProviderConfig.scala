package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The email sign in configuration.
  */
@js.native
trait EmailSignInProviderConfig extends StObject {
  
  /**
    * Whether email provider is enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * Whether password is required for email sign-in. When not required,
    * email sign-in can be performed with password or via email link sign-in.
    */
  var passwordRequired: js.UndefOr[Boolean] = js.native
}
object EmailSignInProviderConfig {
  
  @scala.inline
  def apply(enabled: Boolean): EmailSignInProviderConfig = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailSignInProviderConfig]
  }
  
  @scala.inline
  implicit class EmailSignInProviderConfigMutableBuilder[Self <: EmailSignInProviderConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
  }
}
