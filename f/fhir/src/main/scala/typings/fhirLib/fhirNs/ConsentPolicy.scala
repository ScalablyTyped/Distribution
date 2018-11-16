package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Policies covered by this consent
     */

trait ConsentPolicy extends BackboneElement {
  /**
           * Contains extended information for property 'authority'.
           */
  var _authority: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'uri'.
           */
  var _uri: js.UndefOr[Element] = js.undefined
  /**
           * Enforcement source for policy
           */
  var authority: js.UndefOr[uri] = js.undefined
  /**
           * Specific policy covered by this consent
           */
  var uri: js.UndefOr[uri] = js.undefined
}

