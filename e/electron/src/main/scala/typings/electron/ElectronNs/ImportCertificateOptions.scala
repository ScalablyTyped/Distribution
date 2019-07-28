package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportCertificateOptions extends js.Object {
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
  @scala.inline
  def apply(certificate: String, password: String): ImportCertificateOptions = {
    val __obj = js.Dynamic.literal(certificate = certificate, password = password)
  
    __obj.asInstanceOf[ImportCertificateOptions]
  }
}

