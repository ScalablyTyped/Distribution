package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who/what is requesting procedure or diagnostic
  */
trait ProcedureRequestRequester extends BackboneElement {
  /**
    * Individual making the request
    */
  var agent: Reference
  /**
    * Organization agent is acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}

