package typings.firebaseAuth.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRecaptchaConfigResponse extends StObject {
  
  var recaptchaEnforcementState: js.Array[RecaptchaEnforcementState]
  
  var recaptchaKey: String
}
object GetRecaptchaConfigResponse {
  
  inline def apply(recaptchaEnforcementState: js.Array[RecaptchaEnforcementState], recaptchaKey: String): GetRecaptchaConfigResponse = {
    val __obj = js.Dynamic.literal(recaptchaEnforcementState = recaptchaEnforcementState.asInstanceOf[js.Any], recaptchaKey = recaptchaKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecaptchaConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRecaptchaConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setRecaptchaEnforcementState(value: js.Array[RecaptchaEnforcementState]): Self = StObject.set(x, "recaptchaEnforcementState", value.asInstanceOf[js.Any])
    
    inline def setRecaptchaEnforcementStateVarargs(value: RecaptchaEnforcementState*): Self = StObject.set(x, "recaptchaEnforcementState", js.Array(value*))
    
    inline def setRecaptchaKey(value: String): Self = StObject.set(x, "recaptchaKey", value.asInstanceOf[js.Any])
  }
}
