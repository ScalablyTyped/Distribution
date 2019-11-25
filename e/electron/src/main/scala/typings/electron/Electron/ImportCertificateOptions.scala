package typings.electron.Electron

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
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ImportCertificateOptions]
  }
}

