package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A human-readable formatted text, including images
     */

trait Narrative extends Element {
  /**
           * Contains extended information for property 'div'.
           */
  var _div: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Limited xhtml content
           */
  var div: java.lang.String
  /**
           * generated | extensions | additional | empty
           */
  var status: code
}

