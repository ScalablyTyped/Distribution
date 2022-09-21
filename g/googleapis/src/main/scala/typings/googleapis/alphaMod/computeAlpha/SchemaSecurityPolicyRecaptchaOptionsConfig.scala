package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyRecaptchaOptionsConfig extends StObject {
  
  /**
    * An optional field to supply a reCAPTCHA site key to be used for all the rules using the redirect action with the type of GOOGLE_RECAPTCHA under the security policy. The specified site key needs to be created from the reCAPTCHA API. The user is responsible for the validity of the specified site key. If not specified, a Google-managed site key is used.
    */
  var redirectSiteKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityPolicyRecaptchaOptionsConfig {
  
  inline def apply(): SchemaSecurityPolicyRecaptchaOptionsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyRecaptchaOptionsConfig]
  }
  
  extension [Self <: SchemaSecurityPolicyRecaptchaOptionsConfig](x: Self) {
    
    inline def setRedirectSiteKey(value: String): Self = StObject.set(x, "redirectSiteKey", value.asInstanceOf[js.Any])
    
    inline def setRedirectSiteKeyNull: Self = StObject.set(x, "redirectSiteKey", null)
    
    inline def setRedirectSiteKeyUndefined: Self = StObject.set(x, "redirectSiteKey", js.undefined)
  }
}
