package typings.googleapis.certificatemanagerV1Mod.certificatemanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSelfManagedCertificate extends StObject {
  
  /**
    * Input only. The PEM-encoded certificate chain. Leaf certificate comes first, followed by intermediate ones if any.
    */
  var pemCertificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. The PEM-encoded private key of the leaf certificate.
    */
  var pemPrivateKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaSelfManagedCertificate {
  
  inline def apply(): SchemaSelfManagedCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSelfManagedCertificate]
  }
  
  extension [Self <: SchemaSelfManagedCertificate](x: Self) {
    
    inline def setPemCertificate(value: String): Self = StObject.set(x, "pemCertificate", value.asInstanceOf[js.Any])
    
    inline def setPemCertificateNull: Self = StObject.set(x, "pemCertificate", null)
    
    inline def setPemCertificateUndefined: Self = StObject.set(x, "pemCertificate", js.undefined)
    
    inline def setPemPrivateKey(value: String): Self = StObject.set(x, "pemPrivateKey", value.asInstanceOf[js.Any])
    
    inline def setPemPrivateKeyNull: Self = StObject.set(x, "pemPrivateKey", null)
    
    inline def setPemPrivateKeyUndefined: Self = StObject.set(x, "pemPrivateKey", js.undefined)
  }
}
