package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the certificate properties of the request if it is a secure request. */
trait CertificateInfo extends StObject {
  
  var fingerprint: CertificateInfoFingerprint
  
  var isBuiltInRoot: Boolean
  
  var issuer: String
  
  var rawDER: js.UndefOr[js.Array[Double]] = js.undefined
  
  var serialNumber: String
  
  var subject: String
  
  var subjectPublicKeyInfoDigest: CertificateInfoSubjectPublicKeyInfoDigest
  
  /** Contains start and end timestamps. */
  var validity: CertificateInfoValidity
}
object CertificateInfo {
  
  @scala.inline
  def apply(
    fingerprint: CertificateInfoFingerprint,
    isBuiltInRoot: Boolean,
    issuer: String,
    serialNumber: String,
    subject: String,
    subjectPublicKeyInfoDigest: CertificateInfoSubjectPublicKeyInfoDigest,
    validity: CertificateInfoValidity
  ): CertificateInfo = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], isBuiltInRoot = isBuiltInRoot.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectPublicKeyInfoDigest = subjectPublicKeyInfoDigest.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
  
  @scala.inline
  implicit class CertificateInfoMutableBuilder[Self <: CertificateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFingerprint(value: CertificateInfoFingerprint): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBuiltInRoot(value: Boolean): Self = StObject.set(x, "isBuiltInRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawDER(value: js.Array[Double]): Self = StObject.set(x, "rawDER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawDERUndefined: Self = StObject.set(x, "rawDER", js.undefined)
    
    @scala.inline
    def setRawDERVarargs(value: Double*): Self = StObject.set(x, "rawDER", js.Array(value :_*))
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectPublicKeyInfoDigest(value: CertificateInfoSubjectPublicKeyInfoDigest): Self = StObject.set(x, "subjectPublicKeyInfoDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidity(value: CertificateInfoValidity): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
  }
}
