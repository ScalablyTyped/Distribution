package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Document definition
  */
trait CapabilityStatementDocument extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Description of document support
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * producer | consumer
    */
  var mode: code
  /**
    * Constraint on a resource used in the document
    */
  var profile: Reference
}

