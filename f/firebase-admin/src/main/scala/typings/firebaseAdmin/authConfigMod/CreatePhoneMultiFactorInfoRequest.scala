package typings.firebaseAdmin.authConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePhoneMultiFactorInfoRequest
  extends StObject
     with BaseCreateMultiFactorInfoRequest {
  
  /**
    * The phone number associated with a phone second factor.
    */
  var phoneNumber: String
}
object CreatePhoneMultiFactorInfoRequest {
  
  inline def apply(factorId: String, phoneNumber: String): CreatePhoneMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePhoneMultiFactorInfoRequest]
  }
  
  extension [Self <: CreatePhoneMultiFactorInfoRequest](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
