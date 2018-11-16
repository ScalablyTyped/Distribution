package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * For Composite resources to define the parts
     */

trait SearchParameterComponent extends BackboneElement {
  /**
           * Contains extended information for property 'expression'.
           */
  var _expression: js.UndefOr[Element] = js.undefined
  /**
           * Defines how the part works
           */
  var definition: Reference
  /**
           * Subexpression relative to main expression
           */
  var expression: java.lang.String
}

