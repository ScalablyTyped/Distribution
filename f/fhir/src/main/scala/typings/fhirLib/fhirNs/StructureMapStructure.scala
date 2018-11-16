package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Structure Definition used by this map
     */

trait StructureMapStructure extends BackboneElement {
  /**
           * Contains extended information for property 'alias'.
           */
  var _alias: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'documentation'.
           */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'mode'.
           */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'url'.
           */
  var _url: js.UndefOr[Element] = js.undefined
  /**
           * Name for type in this map
           */
  var alias: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Documentation on use of structure
           */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
           * source | queried | target | produced
           */
  var mode: code
  /**
           * Canonical URL for structure definition
           */
  var url: uri
}

