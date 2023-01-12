package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait connectionObject extends StObject {
  
  var clientKey: String
  
  var clientSecret: String
  
  var password: String
  
  var username: String
}
object connectionObject {
  
  inline def apply(clientKey: String, clientSecret: String, password: String, username: String): connectionObject = {
    val __obj = js.Dynamic.literal(clientKey = clientKey.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[connectionObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: connectionObject] (val x: Self) extends AnyVal {
    
    inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
