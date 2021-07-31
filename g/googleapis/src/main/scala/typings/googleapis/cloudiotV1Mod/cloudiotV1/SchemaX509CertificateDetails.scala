package typings.googleapis.cloudiotV1Mod.cloudiotV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of an X.509 certificate. For informational purposes only.
  */
trait SchemaX509CertificateDetails extends StObject {
  
  /**
    * The time the certificate becomes invalid.
    */
  var expiryTime: js.UndefOr[String] = js.undefined
  
  /**
    * The entity that signed the certificate.
    */
  var issuer: js.UndefOr[String] = js.undefined
  
  /**
    * The type of public key in the certificate.
    */
  var publicKeyType: js.UndefOr[String] = js.undefined
  
  /**
    * The algorithm used to sign the certificate.
    */
  var signatureAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
    * The time the certificate becomes valid.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * The entity the certificate and public key belong to.
    */
  var subject: js.UndefOr[String] = js.undefined
}
object SchemaX509CertificateDetails {
  
  @scala.inline
  def apply(): SchemaX509CertificateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaX509CertificateDetails]
  }
  
  @scala.inline
  implicit class SchemaX509CertificateDetailsMutableBuilder[Self <: SchemaX509CertificateDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpiryTime(value: String): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiryTimeUndefined: Self = StObject.set(x, "expiryTime", js.undefined)
    
    @scala.inline
    def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    @scala.inline
    def setPublicKeyType(value: String): Self = StObject.set(x, "publicKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKeyTypeUndefined: Self = StObject.set(x, "publicKeyType", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
