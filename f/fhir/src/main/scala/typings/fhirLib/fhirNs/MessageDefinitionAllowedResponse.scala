package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Responses to this message
  */
trait MessageDefinitionAllowedResponse extends BackboneElement {
  /**
    * Contains extended information for property 'situation'.
    */
  var _situation: js.UndefOr[Element] = js.undefined
  /**
    * Reference to allowed message definition response
    */
  var message: Reference
  /**
    * When should this response be used
    */
  var situation: js.UndefOr[markdown] = js.undefined
}

