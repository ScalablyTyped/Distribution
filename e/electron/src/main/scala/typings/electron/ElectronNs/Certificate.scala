package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/certificate
  /**
    * PEM encoded data
    */
  var data: String
  /**
    * Fingerprint of the certificate
    */
  var fingerprint: String
  /**
    * Issuer principal
    */
  var issuer: CertificatePrincipal
  /**
    * Issuer certificate (if not self-signed)
    */
  var issuerCert: Certificate
  /**
    * Issuer's Common Name
    */
  var issuerName: String
  /**
    * Hex value represented string
    */
  var serialNumber: String
  /**
    * Subject principal
    */
  var subject: CertificatePrincipal
  /**
    * Subject's Common Name
    */
  var subjectName: String
  /**
    * End date of the certificate being valid in seconds
    */
  var validExpiry: Double
  /**
    * Start date of the certificate being valid in seconds
    */
  var validStart: Double
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
    val __obj = js.Dynamic.literal(data = data, fingerprint = fingerprint, issuer = issuer, issuerCert = issuerCert, issuerName = issuerName, serialNumber = serialNumber, subject = subject, subjectName = subjectName, validExpiry = validExpiry, validStart = validStart)
  
    __obj.asInstanceOf[Certificate]
  }
}

