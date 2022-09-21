package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSslCertificateSelfManagedSslCertificate extends StObject {
  
  /**
    * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
    */
  var certificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A write-only private key in PEM format. Only insert requests will include this field.
    */
  var privateKey: js.UndefOr[String | Null] = js.undefined
}
object SchemaSslCertificateSelfManagedSslCertificate {
  
  inline def apply(): SchemaSslCertificateSelfManagedSslCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertificateSelfManagedSslCertificate]
  }
  
  extension [Self <: SchemaSslCertificateSelfManagedSslCertificate](x: Self) {
    
    inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateNull: Self = StObject.set(x, "certificate", null)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyNull: Self = StObject.set(x, "privateKey", null)
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
  }
}
