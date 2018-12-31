package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Administration/non-administration reasons
  */
trait ImmunizationExplanation extends BackboneElement {
  /**
    * Why immunization occurred
    */
  var reason: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * Why immunization did not occur
    */
  var reasonNotGiven: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

