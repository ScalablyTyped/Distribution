package typings.devtoolsProtocol.mod.Protocol.Security

import typings.devtoolsProtocol.mod.Protocol.Network.TimeSinceEpoch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateSecurityState extends js.Object {
  /**
    * Page certificate.
    */
  var certificate: js.Array[String] = js.native
  /**
    * True if the certificate has a SHA1 signature in the chain.
    */
  var certificateHasSha1Signature: Boolean = js.native
  /**
    * True if the certificate uses a weak signature aglorithm.
    */
  var certificateHasWeakSignature: Boolean = js.native
  /**
    * The highest priority network error code, if the certificate has an error.
    */
  var certificateNetworkError: js.UndefOr[String] = js.native
  /**
    * Cipher name.
    */
  var cipher: String = js.native
  /**
    * Name of the issuing CA.
    */
  var issuer: String = js.native
  /**
    * Key Exchange used by the connection, or the empty string if not applicable.
    */
  var keyExchange: String = js.native
  /**
    * (EC)DH group used by the connection, if applicable.
    */
  var keyExchangeGroup: js.UndefOr[String] = js.native
  /**
    * TLS MAC. Note that AEAD ciphers do not have separate MACs.
    */
  var mac: js.UndefOr[String] = js.native
  /**
    * True if modern SSL
    */
  var modernSSL: Boolean = js.native
  /**
    * True if the connection is using an obsolete SSL cipher.
    */
  var obsoleteSslCipher: Boolean = js.native
  /**
    * True if the connection is using an obsolete SSL key exchange.
    */
  var obsoleteSslKeyExchange: Boolean = js.native
  /**
    * True if the connection is using an obsolete SSL protocol.
    */
  var obsoleteSslProtocol: Boolean = js.native
  /**
    * True if the connection is using an obsolete SSL signature.
    */
  var obsoleteSslSignature: Boolean = js.native
  /**
    * Protocol name (e.g. "TLS 1.2" or "QUIC").
    */
  var protocol: String = js.native
  /**
    * Certificate subject name.
    */
  var subjectName: String = js.native
  /**
    * Certificate valid from date.
    */
  var validFrom: TimeSinceEpoch = js.native
  /**
    * Certificate valid to (expiration) date
    */
  var validTo: TimeSinceEpoch = js.native
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
  implicit class CertificateSecurityStateOps[Self <: CertificateSecurityState] (val x: Self) extends AnyVal {
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
    def setCertificateVarargs(value: String*): Self = this.set("certificate", js.Array(value :_*))
    @scala.inline
    def setCertificate(value: js.Array[String]): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateHasSha1Signature(value: Boolean): Self = this.set("certificateHasSha1Signature", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateHasWeakSignature(value: Boolean): Self = this.set("certificateHasWeakSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def setCipher(value: String): Self = this.set("cipher", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyExchange(value: String): Self = this.set("keyExchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setModernSSL(value: Boolean): Self = this.set("modernSSL", value.asInstanceOf[js.Any])
    @scala.inline
    def setObsoleteSslCipher(value: Boolean): Self = this.set("obsoleteSslCipher", value.asInstanceOf[js.Any])
    @scala.inline
    def setObsoleteSslKeyExchange(value: Boolean): Self = this.set("obsoleteSslKeyExchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setObsoleteSslProtocol(value: Boolean): Self = this.set("obsoleteSslProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setObsoleteSslSignature(value: Boolean): Self = this.set("obsoleteSslSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubjectName(value: String): Self = this.set("subjectName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidFrom(value: TimeSinceEpoch): Self = this.set("validFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidTo(value: TimeSinceEpoch): Self = this.set("validTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateNetworkError(value: String): Self = this.set("certificateNetworkError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateNetworkError: Self = this.set("certificateNetworkError", js.undefined)
    @scala.inline
    def setKeyExchangeGroup(value: String): Self = this.set("keyExchangeGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyExchangeGroup: Self = this.set("keyExchangeGroup", js.undefined)
    @scala.inline
    def setMac(value: String): Self = this.set("mac", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMac: Self = this.set("mac", js.undefined)
  }
  
}

