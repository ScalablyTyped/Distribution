package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthConfig extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var password: String
  
  var serveraddress: String
  
  var username: String
}
object AuthConfig {
  
  inline def apply(password: String, serveraddress: String, username: String): AuthConfig = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], serveraddress = serveraddress.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthConfig]
  }
  
  extension [Self <: AuthConfig](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setServeraddress(value: String): Self = StObject.set(x, "serveraddress", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
