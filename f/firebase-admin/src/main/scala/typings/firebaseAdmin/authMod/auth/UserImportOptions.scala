package typings.firebaseAdmin.authMod.auth

import typings.firebaseAdmin.anon.Algorithm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface representing the user import options needed for
  * {@link auth.Auth.importUsers `importUsers()`} method. This is used to
  * provide the password hashing algorithm information.
  */
@js.native
trait UserImportOptions extends StObject {
  
  /**
    * The password hashing information.
    */
  var hash: Algorithm = js.native
}
object UserImportOptions {
  
  @scala.inline
  def apply(hash: Algorithm): UserImportOptions = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserImportOptions]
  }
  
  @scala.inline
  implicit class UserImportOptionsMutableBuilder[Self <: UserImportOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: Algorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}
