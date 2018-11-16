package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Additional Information about the entity
     */

trait AuditEventEntityDetail extends BackboneElement {
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'value'.
           */
  var _value: js.UndefOr[Element] = js.undefined
  /**
           * Name of the property
           */
  var `type`: java.lang.String
  /**
           * Property value
           */
  var value: base64Binary
}

