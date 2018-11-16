package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Profiles that apply globally
     */

trait ImplementationGuideGlobal extends BackboneElement {
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Profile that all resources must conform to
           */
  var profile: Reference
  /**
           * Type this profiles applies to
           */
  var `type`: code
}

