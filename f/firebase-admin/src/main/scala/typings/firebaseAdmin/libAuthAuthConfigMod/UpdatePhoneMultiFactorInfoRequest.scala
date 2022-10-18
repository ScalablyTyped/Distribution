package typings.firebaseAdmin.libAuthAuthConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePhoneMultiFactorInfoRequest
  extends StObject
     with BaseUpdateMultiFactorInfoRequest {
  
  /**
    * The phone number associated with a phone second factor.
    */
  var phoneNumber: String
}
object UpdatePhoneMultiFactorInfoRequest {
  
  inline def apply(factorId: String, phoneNumber: String): UpdatePhoneMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneMultiFactorInfoRequest]
  }
  
  extension [Self <: UpdatePhoneMultiFactorInfoRequest](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
