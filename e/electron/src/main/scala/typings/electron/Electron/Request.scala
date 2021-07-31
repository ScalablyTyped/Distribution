package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  var certificate: Certificate
  
  /**
    * Error code.
    */
  var errorCode: Double
  
  var hostname: String
  
  var validatedCertificate: Certificate
  
  /**
    * Verification result from chromium.
    */
  var verificationResult: String
}
object Request {
  
  @scala.inline
  def apply(
    certificate: Certificate,
    errorCode: Double,
    hostname: String,
    validatedCertificate: Certificate,
    verificationResult: String
  ): Request = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], validatedCertificate = validatedCertificate.asInstanceOf[js.Any], verificationResult = verificationResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: Certificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatedCertificate(value: Certificate): Self = StObject.set(x, "validatedCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationResult(value: String): Self = StObject.set(x, "verificationResult", value.asInstanceOf[js.Any])
  }
}
