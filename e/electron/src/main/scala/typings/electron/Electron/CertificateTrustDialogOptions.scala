package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateTrustDialogOptions extends StObject {
  
  /**
    * The certificate to trust/import.
    */
  var certificate: Certificate
  
  /**
    * The message to display to the user.
    */
  var message: String
}
object CertificateTrustDialogOptions {
  
  inline def apply(certificate: Certificate, message: String): CertificateTrustDialogOptions = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateTrustDialogOptions]
  }
  
  extension [Self <: CertificateTrustDialogOptions](x: Self) {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
