package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthInfo extends StObject {
  
  var host: String
  
  var isProxy: Boolean
  
  var port: Double
  
  var realm: String
  
  var scheme: String
}
object AuthInfo {
  
  inline def apply(host: String, isProxy: Boolean, port: Double, realm: String, scheme: String): AuthInfo = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], isProxy = isProxy.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthInfo]
  }
  
  extension [Self <: AuthInfo](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setIsProxy(value: Boolean): Self = StObject.set(x, "isProxy", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
