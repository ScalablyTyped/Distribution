package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The people who performed the procedure
     */

trait ProcedurePerformer extends BackboneElement {
  /**
           * The reference to the practitioner
           */
  var actor: Reference
  /**
           * Organization the device or practitioner was acting for
           */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
  /**
           * The role the actor was in
           */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}

