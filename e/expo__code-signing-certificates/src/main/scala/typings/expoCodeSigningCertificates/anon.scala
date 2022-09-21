package typings.expoCodeSigningCertificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PrivateKeyPEM extends StObject {
    
    var privateKeyPEM: String
    
    var publicKeyPEM: String
  }
  object PrivateKeyPEM {
    
    inline def apply(privateKeyPEM: String, publicKeyPEM: String): PrivateKeyPEM = {
      val __obj = js.Dynamic.literal(privateKeyPEM = privateKeyPEM.asInstanceOf[js.Any], publicKeyPEM = publicKeyPEM.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateKeyPEM]
    }
    
    extension [Self <: PrivateKeyPEM](x: Self) {
      
      inline def setPrivateKeyPEM(value: String): Self = StObject.set(x, "privateKeyPEM", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyPEM(value: String): Self = StObject.set(x, "publicKeyPEM", value.asInstanceOf[js.Any])
    }
  }
}
