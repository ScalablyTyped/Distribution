package typings.firebaseAdmin.authMod.auth

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for looking up an account by uid.
  *
  * See auth.getUsers()
  */
trait UidIdentifier
  extends StObject
     with UserIdentifier {
  
  var uid: String
}
object UidIdentifier {
  
  inline def apply(uid: String): UidIdentifier = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UidIdentifier]
  }
  
  extension [Self <: UidIdentifier](x: Self) {
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
