package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Resource(s) that are the subject of the event
     */

trait MessageDefinitionFocus extends BackboneElement {
  /**
           * Contains extended information for property 'code'.
           */
  var _code: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'max'.
           */
  var _max: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'min'.
           */
  var _min: js.UndefOr[Element] = js.undefined
  /**
           * Type of resource
           */
  var code: code
  /**
           * Maximum number of focuses of this type
           */
  var max: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Minimum number of focuses of this type
           */
  var min: js.UndefOr[unsignedInt] = js.undefined
  /**
           * Profile that must be adhered to by focus
           */
  var profile: js.UndefOr[Reference] = js.undefined
}

