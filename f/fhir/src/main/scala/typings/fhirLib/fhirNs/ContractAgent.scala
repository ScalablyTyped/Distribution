package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entity being ascribed responsibility
  */
trait ContractAgent extends BackboneElement {
  /**
    * Contract Agent Type
    */
  var actor: Reference
  /**
    * Role type of the agent
    */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

