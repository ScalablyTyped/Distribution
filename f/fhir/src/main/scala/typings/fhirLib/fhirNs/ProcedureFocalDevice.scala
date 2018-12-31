package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Device changed in procedure
  */
trait ProcedureFocalDevice extends BackboneElement {
  /**
    * Kind of change to device
    */
  var action: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Device that was changed
    */
  var manipulated: Reference
}

