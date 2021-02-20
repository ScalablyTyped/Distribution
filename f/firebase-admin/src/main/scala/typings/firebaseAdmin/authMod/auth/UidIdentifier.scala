package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for looking up an account by uid.
  *
  * See auth.getUsers()
  */
@js.native
trait UidIdentifier extends UserIdentifier {
  
  var uid: String = js.native
}
object UidIdentifier {
  
  @scala.inline
  def apply(uid: String): UidIdentifier = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UidIdentifier]
  }
  
  @scala.inline
  implicit class UidIdentifierMutableBuilder[Self <: UidIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
