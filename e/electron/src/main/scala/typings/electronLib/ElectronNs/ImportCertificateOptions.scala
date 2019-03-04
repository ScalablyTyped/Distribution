package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportCertificateOptions extends js.Object {
  /**
    * Path for the pkcs12 file.
    */
  var certificate: java.lang.String
  /**
    * Passphrase for the certificate.
    */
  var password: java.lang.String
}

object ImportCertificateOptions {
  @scala.inline
  def apply(certificate: java.lang.String, password: java.lang.String): ImportCertificateOptions = {
    val __obj = js.Dynamic.literal(certificate = certificate, password = password)
  
    __obj.asInstanceOf[ImportCertificateOptions]
  }
}

