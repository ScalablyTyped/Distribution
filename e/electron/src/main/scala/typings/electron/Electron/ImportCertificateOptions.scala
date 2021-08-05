package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCertificateOptions extends StObject {
  
  /**
    * Path for the pkcs12 file.
    */
  var certificate: String
  
  /**
    * Passphrase for the certificate.
    */
  var password: String
}
object ImportCertificateOptions {
  
  inline def apply(certificate: String, password: String): ImportCertificateOptions = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateOptions]
  }
  
  extension [Self <: ImportCertificateOptions](x: Self) {
    
    inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
