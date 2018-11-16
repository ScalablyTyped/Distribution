package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Unique identifiers used for system
     */

trait NamingSystemUniqueId extends BackboneElement {
  /**
           * Contains extended information for property 'comment'.
           */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'preferred'.
           */
  var _preferred: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'value'.
           */
  var _value: js.UndefOr[Element] = js.undefined
  /**
           * Notes about identifier usage
           */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
           * When is identifier valid?
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Is this the id that should be used for this type
           */
  var preferred: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * oid | uuid | uri | other
           */
  var `type`: code
  /**
           * The unique identifier
           */
  var value: java.lang.String
}

