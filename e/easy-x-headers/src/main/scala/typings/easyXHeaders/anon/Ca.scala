package typings.easyXHeaders.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ca extends StObject {
  
  var ca: String
  
  var cert: String
  
  var key: String
}
object Ca {
  
  inline def apply(ca: String, cert: String, key: String): Ca = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ca]
  }
  
  extension [Self <: Ca](x: Self) {
    
    inline def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
