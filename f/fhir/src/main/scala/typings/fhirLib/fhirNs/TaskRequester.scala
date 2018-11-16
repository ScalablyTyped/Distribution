package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Who is asking for task to be done
     */

trait TaskRequester extends BackboneElement {
  /**
           * Individual asking for task
           */
  var agent: Reference
  /**
           * Organization individual is acting for
           */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}

