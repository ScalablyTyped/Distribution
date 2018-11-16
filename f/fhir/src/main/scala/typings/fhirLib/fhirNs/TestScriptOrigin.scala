package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An abstract server representing a client or sender in a message exchange
     */

trait TestScriptOrigin extends BackboneElement {
  /**
           * Contains extended information for property 'index'.
           */
  var _index: js.UndefOr[Element] = js.undefined
  /**
           * The index of the abstract origin server starting at 1
           */
  var index: integer
  /**
           * FHIR-Client | FHIR-SDC-FormFiller
           */
  var profile: Coding
}

