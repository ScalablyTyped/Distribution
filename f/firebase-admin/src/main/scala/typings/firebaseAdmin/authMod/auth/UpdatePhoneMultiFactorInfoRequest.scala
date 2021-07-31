package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a phone specific user enrolled second factor
  * for an `UpdateRequest`.
  */
trait UpdatePhoneMultiFactorInfoRequest
  extends StObject
     with UpdateMultiFactorInfoRequest {
  
  /**
    * The phone number associated with a phone second factor.
    */
  var phoneNumber: String
}
object UpdatePhoneMultiFactorInfoRequest {
  
  @scala.inline
  def apply(factorId: String, phoneNumber: String): UpdatePhoneMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePhoneMultiFactorInfoRequest]
  }
  
  @scala.inline
  implicit class UpdatePhoneMultiFactorInfoRequestMutableBuilder[Self <: UpdatePhoneMultiFactorInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
