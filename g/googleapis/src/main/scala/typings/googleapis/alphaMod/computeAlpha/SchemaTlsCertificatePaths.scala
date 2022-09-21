package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTlsCertificatePaths extends StObject {
  
  /**
    * The path to the file holding the client or server TLS certificate to use.
    */
  var certificatePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The path to the file holding the client or server private key.
    */
  var privateKeyPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaTlsCertificatePaths {
  
  inline def apply(): SchemaTlsCertificatePaths = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTlsCertificatePaths]
  }
  
  extension [Self <: SchemaTlsCertificatePaths](x: Self) {
    
    inline def setCertificatePath(value: String): Self = StObject.set(x, "certificatePath", value.asInstanceOf[js.Any])
    
    inline def setCertificatePathNull: Self = StObject.set(x, "certificatePath", null)
    
    inline def setCertificatePathUndefined: Self = StObject.set(x, "certificatePath", js.undefined)
    
    inline def setPrivateKeyPath(value: String): Self = StObject.set(x, "privateKeyPath", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyPathNull: Self = StObject.set(x, "privateKeyPath", null)
    
    inline def setPrivateKeyPathUndefined: Self = StObject.set(x, "privateKeyPath", js.undefined)
  }
}
