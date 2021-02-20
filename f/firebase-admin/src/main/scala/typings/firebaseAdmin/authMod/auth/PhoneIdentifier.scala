package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for looking up an account by phone number.
  *
  * See auth.getUsers()
  */
@js.native
trait PhoneIdentifier extends UserIdentifier {
  
  var phoneNumber: String = js.native
}
object PhoneIdentifier {
  
  @scala.inline
  def apply(phoneNumber: String): PhoneIdentifier = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneIdentifier]
  }
  
  @scala.inline
  implicit class PhoneIdentifierMutableBuilder[Self <: PhoneIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
