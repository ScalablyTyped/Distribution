package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who|what controlled by this exception (or group, by role)
  */
trait ConsentExceptActor extends BackboneElement {
  /**
    * Resource for the actor (or group, by role)
    */
  var reference: Reference
  /**
    * How the actor is involved
    */
  var role: CodeableConcept
}

