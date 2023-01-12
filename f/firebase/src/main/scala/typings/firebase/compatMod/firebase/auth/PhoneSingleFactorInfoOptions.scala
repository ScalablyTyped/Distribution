package typings.firebase.compatMod.firebase.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The phone info options for single-factor sign-in. Only phone number is
  * required.
  */
trait PhoneSingleFactorInfoOptions
  extends StObject
     with PhoneInfoOptions {
  
  var phoneNumber: String
}
object PhoneSingleFactorInfoOptions {
  
  inline def apply(phoneNumber: String): PhoneSingleFactorInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneSingleFactorInfoOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneSingleFactorInfoOptions] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
