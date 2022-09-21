package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCertificate extends StObject {
  
  /**
    * Output only. The issuer distinguished name in RFC 2253 format. Only present if parsed is true.
    */
  var issuer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The certificate is not valid after this time. Only present if parsed is true.
    */
  var notAfterTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The certificate is not valid before this time. Only present if parsed is true.
    */
  var notBeforeTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. True if the certificate was parsed successfully.
    */
  var parsed: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The raw certificate bytes in DER format.
    */
  var rawDer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The certificate serial number as a hex string. Only present if parsed is true.
    */
  var serialNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The SHA-256 certificate fingerprint as a hex string. Only present if parsed is true.
    */
  var sha256Fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The subject distinguished name in RFC 2253 format. Only present if parsed is true.
    */
  var subject: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The subject Alternative DNS names. Only present if parsed is true.
    */
  var subjectAlternativeDnsNames: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaCertificate {
  
  inline def apply(): SchemaCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificate]
  }
  
  extension [Self <: SchemaCertificate](x: Self) {
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerNull: Self = StObject.set(x, "issuer", null)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setNotAfterTime(value: String): Self = StObject.set(x, "notAfterTime", value.asInstanceOf[js.Any])
    
    inline def setNotAfterTimeNull: Self = StObject.set(x, "notAfterTime", null)
    
    inline def setNotAfterTimeUndefined: Self = StObject.set(x, "notAfterTime", js.undefined)
    
    inline def setNotBeforeTime(value: String): Self = StObject.set(x, "notBeforeTime", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeTimeNull: Self = StObject.set(x, "notBeforeTime", null)
    
    inline def setNotBeforeTimeUndefined: Self = StObject.set(x, "notBeforeTime", js.undefined)
    
    inline def setParsed(value: Boolean): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
    
    inline def setParsedNull: Self = StObject.set(x, "parsed", null)
    
    inline def setParsedUndefined: Self = StObject.set(x, "parsed", js.undefined)
    
    inline def setRawDer(value: String): Self = StObject.set(x, "rawDer", value.asInstanceOf[js.Any])
    
    inline def setRawDerNull: Self = StObject.set(x, "rawDer", null)
    
    inline def setRawDerUndefined: Self = StObject.set(x, "rawDer", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberNull: Self = StObject.set(x, "serialNumber", null)
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setSha256Fingerprint(value: String): Self = StObject.set(x, "sha256Fingerprint", value.asInstanceOf[js.Any])
    
    inline def setSha256FingerprintNull: Self = StObject.set(x, "sha256Fingerprint", null)
    
    inline def setSha256FingerprintUndefined: Self = StObject.set(x, "sha256Fingerprint", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeDnsNames(value: js.Array[String]): Self = StObject.set(x, "subjectAlternativeDnsNames", value.asInstanceOf[js.Any])
    
    inline def setSubjectAlternativeDnsNamesNull: Self = StObject.set(x, "subjectAlternativeDnsNames", null)
    
    inline def setSubjectAlternativeDnsNamesUndefined: Self = StObject.set(x, "subjectAlternativeDnsNames", js.undefined)
    
    inline def setSubjectAlternativeDnsNamesVarargs(value: String*): Self = StObject.set(x, "subjectAlternativeDnsNames", js.Array(value*))
    
    inline def setSubjectNull: Self = StObject.set(x, "subject", null)
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
  }
}
