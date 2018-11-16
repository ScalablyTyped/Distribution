package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Contract Term Agent List
     */

trait ContractTermAgent extends BackboneElement {
  /**
           * Contract Term Agent Subject
           */
  var actor: Reference
  /**
           * Type of the Contract Term Agent
           */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

