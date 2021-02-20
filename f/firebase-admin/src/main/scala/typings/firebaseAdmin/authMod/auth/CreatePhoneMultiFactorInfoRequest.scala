package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing a phone specific user enrolled second factor for a
  * `CreateRequest`.
  */
@js.native
trait CreatePhoneMultiFactorInfoRequest extends CreateMultiFactorInfoRequest {
  
  /**
    * The phone number associated with a phone second factor.
    */
  var phoneNumber: String = js.native
}
object CreatePhoneMultiFactorInfoRequest {
  
  @scala.inline
  def apply(factorId: String, phoneNumber: String): CreatePhoneMultiFactorInfoRequest = {
    val __obj = js.Dynamic.literal(factorId = factorId.asInstanceOf[js.Any], phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePhoneMultiFactorInfoRequest]
  }
  
  @scala.inline
  implicit class CreatePhoneMultiFactorInfoRequestMutableBuilder[Self <: CreatePhoneMultiFactorInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
