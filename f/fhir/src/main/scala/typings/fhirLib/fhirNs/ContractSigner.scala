package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Signatory
  */
trait ContractSigner extends BackboneElement {
  /**
    * Contract Signatory Party
    */
  var party: Reference
  /**
    * Contract Documentation Signature
    */
  var signature: js.Array[Signature]
  /**
    * Contract Signatory Role
    */
  var `type`: Coding
}

