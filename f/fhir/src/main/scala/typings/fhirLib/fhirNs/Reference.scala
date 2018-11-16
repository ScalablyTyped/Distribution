package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A reference from one resource to another
     */

trait Reference extends Element {
  /**
           * Contains extended information for property 'display'.
           */
  var _display: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'reference'.
           */
  var _reference: js.UndefOr[Element] = js.undefined
  /**
           * Text alternative for the resource
           */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Logical reference, when literal reference is not known
           */
  var identifier: js.UndefOr[Identifier] = js.undefined
  /**
           * Literal reference, Relative, internal or absolute URL
           */
  var reference: js.UndefOr[java.lang.String] = js.undefined
}

