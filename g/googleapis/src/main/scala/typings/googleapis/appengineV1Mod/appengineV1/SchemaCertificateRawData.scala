package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateRawData extends StObject {
  
  /**
    * Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer. Must include the header and footer. Example: -----BEGIN RSA PRIVATE KEY----- -----END RSA PRIVATE KEY----- @InputOnly
    */
  var privateKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: -----BEGIN CERTIFICATE----- -----END CERTIFICATE-----
    */
  var publicCertificate: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertificateRawData {
  
  inline def apply(): SchemaCertificateRawData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateRawData]
  }
  
  extension [Self <: SchemaCertificateRawData](x: Self) {
    
    inline def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyNull: Self = StObject.set(x, "privateKey", null)
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    inline def setPublicCertificate(value: String): Self = StObject.set(x, "publicCertificate", value.asInstanceOf[js.Any])
    
    inline def setPublicCertificateNull: Self = StObject.set(x, "publicCertificate", null)
    
    inline def setPublicCertificateUndefined: Self = StObject.set(x, "publicCertificate", js.undefined)
  }
}
