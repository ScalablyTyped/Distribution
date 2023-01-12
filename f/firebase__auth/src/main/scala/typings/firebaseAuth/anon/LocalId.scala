package typings.firebaseAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalId extends StObject {
  
  var idToken: String
  
  var localId: String
  
  var refreshToken: String
}
object LocalId {
  
  inline def apply(idToken: String, localId: String, refreshToken: String): LocalId = {
    val __obj = js.Dynamic.literal(idToken = idToken.asInstanceOf[js.Any], localId = localId.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocalId] (val x: Self) extends AnyVal {
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setLocalId(value: String): Self = StObject.set(x, "localId", value.asInstanceOf[js.Any])
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
  }
}
