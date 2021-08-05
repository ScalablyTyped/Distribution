package typings.elasticApmNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserObject extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object UserObject {
  
  inline def apply(): UserObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserObject]
  }
  
  extension [Self <: UserObject](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
