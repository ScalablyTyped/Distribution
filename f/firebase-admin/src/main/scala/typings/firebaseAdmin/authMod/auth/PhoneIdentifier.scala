package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for looking up an account by phone number.
  *
  * See auth.getUsers()
  */
trait PhoneIdentifier
  extends StObject
     with UserIdentifier {
  
  var phoneNumber: String
}
object PhoneIdentifier {
  
  inline def apply(phoneNumber: String): PhoneIdentifier = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneIdentifier]
  }
  
  extension [Self <: PhoneIdentifier](x: Self) {
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
