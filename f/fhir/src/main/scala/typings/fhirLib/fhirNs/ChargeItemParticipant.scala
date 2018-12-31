package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who performed charged service
  */
trait ChargeItemParticipant extends BackboneElement {
  /**
    * Individual who was performing
    */
  var actor: Reference
  /**
    * What type of performance was done
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}

