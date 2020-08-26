package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateVerifyProcProcRequest extends js.Object {
  var certificate: Certificate = js.native
  /**
    * Error code.
    */
  var errorCode: Double = js.native
  var hostname: String = js.native
  var validatedCertificate: Certificate = js.native
  /**
    * Verification result from chromium.
    */
  var verificationResult: String = js.native
}

object CertificateVerifyProcProcRequest {
  @scala.inline
  def apply(
    certificate: Certificate,
    errorCode: Double,
    hostname: String,
    validatedCertificate: Certificate,
    verificationResult: String
  ): CertificateVerifyProcProcRequest = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], validatedCertificate = validatedCertificate.asInstanceOf[js.Any], verificationResult = verificationResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateVerifyProcProcRequest]
  }
  @scala.inline
  implicit class CertificateVerifyProcProcRequestOps[Self <: CertificateVerifyProcProcRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificate(value: Certificate): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidatedCertificate(value: Certificate): Self = this.set("validatedCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerificationResult(value: String): Self = this.set("verificationResult", value.asInstanceOf[js.Any])
  }
  
}

