package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who/What requested the Request
  */
trait MedicationRequestRequester extends BackboneElement {
  /**
    * Who ordered the initial medication(s)
    */
  var agent: Reference
  /**
    * Organization agent is acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}

