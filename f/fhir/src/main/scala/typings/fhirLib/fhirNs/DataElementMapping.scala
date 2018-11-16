package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * External specification mapped to
     */

trait DataElementMapping extends BackboneElement {
  /**
           * Contains extended information for property 'comment'.
           */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'identity'.
           */
  var _identity: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'uri'.
           */
  var _uri: js.UndefOr[Element] = js.undefined
  /**
           * Versions, issues, scope limitations, etc.
           */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Internal id when this mapping is used
           */
  var identity: id
  /**
           * Names what this mapping refers to
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Identifies what this mapping refers to
           */
  var uri: js.UndefOr[uri] = js.undefined
}

