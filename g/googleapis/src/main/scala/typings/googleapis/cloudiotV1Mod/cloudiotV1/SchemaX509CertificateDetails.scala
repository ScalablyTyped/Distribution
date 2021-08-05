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
  
  inline def apply(): SchemaX509CertificateDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaX509CertificateDetails]
  }
  
  extension [Self <: SchemaX509CertificateDetails](x: Self) {
    
    inline def setExpiryTime(value: String): Self = StObject.set(x, "expiryTime", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimeUndefined: Self = StObject.set(x, "expiryTime", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setPublicKeyType(value: String): Self = StObject.set(x, "publicKeyType", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyTypeUndefined: Self = StObject.set(x, "publicKeyType", js.undefined)
    
    inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
