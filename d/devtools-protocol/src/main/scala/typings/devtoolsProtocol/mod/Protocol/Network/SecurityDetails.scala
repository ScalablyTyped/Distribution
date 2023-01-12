package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Security.CertificateId
import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityDetails extends StObject {
  
  /**
    * Certificate ID value.
    */
  var certificateId: CertificateId
  
  /**
    * Whether the request complied with Certificate Transparency policy
    */
  var certificateTransparencyCompliance: CertificateTransparencyCompliance
  
  /**
    * Cipher name.
    */
  var cipher: String
  
  /**
    * Whether the connection used Encrypted ClientHello
    */
  var encryptedClientHello: Boolean
  
  /**
    * Name of the issuing CA.
    */
  var issuer: String
  
  /**
    * Key Exchange used by the connection, or the empty string if not applicable.
    */
  var keyExchange: String
  
  /**
    * (EC)DH group used by the connection, if applicable.
    */
  var keyExchangeGroup: js.UndefOr[String] = js.undefined
  
  /**
    * TLS MAC. Note that AEAD ciphers do not have separate MACs.
    */
  var mac: js.UndefOr[String] = js.undefined
  
  /**
    * Protocol name (e.g. "TLS 1.2" or "QUIC").
    */
  var protocol: String
  
  /**
    * Subject Alternative Name (SAN) DNS names and IP addresses.
    */
  var sanList: js.Array[String]
  
  /**
    * The signature algorithm used by the server in the TLS server signature,
    * represented as a TLS SignatureScheme code point. Omitted if not
    * applicable or not known.
    */
  var serverSignatureAlgorithm: js.UndefOr[integer] = js.undefined
  
  /**
    * List of signed certificate timestamps (SCTs).
    */
  var signedCertificateTimestampList: js.Array[SignedCertificateTimestamp]
  
  /**
    * Certificate subject name.
    */
  var subjectName: String
  
  /**
    * Certificate valid from date.
    */
  var validFrom: TimeSinceEpoch
  
  /**
    * Certificate valid to (expiration) date
    */
  var validTo: TimeSinceEpoch
}
object SecurityDetails {
  
  inline def apply(
    certificateId: CertificateId,
    certificateTransparencyCompliance: CertificateTransparencyCompliance,
    cipher: String,
    encryptedClientHello: Boolean,
    issuer: String,
    keyExchange: String,
    protocol: String,
    sanList: js.Array[String],
    signedCertificateTimestampList: js.Array[SignedCertificateTimestamp],
    subjectName: String,
    validFrom: TimeSinceEpoch,
    validTo: TimeSinceEpoch
  ): SecurityDetails = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any], certificateTransparencyCompliance = certificateTransparencyCompliance.asInstanceOf[js.Any], cipher = cipher.asInstanceOf[js.Any], encryptedClientHello = encryptedClientHello.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], keyExchange = keyExchange.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], sanList = sanList.asInstanceOf[js.Any], signedCertificateTimestampList = signedCertificateTimestampList.asInstanceOf[js.Any], subjectName = subjectName.asInstanceOf[js.Any], validFrom = validFrom.asInstanceOf[js.Any], validTo = validTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityDetails] (val x: Self) extends AnyVal {
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateTransparencyCompliance(value: CertificateTransparencyCompliance): Self = StObject.set(x, "certificateTransparencyCompliance", value.asInstanceOf[js.Any])
    
    inline def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    
    inline def setEncryptedClientHello(value: Boolean): Self = StObject.set(x, "encryptedClientHello", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setKeyExchange(value: String): Self = StObject.set(x, "keyExchange", value.asInstanceOf[js.Any])
    
    inline def setKeyExchangeGroup(value: String): Self = StObject.set(x, "keyExchangeGroup", value.asInstanceOf[js.Any])
    
    inline def setKeyExchangeGroupUndefined: Self = StObject.set(x, "keyExchangeGroup", js.undefined)
    
    inline def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setSanList(value: js.Array[String]): Self = StObject.set(x, "sanList", value.asInstanceOf[js.Any])
    
    inline def setSanListVarargs(value: String*): Self = StObject.set(x, "sanList", js.Array(value*))
    
    inline def setServerSignatureAlgorithm(value: integer): Self = StObject.set(x, "serverSignatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setServerSignatureAlgorithmUndefined: Self = StObject.set(x, "serverSignatureAlgorithm", js.undefined)
    
    inline def setSignedCertificateTimestampList(value: js.Array[SignedCertificateTimestamp]): Self = StObject.set(x, "signedCertificateTimestampList", value.asInstanceOf[js.Any])
    
    inline def setSignedCertificateTimestampListVarargs(value: SignedCertificateTimestamp*): Self = StObject.set(x, "signedCertificateTimestampList", js.Array(value*))
    
    inline def setSubjectName(value: String): Self = StObject.set(x, "subjectName", value.asInstanceOf[js.Any])
    
    inline def setValidFrom(value: TimeSinceEpoch): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
    
    inline def setValidTo(value: TimeSinceEpoch): Self = StObject.set(x, "validTo", value.asInstanceOf[js.Any])
  }
}
