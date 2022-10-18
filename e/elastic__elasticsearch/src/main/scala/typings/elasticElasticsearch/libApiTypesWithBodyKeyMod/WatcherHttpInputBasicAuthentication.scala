package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherHttpInputBasicAuthentication extends StObject {
  
  var password: Password
  
  var username: Username
}
object WatcherHttpInputBasicAuthentication {
  
  inline def apply(password: Password, username: Username): WatcherHttpInputBasicAuthentication = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherHttpInputBasicAuthentication]
  }
  
  extension [Self <: WatcherHttpInputBasicAuthentication](x: Self) {
    
    inline def setPassword(value: Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
