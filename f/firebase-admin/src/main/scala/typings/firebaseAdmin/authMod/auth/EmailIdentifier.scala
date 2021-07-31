package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for looking up an account by email.
  *
  * See auth.getUsers()
  */
trait EmailIdentifier
  extends StObject
     with UserIdentifier {
  
  var email: String
}
object EmailIdentifier {
  
  @scala.inline
  def apply(email: String): EmailIdentifier = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailIdentifier]
  }
  
  @scala.inline
  implicit class EmailIdentifierMutableBuilder[Self <: EmailIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
