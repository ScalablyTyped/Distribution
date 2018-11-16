package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Search parameters supported by implementation
     */

trait CapabilityStatementRestResourceSearchParam extends BackboneElement {
  /**
           * Contains extended information for property 'definition'.
           */
  var _definition: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'documentation'.
           */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Source of definition for parameter
           */
  var definition: js.UndefOr[uri] = js.undefined
  /**
           * Server-specific usage
           */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Name of search parameter
           */
  var name: java.lang.String
  /**
           * number | date | string | token | reference | composite | quantity | uri
           */
  var `type`: code
}

