package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait connectionObject extends StObject {
  
  var clientKey: String = js.native
  
  var clientSecret: String = js.native
  
  var password: String = js.native
  
  var username: String = js.native
}
object connectionObject {
  
  @scala.inline
  def apply(clientKey: String, clientSecret: String, password: String, username: String): connectionObject = {
    val __obj = js.Dynamic.literal(clientKey = clientKey.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[connectionObject]
  }
  
  @scala.inline
  implicit class connectionObjectMutableBuilder[Self <: connectionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
