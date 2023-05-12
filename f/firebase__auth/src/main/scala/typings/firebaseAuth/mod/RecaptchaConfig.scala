package typings.firebaseAuth.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecaptchaConfig extends StObject {
  
  /**
    * The reCAPTCHA enablement status of the {@link EmailAuthProvider} for the current tenant.
    */
  var emailPasswordEnabled: Boolean
  
  /**
    * The reCAPTCHA site key.
    */
  var siteKey: String
}
object RecaptchaConfig {
  
  inline def apply(emailPasswordEnabled: Boolean, siteKey: String): RecaptchaConfig = {
    val __obj = js.Dynamic.literal(emailPasswordEnabled = emailPasswordEnabled.asInstanceOf[js.Any], siteKey = siteKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecaptchaConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecaptchaConfig] (val x: Self) extends AnyVal {
    
    inline def setEmailPasswordEnabled(value: Boolean): Self = StObject.set(x, "emailPasswordEnabled", value.asInstanceOf[js.Any])
    
    inline def setSiteKey(value: String): Self = StObject.set(x, "siteKey", value.asInstanceOf[js.Any])
  }
}
