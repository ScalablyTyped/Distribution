package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  var GID: Double
  
  var UID: Double
}
object User {
  
  inline def apply(GID: Double, UID: Double): User = {
    val __obj = js.Dynamic.literal(GID = GID.asInstanceOf[js.Any], UID = UID.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    inline def setGID(value: Double): Self = StObject.set(x, "GID", value.asInstanceOf[js.Any])
    
    inline def setUID(value: Double): Self = StObject.set(x, "UID", value.asInstanceOf[js.Any])
  }
}
