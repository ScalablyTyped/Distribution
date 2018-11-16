package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * If this describes a specific instance
     */

trait CapabilityStatementImplementation extends BackboneElement {
  /**
           * Contains extended information for property 'description'.
           */
  var _description: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'url'.
           */
  var _url: js.UndefOr[Element] = js.undefined
  /**
           * Describes this specific instance
           */
  var description: java.lang.String
  /**
           * Base URL for the installation
           */
  var url: js.UndefOr[uri] = js.undefined
}

