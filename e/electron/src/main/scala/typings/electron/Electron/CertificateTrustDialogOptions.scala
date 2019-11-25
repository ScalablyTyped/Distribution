package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateTrustDialogOptions extends js.Object {
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
  @scala.inline
  def apply(certificate: Certificate, message: String): CertificateTrustDialogOptions = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateTrustDialogOptions]
  }
}

