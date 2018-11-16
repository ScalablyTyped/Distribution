package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * When no match in the mappings
     */

trait ConceptMapGroupUnmapped extends BackboneElement {
  /**
           * Contains extended information for property 'code'.
           */
  var _code: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'display'.
           */
  var _display: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'mode'.
           */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'url'.
           */
  var _url: js.UndefOr[Element] = js.undefined
  /**
           * Fixed code when mode = fixed
           */
  var code: js.UndefOr[code] = js.undefined
  /**
           * Display for the code
           */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /**
           * provided | fixed | other-map
           */
  var mode: code
  /**
           * Canonical URL for other concept map
           */
  var url: js.UndefOr[uri] = js.undefined
}

