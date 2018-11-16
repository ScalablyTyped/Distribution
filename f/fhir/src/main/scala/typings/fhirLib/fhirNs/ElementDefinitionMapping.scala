package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Map element to another set of definitions
     */

trait ElementDefinitionMapping extends Element {
  /**
           * Contains extended information for property 'comment'.
           */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'identity'.
           */
  var _identity: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'language'.
           */
  var _language: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'map'.
           */
  var _map: js.UndefOr[Element] = js.undefined
  /**
           * Comments about the mapping or its use
           */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Reference to mapping declaration
           */
  var identity: id
  /**
           * Computable language of mapping
           */
  var language: js.UndefOr[code] = js.undefined
  /**
           * Details of the mapping
           */
  var map: java.lang.String
}

