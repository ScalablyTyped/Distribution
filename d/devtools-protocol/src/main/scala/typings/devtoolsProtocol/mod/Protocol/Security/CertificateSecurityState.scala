package typings.devtoolsProtocol.mod.Protocol.Security

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateSecurityState extends StObject {
  
  /**
    * Page certificate.
    */
  var certificate: js.Array[String]
  
  /**
    * True if the certificate has a SHA1 signature in the chain.
    */
  var certificateHasSha1Signature: Boolean
  
  /**
    * True if the certificate uses a weak signature aglorithm.
    */
  var certificateHasWeakSignature: Boolean
  
  /**
    * The highest priority network error code, if the certificate has an error.
    */
  var certificateNetworkError: js.UndefOr[String] = js.undefined
  
  /**
    * Cipher name.
    */
  var cipher: String
  
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
    * True if modern SSL
    */
  var modernSSL: Boolean
  
  /**
    * True if the connection is using an obsolete SSL cipher.
    */
  var obsoleteSslCipher: Boolean
  
  /**
    * True if the connection is using an obsolete SSL key exchange.
    */
  var obsoleteSslKeyExchange: Boolean
  
  /**
    * True if the connection is using an obsolete SSL protocol.
    */
  var obsoleteSslProtocol: Boolean
  
  /**
    * True if the connection is using an obsolete SSL signature.
    */
  var obsoleteSslSignature: Boolean
  
  /**
    * Protocol name (e.g. "TLS 1.2" or "QUIC").
    */
  var protocol: String
  
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
object CertificateSecurityState {
  
  @scala.inline
  def apply(
    certificate: js.Array[String],
    certificateHasSha1Signature: Boolean,
    certificateHasWeakSignature: Boolean,
    cipher: String,
    issuer: String,
    keyExchange: String,
    modernSSL: Boolean,
    obsoleteSslCipher: Boolean,
    obsoleteSslKeyExchange: Boolean,
    obsoleteSslProtocol: Boolean,
    obsoleteSslSignature: Boolean,
    protocol: String,
    subjectName: String,
    validFrom: TimeSinceEpoch,
    validTo: TimeSinceEpoch
  ): CertificateSecurityState = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], certificateHasSha1Signature = certificateHasSha1Signature.asInstanceOf[js.Any], certificateHasWeakSignature = certificateHasWeakSignature.asInstanceOf[js.Any], cipher = cipher.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], keyExchange = keyExchange.asInstanceOf[js.Any], modernSSL = modernSSL.asInstanceOf[js.Any], obsoleteSslCipher = obsoleteSslCipher.asInstanceOf[js.Any], obsoleteSslKeyExchange = obsoleteSslKeyExchange.asInstanceOf[js.Any], obsoleteSslProtocol = obsoleteSslProtocol.asInstanceOf[js.Any], obsoleteSslSignature = obsoleteSslSignature.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], subjectName = subjectName.asInstanceOf[js.Any], validFrom = validFrom.asInstanceOf[js.Any], validTo = validTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSecurityState]
  }
  
  @scala.inline
  implicit class CertificateSecurityStateMutableBuilder[Self <: CertificateSecurityState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: js.Array[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateHasSha1Signature(value: Boolean): Self = StObject.set(x, "certificateHasSha1Signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateHasWeakSignature(value: Boolean): Self = StObject.set(x, "certificateHasWeakSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateNetworkError(value: String): Self = StObject.set(x, "certificateNetworkError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateNetworkErrorUndefined: Self = StObject.set(x, "certificateNetworkError", js.undefined)
    
    @scala.inline
    def setCertificateVarargs(value: String*): Self = StObject.set(x, "certificate", js.Array(value :_*))
    
    @scala.inline
    def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyExchange(value: String): Self = StObject.set(x, "keyExchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyExchangeGroup(value: String): Self = StObject.set(x, "keyExchangeGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyExchangeGroupUndefined: Self = StObject.set(x, "keyExchangeGroup", js.undefined)
    
    @scala.inline
    def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    
    @scala.inline
    def setModernSSL(value: Boolean): Self = StObject.set(x, "modernSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObsoleteSslCipher(value: Boolean): Self = StObject.set(x, "obsoleteSslCipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObsoleteSslKeyExchange(value: Boolean): Self = StObject.set(x, "obsoleteSslKeyExchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObsoleteSslProtocol(value: Boolean): Self = StObject.set(x, "obsoleteSslProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObsoleteSslSignature(value: Boolean): Self = StObject.set(x, "obsoleteSslSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectName(value: String): Self = StObject.set(x, "subjectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFrom(value: TimeSinceEpoch): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidTo(value: TimeSinceEpoch): Self = StObject.set(x, "validTo", value.asInstanceOf[js.Any])
  }
}
