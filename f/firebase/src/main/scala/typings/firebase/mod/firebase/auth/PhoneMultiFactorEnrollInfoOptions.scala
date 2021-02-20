package typings.firebase.mod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The phone info options for multi-factor enrollment. Phone number and
  * multi-factor session are required.
  */
@js.native
trait PhoneMultiFactorEnrollInfoOptions extends PhoneInfoOptions {
  
  var phoneNumber: String = js.native
  
  var session: MultiFactorSession = js.native
}
object PhoneMultiFactorEnrollInfoOptions {
  
  @scala.inline
  def apply(phoneNumber: String, session: MultiFactorSession): PhoneMultiFactorEnrollInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorEnrollInfoOptions]
  }
  
  @scala.inline
  implicit class PhoneMultiFactorEnrollInfoOptionsMutableBuilder[Self <: PhoneMultiFactorEnrollInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: MultiFactorSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
