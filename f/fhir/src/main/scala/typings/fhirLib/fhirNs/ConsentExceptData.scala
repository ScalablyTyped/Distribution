package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Data controlled by this exception
     */

trait ConsentExceptData extends BackboneElement {
  /**
           * Contains extended information for property 'meaning'.
           */
  var _meaning: js.UndefOr[Element] = js.undefined
  /**
           * instance | related | dependents | authoredby
           */
  var meaning: code
  /**
           * The actual data reference
           */
  var reference: Reference
}

