package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Who/what is requesting service
     */

trait SupplyRequestRequester extends BackboneElement {
  /**
           * Individual making the request
           */
  var agent: Reference
  /**
           * Organization agent is acting for
           */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}

