package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateVerifyProcRequest extends js.Object {
  var certificate: Certificate
  /**
    * Error code.
    */
  var errorCode: Double
  var hostname: String
  /**
    * Verification result from chromium.
    */
  var verificationResult: String
}

object CertificateVerifyProcRequest {
  @scala.inline
  def apply(certificate: Certificate, errorCode: Double, hostname: String, verificationResult: String): CertificateVerifyProcRequest = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], verificationResult = verificationResult.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateVerifyProcRequest]
  }
}

