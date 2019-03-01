package typings
package electronLib.ElectronNs

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
  var message: java.lang.String
}

object CertificateTrustDialogOptions {
  @scala.inline
  def apply(certificate: Certificate, message: java.lang.String): CertificateTrustDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("certificate")(certificate)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[CertificateTrustDialogOptions]
  }
}

