package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailSignInConfigServerRequest extends StObject {
  
  var allowPasswordSignup: js.UndefOr[Boolean] = js.undefined
  
  var enableEmailLinkSignin: js.UndefOr[Boolean] = js.undefined
}
object EmailSignInConfigServerRequest {
  
  inline def apply(): EmailSignInConfigServerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailSignInConfigServerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailSignInConfigServerRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowPasswordSignup(value: Boolean): Self = StObject.set(x, "allowPasswordSignup", value.asInstanceOf[js.Any])
    
    inline def setAllowPasswordSignupUndefined: Self = StObject.set(x, "allowPasswordSignup", js.undefined)
    
    inline def setEnableEmailLinkSignin(value: Boolean): Self = StObject.set(x, "enableEmailLinkSignin", value.asInstanceOf[js.Any])
    
    inline def setEnableEmailLinkSigninUndefined: Self = StObject.set(x, "enableEmailLinkSignin", js.undefined)
  }
}
