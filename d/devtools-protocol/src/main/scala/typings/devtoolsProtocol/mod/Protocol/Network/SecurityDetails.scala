package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Security.CertificateId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityDetails extends js.Object {
  /**
    * Certificate ID value.
    */
  var certificateId: CertificateId = js.native
  /**
    * Whether the request complied with Certificate Transparency policy
    */
  var certificateTransparencyCompliance: CertificateTransparencyCompliance = js.native
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
    * Protocol name (e.g. "TLS 1.2" or "QUIC").
    */
  var protocol: String = js.native
  /**
    * Subject Alternative Name (SAN) DNS names and IP addresses.
    */
  var sanList: js.Array[String] = js.native
  /**
    * List of signed certificate timestamps (SCTs).
    */
  var signedCertificateTimestampList: js.Array[SignedCertificateTimestamp] = js.native
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

object SecurityDetails {
  @scala.inline
  def apply(
    certificateId: CertificateId,
    certificateTransparencyCompliance: CertificateTransparencyCompliance,
    cipher: String,
    issuer: String,
    keyExchange: String,
    protocol: String,
    sanList: js.Array[String],
    signedCertificateTimestampList: js.Array[SignedCertificateTimestamp],
    subjectName: String,
    validFrom: TimeSinceEpoch,
    validTo: TimeSinceEpoch
  ): SecurityDetails = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any], certificateTransparencyCompliance = certificateTransparencyCompliance.asInstanceOf[js.Any], cipher = cipher.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], keyExchange = keyExchange.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], sanList = sanList.asInstanceOf[js.Any], signedCertificateTimestampList = signedCertificateTimestampList.asInstanceOf[js.Any], subjectName = subjectName.asInstanceOf[js.Any], validFrom = validFrom.asInstanceOf[js.Any], validTo = validTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityDetails]
  }
  @scala.inline
  implicit class SecurityDetailsOps[Self <: SecurityDetails] (val x: Self) extends AnyVal {
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
    def setCertificateId(value: CertificateId): Self = this.set("certificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateTransparencyCompliance(value: CertificateTransparencyCompliance): Self = this.set("certificateTransparencyCompliance", value.asInstanceOf[js.Any])
    @scala.inline
    def setCipher(value: String): Self = this.set("cipher", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyExchange(value: String): Self = this.set("keyExchange", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setSanListVarargs(value: String*): Self = this.set("sanList", js.Array(value :_*))
    @scala.inline
    def setSanList(value: js.Array[String]): Self = this.set("sanList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignedCertificateTimestampListVarargs(value: SignedCertificateTimestamp*): Self = this.set("signedCertificateTimestampList", js.Array(value :_*))
    @scala.inline
    def setSignedCertificateTimestampList(value: js.Array[SignedCertificateTimestamp]): Self = this.set("signedCertificateTimestampList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubjectName(value: String): Self = this.set("subjectName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidFrom(value: TimeSinceEpoch): Self = this.set("validFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidTo(value: TimeSinceEpoch): Self = this.set("validTo", value.asInstanceOf[js.Any])
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

