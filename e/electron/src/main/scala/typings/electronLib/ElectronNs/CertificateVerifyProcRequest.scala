package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertificateVerifyProcRequest extends js.Object {
  var certificate: Certificate
  /**
    * Error code.
    */
  var errorCode: scala.Double
  var hostname: java.lang.String
  /**
    * Verification result from chromium.
    */
  var verificationResult: java.lang.String
}

