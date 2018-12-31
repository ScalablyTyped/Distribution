package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Certificates associated with security profiles
  */
trait CapabilityStatementRestSecurityCertificate extends BackboneElement {
  /**
    * Contains extended information for property 'blob'.
    */
  var _blob: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Actual certificate
    */
  var blob: js.UndefOr[base64Binary] = js.undefined
  /**
    * Mime type for certificates
    */
  var `type`: js.UndefOr[code] = js.undefined
}

