package typings.firebaseAuth.distAuthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecaptchaEnforcementState extends StObject {
  
  var enforcementState: String
  
  var provider: String
}
object RecaptchaEnforcementState {
  
  inline def apply(enforcementState: String, provider: String): RecaptchaEnforcementState = {
    val __obj = js.Dynamic.literal(enforcementState = enforcementState.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecaptchaEnforcementState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecaptchaEnforcementState] (val x: Self) extends AnyVal {
    
    inline def setEnforcementState(value: String): Self = StObject.set(x, "enforcementState", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
