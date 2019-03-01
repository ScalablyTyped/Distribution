package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/certificate
  /**
    * PEM encoded data
    */
  var data: java.lang.String
  /**
    * Fingerprint of the certificate
    */
  var fingerprint: java.lang.String
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
  var issuerName: java.lang.String
  /**
    * Hex value represented string
    */
  var serialNumber: java.lang.String
  /**
    * Subject principal
    */
  var subject: CertificatePrincipal
  /**
    * Subject's Common Name
    */
  var subjectName: java.lang.String
  /**
    * End date of the certificate being valid in seconds
    */
  var validExpiry: scala.Double
  /**
    * Start date of the certificate being valid in seconds
    */
  var validStart: scala.Double
}

object Certificate {
  @scala.inline
  def apply(
    data: java.lang.String,
    fingerprint: java.lang.String,
    issuer: CertificatePrincipal,
    issuerCert: Certificate,
    issuerName: java.lang.String,
    serialNumber: java.lang.String,
    subject: CertificatePrincipal,
    subjectName: java.lang.String,
    validExpiry: scala.Double,
    validStart: scala.Double
  ): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("fingerprint")(fingerprint)
    __obj.updateDynamic("issuer")(issuer)
    __obj.updateDynamic("issuerCert")(issuerCert)
    __obj.updateDynamic("issuerName")(issuerName)
    __obj.updateDynamic("serialNumber")(serialNumber)
    __obj.updateDynamic("subject")(subject)
    __obj.updateDynamic("subjectName")(subjectName)
    __obj.updateDynamic("validExpiry")(validExpiry)
    __obj.updateDynamic("validStart")(validStart)
    __obj.asInstanceOf[Certificate]
  }
}

