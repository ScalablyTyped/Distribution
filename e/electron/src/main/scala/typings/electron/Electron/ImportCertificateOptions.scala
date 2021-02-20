package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportCertificateOptions extends StObject {
  
  /**
    * Path for the pkcs12 file.
    */
  var certificate: String = js.native
  
  /**
    * Passphrase for the certificate.
    */
  var password: String = js.native
}
object ImportCertificateOptions {
  
  @scala.inline
  def apply(certificate: String, password: String): ImportCertificateOptions = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateOptions]
  }
  
  @scala.inline
  implicit class ImportCertificateOptionsMutableBuilder[Self <: ImportCertificateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
