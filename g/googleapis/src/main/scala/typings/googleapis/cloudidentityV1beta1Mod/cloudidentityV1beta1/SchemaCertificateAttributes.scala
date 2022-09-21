package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificateAttributes extends StObject {
  
  /**
    * The X.509 extension for CertificateTemplate.
    */
  var certificateTemplate: js.UndefOr[SchemaCertificateTemplate] = js.undefined
  
  /**
    * The encoded certificate fingerprint.
    */
  var fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the issuer of this certificate.
    */
  var issuer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Serial number of the certificate, Example: "123456789".
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The subject name of this certificate.
    */
  var subject: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The certificate thumbprint.
    */
  var thumbprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Validation state of this certificate.
    */
  var validationState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Certificate not valid at or after this timestamp.
    */
  var validityExpirationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Certificate not valid before this timestamp.
    */
  var validityStartTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCertificateAttributes {
  
  inline def apply(): SchemaCertificateAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateAttributes]
  }
  
  extension [Self <: SchemaCertificateAttributes](x: Self) {
    
    inline def setCertificateTemplate(value: SchemaCertificateTemplate): Self = StObject.set(x, "certificateTemplate", value.asInstanceOf[js.Any])
    
    inline def setCertificateTemplateUndefined: Self = StObject.set(x, "certificateTemplate", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerNull: Self = StObject.set(x, "issuer", null)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setThumbprint(value: String): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
    
    inline def setThumbprintNull: Self = StObject.set(x, "thumbprint", null)
    
    inline def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
    
    inline def setValidationState(value: String): Self = StObject.set(x, "validationState", value.asInstanceOf[js.Any])
    
    inline def setValidationStateNull: Self = StObject.set(x, "validationState", null)
    
    inline def setValidationStateUndefined: Self = StObject.set(x, "validationState", js.undefined)
    
    inline def setValidityExpirationTime(value: String): Self = StObject.set(x, "validityExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setValidityExpirationTimeNull: Self = StObject.set(x, "validityExpirationTime", null)
    
    inline def setValidityExpirationTimeUndefined: Self = StObject.set(x, "validityExpirationTime", js.undefined)
    
    inline def setValidityStartTime(value: String): Self = StObject.set(x, "validityStartTime", value.asInstanceOf[js.Any])
    
    inline def setValidityStartTimeNull: Self = StObject.set(x, "validityStartTime", null)
    
    inline def setValidityStartTimeUndefined: Self = StObject.set(x, "validityStartTime", js.undefined)
  }
}
