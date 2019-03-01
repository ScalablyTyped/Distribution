package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateVerifyProcRequest extends js.Object {
  var certificate: Certificate
  /**
    * Error code.
    */
  var errorCode: scala.Double
  var hostname: java.lang.String
  /**
    * Verification result from chromium.
    */
  var verificationResult: java.lang.String
}

object CertificateVerifyProcRequest {
  @scala.inline
  def apply(
    certificate: Certificate,
    errorCode: scala.Double,
    hostname: java.lang.String,
    verificationResult: java.lang.String
  ): CertificateVerifyProcRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("certificate")(certificate)
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("hostname")(hostname)
    __obj.updateDynamic("verificationResult")(verificationResult)
    __obj.asInstanceOf[CertificateVerifyProcRequest]
  }
}

