package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneSingleFactorInfoOptions extends PhoneInfoOptions {
  
  var phoneNumber: String = js.native
}
object PhoneSingleFactorInfoOptions {
  
  @scala.inline
  def apply(phoneNumber: String): PhoneSingleFactorInfoOptions = {
    val __obj = js.Dynamic.literal(phoneNumber = phoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneSingleFactorInfoOptions]
  }
  
  @scala.inline
  implicit class PhoneSingleFactorInfoOptionsMutableBuilder[Self <: PhoneSingleFactorInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
  }
}
