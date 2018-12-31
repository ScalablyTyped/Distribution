package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Messages supported by this system
  */
trait CapabilityStatementMessagingSupportedMessage extends BackboneElement {
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Message supported by this system
    */
  var definition: Reference
  /**
    * sender | receiver
    */
  var mode: code
}

