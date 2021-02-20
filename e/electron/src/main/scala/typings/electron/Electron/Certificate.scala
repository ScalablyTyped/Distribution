package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/certificate
  /**
    * PEM encoded data
    */
  var data: String = js.native
  
  /**
    * Fingerprint of the certificate
    */
  var fingerprint: String = js.native
  
  /**
    * Issuer principal
    */
  var issuer: CertificatePrincipal = js.native
  
  /**
    * Issuer certificate (if not self-signed)
    */
  var issuerCert: Certificate = js.native
  
  /**
    * Issuer's Common Name
    */
  var issuerName: String = js.native
  
  /**
    * Hex value represented string
    */
  var serialNumber: String = js.native
  
  /**
    * Subject principal
    */
  var subject: CertificatePrincipal = js.native
  
  /**
    * Subject's Common Name
    */
  var subjectName: String = js.native
  
  /**
    * End date of the certificate being valid in seconds
    */
  var validExpiry: Double = js.native
  
  /**
    * Start date of the certificate being valid in seconds
    */
  var validStart: Double = js.native
}
object Certificate {
  
  @scala.inline
  def apply(
    data: String,
    fingerprint: String,
    issuer: CertificatePrincipal,
    issuerCert: Certificate,
    issuerName: String,
    serialNumber: String,
    subject: CertificatePrincipal,
    subjectName: String,
    validExpiry: Double,
    validStart: Double
  ): Certificate = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], issuerCert = issuerCert.asInstanceOf[js.Any], issuerName = issuerName.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectName = subjectName.asInstanceOf[js.Any], validExpiry = validExpiry.asInstanceOf[js.Any], validStart = validStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: CertificatePrincipal): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerCert(value: Certificate): Self = StObject.set(x, "issuerCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerName(value: String): Self = StObject.set(x, "issuerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: CertificatePrincipal): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectName(value: String): Self = StObject.set(x, "subjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidExpiry(value: Double): Self = StObject.set(x, "validExpiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidStart(value: Double): Self = StObject.set(x, "validStart", value.asInstanceOf[js.Any])
  }
}
