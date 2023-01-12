package typings.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmationResult extends StObject {
  
  def confirm(verificationCode: String): js.Promise[UserCredential]
  
  var verificationId: String
}
object ConfirmationResult {
  
  inline def apply(confirm: String => js.Promise[UserCredential], verificationId: String): ConfirmationResult = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm), verificationId = verificationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfirmationResult] (val x: Self) extends AnyVal {
    
    inline def setConfirm(value: String => js.Promise[UserCredential]): Self = StObject.set(x, "confirm", js.Any.fromFunction1(value))
    
    inline def setVerificationId(value: String): Self = StObject.set(x, "verificationId", value.asInstanceOf[js.Any])
  }
}
